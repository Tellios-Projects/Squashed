package net.leafenzo.squashed.block;

import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;


/**
 * From net.minecraft.block.PowderSnowBlock
 */
public class CompressedCobwebBlock //TODO Polish my visuals! - also once that's done switch net/leafenzo/squashed/block/ModBlocks.java:517 back to being this type of block
extends Block {
    private static final float field_31216 = 0.083333336f;
    private static final float HORIZONTAL_MOVEMENT_MULTIPLIER = 0.9f;
    private static final float VERTICAL_MOVEMENT_MULTIPLIER = 1.5f;
    private static final float field_31219 = 2.5f;
    private static final VoxelShape FALLING_SHAPE = VoxelShapes.cuboid(0.0, 0.0, 0.0, 1.0, 0.9f, 1.0);
    private static final double field_36189 = 4.0;
    private static final double SMALL_FALL_SOUND_MAX_DISTANCE = 7.0;

    public CompressedCobwebBlock(AbstractBlock.Settings settings) { super(settings); }

    //Overriding is NOT deprecated, only calling directly.
    @Override
    public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        if (stateFrom.isOf(this)) {
            return true;
        }
        return super.isSideInvisible(state, stateFrom, direction);
    }

    @Override
    public VoxelShape getCullingShape(BlockState state, BlockView world, BlockPos pos) {
        return VoxelShapes.empty();
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!(entity instanceof LivingEntity) || entity.getBlockStateAtPos().isOf(this)) {
            if(entity instanceof SpiderEntity spiderEntity) {
                spiderEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 1, 2, true, false));
            }
            else {
                entity.slowMovement(state, new Vec3d(0.25, 0.05f, 0.25)); //same as CobwebBlock
//            if(entity instanceof LivingEntity livingEntity){
//            livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 20, 255, true, false));
//            }
//                if(entity instanceof PlayerEntity playerEntity)
//                    if( world.getBlockState(pos.add(0,1,0)).isOf(this)  //if block above is the same
//                        && entity.getPos().y <= pos.getY()+1.6f // and if head is below
//                    ){
//                        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 20, 255, true, false));
//                } else if (entity instanceof LivingEntity livingEntity) {
//                        livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 20, 255, true, false));
//                }
            }
            if (world.isClient) {
                boolean bl;
                Random random = world.getRandom();
                boolean bl2 = bl = entity.lastRenderX != entity.getX() || entity.lastRenderZ != entity.getZ() || entity.lastRenderZ != entity.getY();
                if (bl && random.nextBoolean()) {
                    //TODO Consider having them swarm around player like a swarm of mini-spiders.
                    float r1 = MathHelper.nextBetween(random, -1.0f, 1.0f) / 4;
                    float r2 = MathHelper.nextBetween(random, -1.0f, 1.0f) / 4;
                    world.addParticle(ParticleTypes.ASH, entity.getX() + r1, pos.getY() + 1, entity.getZ() + r2, r1 * 0.0008f, r2 * 0.0008f, -0.02f);
                }
            }
        }
        //entity.setInPowderSnow(true);
        /*
        if (!world.isClient) {
            if (entity.isOnFire() && (world.getGameRules().getBoolean(GameRules.DO_MOB_GRIEFING) || entity instanceof PlayerEntity) && entity.canModifyAt(world, pos)) {
                world.breakBlock(pos, false);
            }
            entity.setOnFire(false);
        }
        */
    }

    @Override
    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        if ((double)fallDistance < 4.0 || !(entity instanceof LivingEntity)) {
            return;
        }
        LivingEntity livingEntity = (LivingEntity)entity;
        LivingEntity.FallSounds fallSounds = livingEntity.getFallSounds();
        SoundEvent soundEvent = (double)fallDistance < 7.0 ? fallSounds.small() : fallSounds.big();
        entity.playSound(soundEvent, 1.0f, 1.0f);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        EntityShapeContext entityShapeContext;
        Entity entity;
        if (context instanceof EntityShapeContext && (entity = (entityShapeContext = (EntityShapeContext)context).getEntity()) != null) {
            if (entity.fallDistance > 2.5f) {
                return FALLING_SHAPE;
            }
            /*
            boolean bl = entity instanceof FallingBlockEntity;
            if (bl || PowderSnowBlock.canWalkOnPowderSnow(entity) && context.isAbove(VoxelShapes.fullCube(), pos, false) && !context.isDescending()) {
                return super.getCollisionShape(state, world, pos, context);
            }
            */
        }
        return VoxelShapes.empty();
    }

    @Override
    public VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.empty();
    }

    public static boolean canWalkOnPowderSnow(Entity entity) {
        /*
        if (entity.getType().isIn(EntityTypeTags.POWDER_SNOW_WALKABLE_MOBS)) {
            return true;
        }
        if (entity instanceof LivingEntity) {
            return ((LivingEntity)entity).getEquippedStack(EquipmentSlot.FEET).isOf(Items.LEATHER_BOOTS);
        }
        */
        return false;
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return true;
    }
}
