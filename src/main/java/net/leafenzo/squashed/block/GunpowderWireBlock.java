package net.leafenzo.squashed.block;

import net.minecraft.block.RedstoneWireBlock;
public class GunpowderWireBlock extends RedstoneWireBlock {
    public GunpowderWireBlock(Settings settings) {
        super(settings);
    }


//    Placed Gunpowder Mixins:
//
//    Properties.Java | Add Boolean Property "Supercharged"
//
//    <TNT block behavior> | Make it summon a tnt entity of a delay like, 3 ticks when the redstone input is Supercharged
//
//            <Gunpowder> | Make it a blockItem, have it place Place GunpowderWireBlock (alt RedstoneWireBlock)
//
//
//    Maybe Needed?:
//    Have redstone signals default to Supercharged = false.
}
