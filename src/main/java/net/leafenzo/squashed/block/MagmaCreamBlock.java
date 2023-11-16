package net.leafenzo.squashed.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlimeBlock;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MagmaCreamBlock
        extends SlimeBlock {
    public MagmaCreamBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        //instead of slowing the player down, just don't do anything
    }
}
