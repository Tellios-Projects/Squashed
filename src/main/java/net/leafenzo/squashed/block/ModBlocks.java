package net.leafenzo.squashed.block;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.leafenzo.squashed.ModInit;
import net.leafenzo.squashed.Super;
import net.leafenzo.squashed.item.ModItemGroups;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModBlocks {

    public static final Block CYAN_DYE_BLOCK = registerBlock("cyan_dye_block",
            new Block(FabricBlockSettings.of(Material.SOIL)
                    .strength(4.0f)),
            ModItemGroups.SQUASHED);

    public static final Block WHITE_COMPRESSED_WOOL = registerBlock("white_compressed_wool",
            new Block(FabricBlockSettings.of(Material.SOIL)
                    .strength(4.0f)),
            ModItemGroups.SQUASHED);

    public static final Block FIRE_CHARGE_BLOCK = registerBlock("fire_charge_block",
            new FireChargeBlock(FabricBlockSettings.of(Material.SOIL)
                    .strength(4.0f)
                    //.sounds(BlockSoundGroup)
            ),
            ModItemGroups.SQUASHED);

//    /**
//     * Behavior from {@link net.leafenzo.squashed.block.FireChargeBlock}
//     */
//    public static final Block COMPRESSED_MAGMA_BLOCK = registerBlock("compressed_magma_block",
//            new FireChargeBlock(FabricBlockSettings.of(Material.SOIL)
//                    .strength(4.0f)),
//            ModItemGroups.SQUASHED);


    public static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name,block,group);
        return Registry.register(Registries.BLOCK, new Identifier(Super.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        BlockItem blockItem = new BlockItem(block, new FabricItemSettings());
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(blockItem));
        return Registry.register(Registries.ITEM, new Identifier(Super.MOD_ID, name), blockItem);
    }

    public static void registerModBlocks() {
        ModInit.LOGGER.debug("Registering mod blocks for " + Super.MOD_ID);
    }
}
