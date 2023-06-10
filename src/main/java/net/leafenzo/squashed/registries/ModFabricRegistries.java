package net.leafenzo.squashed.registries;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.leafenzo.squashed.block.ModBlocks;


public class ModFabricRegistries {
    public static void registerOxidizableBlocks() {
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COMPRESSED_COPPER_BLOCK, ModBlocks.COMPRESSED_EXPOSED_COPPER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COMPRESSED_EXPOSED_COPPER, ModBlocks.COMPRESSED_WEATHERED_COPPER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COMPRESSED_WEATHERED_COPPER, ModBlocks.COMPRESSED_OXIDIZED_COPPER);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COMPRESSED_COPPER_BLOCK, ModBlocks.WAXED_COMPRESSED_COPPER_BLOCK);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COMPRESSED_EXPOSED_COPPER, ModBlocks.WAXED_COMPRESSED_EXPOSED_COPPER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COMPRESSED_WEATHERED_COPPER, ModBlocks.WAXED_COMPRESSED_WEATHERED_COPPER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COMPRESSED_OXIDIZED_COPPER, ModBlocks.WAXED_COMPRESSED_OXIDIZED_COPPER);
    }

    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();
        registry.add(ModBlocks.BLAZE_POWDER_BLOCK, 65536, 65536);
        registry.add(ModBlocks.WHITE_COMPRESSED_WOOL, 60, 30);
        registry.add(ModBlocks.ORANGE_COMPRESSED_WOOL, 60, 30);
        registry.add(ModBlocks.MAGENTA_COMPRESSED_WOOL, 60, 30);
        registry.add(ModBlocks.LIGHT_BLUE_COMPRESSED_WOOL, 60, 30);
        registry.add(ModBlocks.YELLOW_COMPRESSED_WOOL, 60, 30);
        registry.add(ModBlocks.LIME_COMPRESSED_WOOL, 60, 30);
        registry.add(ModBlocks.PINK_COMPRESSED_WOOL, 60, 30);
        registry.add(ModBlocks.GRAY_COMPRESSED_WOOL, 60, 30);
        registry.add(ModBlocks.LIGHT_GRAY_COMPRESSED_WOOL, 60, 30);
        registry.add(ModBlocks.CYAN_COMPRESSED_WOOL, 60, 30);
        registry.add(ModBlocks.PURPLE_COMPRESSED_WOOL, 60, 30);
        registry.add(ModBlocks.BLUE_COMPRESSED_WOOL, 60, 30);
        registry.add(ModBlocks.BROWN_COMPRESSED_WOOL, 60, 30);
        registry.add(ModBlocks.GREEN_COMPRESSED_WOOL, 60, 30);
        registry.add(ModBlocks.RED_COMPRESSED_WOOL, 60, 30);
        registry.add(ModBlocks.BLACK_COMPRESSED_WOOL, 60, 30);
        registry.add(ModBlocks.BOOK_BLOCK, 20, 30);
        registry.add(ModBlocks.COMPRESSED_OAK_LEAVES, 75, 80);
        registry.add(ModBlocks.COMPRESSED_SPRUCE_LEAVES, 75, 80);
        registry.add(ModBlocks.COMPRESSED_BIRCH_LEAVES, 75, 80);
        registry.add(ModBlocks.COMPRESSED_JUNGLE_LEAVES, 75, 80);
        registry.add(ModBlocks.COMPRESSED_ACACIA_LEAVES, 75, 80);
        registry.add(ModBlocks.COMPRESSED_DARK_OAK_LEAVES, 75, 80);
        registry.add(ModBlocks.COMPRESSED_MANGROVE_LEAVES, 75, 80);
        registry.add(ModBlocks.COMPRESSED_AZALEA_LEAVES, 75, 80);
        registry.add(ModBlocks.COMPRESSED_FLOWERING_AZALEA_LEAVES, 60, 60);
        registry.add(ModBlocks.COMPRESSED_OAK_LOG, 5, 5);
        registry.add(ModBlocks.COMPRESSED_SPRUCE_LOG, 5, 5);
        registry.add(ModBlocks.COMPRESSED_BIRCH_LOG, 5, 5);
        registry.add(ModBlocks.COMPRESSED_JUNGLE_LOG, 5, 5);
        registry.add(ModBlocks.COMPRESSED_ACACIA_LOG, 5, 5);
        registry.add(ModBlocks.COMPRESSED_DARK_OAK_LOG, 5, 5);
        registry.add(ModBlocks.COMPRESSED_MANGROVE_LOG, 5, 5);
        registry.add(ModBlocks.COMPRESSED_BAMBOO, 20, 5);
        registry.add(ModBlocks.COMPRESSED_OAK_SAPLING, 20, 5);
        registry.add(ModBlocks.COMPRESSED_SPRUCE_SAPLING, 20, 5);
        registry.add(ModBlocks.COMPRESSED_BIRCH_SAPLING, 20, 5);
        registry.add(ModBlocks.COMPRESSED_JUNGLE_SAPLING, 20, 5);
        registry.add(ModBlocks.COMPRESSED_ACACIA_SAPLING, 20, 5);
        registry.add(ModBlocks.COMPRESSED_DARK_OAK_SAPLING, 20, 5);
        registry.add(ModBlocks.COMPRESSED_AZALEA_SAPLING, 20, 5);
        registry.add(ModBlocks.COMPRESSED_FLOWERING_AZALEA_SAPLING, 20, 5);
        registry.add(ModBlocks.COMPRESSED_COAL_BLOCK, 1, 12);
    }
}
