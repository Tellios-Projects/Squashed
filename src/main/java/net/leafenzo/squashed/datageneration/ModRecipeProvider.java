package net.leafenzo.squashed.datageneration;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.leafenzo.squashed.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;


public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) { super(output); }

    public static void offerCompressedWoolDyeingRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible dye) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output).input(dye).input(ModBlocks.WHITE_COMPRESSED_WOOL).group("wool").criterion(FabricRecipeProvider.hasItem(ModBlocks.WHITE_COMPRESSED_WOOL), FabricRecipeProvider.conditionsFromItem(ModBlocks.WHITE_COMPRESSED_WOOL)).offerTo(exporter);
    }

    public static void offerWoolDyeingRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output).input(input).input(Blocks.WHITE_WOOL).group("wool").criterion("has_white_wool", RecipeProvider.conditionsFromItem(Blocks.WHITE_WOOL)).offerTo(exporter);
    }


    public static void offerReversibleCompactingRecipes(Consumer<RecipeJsonProvider> exporter, RecipeCategory reverseCategory, ItemConvertible baseItem, RecipeCategory compactingCategory, ItemConvertible compactItem) {
        ModRecipeProvider.offerReversibleCompactingRecipes(exporter, reverseCategory, baseItem, compactingCategory, compactItem, RecipeProvider.getRecipeName(compactItem), null, RecipeProvider.getRecipeName(baseItem), null);
    }

    public static void offerReversibleCompactingRecipesWithCompactingRecipeGroup(Consumer<RecipeJsonProvider> exporter, RecipeCategory reverseCategory, ItemConvertible baseItem, RecipeCategory compactingCategory, ItemConvertible compactItem, String compactingId, String compactingGroup) {
        ModRecipeProvider.offerReversibleCompactingRecipes(exporter, reverseCategory, baseItem, compactingCategory, compactItem, compactingId, compactingGroup, RecipeProvider.getRecipeName(baseItem), null);
    }
    public static void offerReversibleCompactingRecipesWithReverseRecipeGroup(Consumer<RecipeJsonProvider> exporter, RecipeCategory reverseCategory, ItemConvertible baseItem, RecipeCategory compactingCategory, ItemConvertible compactItem, String reverseId, String reverseGroup) {
        ModRecipeProvider.offerReversibleCompactingRecipes(exporter, reverseCategory, baseItem, compactingCategory, compactItem, RecipeProvider.getRecipeName(compactItem), null, reverseId, reverseGroup);
    }
    public static void offerReversibleCompactingRecipes(Consumer<RecipeJsonProvider> exporter, RecipeCategory reverseCategory, ItemConvertible baseItem, RecipeCategory compactingCategory, ItemConvertible compactItem, String compactingId, @Nullable String compactingGroup, String reverseId, @Nullable String reverseGroup) {
        ShapelessRecipeJsonBuilder.create(reverseCategory, baseItem, 9).input(compactItem).group(reverseGroup).criterion(RecipeProvider.hasItem(compactItem), RecipeProvider.conditionsFromItem(compactItem)).offerTo(exporter, new Identifier(reverseId+"_from_"+compactingId));
        ShapedRecipeJsonBuilder.create(compactingCategory, compactItem).input(Character.valueOf('#'), baseItem).pattern("###").pattern("###").pattern("###").group(compactingGroup).criterion(RecipeProvider.hasItem(baseItem), RecipeProvider.conditionsFromItem(baseItem)).offerTo(exporter, new Identifier(compactingId+"_from_"+reverseId));
    }

    public static void offerTropicalFishBlockVariantRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 8)
                .input(Character.valueOf('F'), ModBlocks.TROPICAL_FISH_BLOCK_A)
                .input(Character.valueOf('I'), input)
                .pattern("FFF")
                .pattern("FIF")
                .pattern("FFF")
                .criterion("has_tropical_fish_block", FabricRecipeProvider.conditionsFromItem(ModBlocks.TROPICAL_FISH_BLOCK_A))
                .criterion("has_" + input.toString(), FabricRecipeProvider.conditionsFromItem(input))
                .group("tropical_fish_block_variant")
                .offerTo(exporter);
    }


    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerWaxingRecipes(exporter);
        // From the Sheet:
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BLAZE_ROD, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLAZE_ROD_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.INK_SAC, RecipeCategory.BUILDING_BLOCKS, ModBlocks.INK_SAC_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.STICK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STICK_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.FIRE_CHARGE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRE_CHARGE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.MAGMA_CREAM, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGMA_CREAM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BLAZE_POWDER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLAZE_POWDER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SALMON, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_SALMON_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.COOKED_SALMON, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COOKED_SALMON_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.COD, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_COD_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.COOKED_COD, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COOKED_COD_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.RABBIT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_RABBIT_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.COOKED_RABBIT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COOKED_RABBIT_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.MUTTON, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_MUTTON_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.COOKED_MUTTON, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COOKED_MUTTON_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CHICKEN, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_CHICKEN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.COOKED_CHICKEN, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COOKED_CHICKEN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BEEF, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_BEEF_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.COOKED_BEEF, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COOKED_BEEF_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.PORKCHOP, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_PORK_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.COOKED_PORKCHOP, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COOKED_PORK_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.ROTTEN_FLESH, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROTTEN_FLESH_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SPIDER_EYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPIDER_EYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.WHEAT_SEEDS, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHEAT_SEED_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.PUMPKIN_SEEDS, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PUMPKIN_SEED_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BEETROOT_SEEDS, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BEETROOT_SEED_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.MELON_SEEDS, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MELON_SEED_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.COCOA_BEANS, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COCOA_BEAN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.DEAD_BUSH, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEAD_BUSH_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GLOW_BERRIES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLOW_BERRIES_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SWEET_BERRIES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SWEET_BERRIES_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.FERN, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FERN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GLOW_LICHEN, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLOW_LICHEN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.PUMPKIN, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PUMPKIN_PILE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.HAY_BLOCK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HAY_PILE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.MELON, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MELON_PILE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SUGAR_CANE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUGARCANE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SEA_PICKLE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEA_PICKLE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SOUL_SAND, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_SOUL_SAND);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModBlocks.COMPRESSED_SOUL_SAND, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUPER_COMPRESSED_SOUL_SAND);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.COBBLESTONE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_COBBLESTONE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModBlocks.COMPRESSED_COBBLESTONE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUPER_COMPRESSED_COBBLESTONE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.STONE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_STONE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModBlocks.COMPRESSED_STONE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUPER_COMPRESSED_STONE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.ANDESITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_ANDESITE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModBlocks.COMPRESSED_ANDESITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUPER_COMPRESSED_ANDESITE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GRAVEL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_GRAVEL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModBlocks.COMPRESSED_GRAVEL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUPER_COMPRESSED_GRAVEL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.TUFF, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_TUFF);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModBlocks.COMPRESSED_TUFF, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUPER_COMPRESSED_TUFF);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BLACKSTONE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_BLACKSTONE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModBlocks.COMPRESSED_BLACKSTONE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUPER_COMPRESSED_BLACKSTONE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.OBSIDIAN, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_OBSIDIAN);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModBlocks.COMPRESSED_OBSIDIAN, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUPER_COMPRESSED_OBSIDIAN);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.DEEPSLATE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_DEEPSLATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModBlocks.COMPRESSED_DEEPSLATE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUPER_COMPRESSED_DEEPSLATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.NETHERRACK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_NETHERRACK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModBlocks.COMPRESSED_NETHERRACK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUPER_COMPRESSED_NETHERRACK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.END_STONE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_END_STONE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModBlocks.COMPRESSED_END_STONE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUPER_COMPRESSED_END_STONE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.DIORITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_DIORITE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModBlocks.COMPRESSED_DIORITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUPER_COMPRESSED_DIORITE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GRANITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_GRANITE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModBlocks.COMPRESSED_GRANITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUPER_COMPRESSED_GRANITE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.DIRT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_DIRT);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModBlocks.COMPRESSED_DIRT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUPER_COMPRESSED_DIRT);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SAND, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_SAND);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModBlocks.COMPRESSED_SAND, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUPER_COMPRESSED_SAND);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.DRIPSTONE_BLOCK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_DRIPSTONE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CALCITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_CALCITE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.MUD, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_MUD);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.MOSS_BLOCK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_MOSS);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CLAY, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_CLAY);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.RED_SAND, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_RED_SAND);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModBlocks.COMPRESSED_RED_SAND, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUPER_COMPRESSED_RED_SAND);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.MAGMA_BLOCK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_MAGMA_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.WHITE_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.ORANGE_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.MAGENTA_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.LIGHT_BLUE_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.YELLOW_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.LIME_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.PINK_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GRAY_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.LIGHT_GRAY_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CYAN_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.PURPLE_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BLUE_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BROWN_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GREEN_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.RED_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BLACK_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_DYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BASALT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_BASALT);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModBlocks.COMPRESSED_BASALT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUPER_COMPRESSED_BASALT);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.WHITE_WOOL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.ORANGE_WOOL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.MAGENTA_WOOL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.LIGHT_BLUE_WOOL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.YELLOW_WOOL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.LIME_WOOL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.PINK_WOOL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GRAY_WOOL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.LIGHT_GRAY_WOOL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CYAN_WOOL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.PURPLE_WOOL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BLUE_WOOL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BROWN_WOOL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GREEN_WOOL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.RED_WOOL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BLACK_WOOL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_COMPRESSED_WOOL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BOOK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BOOK_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.OAK_LEAVES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_OAK_LEAVES);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SPRUCE_LEAVES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_SPRUCE_LEAVES);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BIRCH_LEAVES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_BIRCH_LEAVES);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.JUNGLE_LEAVES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_JUNGLE_LEAVES);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.ACACIA_LEAVES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_ACACIA_LEAVES);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.DARK_OAK_LEAVES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_DARK_OAK_LEAVES);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.MANGROVE_LEAVES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_MANGROVE_LEAVES);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.AZALEA_LEAVES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_AZALEA_LEAVES);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.FLOWERING_AZALEA_LEAVES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_FLOWERING_AZALEA_LEAVES);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.LEATHER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEATHER_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.OAK_LOG, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_OAK_LOG);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SPRUCE_LOG, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_SPRUCE_LOG);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BIRCH_LOG, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_BIRCH_LOG);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.JUNGLE_LOG, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_JUNGLE_LOG);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.ACACIA_LOG, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_ACACIA_LOG);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.DARK_OAK_LOG, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_DARK_OAK_LOG);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.MANGROVE_LOG, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_MANGROVE_LOG);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CRIMSON_STEM, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_CRIMSON_STEM);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.WARPED_STEM, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_WARPED_STEM);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BAMBOO_BLOCK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_BAMBOO);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.OAK_SAPLING, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_OAK_SAPLING);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SPRUCE_SAPLING, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_SPRUCE_SAPLING);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BIRCH_SAPLING, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_BIRCH_SAPLING);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.JUNGLE_SAPLING, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_JUNGLE_SAPLING);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.ACACIA_SAPLING, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_ACACIA_SAPLING);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.DARK_OAK_SAPLING, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_DARK_OAK_SAPLING);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.AZALEA, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_AZALEA_SAPLING);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.FLOWERING_AZALEA, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_FLOWERING_AZALEA_SAPLING);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.MANGROVE_PROPAGULE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_MANGROVE_PROPAGULE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CRIMSON_FUNGUS, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_CRIMSON_FUNGUS);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.WARPED_FUNGUS, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_WARPED_FUNGUS);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CHORUS_FRUIT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHORUS_FRUIT_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SEAGRASS, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_SEAGRASS);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CACTUS, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_CACTUS);




        // Non-Reversible 2x2 Compacting Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TROPICAL_FISH_BLOCK_A, 1)
                .input(Character.valueOf('F'), Items.TROPICAL_FISH)
                .pattern("FF")
                .pattern("FF")
                .criterion("has_tropical_fish", FabricRecipeProvider.conditionsFromItem(Items.TROPICAL_FISH))
                .offerTo(exporter);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_A, "tropicalFishFromTropicalFishBlock" ,4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_B, "tropicalFishFromTropicalFishBlock" ,4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_C, "tropicalFishFromTropicalFishBlock" ,4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_D, "tropicalFishFromTropicalFishBlock" ,4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_E, "tropicalFishFromTropicalFishBlock" ,4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_F, "tropicalFishFromTropicalFishBlock" ,4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_G, "tropicalFishFromTropicalFishBlock" ,4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_H, "tropicalFishFromTropicalFishBlock" ,4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_I, "tropicalFishFromTropicalFishBlock" ,4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_J, "tropicalFishFromTropicalFishBlock" ,4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_K, "tropicalFishFromTropicalFishBlock" ,4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_L, "tropicalFishFromTropicalFishBlock" ,4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_M, "tropicalFishFromTropicalFishBlock" ,4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_N, "tropicalFishFromTropicalFishBlock" ,4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_O, "tropicalFishFromTropicalFishBlock" ,4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_P, "tropicalFishFromTropicalFishBlock" ,4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_Q, "tropicalFishFromTropicalFishBlock" ,4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_R, "tropicalFishFromTropicalFishBlock" ,4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_S, "tropicalFishFromTropicalFishBlock" ,4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_T, "tropicalFishFromTropicalFishBlock" ,4);

        offerTropicalFishBlockVariantRecipe(exporter, ModBlocks.TROPICAL_FISH_BLOCK_B, Items.COPPER_INGOT);
        offerTropicalFishBlockVariantRecipe(exporter, ModBlocks.TROPICAL_FISH_BLOCK_C, Items.PORKCHOP);
        offerTropicalFishBlockVariantRecipe(exporter, ModBlocks.TROPICAL_FISH_BLOCK_D, Blocks.SEAGRASS);
        offerTropicalFishBlockVariantRecipe(exporter, ModBlocks.TROPICAL_FISH_BLOCK_E, Items.GOLD_NUGGET);
        offerTropicalFishBlockVariantRecipe(exporter, ModBlocks.TROPICAL_FISH_BLOCK_F, Items.NETHER_WART);
        offerTropicalFishBlockVariantRecipe(exporter, ModBlocks.TROPICAL_FISH_BLOCK_G, Items.SUGAR);
        offerTropicalFishBlockVariantRecipe(exporter, ModBlocks.TROPICAL_FISH_BLOCK_H, Items.LAPIS_LAZULI);
        offerTropicalFishBlockVariantRecipe(exporter, ModBlocks.TROPICAL_FISH_BLOCK_I, Items.CHORUS_FRUIT);
        offerTropicalFishBlockVariantRecipe(exporter, ModBlocks.TROPICAL_FISH_BLOCK_J, Items.COOKIE);
        offerTropicalFishBlockVariantRecipe(exporter, ModBlocks.TROPICAL_FISH_BLOCK_K, Items.IRON_NUGGET);
        offerTropicalFishBlockVariantRecipe(exporter, ModBlocks.TROPICAL_FISH_BLOCK_L, Items.ENDER_PEARL);
        offerTropicalFishBlockVariantRecipe(exporter, ModBlocks.TROPICAL_FISH_BLOCK_M, Items.CACTUS);
        offerTropicalFishBlockVariantRecipe(exporter, ModBlocks.TROPICAL_FISH_BLOCK_N, Items.REDSTONE);
        offerTropicalFishBlockVariantRecipe(exporter, ModBlocks.TROPICAL_FISH_BLOCK_O, Items.FLINT);
        offerTropicalFishBlockVariantRecipe(exporter, ModBlocks.TROPICAL_FISH_BLOCK_P, Items.GLOWSTONE_DUST);
        offerTropicalFishBlockVariantRecipe(exporter, ModBlocks.TROPICAL_FISH_BLOCK_Q, Items.KELP);
        offerTropicalFishBlockVariantRecipe(exporter, ModBlocks.TROPICAL_FISH_BLOCK_R, Items.AMETHYST_SHARD);
        offerTropicalFishBlockVariantRecipe(exporter, ModBlocks.TROPICAL_FISH_BLOCK_S, Items.CLAY_BALL);
        offerTropicalFishBlockVariantRecipe(exporter, ModBlocks.TROPICAL_FISH_BLOCK_T, Items.BAMBOO);














        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.PRISMARINE_SHARD, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_CRYSTAL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GLOW_INK_SAC, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLOW_INK_SAC_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SCUTE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCUTE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.FEATHER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FEATHER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GHAST_TEAR, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GHAST_TEAR_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.PHANTOM_MEMBRANE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PHANTOM_MEMBRANE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.NETHER_WART_BLOCK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_NETHER_WART_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.WARPED_WART_BLOCK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_WARPED_WART_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.MANGROVE_ROOTS, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_ROOTS_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.VINE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VINE_BLOCK);

        offerCompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EGG_BLOCK, Items.EGG);


        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BONE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_BONE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.PAPER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PAPER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SCAFFOLDING, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_SCAFFOLDING);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.KELP, RecipeCategory.BUILDING_BLOCKS, ModBlocks.KELP_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GLOWSTONE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_GLOWSTONE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.RAW_IRON, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_RAW_IRON_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.RAW_GOLD, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_RAW_GOLD_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.RAW_COPPER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_RAW_COPPER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.IRON_BLOCK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_IRON_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.REDSTONE_BLOCK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_REDSTONE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.COAL_BLOCK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_COAL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.QUARTZ_BLOCK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_QUARTZ_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.NETHERITE_BLOCK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_NETHERITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GOLD_BLOCK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_GOLD_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.DIAMOND_BLOCK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_DIAMOND_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.EMERALD_BLOCK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_EMERALD_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.LAPIS_BLOCK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_LAPIS_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.AMETHYST_BLOCK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_AMETHYST_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.COPPER_BLOCK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_COPPER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.EXPOSED_COPPER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_EXPOSED_COPPER);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.WEATHERED_COPPER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_WEATHERED_COPPER);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.OXIDIZED_COPPER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_OXIDIZED_COPPER);
        //offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CHERRY_LEAVES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_CHERRY_LEAVES);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CHERRY_LOG, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_CHERRY_LOG);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CHERRY_SAPLING, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_CHERRY_SAPLING);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.ENDER_EYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ENDER_EYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.ENDER_PEARL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ENDER_PEARL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.ECHO_SHARD, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECHO_SHARD_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.COBWEB, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DENSE_COBWEB_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.RABBIT_HIDE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RABBIT_HIDE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.COBBLED_DEEPSLATE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_COBBLED_DEEPSLATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModBlocks.COMPRESSED_COBBLED_DEEPSLATE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUPER_COMPRESSED_COBBLED_DEEPSLATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CARROT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARROT_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GOLDEN_CARROT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLDEN_CARROT_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.APPLE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.APPLE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GOLDEN_APPLE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLDEN_APPLE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.POTATO, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POTATO_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.POISONOUS_POTATO, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POISONOUS_POTATO_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BAKED_POTATO, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAKED_POTATO_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BEETROOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BEETROOT_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.FLINT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLINT_BLOCK);



        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SUGAR, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUGAR_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GUNPOWDER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GUNPOWDER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.PRISMARINE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_PRISMARINE);

        offerCompressedWoolDyeingRecipe(exporter, ModBlocks.WHITE_COMPRESSED_WOOL, Items.WHITE_DYE);
        offerCompressedWoolDyeingRecipe(exporter, ModBlocks.ORANGE_COMPRESSED_WOOL, Items.ORANGE_DYE);
        offerCompressedWoolDyeingRecipe(exporter, ModBlocks.MAGENTA_COMPRESSED_WOOL, Items.MAGENTA_DYE);
        offerCompressedWoolDyeingRecipe(exporter, ModBlocks.LIGHT_BLUE_COMPRESSED_WOOL, Items.LIGHT_BLUE_DYE);
        offerCompressedWoolDyeingRecipe(exporter, ModBlocks.YELLOW_COMPRESSED_WOOL, Items.YELLOW_DYE);
        offerCompressedWoolDyeingRecipe(exporter, ModBlocks.LIME_COMPRESSED_WOOL, Items.LIME_DYE);
        offerCompressedWoolDyeingRecipe(exporter, ModBlocks.PINK_COMPRESSED_WOOL, Items.PINK_DYE);
        offerCompressedWoolDyeingRecipe(exporter, ModBlocks.GRAY_COMPRESSED_WOOL, Items.GRAY_DYE);
        offerCompressedWoolDyeingRecipe(exporter, ModBlocks.LIGHT_GRAY_COMPRESSED_WOOL, Items.LIGHT_GRAY_DYE);
        offerCompressedWoolDyeingRecipe(exporter, ModBlocks.CYAN_COMPRESSED_WOOL, Items.CYAN_DYE);
        offerCompressedWoolDyeingRecipe(exporter, ModBlocks.PURPLE_COMPRESSED_WOOL, Items.PURPLE_DYE);
        offerCompressedWoolDyeingRecipe(exporter, ModBlocks.BLUE_COMPRESSED_WOOL, Items.BLUE_DYE);
        offerCompressedWoolDyeingRecipe(exporter, ModBlocks.BROWN_COMPRESSED_WOOL, Items.BROWN_DYE);
        offerCompressedWoolDyeingRecipe(exporter, ModBlocks.GREEN_COMPRESSED_WOOL, Items.GREEN_DYE);
        offerCompressedWoolDyeingRecipe(exporter, ModBlocks.RED_COMPRESSED_WOOL, Items.RED_DYE);
        offerCompressedWoolDyeingRecipe(exporter, ModBlocks.BLACK_COMPRESSED_WOOL, Items.BLACK_DYE);
    }
}

