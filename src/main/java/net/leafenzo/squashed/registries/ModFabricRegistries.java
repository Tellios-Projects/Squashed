package net.leafenzo.squashed.registries;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.leafenzo.squashed.ModInit;
import net.leafenzo.squashed.Super;
import net.leafenzo.squashed.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemConvertible;


public class ModFabricRegistries {
    public static void registerOxidizableBlocks() {
        ModInit.LOGGER.debug("Registering Oxidizable Blocks for " + Super.MOD_ID);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COMPRESSED_COPPER_BLOCK, ModBlocks.EXPOSED_COMPRESSED_COPPER_BLOCK);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COMPRESSED_COPPER_BLOCK, ModBlocks.WEATHERED_COMPRESSED_COPPER_BLOCK);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COMPRESSED_COPPER_BLOCK, ModBlocks.OXIDIZED_COMPRESSED_COPPER_BLOCK);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COMPRESSED_COPPER_BLOCK, ModBlocks.WAXED_COMPRESSED_COPPER_BLOCK);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COMPRESSED_COPPER_BLOCK, ModBlocks.WAXED_EXPOSED_COMPRESSED_COPPER_BLOCK);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COMPRESSED_COPPER_BLOCK, ModBlocks.WAXED_WEATHERED_COMPRESSED_COPPER_BLOCK);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COMPRESSED_COPPER_BLOCK, ModBlocks.WAXED_OXIDIZED_COMPRESSED_COPPER_BLOCK);
    }

    public static void registerFlammableBlocks() {
        ModInit.LOGGER.debug("Registering Flammable Blocks for " + Super.MOD_ID);
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();
        registry.add(ModBlocks.BLAZE_POWDER_BLOCK, 65536, 65536);

        for(Block block : ModBlocks.COMPRESSED_WOOL_BLOCKS) {
            registry.add(block, 60, 30);
        }

        registry.add(ModBlocks.BOOK_BLOCK, 20, 30);
        registry.add(ModBlocks.PAPER_BLOCK, 20, 30);
        registry.add(ModBlocks.FEATHER_BLOCK, 50, 100);

        registry.add(ModBlocks.COMPRESSED_CACTUS, 5, 5);
        registry.add(ModBlocks.VINE_BLOCK, 50, 15);
        registry.add(ModBlocks.GRASS_CLIPPINGS_BLOCK, 75, 80);
        registry.add(ModBlocks.COMPRESSED_SCAFFOLDING, 20, 5);

        registry.add(ModBlocks.DEAD_BUSH_BLOCK, 60, 30);
        registry.add(ModBlocks.COMPRESSED_HAY_BLOCK, 60, 20);


        registry.add(ModBlocks.GLOW_BERRIES_BLOCK, 75, 80);
        registry.add(ModBlocks.SWEET_BERRIES_BLOCK, 75, 80);

        registry.add(ModBlocks.SUGAR_BLOCK, 20, 5);
        registry.add(ModBlocks.SUGARCANE_BLOCK, 20, 5);

        registry.add(ModBlocks.COMPRESSED_OAK_LEAVES, 75, 80);
        registry.add(ModBlocks.COMPRESSED_SPRUCE_LEAVES, 75, 80);
        registry.add(ModBlocks.COMPRESSED_BIRCH_LEAVES, 75, 80);
        registry.add(ModBlocks.COMPRESSED_JUNGLE_LEAVES, 75, 80);
        registry.add(ModBlocks.COMPRESSED_ACACIA_LEAVES, 75, 80);
        registry.add(ModBlocks.COMPRESSED_DARK_OAK_LEAVES, 75, 80);
        registry.add(ModBlocks.COMPRESSED_MANGROVE_LEAVES, 75, 80);
        registry.add(ModBlocks.COMPRESSED_AZALEA_LEAVES, 75, 80);
        registry.add(ModBlocks.COMPRESSED_FLOWERING_AZALEA_LEAVES, 60, 60);

        for(Block block : ModBlocks.COMPACTED_OAK_LOGS) { registry.add(block, 5, 5);  }
        for(Block block : ModBlocks.COMPACTED_SPRUCE_LOGS) { registry.add(block, 5, 5);  }
        for(Block block : ModBlocks.COMPACTED_BIRCH_LOGS) { registry.add(block, 5, 5);  }
        for(Block block : ModBlocks.COMPACTED_JUNGLE_LOGS) { registry.add(block, 5, 5);  }
        for(Block block : ModBlocks.COMPACTED_ACACIA_LOGS) { registry.add(block, 5, 5);  }
        for(Block block : ModBlocks.COMPACTED_DARK_OAK_LOGS) { registry.add(block, 5, 5);  }
        for(Block block : ModBlocks.COMPACTED_MANGROVE_LOGS) { registry.add(block, 5, 5);  }
        for(Block block : ModBlocks.COMPACTED_CHERRY_LOGS) { registry.add(block, 5, 5); }
        for(Block block : ModBlocks.COMPACTED_BAMBOO_BLOCKS) { registry.add(block, 20, 5); }

        registry.add(ModBlocks.COMPRESSED_OAK_SAPLING, 10, 5);
        registry.add(ModBlocks.COMPRESSED_SPRUCE_SAPLING, 10, 5);
        registry.add(ModBlocks.COMPRESSED_BIRCH_SAPLING, 10, 5);
        registry.add(ModBlocks.COMPRESSED_JUNGLE_SAPLING, 10, 5);
        registry.add(ModBlocks.COMPRESSED_ACACIA_SAPLING, 10, 5);
        registry.add(ModBlocks.COMPRESSED_DARK_OAK_SAPLING, 10, 5);
        registry.add(ModBlocks.COMPRESSED_AZALEA_SAPLING, 10, 5);
        registry.add(ModBlocks.COMPRESSED_FLOWERING_AZALEA_SAPLING, 20, 5);

        for(Block block : ModBlocks.COMPACTED_COAL_BLOCKS) { registry.add(block, 1, 12); }
        registry.add(ModBlocks.CHARCOAL_BLOCK, 1, 5); // lower burn chance in case we ever get around to doing that tree burning mixin
    }

    public static void registerFuels() {
        ModInit.LOGGER.debug("Registering Smelting Fuels for " + Super.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        for(ItemConvertible item : ModBlocks.COMPRESSED_WOOL_BLOCKS) {
            registry.add(item, 300);
        }

        registry.add(ModBlocks.CHARCOAL_BLOCK, 800);
        // registerCompactedFuels(registry, ModBlocks.COMPACTED_COAL_BLOCKS, 16000); //7200 S (2 hours), 64800 S (18 hours), 583200 S (6.75 days), 5248800 S (60 days) // fabric doesn't allow it :(
                                                        //coal block =  13.33 minutes
        registry.add(ModBlocks.COMPACTED_COAL_BLOCKS[0], 144000); //2 hours
        registry.add(ModBlocks.COMPACTED_COAL_BLOCKS[1], 655340); //9 hours
        //registry.add(ModBlocks.COMPACTED_COAL_BLOCKS[2], 655340); //9 hours //Don't let people waste it if it doesn't actually improve nothin. //TODO ask el about this
        //registry.add(ModBlocks.COMPACTED_COAL_BLOCKS[3], 655340); //9 hours

        registerCompactedFuels(registry, ModBlocks.COMPACTED_OAK_LOGS, 300); //135 S (2 minutes), 1215 S (20 minutes), 10935 S (3 hours), 98415 S (1 day)
        registerCompactedFuels(registry, ModBlocks.COMPACTED_SPRUCE_LOGS, 300);
        registerCompactedFuels(registry, ModBlocks.COMPACTED_BIRCH_LOGS, 300);
        registerCompactedFuels(registry, ModBlocks.COMPACTED_JUNGLE_LOGS, 300);
        registerCompactedFuels(registry, ModBlocks.COMPACTED_ACACIA_LOGS, 300);
        registerCompactedFuels(registry, ModBlocks.COMPACTED_DARK_OAK_LOGS, 300);
        registerCompactedFuels(registry, ModBlocks.COMPACTED_MANGROVE_LOGS, 300);
        registerCompactedFuels(registry, ModBlocks.COMPACTED_CHERRY_LOGS, 300);
        registerCompactedFuels(registry, ModBlocks.COMPACTED_BAMBOO_BLOCKS, 300);

        registry.add(ModBlocks.COMPRESSED_CHERRY_SAPLING, 900);
        registry.add(ModBlocks.COMPRESSED_OAK_SAPLING, 900);
        registry.add(ModBlocks.COMPRESSED_SPRUCE_SAPLING, 900);
        registry.add(ModBlocks.COMPRESSED_BIRCH_SAPLING, 900);
        registry.add(ModBlocks.COMPRESSED_JUNGLE_SAPLING, 900);
        registry.add(ModBlocks.COMPRESSED_ACACIA_SAPLING, 900);
        registry.add(ModBlocks.COMPRESSED_DARK_OAK_SAPLING, 900);
        registry.add(ModBlocks.COMPRESSED_AZALEA_SAPLING, 900);
        registry.add(ModBlocks.COMPRESSED_FLOWERING_AZALEA_SAPLING, 900);
        registry.add(ModBlocks.COMPRESSED_MANGROVE_PROPAGULE, 900);
        registry.add(ModBlocks.FEATHER_BLOCK, 100);
        registry.add(ModBlocks.MANGROVE_ROOTS_BLOCK, 2700);
        registry.add(ModBlocks.PAPER_BLOCK, 200);
        registry.add(ModBlocks.COMPRESSED_SCAFFOLDING, 300);
        registry.add(ModBlocks.SUGARCANE_BLOCK, 300);
        registry.add(ModBlocks.DEAD_BUSH_BLOCK, 300);
        registry.add(ModBlocks.GRASS_CLIPPINGS_BLOCK, 300);
    }

    private static void registerCompactedFuels(FuelRegistry registry, ItemConvertible[] compactedItems, int burnTimePerOne) {
        for (int i = 0; i < compactedItems.length; i++) {
            int t = Math.max(burnTimePerOne * (9 * (i+1)), 32767);
//                System.out.println("registering burn time of: " + t + " ticks for " + compactedItems[i].asItem().getName());
            registry.add(compactedItems[i], t);
        }
    }

    public static void registerCompostingChances() {
        ModInit.LOGGER.debug("Registering composting chances for " + Super.MOD_ID);
        CompostingChanceRegistry compostingChanceRegistry = CompostingChanceRegistry.INSTANCE;

        //1.0 - 0.3 = 0.7
        //0.7 ^ 9 = 0.000019683 //chances of getting all losses in row if a 30% chance win is repeated nine times.
        //1 - ans = ~0.99998
        compostingChanceRegistry.add(ModBlocks.WHEAT_SEED_BLOCK, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.BEETROOT_SEED_BLOCK, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.MELON_SEED_BLOCK, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.PUMPKIN_SEED_BLOCK, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.GRASS_CLIPPINGS_BLOCK, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.FERN_BLOCK, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.KELP_BLOCK, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_SEAGRASS, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.SWEET_BERRIES_BLOCK, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.GLOW_BERRIES_BLOCK, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_OAK_LEAVES, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_SPRUCE_LEAVES, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_BIRCH_LEAVES, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_JUNGLE_LEAVES, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_ACACIA_LEAVES, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_DARK_OAK_LEAVES, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_MANGROVE_LEAVES, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_AZALEA_LEAVES, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_FLOWERING_AZALEA_LEAVES, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_CHERRY_SAPLING, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_OAK_SAPLING, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_SPRUCE_SAPLING, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_BIRCH_SAPLING, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_JUNGLE_SAPLING, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_ACACIA_SAPLING, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_DARK_OAK_SAPLING, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_AZALEA_SAPLING, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_FLOWERING_AZALEA_SAPLING, 0.95964f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_MANGROVE_PROPAGULE, 0.95964f);

        //0.5 ^ 9 = ~0.99805
        compostingChanceRegistry.add(ModBlocks.VINE_BLOCK, 0.99805f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_CACTUS, 0.99805f);
        compostingChanceRegistry.add(ModBlocks.GLOW_LICHEN_BLOCK, 0.99805f);
        compostingChanceRegistry.add(ModBlocks.SUGARCANE_BLOCK, 0.99805f);

        // ideally these ones would fill up more than one... but I don't really have the time to figure out how to program that at the moment //TODO come back to this maybe?
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_MELON, 1.0f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_PUMPKIN, 1.0f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_HAY_BLOCK, 1.0f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_NETHER_WART_BLOCK, 1.0f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_WARPED_WART_BLOCK, 1.0f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_CRIMSON_FUNGUS, 1.0f);
        compostingChanceRegistry.add(ModBlocks.COMPRESSED_WARPED_FUNGUS, 1.0f);
        compostingChanceRegistry.add(ModBlocks.POTATO_BLOCK, 1.0f);
        compostingChanceRegistry.add(ModBlocks.CARROT_BLOCK, 1.0f);
        compostingChanceRegistry.add(ModBlocks.APPLE_BLOCK, 1.0f);
        compostingChanceRegistry.add(ModBlocks.BEETROOT_BLOCK, 1.0f);
        compostingChanceRegistry.add(ModBlocks.SEA_PICKLE_BLOCK, 1.0f);
        compostingChanceRegistry.add(ModBlocks.COMPACTED_MOSS_BLOCKS[0], 1.0f); // not going past compression tier one for this in case someone accidentally right click's a composter with an entire endangered wetland ecosystem's worth of moss in their hand
    }
}
