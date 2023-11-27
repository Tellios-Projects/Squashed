package net.leafenzo.squashed.block.dispenser;

import net.leafenzo.squashed.block.CompressedTntBlock;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.ItemDispenserBehavior;
import net.minecraft.entity.TntEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPointer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.event.GameEvent;

public class CompressedTntDispenserBehavior extends ItemDispenserBehavior {
    @Override
    protected ItemStack dispenseSilently(BlockPointer pointer, ItemStack stack) {
        ServerWorld world = pointer.getWorld();
        BlockPos pos = pointer.getPos().offset(pointer.getBlockState().get(DispenserBlock.FACING));
        Direction direction = pointer.getBlockState().get(DispenserBlock.FACING);

        Random random = world.random;

        for (int i = 0; i < CompressedTntBlock.tntCount; i++) {
            TntEntity tntEntity = new TntEntity(world, (double)pos.getX() + 0.5, pos.getY(), (double)pos.getZ() + 0.5, null);
            int j = tntEntity.getFuse();
            tntEntity.setFuse((short)(random.nextInt(j / 4) + j / 8) + 80);
            world.spawnEntity(tntEntity);

            double d = random.nextDouble() * 6.2831854820251465;

            if(direction == Direction.UP) {
                tntEntity.addVelocity(-Math.sin(d) * 0.12, 0.66, -Math.cos(d) * 0.12);
            }
            else if(direction == Direction.DOWN) {
                tntEntity.addVelocity(-Math.sin(d) * 0.12, -0.66, -Math.cos(d) * 0.12);
            }

            else if(direction == Direction.EAST) {
                tntEntity.addVelocity(0.66, (-Math.sin(d) * 0.12) + 0.09, -Math.cos(d) * 0.12);
            }
            else if(direction == Direction.WEST) {
                tntEntity.addVelocity(-0.66, (-Math.sin(d) * 0.12) + 0.09, -Math.cos(d) * 0.12);
            }

            else if(direction == Direction.NORTH) {
                tntEntity.addVelocity(-Math.sin(d) * 0.12, (-Math.cos(d) * 0.12) + 0.09, -0.66);
            }
            else if(direction == Direction.SOUTH) {
                tntEntity.addVelocity(-Math.sin(d) * 0.12, (-Math.cos(d) * 0.12) + 0.09, 0.66);
            }

            world.playSound(null, tntEntity.getX(), tntEntity.getY(), tntEntity.getZ(), SoundEvents.ENTITY_TNT_PRIMED, SoundCategory.BLOCKS, 1.0f, 0.9f + random.nextFloat() * 0.15f);
            world.emitGameEvent(null, GameEvent.ENTITY_PLACE, pos);
        }
        stack.decrement(1);
        return stack;

//        TntEntity tntEntity = new TntEntity(world, (double)blockPos.getX() + 0.5, blockPos.getY(), (double)blockPos.getZ() + 0.5, null);
//        world.spawnEntity(tntEntity);
//        world.playSound(null, tntEntity.getX(), tntEntity.getY(), tntEntity.getZ(), SoundEvents.ENTITY_TNT_PRIMED, SoundCategory.BLOCKS, 1.0f, 1.0f);
//        world.emitGameEvent(null, GameEvent.ENTITY_PLACE, blockPos);
//        stack.decrement(1);
//        return stack;
    }
}
