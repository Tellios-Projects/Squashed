package net.leafenzo.squashed.item;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

// May not be the best way to do this sort of thing, but it's the best I've come up with so far.

//Placed normally - pick a block out of the pallete at random
//Placed with crosshair over another block - use the same block texture as THAT pallete block
//
//So you can place different textures adjacent to eachother, all it cares about is how you place it

/**
 *  Mimics the behavior of other BlockItems as determined either randomly and by what block they are placed against.
 */
public class TropicalFishBlockItem
extends BlockItem {
    public TropicalFishBlockItem(Block block, Settings settings) {
        super(block, settings);
    }


}


