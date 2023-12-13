package net.leafenzo.squashed.block;

import net.minecraft.block.RedstoneWireBlock;

public class GunpowderWireBlock extends RedstoneWireBlock {
    public GunpowderWireBlock(Settings settings) {
        super(settings);
    }

//    Placed Gunpowder Mixins:
//
//    Properties.Java | Add Boolean Property "Supercharged" //Or maybe not actually... I don't know much about how mixins are supposed to be used yet
//
//    <TNT block behavior> | Make it summon a tnt entity of a delay 3 ticks when the redstone input is Supercharged
//
//    <Gunpowder> | have it place GunpowderWireBlock as an AliasedBlockItem
//      Minecraft:Items.java line 902: public static final Item GUNPOWDER = Items.register("gunpowder", new Item(new Item.Settings()));
//      replace with:  public static final Item GUNPOWDER = Items.register("gunpowder", (Item)new AliasedBlockItem(???, new Item.Settings()))
//
//    Someone's got to have done something like this before... right?
//
//    Maybe Needed?:
//    Have redstone signals default to Supercharged = false.
}
