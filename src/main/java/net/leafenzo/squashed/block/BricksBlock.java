package net.leafenzo.squashed.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class BricksBlock extends FallingBlock {
    public static final EnumProperty<Direction.Axis> AXIS = Properties.HORIZONTAL_AXIS;

    public BricksBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)this.getDefaultState().with(AXIS, Direction.Axis.X));
    }

    @Override
    protected void configureFallingBlockEntity(FallingBlockEntity entity) {
        entity.setHurtEntities(2.0f, 40);
    }

    @Override
    public void onLanding(World world, BlockPos pos, BlockState fallingBlockState, BlockState currentStateInPos, FallingBlockEntity fallingBlockEntity) {
        if (!fallingBlockEntity.isSilent()) {
            world.playSound(null, pos, SoundEvents.BLOCK_NETHER_BRICKS_PLACE, SoundCategory.BLOCKS, 1.6f, 0.1f); // low end to make it sound more powerful
            world.playSound(null, pos, SoundEvents.BLOCK_NETHER_BRICKS_PLACE, SoundCategory.BLOCKS, 1.0f, 1.0f);
        }
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        switch (rotation) {
            case COUNTERCLOCKWISE_90:
            case CLOCKWISE_90: {
                switch (state.get(AXIS)) {
                    case X: {
                        return (BlockState)state.with(AXIS, Direction.Axis.Z);
                    }
                    case Z: {
                        return (BlockState)state.with(AXIS, Direction.Axis.X);
                    }
                }
                return state;
            }
        }
        return state;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        //Direction.Axis axis = ctx.getSide().getAxis();
//        if(axis == Direction.Axis.Y ) {
//            return (BlockState)this.getDefaultState().with(AXIS, Direction.Axis.X);
//        }
//        else { return (BlockState)this.getDefaultState().with(AXIS, axis); }

        Direction.Axis axis = ctx.getHorizontalPlayerFacing().getAxis();
        return (BlockState)this.getDefaultState().with(AXIS, axis);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AXIS);
    }

}
