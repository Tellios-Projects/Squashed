package net.leafenzo.squashed.registries;

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
}
