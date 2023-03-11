package net.leafenzo.squashed.datageneration;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.leafenzo.squashed.block.ModBlocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CYAN_DYE, RecipeCategory.MISC, ModBlocks.CYAN_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BLAZE_ROD, RecipeCategory.MISC, BLAZE_ROD_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.INK_SAC, RecipeCategory.MISC, INK_SAC_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STICK, RecipeCategory.MISC, STICK_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.FIRE_CHARGE, RecipeCategory.MISC, FIRE_CHARGE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MAGMA_CREAM, RecipeCategory.MISC, MAGMA_CREAM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BLAZE_POWDER, RecipeCategory.MISC, BLAZE_POWDER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.SALMON, RecipeCategory.MISC, RAW_SALMON_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.COOKED_SALMON, RecipeCategory.MISC, COOKED_SALMON_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.COD, RecipeCategory.MISC, RAW_COD_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.COOKED_COD, RecipeCategory.MISC, COOKED_COD_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.RABBIT, RecipeCategory.MISC, RAW_RABBIT_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.COOKED_RABBIT, RecipeCategory.MISC, COOKED_RABBIT_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MUTTON, RecipeCategory.MISC, RAW_MUTTON_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.COOKED_MUTTON, RecipeCategory.MISC, COOKED_MUTTON_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CHICKEN, RecipeCategory.MISC, RAW_CHICKEN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.COOKED_CHICKEN, RecipeCategory.MISC, COOKED_CHICKEN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BEEF, RecipeCategory.MISC, RAW_BEEF_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.COOKED_BEEF, RecipeCategory.MISC, COOKED_BEEF_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.PORKCHOP, RecipeCategory.MISC, RAW_PORK_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.COOKED_PORKCHOP, RecipeCategory.MISC, COOKED_PORK_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.ROTTEN_FLESH, RecipeCategory.MISC, ROTTEN_FLESH_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.SPIDER_EYE, RecipeCategory.MISC, SPIDER_EYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.WHEAT_SEEDS, RecipeCategory.MISC, WHEAT_SEED_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.PUMPKIN_SEEDS, RecipeCategory.MISC, PUMPKIN_SEED_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BEETROOT_SEEDS, RecipeCategory.MISC, BEETROOT_SEED_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MELON_SEEDS, RecipeCategory.MISC, MELON_SEED_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.COCOA_BEANS, RecipeCategory.MISC, COCOA_BEAN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.DEAD_BUSH, RecipeCategory.MISC, DEAD_BUSH_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.GLOW_BERRIES, RecipeCategory.MISC, GLOW_BERRIES_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.SWEET_BERRIES, RecipeCategory.MISC, SWEET_BERRIES_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.GRASS, RecipeCategory.MISC, GRASS_CLIPPINGS_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.FERN, RecipeCategory.MISC, FERN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.GLOW_LICHEN, RecipeCategory.MISC, GLOW_LICHEN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.PUMPKIN, RecipeCategory.MISC, PUMPKIN_PILE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.HAY_BLOCK, RecipeCategory.MISC, HAY_PILE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MELON, RecipeCategory.MISC, MELON_PILE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.SUGAR_CANE, RecipeCategory.MISC, SUGARCANE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.SEA_PICKLE, RecipeCategory.MISC, SEA_PICKLE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.SOUL_SAND, RecipeCategory.MISC, COMPRESSED_SOUL_SAND);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_SOUL_SAND, RecipeCategory.MISC, SUPER_COMPRESSED_SOUL_SAND);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.COBBLESTONE, RecipeCategory.MISC, COMPRESSED_COBBLESTONE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_COBBLESTONE, RecipeCategory.MISC, SUPER_COMPRESSED_COBBLESTONE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STONE, RecipeCategory.MISC, COMPRESSED_STONE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_STONE, RecipeCategory.MISC, SUPER_COMPRESSED_STONE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.ANDESITE, RecipeCategory.MISC, COMPRESSED_ANDESITE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_ANDESITE, RecipeCategory.MISC, SUPER_COMPRESSED_ANDESITE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.GRAVEL, RecipeCategory.MISC, COMPRESSED_GRAVEL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_GRAVEL, RecipeCategory.MISC, SUPER_COMPRESSED_GRAVEL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.TUFF, RecipeCategory.MISC, COMPRESSED_TUFF);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_SOUL_SAND, RecipeCategory.MISC, SUPER_COMPRESSED_TUFF);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BLACKSTONE, RecipeCategory.MISC, COMPRESSED_BLACKSTONE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_BLACKSTONE, RecipeCategory.MISC, SUPER_COMPRESSED_BLACKSTONE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.OBSIDIAN, RecipeCategory.MISC, COMPRESSED_OBSIDIAN);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_OBSIDIAN, RecipeCategory.MISC, SUPER_COMPRESSED_OBSIDIAN);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.DEEPSLATE, RecipeCategory.MISC, COMPRESSED_DEEPSLATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_DEEPSLATE, RecipeCategory.MISC, SUPER_COMPRESSED_DEEPSLATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.NETHERRACK, RecipeCategory.MISC, COMPRESSED_NETHERRACK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_NETHERRACK, RecipeCategory.MISC, SUPER_COMPRESSED_NETHERRACK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.END_STONE, RecipeCategory.MISC, COMPRESSED_END_STONE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_END_STONE, RecipeCategory.MISC, SUPER_COMPRESSED_END_STONE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.DIORITE, RecipeCategory.MISC, COMPRESSED_DIORITE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_DIORITE, RecipeCategory.MISC, SUPER_COMPRESSED_DIORITE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.GRANITE, RecipeCategory.MISC, COMPRESSED_GRANITE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_GRANITE, RecipeCategory.MISC, SUPER_COMPRESSED_GRANITE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.DIRT, RecipeCategory.MISC, COMPRESSED_DIRT);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_DIRT, RecipeCategory.MISC, SUPER_COMPRESSED_DIRT);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.SAND, RecipeCategory.MISC, COMPRESSED_SAND);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_SAND, RecipeCategory.MISC, SUPER_COMPRESSED_SAND);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.DRIPSTONE, RecipeCategory.MISC, COMPRESSED_DRIPSTONE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_DRIPSTONE, RecipeCategory.MISC, SUPER_COMPRESSED_DRIPSTONE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MARBLE, RecipeCategory.MISC, COMPRESSED_MARBLE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_MARBLE, RecipeCategory.MISC, SUPER_COMPRESSED_MARBLE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MUD, RecipeCategory.MISC, COMPRESSED_MUD);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Item.MOSS_BLOCK, RecipeCategory.MISC, COMPRESSED_MOSS);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CLAY, RecipeCategory.MISC, COMPRESSED_CLAY);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.RED_SAND, RecipeCategory.MISC, COMPRESSED_RED_SAND);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_RED_SAND, RecipeCategory.MISC, SUPER_COMPRESSED_RED_SAND);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MAGMA_BLOCK, RecipeCategory.MISC, COMPRESSED_MAGMA_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.WHITE_DYE, RecipeCategory.MISC, WHITE_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.ORANGE_DYE, RecipeCategory.MISC, ORANGE_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MAGENTA_DYE, RecipeCategory.MISC, MAGENTA_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_BLUE_DYE, RecipeCategory.MISC, LIGHT_BLUE_DYE_BLOCK );
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.YELLOW_DYE, RecipeCategory.MISC, YELLOW_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.LIME_DYE, RecipeCategory.MISC, LIME_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.PINK_DYE, RecipeCategory.MISC, PINK_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.GRAY_DYE, RecipeCategory.MISC, GRAY_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_GRAY_DYE, RecipeCategory.MISC, LIGHT_GRAY_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CYAN_DYE, RecipeCategory.MISC, CYAN_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.PURPLE_DYE, RecipeCategory.MISC, PURPLE_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BLUE_DYE, RecipeCategory.MISC, BLUE_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BROWN_DYE, RecipeCategory.MISC, BROWN_DYE_BLOCK );
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.GREEN_DYE, RecipeCategory.MISC, GREEN_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.RED_DYE, RecipeCategory.MISC, RED_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BLACK_DYE, RecipeCategory.MISC, BLACK_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BASALT, RecipeCategory.MISC, COMPRESSED_BASALT);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_BASALT, RecipeCategory.MISC, SUPER_COMPRESSED_BASALT);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.WHITE_WOOL, RecipeCategory.MISC, WHITE_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.ORANGE_WOOL, RecipeCategory.MISC, ORANGE_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MAGENTA_WOOL, RecipeCategory.MISC, MAGENTA_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_BLUE_WOOL, RecipeCategory.MISC, LIGHT_BLUE_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.YELLOW_WOOL, RecipeCategory.MISC, YELLOW_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.LIME_WOOL, RecipeCategory.MISC, LIME_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.PINK_WOOL, RecipeCategory.MISC, PINK_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.GRAY_WOOL, RecipeCategory.MISC, GRAY_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_GRAY_WOOL, RecipeCategory.MISC, LIGHT_GRAY_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CYAN_WOOL, RecipeCategory.MISC, CYAN_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.PURPLE_WOOL, RecipeCategory.MISC, PURPLE_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BLUE_WOOL, RecipeCategory.MISC, BLUE_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BROWN_WOOL, RecipeCategory.MISC, BROWN_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.GREEN_WOOL, RecipeCategory.MISC, GREEN_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.RED_WOOL, RecipeCategory.MISC, RED_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BLACK_WOOL, RecipeCategory.MISC, BLACK_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BOOK, RecipeCategory.MISC, BOOK_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.OAK_LEAVES, RecipeCategory.MISC, COMPRESSED_OAK_LEAVES);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.SPRUCE_LEAVES, RecipeCategory.MISC, COMPRESSED_SPRUCE_LEAVES);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BIRCH_LEAVES, RecipeCategory.MISC, COMPRESSED_BIRCH_LEAVES);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.JUNGLE_LEAVES, RecipeCategory.MISC, COMPRESSED_JUNGLE_LEAVES);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.ACACIA_LEAVES, RecipeCategory.MISC, COMPRESSED_ACACIA_LEAVES);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.DARK_OAK_LEAVES, RecipeCategory.MISC, COMPRESSED_DARK_OAK_LEAVES);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MANGROVE_LEAVES, RecipeCategory.MISC, COMPRESSED_MANGROVE_LEAVES);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.AZALEA_LEAVES, RecipeCategory.MISC, COMPRESSED_AZALEA_LEAVES);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.FLOWERING_AZALEA_LEAVES, RecipeCategory.MISC, COMPRESSED_FLOWERING_AZALEA_LEAVES);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.LEATHER, RecipeCategory.MISC, LEATHER_BLOCK);



        offerWoolDyeingRecipe(exporter, ModBlocks.ORANGE_COMPRESSED_WOOL, ModBlocks.ORANGE_DYE_BLOCK, RecipeCategory.BUILDING_BLOCKS);
        offerWoolDyeingRecipe(exporter, Items.CYAN_WOOL, ModBlocks.CYAN_DYE_BLOCK, RecipeCategory.BUILDING_BLOCKS, );
    }
}
