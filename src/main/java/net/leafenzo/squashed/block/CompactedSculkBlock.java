package net.leafenzo.squashed.block;

import net.minecraft.block.SculkBlock;
import net.minecraft.block.entity.SculkSpreadManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldAccess;

public class CompactedSculkBlock extends SculkBlock {
    public CompactedSculkBlock(Settings settings) {
        super(settings);
    }


    //I don't know much about this, but I do know I don't want the player to have easy access to a super compressed Squashed_Sculk farm y'know? I could probably look into what this function actually does but I am in a rush.
    @Override
    public int spread(SculkSpreadManager.Cursor cursor, WorldAccess world, BlockPos catalystPos, Random random, SculkSpreadManager spreadManager, boolean shouldConvertToBlock) {
        //do nothing
        return 0;
    }
}
