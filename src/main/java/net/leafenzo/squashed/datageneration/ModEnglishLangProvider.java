package net.leafenzo.squashed.datageneration;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.leafenzo.squashed.Super;
import net.leafenzo.squashed.block.ModBlocks;
import net.leafenzo.squashed.util.ModUtil;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import org.apache.http.annotation.Obsolete;

import java.util.HashSet;
import java.util.Set;

import static net.leafenzo.squashed.util.ModUtil.toSentanceCase;

public class ModEnglishLangProvider extends FabricLanguageProvider {
    Set<String> usedTranslationKeys = new HashSet<String>(); // For duplicate handling

    public ModEnglishLangProvider(FabricDataOutput dataGenerator) {
        super(dataGenerator, "en_us");
    }
    private void generateTranslation(TranslationBuilder translationBuilder, String key, String translation) {
        if(usedTranslationKeys.contains(key)) {
            //("Duplicate translation key " + key + " ignored"); //TODO, figure out how the heck do we print to debug from datagen?
            return;
        }
        translationBuilder.add(key, translation);
        usedTranslationKeys.add(key);
    }
    private void generateTranslation(TranslationBuilder translationBuilder, Block block, String translation) {
        generateTranslation(translationBuilder, block.getTranslationKey(), translation);
    }
    private void generateTranslation(TranslationBuilder translationBuilder, Item item, String translation) {
        generateTranslation(translationBuilder, item.getTranslationKey(), translation);
    }
//    private void generateTranslation(TranslationBuilder translationBuilder, ItemGroup itemGroup, String translation) {
//        generateTranslation(translationBuilder, "itemgroup." + Registries.ITEM_GROUP.getId(itemGroup).getPath(), translation);
//    }
    private void generatePotionTranslation(TranslationBuilder translationBuilder,  String subKey, String effectName) {
        String potionKey = "item.minecraft.potion.effect." + subKey;
        generateTranslation(translationBuilder, potionKey, "Potion of " + effectName);

        String splashPotionKey = "item.minecraft.splash_potion.effect." + subKey;
        generateTranslation(translationBuilder, splashPotionKey, "Splash Potion of " + effectName);

        String lingeringPotionKey = "item.minecraft.lingering_potion.effect." + subKey;
        generateTranslation(translationBuilder, lingeringPotionKey, "Lingering Potion of " + effectName);

        String arrowKey = "item.minecraft.tipped_arrow.effect." + subKey;
        generateTranslation(translationBuilder, arrowKey, "Arrow of " + effectName);
    }

    private static String replaceCompressionTierName(Block block, String rawReplacement) {
        String blockPath = Registries.BLOCK.getId(block).getPath();
        for (String tier : ModBlocks.compressionTierNames) blockPath = blockPath.replace(tier, rawReplacement);
        return blockPath;
    }
    /**
     * Really circumstantial, check if you even ought to use this
     */
    @Obsolete
    private void generateTranslationUsingPileNamingScheme(TranslationBuilder translationBuilder, Block block) {
        generateTranslation(translationBuilder, block, toSentanceCase(replaceCompressionTierName(block, "pile_of")));
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        //Manual
//        generateTranslation(translationBuilder, ModItemGroups.SQUASHED_BLOCKS, "Squashed!");
//        generateTranslation(translationBuilder, ModItemGroups.SQUASHED_COMPACTED, "Squashed! - Compacted Blocks");

        generateTranslation(translationBuilder, ModBlocks.WHITE_COMPRESSED_WOOL, "Spool of White Wool");
        generateTranslation(translationBuilder, ModBlocks.LIGHT_GRAY_COMPRESSED_WOOL, "Spool of Light Gray Wool");
        generateTranslation(translationBuilder, ModBlocks.GRAY_COMPRESSED_WOOL, "Spool of Gray Wool");
        generateTranslation(translationBuilder, ModBlocks.BLACK_COMPRESSED_WOOL, "Spool of Black Wool");
        generateTranslation(translationBuilder, ModBlocks.BROWN_COMPRESSED_WOOL, "Spool of Brown Wool");
        generateTranslation(translationBuilder, ModBlocks.RED_COMPRESSED_WOOL, "Spool of Red Wool");
        generateTranslation(translationBuilder, ModBlocks.ORANGE_COMPRESSED_WOOL, "Spool of Orange Wool");
        generateTranslation(translationBuilder, ModBlocks.YELLOW_COMPRESSED_WOOL, "Spool of Yellow Wool");
        generateTranslation(translationBuilder, ModBlocks.LIME_COMPRESSED_WOOL, "Spool of Lime Wool");
        generateTranslation(translationBuilder, ModBlocks.GREEN_COMPRESSED_WOOL, "Spool of Green Wool");
        generateTranslation(translationBuilder, ModBlocks.CYAN_COMPRESSED_WOOL, "Spool of Cyan Wool");
        generateTranslation(translationBuilder, ModBlocks.LIGHT_BLUE_COMPRESSED_WOOL, "Spool of Light Blue Wool");
        generateTranslation(translationBuilder, ModBlocks.BLUE_COMPRESSED_WOOL, "Spool of Blue Wool");
        generateTranslation(translationBuilder, ModBlocks.PURPLE_COMPRESSED_WOOL, "Spool of Purple Wool");
        generateTranslation(translationBuilder, ModBlocks.MAGENTA_COMPRESSED_WOOL, "Spool of Magenta Wool");
        generateTranslation(translationBuilder, ModBlocks.PINK_COMPRESSED_WOOL, "Spool of Pink Wool");

        generateTranslation(translationBuilder, ModBlocks.COMPACTED_REDSTONE_BLOCKS[0], "Critical Redstone Block");
        generateTranslation(translationBuilder, ModBlocks.COMPACTED_REDSTONE_BLOCKS[1], "Supercritical Redstone Block");

        generateTranslation(translationBuilder, ModBlocks.COMPACTED_QUARTZ_BLOCKS[0], "Pure Quartz Block");
        generateTranslation(translationBuilder, ModBlocks.COMPACTED_DIAMOND_BLOCKS[0], "Pure Diamond Block");
        generateTranslation(translationBuilder, ModBlocks.COMPACTED_EMERALD_BLOCKS[0], "Pure Emerald Block");
        generateTranslation(translationBuilder, ModBlocks.COMPACTED_AMETHYST_BLOCKS[0], "Pure Amethyst Block");
        generateTranslation(translationBuilder, ModBlocks.COMPACTED_OBSIDIAN[0], "Obsidian Glass");

        generateTranslation(translationBuilder, ModBlocks.COMPACTED_SOUL_SAND[0], "Packed Soul Sand");
        generateTranslation(translationBuilder, ModBlocks.COMPACTED_SOUL_SAND[1], "Overcrowded Soul Sand");
        generateTranslation(translationBuilder, ModBlocks.COMPACTED_SOUL_SAND[2], "Agonized Soul Sand");
        generateTranslation(translationBuilder, ModBlocks.COMPACTED_SOUL_SAND[3], "Block of Drowned out Voices");

        generateTranslation(translationBuilder, ModBlocks.ROTTEN_FLESH_BLOCK, "Heap of Rotten Flesh");
        generateTranslation(translationBuilder, ModBlocks.SPIDER_EYE_BLOCK, "Heap of Spider Eyes");
        generateTranslation(translationBuilder, ModBlocks.FERMENTED_SPIDER_EYE_BLOCK, "Heap of Fermented Spider Eyes");
        generateTranslation(translationBuilder, ModBlocks.ENDER_PEARL_BLOCK, "Heap of Ender Pearls");
        generateTranslation(translationBuilder, ModBlocks.ENDER_EYE_BLOCK, "Heap of Ender Eyes");

        generateTranslation(translationBuilder, ModBlocks.RAW_BEEF_BLOCK, "Heap of Raw Beef");
        generateTranslation(translationBuilder, ModBlocks.RAW_CHICKEN_BLOCK, "Heap of Raw Chicken");
        generateTranslation(translationBuilder, ModBlocks.RAW_COD_BLOCK, "Heap of Raw Cod");
        generateTranslation(translationBuilder, ModBlocks.RAW_SALMON_BLOCK, "Heap of Raw Salmon");
        generateTranslation(translationBuilder, ModBlocks.RAW_PORK_BLOCK, "Heap of Raw Pork");
        generateTranslation(translationBuilder, ModBlocks.RAW_MUTTON_BLOCK, "Heap of Raw Mutton");
        generateTranslation(translationBuilder, ModBlocks.RAW_RABBIT_BLOCK, "Heap of Raw Rabbit");

        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_COBWEB_BLOCK, "Clump of Cobwebs");

//        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_CHERRY_SAPLING, "Cherry Mulch");
        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_OAK_SAPLING, "Oak Mulch");
        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_SPRUCE_SAPLING, "Spruce Mulch");
        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_BIRCH_SAPLING, "Birch Mulch");
        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_JUNGLE_SAPLING, "Jungle Mulch");
        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_ACACIA_SAPLING, "Acacia Mulch");
        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_DARK_OAK_SAPLING, "Dark Oak Mulch");
        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_AZALEA_SAPLING, "Azalea Mulch");
        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_FLOWERING_AZALEA_SAPLING, "Flowering Azalea Mulch");
        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_MANGROVE_PROPAGULE, "Mangrove Mulch");
        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_CRIMSON_FUNGUS, "Crimson Mulch");
        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_WARPED_FUNGUS, "Warped Mulch");
        generateTranslationUsingPileNamingScheme(translationBuilder, ModBlocks.COMPRESSED_OAK_LEAVES);
        generateTranslationUsingPileNamingScheme(translationBuilder, ModBlocks.COMPRESSED_SPRUCE_LEAVES);
        generateTranslationUsingPileNamingScheme(translationBuilder, ModBlocks.COMPRESSED_BIRCH_LEAVES);
        generateTranslationUsingPileNamingScheme(translationBuilder, ModBlocks.COMPRESSED_JUNGLE_LEAVES);
        generateTranslationUsingPileNamingScheme(translationBuilder, ModBlocks.COMPRESSED_ACACIA_LEAVES);
        generateTranslationUsingPileNamingScheme(translationBuilder, ModBlocks.COMPRESSED_DARK_OAK_LEAVES);
        generateTranslationUsingPileNamingScheme(translationBuilder, ModBlocks.COMPRESSED_MANGROVE_LEAVES);
        generateTranslationUsingPileNamingScheme(translationBuilder, ModBlocks.COMPRESSED_AZALEA_LEAVES);
        generateTranslationUsingPileNamingScheme(translationBuilder, ModBlocks.COMPRESSED_FLOWERING_AZALEA_LEAVES);
        generateTranslationUsingPileNamingScheme(translationBuilder, ModBlocks.COMPRESSED_CHERRY_LEAVES);

        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_NETHER_WART_BLOCK, "Pile of Nether Wart");
        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_SPONGE, "Menger Sponge");

        generateTranslation(translationBuilder, ModBlocks.BOOK_BLOCK, "Pile of Books");
        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_PUMPKIN, "Pile of Pumpkins");
        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_MELON, "Pile of Melons");
        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_HAY_BLOCK, "Pile of Hay");

        generateTranslation(translationBuilder, ModBlocks.GRASS_CLIPPINGS_BLOCK, "Pile of Grass Clippings");
        generateTranslation(translationBuilder, ModBlocks.FERN_BLOCK, "Pile of Fern Clippings");
        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_SEAGRASS, "Pile of Seagrass");
        generateTranslation(translationBuilder, ModBlocks.KELP_BLOCK, "Pile of Wet Kelp");

        generateTranslation(translationBuilder, ModBlocks.COCOA_BEANS_BLOCK, "Pile of Cocoa Beans");

        generateTranslation(translationBuilder, ModBlocks.WHEAT_SEED_BLOCK, "Pile of Wheat Seeds");
        generateTranslation(translationBuilder, ModBlocks.PUMPKIN_SEED_BLOCK, "Pile of Pumpkin Seeds");
        generateTranslation(translationBuilder, ModBlocks.BEETROOT_SEED_BLOCK, "Pile of Beetroot Seeds");
        generateTranslation(translationBuilder, ModBlocks.MELON_SEED_BLOCK, "Pile of Melon Seeds");

        generateTranslation(translationBuilder, ModBlocks.CARROT_BLOCK, "Pile of Carrots");
        generateTranslation(translationBuilder, ModBlocks.GOLDEN_CARROT_BLOCK, "Pile of Golden Carrots");
        generateTranslation(translationBuilder, ModBlocks.APPLE_BLOCK, "Pile of Apples");
        generateTranslation(translationBuilder, ModBlocks.GOLDEN_APPLE_BLOCK, "Pile of Golden Apples");
        generateTranslation(translationBuilder, ModBlocks.POTATO_BLOCK, "Pile of Potatoes");
        generateTranslation(translationBuilder, ModBlocks.POISONOUS_POTATO_BLOCK, "Pile of Poisonous Potatoes");
        generateTranslation(translationBuilder, ModBlocks.BAKED_POTATO_BLOCK, "Pile of Baked Potatoes");
        generateTranslation(translationBuilder, ModBlocks.BEETROOT_BLOCK, "Pile of Beetroots");

        generateTranslation(translationBuilder, ModBlocks.EGG_BLOCK, "Pile of Eggs");
        generateTranslation(translationBuilder, ModBlocks.PAPER_BLOCK, "Pile of Paper");
        generateTranslation(translationBuilder, ModBlocks.BONES_BLOCK, "Pile of Bones");
        generateTranslation(translationBuilder, ModBlocks.ECHO_SHARD_BLOCK, "Pile of Echo Shards");
        generateTranslation(translationBuilder, ModBlocks.BRICKS_BLOCK, "Pile of Bricks");
        generateTranslation(translationBuilder, ModBlocks.NETHER_BRICKS_BLOCK, "Pile of Nether Bricks");
        generateTranslation(translationBuilder, ModBlocks.STRING_BLOCK, "Spool of String");
        generateTranslation(translationBuilder, ModBlocks.MANGROVE_ROOTS_BLOCK, "Block of Mangrove Roots");
        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_HONEY_BLOCK, "Coagulated Honey");
        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_SLIME_BLOCK, "Coagulated Slime");

        generateTranslation(translationBuilder, ModBlocks.EXPERIENCE_BLOCK, "Coagulated Experience");
//        generateTranslation(translationBuilder, ModBlocks.PINK_PETAL_BLOCK, "Pile of Pink Petals");
        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_SHROOMLIGHT, "Shroomlight Spore Block");
        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_NETHER_WART_BLOCK, "Pile of Nether Wart");
        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_HONEYCOMB_BLOCK, "Stacked Honeycomb");




        //TODO figure out a naming convention here that makes these easier to search for in the creative menu, you should ask el for ideas about this
        generateTranslation(translationBuilder, ModBlocks.TROPICAL_FISH_BLOCK_A, "Ocellaris Clownfish Block");
        generateTranslation(translationBuilder, ModBlocks.TROPICAL_FISH_BLOCK_B, "Peacock Cichlid Block");
        generateTranslation(translationBuilder, ModBlocks.TROPICAL_FISH_BLOCK_C, "Emperor Red Snapper Block");
        generateTranslation(translationBuilder, ModBlocks.TROPICAL_FISH_BLOCK_D, "Lake Kutubu Rainbowfish Block");
        generateTranslation(translationBuilder, ModBlocks.TROPICAL_FISH_BLOCK_E, "Goldfish Block");
        generateTranslation(translationBuilder, ModBlocks.TROPICAL_FISH_BLOCK_F, "Red Snapper Block");
        generateTranslation(translationBuilder, ModBlocks.TROPICAL_FISH_BLOCK_G, "Cotton Candy Betta Block");
        generateTranslation(translationBuilder, ModBlocks.TROPICAL_FISH_BLOCK_H, "Blue Tang Block");
        generateTranslation(translationBuilder, ModBlocks.TROPICAL_FISH_BLOCK_I, "Splendid Dottyback Block");
        generateTranslation(translationBuilder, ModBlocks.TROPICAL_FISH_BLOCK_J, "Gray Triggerfish Block");
        generateTranslation(translationBuilder, ModBlocks.TROPICAL_FISH_BLOCK_K, "Yellowtail Parrotfish Block");
        generateTranslation(translationBuilder, ModBlocks.TROPICAL_FISH_BLOCK_L, "Purple Tang Block");
        generateTranslation(translationBuilder, ModBlocks.TROPICAL_FISH_BLOCK_M, "Green Sunfish Block");
        generateTranslation(translationBuilder, ModBlocks.TROPICAL_FISH_BLOCK_N, "Red Lipped Blenny Block");
        generateTranslation(translationBuilder, ModBlocks.TROPICAL_FISH_BLOCK_O, "Moorish Idol Block");
        generateTranslation(translationBuilder, ModBlocks.TROPICAL_FISH_BLOCK_P, "Starry Rockfish Block");
        generateTranslation(translationBuilder, ModBlocks.TROPICAL_FISH_BLOCK_Q, "Largemouth Bass Block");
        generateTranslation(translationBuilder, ModBlocks.TROPICAL_FISH_BLOCK_R, "Orchid Dottyback Block");
        generateTranslation(translationBuilder, ModBlocks.TROPICAL_FISH_BLOCK_S, "Flying Fish Block");
        generateTranslation(translationBuilder, ModBlocks.TROPICAL_FISH_BLOCK_T, "Mahi-Mahi Block");
        generateTranslation(translationBuilder, ModBlocks.TROPICAL_FISH_BLOCK_U, "Pufferfish Block");

        //Automatic
        for(Identifier id : ModUtil.allBlockIdsInNamespace(Super.MOD_ID)) {
            String key = Registries.BLOCK.get(id).getTranslationKey();
            if(usedTranslationKeys.contains(key)) { continue; } //Skip over duplicate translation keys
            usedTranslationKeys.add(key);

            translationBuilder.add(key, toSentanceCase(id.getPath())
                    .replace("Compressed", "Packed")
            );
        }
        for(Identifier id : ModUtil.allItemIdsInNamespace(Super.MOD_ID)) {
            String key = Registries.ITEM.get(id).getTranslationKey();
            if(usedTranslationKeys.contains(key)) { continue; } //Skip over duplicate translation keys
            usedTranslationKeys.add(key);
            translationBuilder.add(key, toSentanceCase(id.getPath()));
        }
//        for(Identifier id : ModUtil.allItemGroupIdsInNamespace(Super.MOD_ID)) {
//            String key = Registries.ITEM_GROUP.get(id).getDisplayName().getString();
//            if(usedTranslationKeys.contains(key)) { continue; } //Skip over duplicate translation keys
//            usedTranslationKeys.add(key);
//            translationBuilder.add(key, toSentanceCase(id.getPath()));
//        }
//        for(Identifier id : ModUtil.allStatusEffectIdsInNamespace(Super.MOD_ID)) {
//            String key = Registries.STATUS_EFFECT.get(id).getTranslationKey();
//            if(usedTranslationKeys.contains(key)) { continue; } //Skip over duplicate translation keys
//            usedTranslationKeys.add(key);
//            translationBuilder.add(key, toSentanceCase(id.getPath()));
//        }
    }
}