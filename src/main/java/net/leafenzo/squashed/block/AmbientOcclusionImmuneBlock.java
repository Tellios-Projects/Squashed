package net.leafenzo.squashed.block;

import net.leafenzo.squashed.interfaces.IAmbientOcclusionDisableable;
import net.leafenzo.squashed.util.ModUtil;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class AmbientOcclusionImmuneBlock extends Block {
    public AmbientOcclusionImmuneBlock(Settings settings) {
        super(settings);
    }

    @Override
    public float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
        return 0.0f;
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        if (!world.isClient) { //only run on the client
            return;
        }
        for(BlockState adjacentBlockState : ModUtil.allAdjacentBlockStates(world, pos)) {
            IAmbientOcclusionDisableable ao = (IAmbientOcclusionDisableable) adjacentBlockState;
            ao.setAmbientOcclusionEnabled(false);
        }
    }

}
