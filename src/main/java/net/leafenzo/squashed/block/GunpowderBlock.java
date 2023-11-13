package net.leafenzo.squashed.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FallingBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import net.minecraft.world.explosion.Explosion;
import org.jetbrains.annotations.Nullable;

public class GunpowderBlock extends FallingBlock {
    public GunpowderBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onDestroyedByExplosion(World world, BlockPos pos, Explosion explosion) {
        if (world.isClient) {
            return;
        }
//        TntEntity tntEntity = new TntEntity(world, (double)pos.getX() + 0.5, pos.getY(), (double)pos.getZ() + 0.5, explosion.getCausingEntity());
//        int i = tntEntity.getFuse();
//        tntEntity.setFuse((short)(world.random.nextInt(i / 4) + i / 8));
//        world.spawnEntity(tntEntity);
        explode(world, pos); //TODO make this not crash so easily with large amounts of these
    }


    private void primeExplosion(World world, BlockPos pos, @Nullable LivingEntity igniter) {
        if (world.isClient) {
            return;
        }
//        TntEntity tntEntity = new TntEntity(world, (double)pos.getX() + 0.5, pos.getY(), (double)pos.getZ() + 0.5, igniter);
//        world.spawnEntity(tntEntity);
        world.playSound(null, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.ENTITY_TNT_PRIMED, SoundCategory.BLOCKS, 1.0f, 1.0f);
        world.emitGameEvent((Entity)igniter, GameEvent.PRIME_FUSE, pos);
        explode(world, pos);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isOf(Items.FLINT_AND_STEEL) || itemStack.isOf(Items.FIRE_CHARGE)) {
            primeExplosion(world, pos, player);
            world.setBlockState(pos, Blocks.AIR.getDefaultState(), Block.NOTIFY_ALL | Block.REDRAW_ON_MAIN_THREAD);
            Item item = itemStack.getItem();
            if (!player.isCreative()) {
                if (itemStack.isOf(Items.FLINT_AND_STEEL)) {
                    itemStack.damage(1, player, playerx -> playerx.sendToolBreakStatus(hand));
                } else {
                    itemStack.decrement(1);
                }
            }
            player.incrementStat(Stats.USED.getOrCreateStat(item));
            return ActionResult.success(world.isClient);
        }
        return super.onUse(state, world, pos, player, hand, hit);
    }

    @Override
    public void onProjectileHit(World world, BlockState state, BlockHitResult hit, ProjectileEntity projectile) {
        if (!world.isClient) {
            BlockPos blockPos = hit.getBlockPos();
            Entity entity = projectile.getOwner();
            if (projectile.isOnFire() && projectile.canModifyAt(world, blockPos)) {
                primeExplosion(world, blockPos, entity instanceof LivingEntity ? (LivingEntity)entity : null);
                world.removeBlock(blockPos, false);
            }
        }
    }

    private void explode(World world, BlockPos pos) {
        world.createExplosion(null, pos.getX(), pos.getY() + 0.0625, pos.getZ(), 4.0f, World.ExplosionSourceType.BLOCK);
    }

    @Override
    public boolean shouldDropItemsOnExplosion(Explosion explosion) {
        return false;
    }

    // TODO figure out how to make this explode when it's caught fire from any source
}
