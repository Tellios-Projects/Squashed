package net.leafenzo.squashed.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.leafenzo.squashed.ModInit;
import net.leafenzo.squashed.Super;
import net.leafenzo.squashed.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;



public class ModItemGroups {

    public static final ItemGroup SQUASHED_BLOCKS = FabricItemGroup.builder(new Identifier(Super.MOD_ID, "squashed_blocks"))
            .displayName(Text.translatable("itemgroup.squashed_blocks"))
            .icon(() -> new ItemStack(ModBlocks.COMPRESSED_SPONGE.asItem()))
            .build();

    public static final ItemGroup SQUASHED_COMPACTED = FabricItemGroup.builder(new Identifier(Super.MOD_ID, "squashed_compacted_blocks"))
            .displayName(Text.translatable("itemgroup.squashed_compacted_blocks"))
            .icon(() -> new ItemStack(ModBlocks.COMPRESSED_SPONGE.asItem()))
            .build();

//    public static ItemGroup SQUASHED_BLOCKS = Registry.register(Registries.ITEM_GROUP, new Identifier(Super.MOD_ID, "squashed_blocks"),
//            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.squashed_blocks"))
//                    .icon(() -> new ItemStack(ModBlocks.COMPRESSED_SPONGE.asItem())).entries((displayContext, entries) -> {
//                            entries.add(ModBlocks.COMPRESSED_OAK_LEAVES);
//                            entries.add(ModBlocks.COMPRESSED_SPRUCE_LEAVES);
//                            entries.add(ModBlocks.COMPRESSED_BIRCH_LEAVES);
//                            entries.add(ModBlocks.COMPRESSED_JUNGLE_LEAVES);
//                            entries.add(ModBlocks.COMPRESSED_ACACIA_LEAVES);
//                            entries.add(ModBlocks.COMPRESSED_DARK_OAK_LEAVES);
//                            entries.add(ModBlocks.COMPRESSED_MANGROVE_LEAVES);
//                            entries.add(ModBlocks.COMPRESSED_CHERRY_LEAVES);
//                            entries.add(ModBlocks.COMPRESSED_AZALEA_LEAVES);
//                            entries.add(ModBlocks.COMPRESSED_FLOWERING_AZALEA_LEAVES);
//                            entries.add(ModBlocks.COMPRESSED_NETHER_WART_BLOCK);
//                            entries.add(ModBlocks.COMPRESSED_WARPED_WART_BLOCK);
//                            entries.add(ModBlocks.COMPRESSED_SHROOMLIGHT);
//                            entries.add(ModBlocks.COMPRESSED_OAK_SAPLING);
//                            entries.add(ModBlocks.COMPRESSED_SPRUCE_SAPLING);
//                            entries.add(ModBlocks.COMPRESSED_BIRCH_SAPLING);
//                            entries.add(ModBlocks.COMPRESSED_JUNGLE_SAPLING);
//                            entries.add(ModBlocks.COMPRESSED_ACACIA_SAPLING);
//                            entries.add(ModBlocks.COMPRESSED_DARK_OAK_SAPLING);
//                            entries.add(ModBlocks.COMPRESSED_AZALEA_SAPLING);
//                            entries.add(ModBlocks.COMPRESSED_FLOWERING_AZALEA_SAPLING);
//                            entries.add(ModBlocks.COMPRESSED_MANGROVE_PROPAGULE);
//                            entries.add(ModBlocks.COMPRESSED_CHERRY_SAPLING);
//                            entries.add(ModBlocks.COMPRESSED_CRIMSON_FUNGUS);
//                            entries.add(ModBlocks.COMPRESSED_WARPED_FUNGUS);
//                            entries.add(ModBlocks.GRASS_CLIPPINGS_BLOCK);
//                            entries.add(ModBlocks.FERN_BLOCK);
//                            entries.add(ModBlocks.DEAD_BUSH_BLOCK);
//                            entries.add(ModBlocks.PINK_PETAL_BLOCK);
//                            entries.add(ModBlocks.SUGARCANE_BLOCK);
//                            entries.add(ModBlocks.MANGROVE_ROOTS_BLOCK);
//                            entries.add(ModBlocks.COMPRESSED_CACTUS);
//                            entries.add(ModBlocks.VINE_BLOCK);
//                            entries.add(ModBlocks.GLOW_LICHEN_BLOCK);
//                            entries.add(ModBlocks.WHEAT_SEED_BLOCK);
//                            entries.add(ModBlocks.COCOA_BEANS_BLOCK);
//                            entries.add(ModBlocks.PUMPKIN_SEED_BLOCK);
//                            entries.add(ModBlocks.MELON_SEED_BLOCK);
//                            entries.add(ModBlocks.BEETROOT_SEED_BLOCK);
//                            entries.add(ModBlocks.GLOW_BERRIES_BLOCK);
//                            entries.add(ModBlocks.SWEET_BERRIES_BLOCK);
//                            entries.add(ModBlocks.LILY_PAD_BLOCK);
//                            entries.add(ModBlocks.COMPRESSED_SEAGRASS);
//                            entries.add(ModBlocks.SEA_PICKLE_BLOCK);
//                            entries.add(ModBlocks.KELP_BLOCK);
//                            entries.add(ModBlocks.COMPRESSED_SPONGE);
//                            entries.add(ModBlocks.GLISTERING_MELON_BLOCK);
//                            entries.add(ModBlocks.COMPRESSED_GLISTERING_MELON_BLOCK);
//                            entries.add(ModBlocks.COMPRESSED_MELON);
//                            entries.add(ModBlocks.COMPRESSED_PUMPKIN);
//                            entries.add(ModBlocks.COMPRESSED_HAY_BLOCK);
//                            entries.add(ModBlocks.COMPRESSED_HONEYCOMB_BLOCK);
//                            entries.add(ModBlocks.COMPRESSED_SCAFFOLDING);
//                            entries.add(ModBlocks.COMPRESSED_TNT);
//                            entries.add(ModBlocks.CHARCOAL_BLOCK);
//                            entries.add(ModBlocks.CRYSTAL_QUARTZ_BLOCK);
//                            entries.add(ModBlocks.AMETHYST_SHARD_BLOCK);
//                            entries.add(ModBlocks.STICK_BLOCK);
//                            entries.add(ModBlocks.FLINT_BLOCK);
//                            entries.add(ModBlocks.BONES_BLOCK);
//                            entries.add(ModBlocks.COMPRESSED_COBWEB_BLOCK);
//                            entries.add(ModBlocks.FEATHER_BLOCK);
//                            entries.add(ModBlocks.STRING_BLOCK);
//                            entries.add(ModBlocks.SNOWBALL_BLOCK);
//                            entries.add(ModBlocks.EGG_BLOCK);
//                            entries.add(ModBlocks.LEATHER_BLOCK);
//                            entries.add(ModBlocks.RABBIT_HIDE_BLOCK);
//                            entries.add(ModBlocks.INK_SAC_BLOCK);
//                            entries.add(ModBlocks.GLOW_INK_SAC_BLOCK);
//                            entries.add(ModBlocks.SCUTE_BLOCK);
//                            entries.add(ModBlocks.COMPRESSED_SLIME_BLOCK);
//                            entries.add(ModBlocks.COMPRESSED_HONEY_BLOCK);
//                            entries.add(ModBlocks.CLAY_BALL_BLOCK);
//                            entries.add(ModBlocks.PRISMARINE_CRYSTAL_BLOCK);
//                            entries.add(ModBlocks.HEART_OF_THE_SEA_BLOCK);
//                            entries.add(ModBlocks.NAUTILUS_SHELL_BLOCK);
//                            entries.add(ModBlocks.FIRE_CHARGE_BLOCK);
//                            entries.add(ModBlocks.BLAZE_ROD_BLOCK);
//                            entries.add(ModBlocks.NETHERITE_SCRAP_BLOCK);
//                            entries.add(ModBlocks.NETHER_STAR_BLOCK);
//                            entries.add(ModBlocks.ENDER_PEARL_BLOCK);
//                            entries.add(ModBlocks.ENDER_EYE_BLOCK);
//                            entries.add(ModBlocks.ECHO_SHARD_BLOCK);
//                            entries.add(ModBlocks.BRICKS_BLOCK);
//                            entries.add(ModBlocks.NETHER_BRICKS_BLOCK);
//                            entries.add(ModBlocks.PAPER_BLOCK);
//                            entries.add(ModBlocks.BOOK_BLOCK);
//                            entries.add(ModBlocks.GLOWSTONE_DUST_BLOCK);
//                            entries.add(ModBlocks.REDSTONE_DUST_BLOCK);
//                            entries.add(ModBlocks.GUNPOWDER_BLOCK);
//                            entries.add(ModBlocks.FERMENTED_SPIDER_EYE_BLOCK);
//                            entries.add(ModBlocks.BLAZE_POWDER_BLOCK);
//                            entries.add(ModBlocks.SUGAR_BLOCK);
//                            entries.add(ModBlocks.SPIDER_EYE_BLOCK);
//                            entries.add(ModBlocks.MAGMA_CREAM_BLOCK);
//                            entries.add(ModBlocks.GHAST_TEAR_BLOCK);
//                            entries.add(ModBlocks.PHANTOM_MEMBRANE_BLOCK);
//                            entries.add(ModBlocks.APPLE_BLOCK);
//                            entries.add(ModBlocks.GOLDEN_APPLE_BLOCK);
//                            entries.add(ModBlocks.CHORUS_FRUIT_BLOCK);
//                            entries.add(ModBlocks.CARROT_BLOCK);
//                            entries.add(ModBlocks.GOLDEN_CARROT_BLOCK);
//                            entries.add(ModBlocks.POTATO_BLOCK);
//                            entries.add(ModBlocks.BAKED_POTATO_BLOCK);
//                            entries.add(ModBlocks.POISONOUS_POTATO_BLOCK);
//                            entries.add(ModBlocks.BEETROOT_BLOCK);

//                            entries.add(ModBlocks.RAW_BEEF_BLOCK);
//                            entries.add(ModBlocks.COOKED_BEEF_BLOCK);
//                            entries.add(ModBlocks.RAW_PORK_BLOCK);
//                            entries.add(ModBlocks.COOKED_PORK_BLOCK);
//                            entries.add(ModBlocks.RAW_MUTTON_BLOCK);
//                            entries.add(ModBlocks.COOKED_MUTTON_BLOCK);
//                            entries.add(ModBlocks.RAW_CHICKEN_BLOCK);
//                            entries.add(ModBlocks.COOKED_CHICKEN_BLOCK);
//                            entries.add(ModBlocks.RAW_RABBIT_BLOCK);
//                            entries.add(ModBlocks.COOKED_RABBIT_BLOCK);
//                            entries.add(ModBlocks.RAW_COD_BLOCK);
//                            entries.add(ModBlocks.COOKED_COD_BLOCK);
//                            entries.add(ModBlocks.RAW_SALMON_BLOCK);
//                            entries.add(ModBlocks.COOKED_SALMON_BLOCK);
////                            entries.add(ModBlocks.PUFFERFISH_BLOCK); //TODO uncomment me once this has been reworked!
////                            entries.add(ModBlocks.BREAD_BLOCK);
////                            entries.add(ModBlocks.COOKIE_BLOCK);
//                            entries.add(ModBlocks.ROTTEN_FLESH_BLOCK);
//                            entries.add(ModBlocks.WHITE_DYE_BLOCK);
//                            entries.add(ModBlocks.LIGHT_GRAY_DYE_BLOCK);
//                            entries.add(ModBlocks.GRAY_DYE_BLOCK);
//                            entries.add(ModBlocks.BLACK_DYE_BLOCK);
//                            entries.add(ModBlocks.BROWN_DYE_BLOCK);
//                            entries.add(ModBlocks.RED_DYE_BLOCK);
//                            entries.add(ModBlocks.ORANGE_DYE_BLOCK);
//                            entries.add(ModBlocks.YELLOW_DYE_BLOCK);
//                            entries.add(ModBlocks.LIME_DYE_BLOCK);
//                            entries.add(ModBlocks.GREEN_DYE_BLOCK);
//                            entries.add(ModBlocks.CYAN_DYE_BLOCK);
//                            entries.add(ModBlocks.LIGHT_BLUE_DYE_BLOCK);
//                            entries.add(ModBlocks.BLUE_DYE_BLOCK);
//                            entries.add(ModBlocks.PURPLE_DYE_BLOCK);
//                            entries.add(ModBlocks.MAGENTA_DYE_BLOCK);
//                            entries.add(ModBlocks.PINK_DYE_BLOCK);
//                            entries.add(ModBlocks.WHITE_COMPRESSED_WOOL);
//                            entries.add(ModBlocks.LIGHT_GRAY_COMPRESSED_WOOL);
//                            entries.add(ModBlocks.GRAY_COMPRESSED_WOOL);
//                            entries.add(ModBlocks.BLACK_COMPRESSED_WOOL);
//                            entries.add(ModBlocks.BROWN_COMPRESSED_WOOL);
//                            entries.add(ModBlocks.RED_COMPRESSED_WOOL);
//                            entries.add(ModBlocks.ORANGE_COMPRESSED_WOOL);
//                            entries.add(ModBlocks.YELLOW_COMPRESSED_WOOL);
//                            entries.add(ModBlocks.LIME_COMPRESSED_WOOL);
//                            entries.add(ModBlocks.GREEN_COMPRESSED_WOOL);
//                            entries.add(ModBlocks.CYAN_COMPRESSED_WOOL);
//                            entries.add(ModBlocks.LIGHT_BLUE_COMPRESSED_WOOL);
//                            entries.add(ModBlocks.BLUE_COMPRESSED_WOOL);
//                            entries.add(ModBlocks.PURPLE_COMPRESSED_WOOL);
//                            entries.add(ModBlocks.MAGENTA_COMPRESSED_WOOL);
//                            entries.add(ModBlocks.PINK_COMPRESSED_WOOL);
//                            entries.add(ModBlocks.TROPICAL_FISH_BLOCK_A);
//                            entries.add(ModBlocks.TROPICAL_FISH_BLOCK_B);
//                            entries.add(ModBlocks.TROPICAL_FISH_BLOCK_C);
//                            entries.add(ModBlocks.TROPICAL_FISH_BLOCK_D);
//                            entries.add(ModBlocks.TROPICAL_FISH_BLOCK_E);
//                            entries.add(ModBlocks.TROPICAL_FISH_BLOCK_F);
//                            entries.add(ModBlocks.TROPICAL_FISH_BLOCK_G);
//                            entries.add(ModBlocks.TROPICAL_FISH_BLOCK_H);
//                            entries.add(ModBlocks.TROPICAL_FISH_BLOCK_I);
//                            entries.add(ModBlocks.TROPICAL_FISH_BLOCK_J);
//                            entries.add(ModBlocks.TROPICAL_FISH_BLOCK_K);
//                            entries.add(ModBlocks.TROPICAL_FISH_BLOCK_L);
//                            entries.add(ModBlocks.TROPICAL_FISH_BLOCK_M);
//                            entries.add(ModBlocks.TROPICAL_FISH_BLOCK_N);
//                            entries.add(ModBlocks.TROPICAL_FISH_BLOCK_O);
//                            entries.add(ModBlocks.TROPICAL_FISH_BLOCK_P);
//                            entries.add(ModBlocks.TROPICAL_FISH_BLOCK_Q);
//                            entries.add(ModBlocks.TROPICAL_FISH_BLOCK_R);
//                            entries.add(ModBlocks.TROPICAL_FISH_BLOCK_S);
//                            entries.add(ModBlocks.TROPICAL_FISH_BLOCK_T);
//                            entries.add(ModBlocks.TROPICAL_FISH_BLOCK_U);
//                            entries.add(ModBlocks.EXPERIENCE_BLOCK);
//                            entries.add(ModItems.STACKED_RAILS);
//                            entries.add(ModItems.STACKED_POWERED_RAILS);
//                            entries.add(ModItems.STACKED_MINECARTS);
//                            entries.add(ModItems.STACKED_BUCKETS);
//                            entries.add(ModItems.BUNDLED_NAMETAGS);
//                            entries.add(ModItems.BUNDLED_LEADS);
//                            entries.add(ModItems.STACKED_SADDLES);
//                            entries.add(ModItems.BUNDLED_ARROWS);
//                            entries.add(ModItems.BUNDLED_SPECTRAL_ARROWS);
//                            entries.add(ModItems.BUNDLED_STICKS);
//                            entries.add(ModItems.STACKED_BOWLS);
//                            entries.add(ModItems.BUNDLED_BOTTLES);
//                    }).build());

//    public static ItemGroup SQUASHED_COMPACTED = Registry.register(Registries.ITEM_GROUP, new Identifier(Super.MOD_ID, "squashed_compacted_blocks"),
//            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.squashed_compacted_blocks"))
//                    .icon(() -> new ItemStack(ModBlocks.COMPACTED_TUFF[2].asItem())).entries((displayContext, entries) -> {
//                            for(Block block : ModBlocks.COMPACTED_DIRT) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_MUD) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_CLAY) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_GRAVEL) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_SAND) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_RED_SAND) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_BLUE_ICE) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_SNOW_BLOCKS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_MOSS_BLOCKS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_STONE) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_COBBLESTONE) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_DEEPSLATE) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_COBBLED_DEEPSLATE) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_GRANITE) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_DIORITE) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_ANDESITE) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_CALCITE) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_TUFF) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_DRIPSTONE_BLOCKS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_PRISMARINE) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_MAGMA_BLOCKS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_OBSIDIAN) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_NETHERRACK) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_SOUL_SAND) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_SOUL_SOIL) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_BONE_BLOCKS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_BLACKSTONE) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_BASALT) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_END_STONE) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_COAL_BLOCKS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_RAW_IRON_BLOCKS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_RAW_COPPER_BLOCKS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_RAW_GOLD_BLOCKS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_IRON_BLOCKS) entries.add(block);
//                            entries.add(ModBlocks.COMPACTED_COPPER_BLOCKS[0]);
//                            entries.add(ModBlocks.EXPOSED_COMPRESSED_COPPER_BLOCK);
//                            entries.add(ModBlocks.WEATHERED_COMPRESSED_COPPER_BLOCK);
//                            entries.add(ModBlocks.OXIDIZED_COMPRESSED_COPPER_BLOCK);
//                            entries.add(ModBlocks.WAXED_COMPRESSED_COPPER_BLOCK);
//                            entries.add(ModBlocks.WAXED_EXPOSED_COMPRESSED_COPPER_BLOCK);
//                            entries.add(ModBlocks.WAXED_WEATHERED_COMPRESSED_COPPER_BLOCK);
//                            entries.add(ModBlocks.WAXED_OXIDIZED_COMPRESSED_COPPER_BLOCK);
//                            entries.add(ModBlocks.COMPACTED_COPPER_BLOCKS[1]);
//                            entries.add(ModBlocks.COMPACTED_COPPER_BLOCKS[2]);
//                            entries.add(ModBlocks.COMPACTED_COPPER_BLOCKS[3]);

//                            for(Block block : ModBlocks.COMPACTED_GOLD_BLOCKS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_REDSTONE_BLOCKS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_EMERALD_BLOCKS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_LAPIS_BLOCKS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_DIAMOND_BLOCKS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_NETHERITE_BLOCKS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_GLOWSTONE_BLOCKS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_QUARTZ_BLOCKS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_AMETHYST_BLOCKS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_OAK_LOGS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_SPRUCE_LOGS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_BIRCH_LOGS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_JUNGLE_LOGS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_ACACIA_LOGS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_DARK_OAK_LOGS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_MANGROVE_LOGS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_CHERRY_LOGS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_BAMBOO_BLOCKS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_CRIMSON_STEMS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_WARPED_STEMS) entries.add(block);
//                            for(Block block : ModBlocks.COMPACTED_SCULK) entries.add(block);
//                    }).build());

    public static void registerModItemGroups() {
        ModInit.LOGGER.debug("Registering item groups for " + Super.MOD_ID);
    }
}
