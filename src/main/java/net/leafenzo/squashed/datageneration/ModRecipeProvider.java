package net.leafenzo.squashed.datageneration;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.leafenzo.squashed.Super;
import net.leafenzo.squashed.block.ModBlocks;
import net.leafenzo.squashed.item.ModItems;
import net.leafenzo.squashed.registry.tag.ModTags;
import net.leafenzo.squashed.util.ModUtil;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;


public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) { super(output); }

    public static void offerCompressedWoolDyeingRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible dye) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output)
                .input(dye)
                .input(ModBlocks.WHITE_COMPRESSED_WOOL)
                .group("compressed_wool")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.WHITE_COMPRESSED_WOOL), FabricRecipeProvider.conditionsFromItem(ModBlocks.WHITE_COMPRESSED_WOOL))
                .offerTo(exporter);
    }
    public static void offerWoolDyeingRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output).input(input).input(Blocks.WHITE_WOOL).group("wool")
                .criterion("has_white_wool", FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_WOOL))
                .offerTo(exporter);
    }
    public static void offerNamingSafeReversibleCompactingRecipes(Consumer<RecipeJsonProvider> exporter, RecipeCategory reverseCategory, ItemConvertible baseItem, TagKey<Item> baseItemTag, RecipeCategory compactingCategory, ItemConvertible compactItem) {
        String compactingGroup = Super.MOD_ID + ":" + Registries.ITEM.getId(baseItem.asItem()).getPath();
        String reverseGroup = Super.MOD_ID + ":" + Registries.ITEM.getId(baseItem.asItem()).getPath() + "_reverse";
        String compactingId = FabricRecipeProvider.getRecipeName(compactItem);
        String reverseId = FabricRecipeProvider.getRecipeName(baseItem);

        ShapelessRecipeJsonBuilder.create(reverseCategory, baseItem, 9)
                .input(compactItem)
                .group(reverseGroup)
                .criterion(FabricRecipeProvider.hasItem(compactItem), FabricRecipeProvider.conditionsFromItem(compactItem))
                .offerTo(exporter, new Identifier(reverseId+"_from_"+compactingId));

        ShapedRecipeJsonBuilder.create(compactingCategory, compactItem)
                .input(Character.valueOf('#'), baseItemTag)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .group(compactingGroup)
                .criterion(FabricRecipeProvider.hasItem(baseItem), FabricRecipeProvider.conditionsFromTag(baseItemTag))
                .offerTo(exporter, new Identifier(compactingId+"_from_"+reverseId));
    }
    public static void offerNamingSafeReversibleCompactingRecipes(Consumer<RecipeJsonProvider> exporter, RecipeCategory reverseCategory,  ItemConvertible baseItem,  RecipeCategory compactingCategory, ItemConvertible compactItem) {
        offerNamingSafeReversibleCompactingRecipes(exporter, reverseCategory, baseItem, compactingCategory, compactItem,
                FabricRecipeProvider.getRecipeName(compactItem), Super.MOD_ID + ":" + Registries.ITEM.getId(baseItem.asItem()).getPath(),
                FabricRecipeProvider.getRecipeName(baseItem), Super.MOD_ID + ":" + Registries.ITEM.getId(baseItem.asItem()).getPath() + "_reverse");
    }
    public static void offerNamingSafeReversibleCompactingRecipes(Consumer<RecipeJsonProvider> exporter, ItemConvertible baseItem, ItemConvertible compactItem) {
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, baseItem, RecipeCategory.BUILDING_BLOCKS, compactItem,
                FabricRecipeProvider.getRecipeName(compactItem), Super.MOD_ID + ":" + Registries.ITEM.getId(baseItem.asItem()).getPath(),
                FabricRecipeProvider.getRecipeName(baseItem), Super.MOD_ID + ":" + Registries.ITEM.getId(baseItem.asItem()).getPath() + "_reverse");
    }
    public static void offerNamingSafeReversibleCompactingRecipes(Consumer<RecipeJsonProvider> exporter, RecipeCategory reverseCategory, RecipeCategory compactingCategory, ItemConvertible baseItem, ItemConvertible[] compactItems) {
        ItemConvertible[] a = new ItemConvertible[1]; // this is hacky and awful but im in a huge rush rn.
        a[0] = baseItem;
        ItemConvertible[] items = ModUtil.concat(a, compactItems);
        for (int i = 0; i < (items.length - 1); i++) {
            offerNamingSafeReversibleCompactingRecipes(exporter, reverseCategory, items[i], compactingCategory, items[i+1], RecipeProvider.getRecipeName(items[i+1]), Super.MOD_ID + ":" + Registries.ITEM.getId(baseItem.asItem()).getPath(), RecipeProvider.getRecipeName(items[i]), Super.MOD_ID + ":" + Registries.ITEM.getId(baseItem.asItem()).getPath() + "_reverse");
        }
    }
    public static void offerNamingSafeReversibleCompactingRecipes(Consumer<RecipeJsonProvider> exporter, ItemConvertible baseItem, ItemConvertible[] compactItems) {
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, RecipeCategory.BUILDING_BLOCKS, baseItem, compactItems);
    }
    public static void offerNamingSafeReversibleCompactingRecipes(Consumer<RecipeJsonProvider> exporter, RecipeCategory reverseCategory, ItemConvertible baseItem, RecipeCategory compactingCategory, ItemConvertible compactItem, String compactingId, @Nullable String compactingGroup, String reverseId, @Nullable String reverseGroup) {
        ShapelessRecipeJsonBuilder.create(reverseCategory, baseItem, 9)
                .input(compactItem)
                .group(reverseGroup)
                .criterion(FabricRecipeProvider.hasItem(compactItem), FabricRecipeProvider.conditionsFromItem(compactItem))
                .offerTo(exporter, new Identifier(reverseId+"_from_"+compactingId));

        ShapedRecipeJsonBuilder.create(compactingCategory, compactItem)
                .input(Character.valueOf('#'), baseItem)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .group(compactingGroup)
                .criterion(FabricRecipeProvider.hasItem(baseItem), FabricRecipeProvider.conditionsFromItem(baseItem))
                .offerTo(exporter, new Identifier(compactingId+"_from_"+reverseId));
    }

    public static void offerReversibleStackingRecipes(Consumer<RecipeJsonProvider> exporter, RecipeCategory reverseCategory, ItemConvertible baseItem, RecipeCategory compactingCategory, ItemConvertible compactItem, String compactingId, @Nullable String compactingGroup, String reverseId, @Nullable String reverseGroup) {
        ShapelessRecipeJsonBuilder.create(reverseCategory, baseItem, 3).input(compactItem).group(reverseGroup).criterion(RecipeProvider.hasItem(compactItem), RecipeProvider.conditionsFromItem(compactItem)).offerTo(exporter, new Identifier(reverseId+"_from_"+compactingId));
        ShapedRecipeJsonBuilder.create(compactingCategory, compactItem)
                .input(Character.valueOf('#'), baseItem)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" # ")
                .group(compactingGroup)
                .criterion(FabricRecipeProvider.hasItem(baseItem), FabricRecipeProvider.conditionsFromItem(baseItem))
                .offerTo(exporter, new Identifier(compactingId+"_from_"+reverseId));
    }
    public static void offerReversibleStackingRecipes(Consumer<RecipeJsonProvider> exporter, RecipeCategory reverseCategory, ItemConvertible baseItem, RecipeCategory compactingCategory, ItemConvertible compactItem) {
        offerReversibleStackingRecipes(exporter, reverseCategory, baseItem, compactingCategory, compactItem, FabricRecipeProvider.getRecipeName(compactItem), Super.MOD_ID + ":" + Registries.ITEM.getId(baseItem.asItem()).getPath(), FabricRecipeProvider.getRecipeName(baseItem), Super.MOD_ID + ":" + Registries.ITEM.getId(baseItem.asItem()).getPath() + "_reverse");
    }

    public static void offerReversible2x2CompactingRecipes(Consumer<RecipeJsonProvider> exporter, RecipeCategory reverseCategory, ItemConvertible baseItem, RecipeCategory compactingCategory, ItemConvertible compactItem, String compactingId, @Nullable String compactingGroup, String reverseId, @Nullable String reverseGroup) {
        ShapelessRecipeJsonBuilder.create(reverseCategory, baseItem, 4).input(compactItem).group(reverseGroup).criterion(RecipeProvider.hasItem(compactItem), RecipeProvider.conditionsFromItem(compactItem)).offerTo(exporter, new Identifier(reverseId+"_from_"+compactingId));
        ShapedRecipeJsonBuilder.create(compactingCategory, compactItem)
                .input(Character.valueOf('#'), baseItem)
                .pattern("##")
                .pattern("##")
                .group(compactingGroup)
                .criterion(FabricRecipeProvider.hasItem(baseItem), FabricRecipeProvider.conditionsFromItem(baseItem))
                .offerTo(exporter, new Identifier(compactingId+"_from_"+reverseId));
    }
    public static void offerReversible2x2CompactingRecipes(Consumer<RecipeJsonProvider> exporter, RecipeCategory reverseCategory, ItemConvertible baseItem, RecipeCategory compactingCategory, ItemConvertible compactItem) {
        offerReversible2x2CompactingRecipes(exporter, reverseCategory, baseItem, compactingCategory, compactItem, RecipeProvider.getRecipeName(compactItem), Super.MOD_ID + ":" + Registries.ITEM.getId(baseItem.asItem()).getPath(), RecipeProvider.getRecipeName(baseItem), Super.MOD_ID + ":" + Registries.ITEM.getId(baseItem.asItem()).getPath() + "_reverse");
    }

//    public static void offerReversibleCompactingRecipes(Consumer<RecipeJsonProvider> exporter, ItemConvertible baseItem, ItemConvertible compactItem) {
//        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, baseItem, RecipeCategory.BUILDING_BLOCKS, compactItem, RecipeProvider.getRecipeName(compactItem), Super.MOD_ID + ":" + Registries.ITEM.getId(baseItem.asItem()).getPath(), RecipeProvider.getRecipeName(baseItem), Super.MOD_ID + ":" + Registries.ITEM.getId(baseItem.asItem()).getPath() + "_reverse");
//    }

    public static void offerTropicalFishBlockVariantRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 8)
                .input(Character.valueOf('F'), ModBlocks.TROPICAL_FISH_BLOCK_A)
                .input(Character.valueOf('I'), input)
                .pattern("FFF")
                .pattern("FIF")
                .pattern("FFF")
                .criterion("has_tropical_fish_block", FabricRecipeProvider.conditionsFromItem(ModBlocks.TROPICAL_FISH_BLOCK_A))
//                .criterion("has_" + input.toString(), FabricRecipeProvider.conditionsFromItem(input))
                .group("tropical_fish_block_variant")
                .offerTo(exporter);
    }


    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerWaxingRecipes(exporter);
        // From the Sheet:
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BLAZE_ROD, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLAZE_ROD_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.INK_SAC, RecipeCategory.BUILDING_BLOCKS, ModBlocks.INK_SAC_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, ModItems.BUNDLED_STICKS, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STICK_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.FIRE_CHARGE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRE_CHARGE_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.MAGMA_CREAM, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGMA_CREAM_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BLAZE_POWDER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLAZE_POWDER_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.SALMON, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_SALMON_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.COOKED_SALMON, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COOKED_SALMON_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.COD, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_COD_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.COOKED_COD, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COOKED_COD_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.RABBIT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_RABBIT_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.COOKED_RABBIT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COOKED_RABBIT_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.MUTTON, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_MUTTON_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.COOKED_MUTTON, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COOKED_MUTTON_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.CHICKEN, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_CHICKEN_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.COOKED_CHICKEN, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COOKED_CHICKEN_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.BEEF, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_BEEF_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.COOKED_BEEF, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COOKED_BEEF_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.PORKCHOP, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_PORK_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.COOKED_PORKCHOP, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COOKED_PORK_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.ROTTEN_FLESH, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROTTEN_FLESH_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SPIDER_EYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPIDER_EYE_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.WHEAT_SEEDS, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHEAT_SEED_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.PUMPKIN_SEEDS, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PUMPKIN_SEED_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BEETROOT_SEEDS, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BEETROOT_SEED_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.MELON_SEEDS, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MELON_SEED_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.COCOA_BEANS, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COCOA_BEANS_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.DEAD_BUSH, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEAD_BUSH_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GLOW_BERRIES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLOW_BERRIES_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SWEET_BERRIES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SWEET_BERRIES_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Blocks.GRASS, ModTags.Items.GRASS, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASS_CLIPPINGS_BLOCK);

        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.FERN, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FERN_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GLOW_LICHEN, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLOW_LICHEN_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.PUMPKIN, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_PUMPKIN);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.HAY_BLOCK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_HAY_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.MELON, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_MELON);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SUGAR_CANE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUGARCANE_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SEA_PICKLE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEA_PICKLE_BLOCK);



        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.SOUL_SAND, ModBlocks.COMPACTED_SOUL_SAND);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.SOUL_SOIL, ModBlocks.COMPACTED_SOUL_SOIL);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.COBBLESTONE, ModBlocks.COMPACTED_COBBLESTONE);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.STONE, ModBlocks.COMPACTED_STONE);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.ANDESITE, ModBlocks.COMPACTED_ANDESITE);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.GRAVEL, ModBlocks.COMPACTED_GRAVEL);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.TUFF, ModBlocks.COMPACTED_TUFF);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.BLACKSTONE, ModBlocks.COMPACTED_BLACKSTONE);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.OBSIDIAN, ModBlocks.COMPACTED_OBSIDIAN);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.DEEPSLATE, ModBlocks.COMPACTED_DEEPSLATE);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.NETHERRACK, ModBlocks.COMPACTED_NETHERRACK);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.END_STONE, ModBlocks.COMPACTED_END_STONE);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.DIORITE, ModBlocks.COMPACTED_DIORITE);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.GRANITE, ModBlocks.COMPACTED_GRANITE);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.DIRT, ModBlocks.COMPACTED_DIRT);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.SAND, ModBlocks.COMPACTED_SAND);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.RED_SAND, ModBlocks.COMPACTED_RED_SAND);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.DRIPSTONE_BLOCK, ModBlocks.COMPACTED_DRIPSTONE_BLOCKS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.CALCITE, ModBlocks.COMPACTED_CALCITE);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.MUD, ModBlocks.COMPACTED_MUD);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.MOSS_BLOCK, ModBlocks.COMPACTED_MOSS_BLOCKS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.CLAY, ModBlocks.COMPACTED_CLAY);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.MAGMA_BLOCK, ModBlocks.COMPACTED_MAGMA_BLOCKS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.SNOW_BLOCK, ModBlocks.COMPACTED_SNOW_BLOCKS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.BASALT, ModBlocks.COMPACTED_BASALT);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.COBBLED_DEEPSLATE, ModBlocks.COMPACTED_COBBLED_DEEPSLATE);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.SCULK, ModBlocks.COMPACTED_SCULK);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.PRISMARINE, ModBlocks.COMPACTED_PRISMARINE);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.BLUE_ICE, ModBlocks.COMPACTED_BLUE_ICE);
        offerShapelessRecipe(exporter, Blocks.PACKED_ICE, Blocks.BLUE_ICE, "packedIceFromBlueIce",9);

        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.GLOWSTONE, ModBlocks.COMPACTED_GLOWSTONE_BLOCKS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.RAW_IRON_BLOCK, ModBlocks.COMPACTED_RAW_IRON_BLOCKS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.RAW_GOLD_BLOCK, ModBlocks.COMPACTED_RAW_GOLD_BLOCKS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.RAW_COPPER_BLOCK, ModBlocks.COMPACTED_RAW_COPPER_BLOCKS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.REDSTONE_BLOCK, ModBlocks.COMPACTED_REDSTONE_BLOCKS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.COAL_BLOCK, ModBlocks.COMPACTED_COAL_BLOCKS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.QUARTZ_BLOCK, ModBlocks.COMPACTED_QUARTZ_BLOCKS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.IRON_BLOCK, ModBlocks.COMPACTED_IRON_BLOCKS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.NETHERITE_BLOCK, ModBlocks.COMPACTED_NETHERITE_BLOCKS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.GOLD_BLOCK, ModBlocks.COMPACTED_GOLD_BLOCKS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.DIAMOND_BLOCK, ModBlocks.COMPACTED_DIAMOND_BLOCKS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.EMERALD_BLOCK, ModBlocks.COMPACTED_EMERALD_BLOCKS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.LAPIS_BLOCK, ModBlocks.COMPACTED_LAPIS_BLOCKS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.AMETHYST_BLOCK, ModBlocks.COMPACTED_AMETHYST_BLOCKS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.BONE_BLOCK, ModBlocks.COMPACTED_BONE_BLOCKS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.COPPER_BLOCK, ModBlocks.COMPACTED_COPPER_BLOCKS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Items.EXPOSED_COPPER, ModBlocks.EXPOSED_COMPRESSED_COPPER_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, Items.WEATHERED_COPPER, ModBlocks.WEATHERED_COMPRESSED_COPPER_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, Items.OXIDIZED_COPPER, ModBlocks.OXIDIZED_COMPRESSED_COPPER_BLOCK);

        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.OAK_LOG, ModBlocks.COMPACTED_OAK_LOGS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.SPRUCE_LOG, ModBlocks.COMPACTED_SPRUCE_LOGS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.BIRCH_LOG, ModBlocks.COMPACTED_BIRCH_LOGS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.JUNGLE_LOG, ModBlocks.COMPACTED_JUNGLE_LOGS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.ACACIA_LOG, ModBlocks.COMPACTED_ACACIA_LOGS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.DARK_OAK_LOG, ModBlocks.COMPACTED_DARK_OAK_LOGS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.MANGROVE_LOG, ModBlocks.COMPACTED_MANGROVE_LOGS);
//        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.CHERRY_LOG, ModBlocks.COMPACTED_CHERRY_LOGS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.CRIMSON_STEM, ModBlocks.COMPACTED_CRIMSON_STEMS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.WARPED_STEM, ModBlocks.COMPACTED_WARPED_STEMS);
        offerNamingSafeReversibleCompactingRecipes(exporter, Blocks.BAMBOO_BLOCK, ModBlocks.COMPACTED_BAMBOO_BLOCKS);

        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.WHITE_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_DYE_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.ORANGE_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_DYE_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.MAGENTA_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_DYE_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.LIGHT_BLUE_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_DYE_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.YELLOW_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_DYE_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.LIME_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_DYE_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.PINK_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_DYE_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.GRAY_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_DYE_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.LIGHT_GRAY_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_DYE_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.CYAN_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_DYE_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.PURPLE_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_DYE_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.BLUE_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_DYE_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.BROWN_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_DYE_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.GREEN_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_DYE_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.RED_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_DYE_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.BLACK_DYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_DYE_BLOCK);

        offerNamingSafeReversibleCompactingRecipes(exporter, Items.WHITE_WOOL, ModBlocks.WHITE_COMPRESSED_WOOL);
        offerNamingSafeReversibleCompactingRecipes(exporter, Items.ORANGE_WOOL, ModBlocks.ORANGE_COMPRESSED_WOOL);
        offerNamingSafeReversibleCompactingRecipes(exporter, Items.MAGENTA_WOOL, ModBlocks.MAGENTA_COMPRESSED_WOOL);
        offerNamingSafeReversibleCompactingRecipes(exporter, Items.LIGHT_BLUE_WOOL, ModBlocks.LIGHT_BLUE_COMPRESSED_WOOL);
        offerNamingSafeReversibleCompactingRecipes(exporter, Items.YELLOW_WOOL, ModBlocks.YELLOW_COMPRESSED_WOOL);
        offerNamingSafeReversibleCompactingRecipes(exporter, Items.LIME_WOOL, ModBlocks.LIME_COMPRESSED_WOOL);
        offerNamingSafeReversibleCompactingRecipes(exporter, Items.PINK_WOOL, ModBlocks.PINK_COMPRESSED_WOOL);
        offerNamingSafeReversibleCompactingRecipes(exporter, Items.GRAY_WOOL, ModBlocks.GRAY_COMPRESSED_WOOL);
        offerNamingSafeReversibleCompactingRecipes(exporter, Items.LIGHT_GRAY_WOOL, ModBlocks.LIGHT_GRAY_COMPRESSED_WOOL);
        offerNamingSafeReversibleCompactingRecipes(exporter, Items.CYAN_WOOL, ModBlocks.CYAN_COMPRESSED_WOOL);
        offerNamingSafeReversibleCompactingRecipes(exporter, Items.PURPLE_WOOL, ModBlocks.PURPLE_COMPRESSED_WOOL);
        offerNamingSafeReversibleCompactingRecipes(exporter, Items.BLUE_WOOL, ModBlocks.BLUE_COMPRESSED_WOOL);
        offerNamingSafeReversibleCompactingRecipes(exporter, Items.BROWN_WOOL, ModBlocks.BROWN_COMPRESSED_WOOL);
        offerNamingSafeReversibleCompactingRecipes(exporter, Items.GREEN_WOOL, ModBlocks.GREEN_COMPRESSED_WOOL);
        offerNamingSafeReversibleCompactingRecipes(exporter, Items.RED_WOOL, ModBlocks.RED_COMPRESSED_WOOL);
        offerNamingSafeReversibleCompactingRecipes(exporter, Items.BLACK_WOOL, ModBlocks.BLACK_COMPRESSED_WOOL);
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

        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BOOK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BOOK_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.OAK_LEAVES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_OAK_LEAVES);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SPRUCE_LEAVES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_SPRUCE_LEAVES);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BIRCH_LEAVES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_BIRCH_LEAVES);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.JUNGLE_LEAVES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_JUNGLE_LEAVES);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.ACACIA_LEAVES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_ACACIA_LEAVES);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.DARK_OAK_LEAVES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_DARK_OAK_LEAVES);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.MANGROVE_LEAVES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_MANGROVE_LEAVES);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.AZALEA_LEAVES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_AZALEA_LEAVES);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.FLOWERING_AZALEA_LEAVES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_FLOWERING_AZALEA_LEAVES);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CHERRY_LEAVES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_CHERRY_LEAVES);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.LEATHER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEATHER_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.OAK_SAPLING, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_OAK_SAPLING);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.SPRUCE_SAPLING, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_SPRUCE_SAPLING);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.BIRCH_SAPLING, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_BIRCH_SAPLING);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.JUNGLE_SAPLING, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_JUNGLE_SAPLING);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.ACACIA_SAPLING, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_ACACIA_SAPLING);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.DARK_OAK_SAPLING, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_DARK_OAK_SAPLING);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.AZALEA, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_AZALEA_SAPLING);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.FLOWERING_AZALEA, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_FLOWERING_AZALEA_SAPLING);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.MANGROVE_PROPAGULE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_MANGROVE_PROPAGULE);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.CRIMSON_FUNGUS, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_CRIMSON_FUNGUS);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.WARPED_FUNGUS, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_WARPED_FUNGUS);
//        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.CHERRY_SAPLING, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_CHERRY_SAPLING);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CHORUS_FRUIT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHORUS_FRUIT_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SEAGRASS, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_SEAGRASS);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CACTUS, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_CACTUS);

        // Non-Reversible 2x2 Compacting Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TROPICAL_FISH_BLOCK_A, 1)
                .input(Character.valueOf('F'), Items.TROPICAL_FISH)
                .pattern("FF")
                .pattern("FF")
                .criterion("has_tropical_fish", FabricRecipeProvider.conditionsFromItem(Items.TROPICAL_FISH))
                .offerTo(exporter);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_A, "tropicalFishFromTropicalFishBlock",4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_B, "tropicalFishFromTropicalFishBlock",4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_C, "tropicalFishFromTropicalFishBlock",4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_D, "tropicalFishFromTropicalFishBlock",4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_E, "tropicalFishFromTropicalFishBlock",4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_F, "tropicalFishFromTropicalFishBlock",4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_G, "tropicalFishFromTropicalFishBlock",4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_H, "tropicalFishFromTropicalFishBlock",4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_I, "tropicalFishFromTropicalFishBlock",4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_J, "tropicalFishFromTropicalFishBlock",4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_K, "tropicalFishFromTropicalFishBlock",4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_L, "tropicalFishFromTropicalFishBlock",4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_M, "tropicalFishFromTropicalFishBlock",4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_N, "tropicalFishFromTropicalFishBlock",4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_O, "tropicalFishFromTropicalFishBlock",4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_P, "tropicalFishFromTropicalFishBlock",4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_Q, "tropicalFishFromTropicalFishBlock",4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_R, "tropicalFishFromTropicalFishBlock",4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_S, "tropicalFishFromTropicalFishBlock",4);
        offerShapelessRecipe(exporter, Items.TROPICAL_FISH, ModBlocks.TROPICAL_FISH_BLOCK_T, "tropicalFishFromTropicalFishBlock",4);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.PUFFERFISH, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TROPICAL_FISH_BLOCK_U);

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

        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.PRISMARINE_SHARD, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_CRYSTAL_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GLOW_INK_SAC, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLOW_INK_SAC_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.SCUTE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCUTE_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.FEATHER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FEATHER_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.GHAST_TEAR, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GHAST_TEAR_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.PHANTOM_MEMBRANE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PHANTOM_MEMBRANE_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.NETHER_WART, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_NETHER_WART_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.WARPED_WART_BLOCK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_WARPED_WART_BLOCK);

        offerCompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_ROOTS_BLOCK, Blocks.MANGROVE_ROOTS);
        offerShapelessRecipe(exporter, Blocks.MANGROVE_PLANKS, ModBlocks.MANGROVE_ROOTS_BLOCK, "tropicalFishFromTropicalFishBlock",4);

        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.VINE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VINE_BLOCK);
        offerCompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EGG_BLOCK, Items.EGG); //net/leafenzo/squashed/block/EggsBlock.java:25 | change the number of Chickentries variable if you change how many eggs it takes to craft this
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Blocks.SPONGE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_SPONGE);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BONE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BONES_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.PAPER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PAPER_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SCAFFOLDING, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_SCAFFOLDING);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.KELP, RecipeCategory.BUILDING_BLOCKS, ModBlocks.KELP_BLOCK);


        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.ENDER_EYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ENDER_EYE_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.ENDER_PEARL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ENDER_PEARL_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.ECHO_SHARD, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECHO_SHARD_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.COBWEB, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_COBWEB_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.RABBIT_HIDE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RABBIT_HIDE_BLOCK);


        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CARROT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARROT_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GOLDEN_CARROT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLDEN_CARROT_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.APPLE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.APPLE_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GOLDEN_APPLE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLDEN_APPLE_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.POTATO, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POTATO_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.POISONOUS_POTATO, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POISONOUS_POTATO_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BAKED_POTATO, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAKED_POTATO_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BEETROOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BEETROOT_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.FLINT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLINT_BLOCK);

        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SUGAR, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUGAR_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.GUNPOWDER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GUNPOWDER_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CHARCOAL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHARCOAL_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SNOWBALL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOWBALL_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.AMETHYST_SHARD, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_SHARD_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.QUARTZ, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRYSTAL_QUARTZ_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.HEART_OF_THE_SEA, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HEART_OF_THE_SEA_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.NAUTILUS_SHELL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NAUTILUS_SHELL_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.NETHER_STAR, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHER_STAR_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BRICK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BRICKS_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.NETHER_BRICK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHER_BRICKS_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.FERMENTED_SPIDER_EYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FERMENTED_SPIDER_EYE_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GLISTERING_MELON_SLICE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLISTERING_MELON_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModBlocks.GLISTERING_MELON_BLOCK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_GLISTERING_MELON_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.STRING, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRING_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Blocks.TNT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_TNT);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GLOWSTONE_DUST, RecipeCategory.MISC, ModBlocks.GLOWSTONE_DUST_BLOCK);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.REDSTONE, RecipeCategory.MISC, ModBlocks.REDSTONE_DUST_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Blocks.SHROOMLIGHT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_SHROOMLIGHT);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Blocks.HONEY_BLOCK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_HONEY_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Blocks.SLIME_BLOCK, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_SLIME_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CLAY_BALL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CLAY_BALL_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.LILY_PAD, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LILY_PAD_BLOCK);

        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPERIENCE_BLOCK, Items.EXPERIENCE_BOTTLE);

        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.NETHERITE_SCRAP, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERITE_SCRAP_BLOCK);
        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.HONEYCOMB, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_HONEYCOMB_BLOCK);
//        offerNamingSafeReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Blocks.PINK_PETALS, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_PETAL_BLOCK);

        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.ARROW, RecipeCategory.MISC, ModItems.BUNDLED_ARROWS);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.GLASS_BOTTLE, RecipeCategory.MISC, ModItems.BUNDLED_BOTTLES);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.LEAD, RecipeCategory.MISC, ModItems.BUNDLED_LEADS);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.NAME_TAG, RecipeCategory.MISC, ModItems.BUNDLED_NAMETAGS);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.SPECTRAL_ARROW, RecipeCategory.MISC, ModItems.BUNDLED_SPECTRAL_ARROWS);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.STICK, RecipeCategory.MISC, ModItems.BUNDLED_STICKS);

        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.BOWL, RecipeCategory.MISC, ModItems.STACKED_BOWLS);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.BUCKET, RecipeCategory.MISC, ModItems.STACKED_BUCKETS);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.MINECART, RecipeCategory.MISC, ModItems.STACKED_MINECARTS);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.POWERED_RAIL, RecipeCategory.MISC, ModItems.STACKED_POWERED_RAILS);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.RAIL, RecipeCategory.MISC, ModItems.STACKED_RAILS);
        offerReversible2x2CompactingRecipes(exporter, RecipeCategory.MISC, Items.SADDLE, RecipeCategory.MISC, ModItems.STACKED_SADDLES); //TODO if we are going to add me, find a way so that three items aren't forced into an item stack for what should be a non-stackable item when these are uncrafted. Such as spitting them all into the player's inventory at once. // nvm eliza said she doesnt care im just throwing it in
    }

    private static Identifier getItemId(ItemConvertible item) {
        return Registries.ITEM.getId(item.asItem());
    }
}

