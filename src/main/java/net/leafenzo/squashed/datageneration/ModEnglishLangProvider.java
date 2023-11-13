package net.leafenzo.squashed.datageneration;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.leafenzo.squashed.Super;
import net.leafenzo.squashed.util.ModUtil;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.leafenzo.squashed.block.ModBlocks;
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
            //("Duplicate translation key " + key + "ignored"); //TODO, figure out how the heck do we print to debug from datagen?
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
        generateTranslation(translationBuilder, ModBlocks.ENDER_PEARL_BLOCK, "Heap of Ender Pearls");
        generateTranslation(translationBuilder, ModBlocks.ENDER_EYE_BLOCK, "Heap of Ender Eyes");

        generateTranslation(translationBuilder, ModBlocks.RAW_BEEF_BLOCK, "Heap of Raw Beef");
        generateTranslation(translationBuilder, ModBlocks.RAW_CHICKEN_BLOCK, "Heap of Raw Chicken");
        generateTranslation(translationBuilder, ModBlocks.RAW_COD_BLOCK, "Heap of Raw Cod");
        generateTranslation(translationBuilder, ModBlocks.RAW_SALMON_BLOCK, "Heap of Raw Salmon");
        generateTranslation(translationBuilder, ModBlocks.RAW_PORK_BLOCK, "Heap of Raw Pork");
        generateTranslation(translationBuilder, ModBlocks.RAW_MUTTON_BLOCK, "Heap of Raw Mutton");
        generateTranslation(translationBuilder, ModBlocks.RAW_RABBIT_BLOCK, "Heap of Raw Rabbit");

        generateTranslationUsingPileNamingScheme(translationBuilder, ModBlocks.COMPRESSED_OAK_LEAVES);
        generateTranslationUsingPileNamingScheme(translationBuilder, ModBlocks.COMPRESSED_SPRUCE_LEAVES);
        generateTranslationUsingPileNamingScheme(translationBuilder, ModBlocks.COMPRESSED_BIRCH_LEAVES);
        generateTranslationUsingPileNamingScheme(translationBuilder, ModBlocks.COMPRESSED_JUNGLE_LEAVES);
        generateTranslationUsingPileNamingScheme(translationBuilder, ModBlocks.COMPRESSED_ACACIA_LEAVES);
        generateTranslationUsingPileNamingScheme(translationBuilder, ModBlocks.COMPRESSED_DARK_OAK_LEAVES);
        generateTranslationUsingPileNamingScheme(translationBuilder, ModBlocks.COMPRESSED_MANGROVE_LEAVES);
        generateTranslationUsingPileNamingScheme(translationBuilder, ModBlocks.COMPRESSED_AZALEA_LEAVES);
        generateTranslationUsingPileNamingScheme(translationBuilder, ModBlocks.COMPRESSED_FLOWERING_AZALEA_LEAVES);

        generateTranslation(translationBuilder, ModBlocks.BOOK_BLOCK, "Pile of Books");
        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_PUMPKIN, "Pile of Pumpkins");
        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_MELON, "Pile of Melons");
        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_HAY_BLOCK, "Pile of Hay");

        generateTranslation(translationBuilder, ModBlocks.GRASS_CLIPPINGS_BLOCK, "Pile of Grass Clippings");
        generateTranslation(translationBuilder, ModBlocks.FERN_BLOCK, "Pile of Fern Clippings");
        generateTranslation(translationBuilder, ModBlocks.COMPRESSED_SEAGRASS, "Pile of Seagrass");
        generateTranslation(translationBuilder, ModBlocks.KELP_BLOCK, "Pile of Wet Kelp");

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
        for(Identifier id : ModUtil.allItemGroupIdsInNamespace(Super.MOD_ID)) {
            String key = Registries.ITEM_GROUP.get(id).getDisplayName().getString();
            if(usedTranslationKeys.contains(key)) { continue; } //Skip over duplicate translation keys
            usedTranslationKeys.add(key);
            translationBuilder.add(key, toSentanceCase(id.getPath()));
        }
//        for(Identifier id : ModUtil.allStatusEffectIdsInNamespace(Super.MOD_ID)) {
//            String key = Registries.STATUS_EFFECT.get(id).getTranslationKey();
//            if(usedTranslationKeys.contains(key)) { continue; } //Skip over duplicate translation keys
//            usedTranslationKeys.add(key);
//            translationBuilder.add(key, toSentanceCase(id.getPath()));
//        }
    }
}