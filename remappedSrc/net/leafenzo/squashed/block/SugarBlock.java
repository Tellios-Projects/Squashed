package net.leafenzo.squashed.block;

import net.leafenzo.squashed.state.ModProperties;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.FluidFillable;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class SugarBlock extends FallingBlock implements FluidFillable {
    public static final BooleanProperty WET = ModProperties.WET;
    public SugarBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(WET, false));
    }

    @Override
    public boolean canFillWithFluid(BlockView world, BlockPos pos, BlockState state, Fluid fluid) {
        return fluid == Fluids.WATER;
    }
    @Override
    public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
        if (!state.get(ModProperties.WET).booleanValue() && fluidState.getFluid() == Fluids.WATER) {
            if (!world.isClient()) {
                world.setBlockState(pos, (BlockState)state.with(ModProperties.WET, true), Block.NOTIFY_ALL);
                world.scheduleFluidTick(pos, fluidState.getFluid(), fluidState.getFluid().getTickRate(world)); // Not sure if this line is necessary here? I won't bother touching it though.
            }
            return true;
        }
        return false;
    }

    @Override
    public void onLanding(World world, BlockPos pos, BlockState fallingBlockState, BlockState currentStateInPos, FallingBlockEntity fallingBlockEntity) {
        if (SugarBlock.shouldHarden(world, pos, currentStateInPos)) {
            world.setBlockState(pos, this.getDefaultState().with(WET, true), Block.NOTIFY_LISTENERS);
        }
    }
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockState;
        BlockPos blockPos;
        World blockView = ctx.getWorld();
        if (SugarBlock.shouldHarden(blockView, blockPos = ctx.getBlockPos(), blockState = blockView.getBlockState(blockPos))) {
            return this.getDefaultState().with(WET, true);
        }
        return super.getPlacementState(ctx);
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(WET);
    }
    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        if (world.isClient) {
            return;
        }
        boolean bl = state.get(WET);
        if (bl != SugarBlock.hardensOnAnySide(world, pos)) {
            if (bl) {
                world.scheduleBlockTick(pos, this, 4);
            } else {
                world.setBlockState(pos, (BlockState)state.cycle(WET), Block.NOTIFY_LISTENERS);
            }
        }
    }
    private static boolean shouldHarden(BlockView world, BlockPos pos, BlockState state) {
        return SugarBlock.hardensIn(state) || SugarBlock.hardensOnAnySide(world, pos);
    }
    private static boolean hardensOnAnySide(BlockView world, BlockPos pos) {
        boolean bl = false;
        BlockPos.Mutable mutable = pos.mutableCopy();
        for (Direction direction : Direction.values()) {
            BlockState blockState = world.getBlockState(mutable);
            if (direction == Direction.DOWN && !SugarBlock.hardensIn(blockState)) continue;
            mutable.set((Vec3i)pos, direction);
            blockState = world.getBlockState(mutable);
            if (!SugarBlock.hardensIn(blockState) || blockState.isSideSolidFullSquare(world, pos, direction.getOpposite())) continue;
            bl = true;
            break;
        }
        return bl;
    }
    private static boolean hardensIn(BlockState state) {
        return state.getFluidState().isIn(FluidTags.WATER);
    }
}
