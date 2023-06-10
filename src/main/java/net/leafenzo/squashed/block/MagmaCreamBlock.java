package net.leafenzo.squashed.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SlimeBlock;

public class MagmaCreamBlock
        extends SlimeBlock {
    public MagmaCreamBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

//    private BlockState pushedBlock = Blocks.AIR.getDefaultState();
    //Blocks.HONEY_BLOCK || this.getBlock
//    private boolean isPushingHoneyBlock() {
//        return this.pushedBlock.isOf(Blocks.HONEY_BLOCK) || this.pushedBlock.isOf(ModBlocks.MAGMA_CREAM_BLOCK);
//    }

    //Lnet/minecraft/block/entity/PistonBlockEntity;isPushingHoneyBlock()Z

    //Doesn't work, feels like a bad idea even if it did
//    public Block getBlock() {
//        return Blocks.SLIME_BLOCK;
//    }
//    public boolean isOf(Block block) {
//        return Blocks.SLIME_BLOCK == block;
//    }
}
