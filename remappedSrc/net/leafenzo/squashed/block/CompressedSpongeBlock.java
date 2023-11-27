package net.leafenzo.squashed.block;


import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;

/**
 * From net.minecraft.block.SpongeBlock
 * Does not need to be furnaced
 */
public class CompressedSpongeBlock extends Block {
    public static final int field_31250 = 6;
    public static final int field_31251 = 64;

    private static final Direction[] field_43257 = Direction.values();

    public CompressedSpongeBlock(Settings settings) {
        super(settings);
    }

    @Override
    public float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
        return 0.2f;
    }

//    @Override
//    public boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
//        return true;
//    }

//    @Override
//    public boolean isTranslucent(BlockState state, BlockView world, BlockPos pos) {
//        return true;
//    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        if (oldState.isOf(state.getBlock())) {
            return;
        }
        this.update(world, pos);
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        this.update(world, pos);
        super.neighborUpdate(state, world, pos, sourceBlock, sourcePos, notify);
    }

    protected void update(World world, BlockPos pos) {
        if (this.absorbWater(world, pos)) {
            //world.setBlockState(pos, Blocks.WET_SPONGE.getDefaultState(), Block.NOTIFY_LISTENERS);
            world.syncWorldEvent(WorldEvents.BLOCK_BROKEN, pos, Block.getRawIdFromState(Blocks.WATER.getDefaultState()));
        }
    }

    /*
    @Override
    public float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
        return 999999999f/2.5f;
    }
    */

    private boolean absorbWater(World world, BlockPos pos) {
        return BlockPos.iterateRecursively(pos, 6, 65, (currentPos, queuer) -> {
            for (Direction direction : field_43257) {
                queuer.accept(currentPos.offset(direction));
            }
        }, currentPos -> {
            FluidDrainable fluidDrainable;
            if (currentPos.equals(pos)) {
                return true;
            }
            BlockState blockState = world.getBlockState((BlockPos)currentPos);
            FluidState fluidState = world.getFluidState((BlockPos)currentPos);
            if (!fluidState.isIn(FluidTags.WATER)) {
                return false;
            }
            Block block = blockState.getBlock();
            if (block instanceof FluidDrainable && !(fluidDrainable = (FluidDrainable)((Object)block)).tryDrainFluid(world, (BlockPos)currentPos, blockState).isEmpty()) {
                return true;
            }
            if (blockState.getBlock() instanceof FluidBlock) {
                world.setBlockState((BlockPos)currentPos, Blocks.AIR.getDefaultState(), Block.NOTIFY_ALL);
            } else if (blockState.isOf(Blocks.KELP) || blockState.isOf(Blocks.KELP_PLANT) || blockState.isOf(Blocks.SEAGRASS) || blockState.isOf(Blocks.TALL_SEAGRASS)) {
                BlockEntity blockEntity = blockState.hasBlockEntity() ? world.getBlockEntity((BlockPos)currentPos) : null;
                SpongeBlock.dropStacks(blockState, world, currentPos, blockEntity);
                world.setBlockState((BlockPos)currentPos, Blocks.AIR.getDefaultState(), Block.NOTIFY_ALL);
            } else {
                return false;
            }
            return true;
        }) > 1;
    }
}
