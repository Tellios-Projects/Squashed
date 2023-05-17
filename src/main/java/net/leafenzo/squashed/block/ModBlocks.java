package net.leafenzo.squashed.block;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.leafenzo.squashed.ModInit;
import net.leafenzo.squashed.Super;
import net.leafenzo.squashed.item.ModItemGroups;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class ModBlocks {
    public static final Block BLAZE_ROD_BLOCK = registerBlock("blaze_rod_block", new ReversiblePillarBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).sounds(BlockSoundGroup.SHROOMLIGHT).luminance(state -> 7)),ModItemGroups.SQUASHED);
    public static final Block INK_SAC_BLOCK = registerBlock("ink_sac_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block STICK_BLOCK = registerBlock("stick_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.BAMBOO_WOOD)),ModItemGroups.SQUASHED);
    public static final Block FIRE_CHARGE_BLOCK = registerBlock("fire_charge_block", new FireChargeBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.GRAVEL)),ModItemGroups.SQUASHED);
    public static final Block MAGMA_CREAM_BLOCK = registerBlock("magma_cream_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.HONEY)),ModItemGroups.SQUASHED);
    public static final Block BLAZE_POWDER_BLOCK = registerBlock("blaze_powder_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.SNOW)),ModItemGroups.SQUASHED);
    public static final Block RAW_SALMON_BLOCK = registerBlock("raw_salmon_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block COOKED_SALMON_BLOCK = registerBlock("cooked_salmon_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FUNGUS)),ModItemGroups.SQUASHED);
    public static final Block RAW_COD_BLOCK = registerBlock("raw_cod_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block COOKED_COD_BLOCK = registerBlock("cooked_cod_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FUNGUS)),ModItemGroups.SQUASHED);
    public static final Block RAW_RABBIT_BLOCK = registerBlock("raw_rabbit_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block COOKED_RABBIT_BLOCK = registerBlock("cooked_rabbit_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FUNGUS)),ModItemGroups.SQUASHED);
    public static final Block RAW_MUTTON_BLOCK = registerBlock("raw_mutton_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block COOKED_MUTTON_BLOCK = registerBlock("cooked_mutton_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FUNGUS)),ModItemGroups.SQUASHED);
    public static final Block RAW_CHICKEN_BLOCK = registerBlock("raw_chicken_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block COOKED_CHICKEN_BLOCK = registerBlock("cooked_chicken_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FUNGUS)),ModItemGroups.SQUASHED);
    public static final Block RAW_BEEF_BLOCK = registerBlock("raw_beef_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block COOKED_BEEF_BLOCK = registerBlock("cooked_beef_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FUNGUS)),ModItemGroups.SQUASHED);
    public static final Block RAW_PORK_BLOCK = registerBlock("raw_pork_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block COOKED_PORK_BLOCK = registerBlock("cooked_pork_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FUNGUS)),ModItemGroups.SQUASHED);
    public static final Block ROTTEN_FLESH_BLOCK = registerBlock("rotten_flesh_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block SPIDER_EYE_BLOCK = registerBlock("spider_eye_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block WHEAT_SEED_BLOCK = registerBlock("wheat_seed_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.AZALEA)),ModItemGroups.SQUASHED);
    public static final Block PUMPKIN_SEED_BLOCK = registerBlock("pumpkin_seed_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.AZALEA)),ModItemGroups.SQUASHED);
    public static final Block BEETROOT_SEED_BLOCK = registerBlock("beetroot_seed_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.AZALEA)),ModItemGroups.SQUASHED);
    public static final Block MELON_SEED_BLOCK = registerBlock("melon_seed_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.AZALEA)),ModItemGroups.SQUASHED);
    public static final Block COCOA_BEAN_BLOCK = registerBlock("cocoa_bean_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.AZALEA)),ModItemGroups.SQUASHED);
    public static final Block DEAD_BUSH_BLOCK = registerBlock("dead_bush_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOD)),ModItemGroups.SQUASHED);
    public static final Block GLOW_BERRIES_BLOCK = registerBlock("glow_berries_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.GRASS).luminance(state -> 7)),ModItemGroups.SQUASHED);
    public static final Block SWEET_BERRIES_BLOCK = registerBlock("sweet_berries_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.SWEET_BERRY_BUSH)),ModItemGroups.SQUASHED);
    public static final Block GRASS_CLIPPINGS_BLOCK = registerBlock("grass_clippings_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MOSS_BLOCK)),ModItemGroups.SQUASHED);
    public static final Block FERN_BLOCK = registerBlock("fern_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MOSS_BLOCK)),ModItemGroups.SQUASHED);
    public static final Block GLOW_LICHEN_BLOCK = registerBlock("glow_lichen_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MOSS_BLOCK).luminance(state -> 7)),ModItemGroups.SQUASHED);
    public static final Block PUMPKIN_PILE = registerBlock("pumpkin_pile", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOD)),ModItemGroups.SQUASHED);
    public static final Block HAY_PILE = registerBlock("hay_pile", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.GRASS)),ModItemGroups.SQUASHED);
    public static final Block MELON_PILE = registerBlock("melon_pile", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOD)),ModItemGroups.SQUASHED);
    public static final Block SUGARCANE_BLOCK = registerBlock("sugarcane_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.BAMBOO_WOOD)),ModItemGroups.SQUASHED);
    public static final Block SEA_PICKLE_BLOCK = registerBlock("sea_pickle_block", new SeaPickleBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.CORAL)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_SOUL_SAND = registerBlock("compressed_soul_sand", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.SOUL_SOIL).luminance(state -> 15)),ModItemGroups.SQUASHED);
    public static final Block SUPER_COMPRESSED_SOUL_SAND = registerBlock("super_compressed_soul_sand", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.SHROOMLIGHT)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_COBBLESTONE = registerBlock("compressed_cobblestone", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.STONE)),ModItemGroups.SQUASHED);
    public static final Block SUPER_COMPRESSED_COBBLESTONE = registerBlock("super_compressed_cobblestone", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.DEEPSLATE)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_STONE = registerBlock("compressed_stone", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.STONE)),ModItemGroups.SQUASHED);
    public static final Block SUPER_COMPRESSED_STONE = registerBlock("super_compressed_stone", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.DEEPSLATE)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_ANDESITE = registerBlock("compressed_andesite", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.STONE)),ModItemGroups.SQUASHED);
    public static final Block SUPER_COMPRESSED_ANDESITE = registerBlock("super_compressed_andesite", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.DEEPSLATE)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_GRAVEL = registerBlock("compressed_gravel", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.GRAVEL)),ModItemGroups.SQUASHED);
    public static final Block SUPER_COMPRESSED_GRAVEL = registerBlock("super_compressed_gravel", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.ANCIENT_DEBRIS)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_TUFF = registerBlock("compressed_tuff", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.TUFF)),ModItemGroups.SQUASHED);
    public static final Block SUPER_COMPRESSED_TUFF = registerBlock("super_compressed_tuff", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.DEEPSLATE)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_BLACKSTONE = registerBlock("compressed_blackstone", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.STONE)),ModItemGroups.SQUASHED);
    public static final Block SUPER_COMPRESSED_BLACKSTONE = registerBlock("super_compressed_blackstone", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.DEEPSLATE)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_OBSIDIAN = registerBlock("compressed_obsidian", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.STONE)),ModItemGroups.SQUASHED);
    public static final Block SUPER_COMPRESSED_OBSIDIAN = registerBlock("super_compressed_obsidian", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.DEEPSLATE)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_DEEPSLATE = registerBlock("compressed_deepslate", new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.DEEPSLATE)),ModItemGroups.SQUASHED);
    public static final Block SUPER_COMPRESSED_DEEPSLATE = registerBlock("super_compressed_deepslate", new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.DEEPSLATE)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_NETHERRACK = registerBlock("compressed_netherrack", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.NETHERRACK)),ModItemGroups.SQUASHED);
    public static final Block SUPER_COMPRESSED_NETHERRACK = registerBlock("super_compressed_netherrack", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.NETHER_BRICKS)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_END_STONE = registerBlock("compressed_end_stone", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.STONE)),ModItemGroups.SQUASHED);
    public static final Block SUPER_COMPRESSED_END_STONE = registerBlock("super_compressed_end_stone", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.DEEPSLATE)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_DIORITE = registerBlock("compressed_diorite", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.STONE)),ModItemGroups.SQUASHED);
    public static final Block SUPER_COMPRESSED_DIORITE = registerBlock("super_compressed_diorite", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.DEEPSLATE)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_GRANITE = registerBlock("compressed_granite", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.STONE)),ModItemGroups.SQUASHED);
    public static final Block SUPER_COMPRESSED_GRANITE = registerBlock("super_compressed_granite", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.DEEPSLATE)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_DIRT = registerBlock("compressed_dirt", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.ROOTED_DIRT)),ModItemGroups.SQUASHED);
    public static final Block SUPER_COMPRESSED_DIRT = registerBlock("super_compressed_dirt", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.ANCIENT_DEBRIS)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_SAND = registerBlock("compressed_sand", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.SAND)),ModItemGroups.SQUASHED);
    public static final Block SUPER_COMPRESSED_SAND = registerBlock("super_compressed_sand", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.ANCIENT_DEBRIS)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_DRIPSTONE = registerBlock("compressed_dripstone", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_CALCITE = registerBlock("compressed_calcite", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.CALCITE)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_MUD = registerBlock("compressed_mud", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.PACKED_MUD)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_MOSS = registerBlock("compressed_moss", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_CLAY = registerBlock("compressed_clay", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.STONE)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_RED_SAND = registerBlock("compressed_red_sand", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.SAND)),ModItemGroups.SQUASHED);
    public static final Block SUPER_COMPRESSED_RED_SAND = registerBlock("super_compressed_red_sand", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.ANCIENT_DEBRIS)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_MAGMA_BLOCK = registerBlock("compressed_magma_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.NETHER_GOLD_ORE)),ModItemGroups.SQUASHED);
    public static final Block WHITE_DYE_BLOCK = registerBlock("white_dye_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FROGSPAWN)),ModItemGroups.SQUASHED);
    public static final Block ORANGE_DYE_BLOCK = registerBlock("orange_dye_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FROGSPAWN)),ModItemGroups.SQUASHED);
    public static final Block MAGENTA_DYE_BLOCK = registerBlock("magenta_dye_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FROGSPAWN)),ModItemGroups.SQUASHED);
    public static final Block LIGHT_BLUE_DYE_BLOCK = registerBlock("light_blue_dye_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FROGSPAWN)),ModItemGroups.SQUASHED);
    public static final Block YELLOW_DYE_BLOCK = registerBlock("yellow_dye_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FROGSPAWN)),ModItemGroups.SQUASHED);
    public static final Block LIME_DYE_BLOCK = registerBlock("lime_dye_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FROGSPAWN)),ModItemGroups.SQUASHED);
    public static final Block PINK_DYE_BLOCK = registerBlock("pink_dye_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FROGSPAWN)),ModItemGroups.SQUASHED);
    public static final Block GRAY_DYE_BLOCK = registerBlock("gray_dye_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FROGSPAWN)),ModItemGroups.SQUASHED);
    public static final Block LIGHT_GRAY_DYE_BLOCK = registerBlock("light_gray_dye_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FROGSPAWN)),ModItemGroups.SQUASHED);
    public static final Block CYAN_DYE_BLOCK = registerBlock("cyan_dye_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FROGSPAWN)),ModItemGroups.SQUASHED);
    public static final Block PURPLE_DYE_BLOCK = registerBlock("purple_dye_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FROGSPAWN)),ModItemGroups.SQUASHED);
    public static final Block BLUE_DYE_BLOCK = registerBlock("blue_dye_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FROGSPAWN)),ModItemGroups.SQUASHED);
    public static final Block BROWN_DYE_BLOCK = registerBlock("brown_dye_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FROGSPAWN)),ModItemGroups.SQUASHED);
    public static final Block GREEN_DYE_BLOCK = registerBlock("green_dye_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FROGSPAWN)),ModItemGroups.SQUASHED);
    public static final Block RED_DYE_BLOCK = registerBlock("red_dye_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FROGSPAWN)),ModItemGroups.SQUASHED);
    public static final Block BLACK_DYE_BLOCK = registerBlock("black_dye_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FROGSPAWN)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_BASALT = registerBlock("compressed_basalt", new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.BASALT)),ModItemGroups.SQUASHED);
    public static final Block SUPER_COMPRESSED_BASALT = registerBlock("super_compressed_basalt", new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.DEEPSLATE)),ModItemGroups.SQUASHED);
    public static final Block WHITE_COMPRESSED_WOOL = registerBlock("white_compressed_wool", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOL)),ModItemGroups.SQUASHED);
    public static final Block ORANGE_COMPRESSED_WOOL = registerBlock("orange_compressed_wool", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOL)),ModItemGroups.SQUASHED);
    public static final Block MAGENTA_COMPRESSED_WOOL = registerBlock("magenta_compressed_wool", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOL)),ModItemGroups.SQUASHED);
    public static final Block LIGHT_BLUE_COMPRESSED_WOOL = registerBlock("light_blue_compressed_wool", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOL)),ModItemGroups.SQUASHED);
    public static final Block YELLOW_COMPRESSED_WOOL = registerBlock("yellow_compressed_wool", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOL)),ModItemGroups.SQUASHED);
    public static final Block LIME_COMPRESSED_WOOL = registerBlock("lime_compressed_wool", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOL)),ModItemGroups.SQUASHED);
    public static final Block PINK_COMPRESSED_WOOL = registerBlock("pink_compressed_wool", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOL)),ModItemGroups.SQUASHED);
    public static final Block GRAY_COMPRESSED_WOOL = registerBlock("gray_compressed_wool", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOL)),ModItemGroups.SQUASHED);
    public static final Block LIGHT_GRAY_COMPRESSED_WOOL = registerBlock("light_gray_compressed_wool", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOL)),ModItemGroups.SQUASHED);
    public static final Block CYAN_COMPRESSED_WOOL = registerBlock("cyan_compressed_wool", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOL)),ModItemGroups.SQUASHED);
    public static final Block PURPLE_COMPRESSED_WOOL = registerBlock("purple_compressed_wool", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOL)),ModItemGroups.SQUASHED);
    public static final Block BLUE_COMPRESSED_WOOL = registerBlock("blue_compressed_wool", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOL)),ModItemGroups.SQUASHED);
    public static final Block BROWN_COMPRESSED_WOOL = registerBlock("brown_compressed_wool", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOL)),ModItemGroups.SQUASHED);
    public static final Block GREEN_COMPRESSED_WOOL = registerBlock("green_compressed_wool", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOL)),ModItemGroups.SQUASHED);
    public static final Block RED_COMPRESSED_WOOL = registerBlock("red_compressed_wool", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOL)),ModItemGroups.SQUASHED);
    public static final Block BLACK_COMPRESSED_WOOL = registerBlock("black_compressed_wool", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOL)),ModItemGroups.SQUASHED);
    public static final Block BOOK_BLOCK = registerBlock("book_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.NETHER_WOOD)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_OAK_LEAVES = registerBlock("compressed_oak_leaves", new LeafPileBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.AZALEA_LEAVES)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_SPRUCE_LEAVES = registerBlock("compressed_spruce_leaves", new LeafPileBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FLOWERING_AZALEA)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_BIRCH_LEAVES = registerBlock("compressed_birch_leaves", new LeafPileBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.AZALEA_LEAVES)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_JUNGLE_LEAVES = registerBlock("compressed_jungle_leaves", new LeafPileBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.AZALEA_LEAVES)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_ACACIA_LEAVES = registerBlock("compressed_acacia_leaves", new LeafPileBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.AZALEA_LEAVES)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_DARK_OAK_LEAVES = registerBlock("compressed_dark_oak_leaves", new LeafPileBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.AZALEA_LEAVES)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_MANGROVE_LEAVES = registerBlock("compressed_mangrove_leaves", new LeafPileBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.AZALEA_LEAVES)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_AZALEA_LEAVES = registerBlock("compressed_azalea_leaves", new LeafPileBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.AZALEA_LEAVES)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_FLOWERING_AZALEA_LEAVES = registerBlock("compressed_flowering_azalea_leaves", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.AZALEA_LEAVES)),ModItemGroups.SQUASHED);
    public static final Block LEATHER_BLOCK = registerBlock("leather_block", new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FUNGUS)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_OAK_LOG = registerBlock("compressed_oak_log", new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOD)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_SPRUCE_LOG = registerBlock("compressed_spruce_log", new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOD)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_BIRCH_LOG = registerBlock("compressed_birch_log", new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOD)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_JUNGLE_LOG = registerBlock("compressed_jungle_log", new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOD)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_ACACIA_LOG = registerBlock("compressed_acacia_log", new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOD)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_DARK_OAK_LOG = registerBlock("compressed_dark_oak_log", new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOD)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_MANGROVE_LOG = registerBlock("compressed_mangrove_log", new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOD)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_CRIMSON_STEM = registerBlock("compressed_crimson_stem", new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.NETHER_STEM)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_WARPED_STEM = registerBlock("compressed_warped_stem", new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.NETHER_STEM)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_BAMBOO = registerBlock("compressed_bamboo", new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.BAMBOO_WOOD)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_OAK_SAPLING = registerBlock("compressed_oak_sapling", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.ROOTED_DIRT)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_SPRUCE_SAPLING = registerBlock("compressed_spruce_sapling", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.ROOTED_DIRT)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_BIRCH_SAPLING = registerBlock("compressed_birch_sapling", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.ROOTED_DIRT)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_JUNGLE_SAPLING = registerBlock("compressed_jungle_sapling", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.ROOTED_DIRT)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_ACACIA_SAPLING = registerBlock("compressed_acacia_sapling", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.ROOTED_DIRT)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_DARK_OAK_SAPLING = registerBlock("compressed_dark_oak_sapling", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.ROOTED_DIRT)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_AZALEA_SAPLING = registerBlock("compressed_azalea_sapling", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.ROOTED_DIRT)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_FLOWERING_AZALEA_SAPLING = registerBlock("compressed_flowering_azalea_sapling", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.ROOTED_DIRT)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_MANGROVE_PROPAGULE = registerBlock("compressed_mangrove_propagule", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.ROOTED_DIRT)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_CRIMSON_FUNGUS = registerBlock("compressed_crimson_fungus", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WART_BLOCK)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_WARPED_FUNGUS = registerBlock("compressed_warped_fungus", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WART_BLOCK)),ModItemGroups.SQUASHED);
    public static final Block CHORUS_FRUIT_BLOCK = registerBlock("chorus_fruit_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WART_BLOCK)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_SEAGRASS = registerBlock("compressed_seagrass", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WET_GRASS)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_CACTUS = registerBlock("compressed_cactus", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOL)),ModItemGroups.SQUASHED);
    public static final Block TROPICAL_FISH_BLOCK_A = registerBlock("tropical_fish_block_a", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block TROPICAL_FISH_BLOCK_B = registerBlock("tropical_fish_block_b", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block TROPICAL_FISH_BLOCK_C = registerBlock("tropical_fish_block_c", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block TROPICAL_FISH_BLOCK_D = registerBlock("tropical_fish_block_d", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block TROPICAL_FISH_BLOCK_E = registerBlock("tropical_fish_block_e", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block TROPICAL_FISH_BLOCK_F = registerBlock("tropical_fish_block_f", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block TROPICAL_FISH_BLOCK_G = registerBlock("tropical_fish_block_g", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block TROPICAL_FISH_BLOCK_H = registerBlock("tropical_fish_block_h", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block TROPICAL_FISH_BLOCK_I = registerBlock("tropical_fish_block_i", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block TROPICAL_FISH_BLOCK_J = registerBlock("tropical_fish_block_j", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block TROPICAL_FISH_BLOCK_K = registerBlock("tropical_fish_block_k", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block TROPICAL_FISH_BLOCK_L = registerBlock("tropical_fish_block_l", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block TROPICAL_FISH_BLOCK_M = registerBlock("tropical_fish_block_m", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block TROPICAL_FISH_BLOCK_N = registerBlock("tropical_fish_block_n", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block TROPICAL_FISH_BLOCK_O = registerBlock("tropical_fish_block_o", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block TROPICAL_FISH_BLOCK_P = registerBlock("tropical_fish_block_p", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block TROPICAL_FISH_BLOCK_Q = registerBlock("tropical_fish_block_q", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block TROPICAL_FISH_BLOCK_R = registerBlock("tropical_fish_block_r", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block TROPICAL_FISH_BLOCK_S = registerBlock("tropical_fish_block_s", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block TROPICAL_FISH_BLOCK_T = registerBlock("tropical_fish_block_t", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD)),ModItemGroups.SQUASHED);
    public static final Block PRISMARINE_CRYSTAL_BLOCK = registerBlock("prismarine_crystal_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.GLASS).luminance(state -> 15)),ModItemGroups.SQUASHED);
    public static final Block GLOW_INK_SAC_BLOCK = registerBlock("glow_ink_sac_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUD).luminance(state -> 7)),ModItemGroups.SQUASHED);
    public static final Block SCUTE_BLOCK = registerBlock("scute_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.CANDLE)),ModItemGroups.SQUASHED);
    public static final Block FEATHER_BLOCK = registerBlock("feather_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOL)),ModItemGroups.SQUASHED);
    public static final Block GHAST_TEAR_BLOCK = registerBlock("ghast_tear_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.GLASS)),ModItemGroups.SQUASHED);
    public static final Block PHANTOM_MEMBRANE_BLOCK = registerBlock("phantom_membrane_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.CORAL)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_NETHER_WART_BLOCK = registerBlock("compressed_nether_wart_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WART_BLOCK)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_WARPED_WART_BLOCK = registerBlock("compressed_warped_wart_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WART_BLOCK)),ModItemGroups.SQUASHED);
    public static final Block MANGROVE_ROOTS_BLOCK = registerBlock("mangrove_roots_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MUDDY_MANGROVE_ROOTS)),ModItemGroups.SQUASHED);
    public static final Block VINE_BLOCK = registerBlock("vine_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.MOSS_BLOCK)),ModItemGroups.SQUASHED);
    public static final Block EGG_BLOCK = registerBlock("egg_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.CANDLE)),ModItemGroups.SQUASHED);
    public static final Block PUFFERFISH_BLOCK = registerBlock("pufferfish_block", new PufferfishBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.CORAL)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_SPONGE = registerBlock("compressed_sponge", new CompressedSpongeBlock(FabricBlockSettings.of(ModMaterial.COMPRESSED_SPONGE).strength(2.0f).sounds(BlockSoundGroup.CANDLE).nonOpaque()),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_BONE = registerBlock("compressed_bone", new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.BONE)),ModItemGroups.SQUASHED);
    public static final Block PAPER_BLOCK = registerBlock("paper_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.BIG_DRIPLEAF)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_SCAFFOLDING = registerBlock("compressed_scaffolding", new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.SCAFFOLDING)),ModItemGroups.SQUASHED);
    public static final Block KELP_BLOCK = registerBlock("kelp_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WET_GRASS)),ModItemGroups.SQUASHED);
    public static final Block LILY_PAD_BLOCK = registerBlock("lily_pad_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WET_GRASS)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_GLOWSTONE = registerBlock("compressed_glowstone", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.GLASS).luminance(state -> 15)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_RAW_IRON_BLOCK = registerBlock("compressed_raw_iron_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.DEEPSLATE)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_RAW_GOLD_BLOCK = registerBlock("compressed_raw_gold_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.DEEPSLATE)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_RAW_COPPER_BLOCK = registerBlock("compressed_raw_copper_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.DEEPSLATE)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_IRON_BLOCK = registerBlock("compressed_iron_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.NETHERITE)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_REDSTONE_BLOCK = registerBlock("compressed_redstone_block", new RedstoneBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.STONE).luminance(state -> 9)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_COAL_BLOCK = registerBlock("compressed_coal_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.DEEPSLATE)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_QUARTZ_BLOCK = registerBlock("compressed_quartz_block", ModBlocks.createCompressedQuartzBlock(DyeColor.WHITE), ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_NETHERITE_BLOCK = registerBlock("compressed_netherite_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.NETHERITE)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_GOLD_BLOCK = registerBlock("compressed_gold_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.NETHERITE)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_DIAMOND_BLOCK = registerBlock("compressed_diamond_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.GLASS)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_EMERALD_BLOCK = registerBlock("compressed_emerald_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.GLASS)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_LAPIS_BLOCK = registerBlock("compressed_lapis_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.STONE)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_AMETHYST_BLOCK = registerBlock("compressed_amethyst_block", ModBlocks.createCompressedAmethystBlock(DyeColor.MAGENTA), ModItemGroups.SQUASHED); //TODO Check if color looks ok
    public static final Block COMPRESSED_COPPER_BLOCK = registerBlock("compressed_copper_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.COPPER)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_EXPOSED_COPPER = registerBlock("compressed_exposed_copper", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.COPPER)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_WEATHERED_COPPER = registerBlock("compressed_weathered_copper", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.COPPER)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_OXIDIZED_COPPER = registerBlock("compressed_oxidized_copper", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.COPPER)),ModItemGroups.SQUASHED);
    //public static final Block COMPRESSED_CHERRY_LEAVES = registerBlock("compressed_cherry_leaves", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.AZALEA_LEAVES)),ModItemGroups.SQUASHED);
    //public static final Block COMPRESSED_CHERRY_LOG = registerBlock("compressed_cherry_log", new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.WOOD)),ModItemGroups.SQUASHED);
    //public static final Block COMPRESSED_CHERRY_SAPLING = registerBlock("compressed_cherry_sapling", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.ROOTED_DIRT)),ModItemGroups.SQUASHED);
    public static final Block ENDER_EYE_BLOCK = registerBlock("ender_eye_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FROGLIGHT)),ModItemGroups.SQUASHED);
    public static final Block ENDER_PEARL_BLOCK = registerBlock("ender_pearl_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FROGLIGHT)),ModItemGroups.SQUASHED);
    public static final Block ECHO_SHARD_BLOCK = registerBlock("echo_shard_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.SCULK_CATALYST)),ModItemGroups.SQUASHED);
    public static final Block DENSE_COBWEB_BLOCK = registerBlock("dense_cobweb_block", new DenseCobwebBlock(FabricBlockSettings.of(ModMaterial.DENSE_COBWEB).strength(2.0f).sounds(BlockSoundGroup.WOOL).dynamicBounds().nonOpaque()),ModItemGroups.SQUASHED);
    public static final Block RABBIT_HIDE_BLOCK = registerBlock("rabbit_hide_block", new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.FUNGUS)),ModItemGroups.SQUASHED);
    public static final Block COMPRESSED_COBBLED_DEEPSLATE = registerBlock("compressed_cobbled_deepslate", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.DEEPSLATE)),ModItemGroups.SQUASHED);
    public static final Block SUPER_COMPRESSED_COBBLED_DEEPSLATE = registerBlock("super_compressed_cobbled_deepslate", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.DEEPSLATE)),ModItemGroups.SQUASHED);
    public static final Block CARROT_BLOCK = registerBlock("carrot_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.AZALEA)),ModItemGroups.SQUASHED);
    public static final Block GOLDEN_CARROT_BLOCK = registerBlock("golden_carrot_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.NETHER_ORE)),ModItemGroups.SQUASHED);
    public static final Block APPLE_BLOCK = registerBlock("apple_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.AZALEA)),ModItemGroups.SQUASHED);
    public static final Block GOLDEN_APPLE_BLOCK = registerBlock("golden_apple_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.NETHER_ORE)),ModItemGroups.SQUASHED);
    public static final Block POTATO_BLOCK = registerBlock("potato_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.AZALEA)),ModItemGroups.SQUASHED);
    public static final Block POISONOUS_POTATO_BLOCK = registerBlock("poisonous_potato_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.AZALEA)),ModItemGroups.SQUASHED);
    public static final Block BAKED_POTATO_BLOCK = registerBlock("baked_potato_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.AZALEA)),ModItemGroups.SQUASHED);
    public static final Block BEETROOT_BLOCK = registerBlock("beetroot_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.AZALEA)),ModItemGroups.SQUASHED);
    public static final Block FLINT_BLOCK = registerBlock("flint_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).sounds(BlockSoundGroup.TUFF)),ModItemGroups.SQUASHED);
    public static final Block WAXED_COMPRESSED_COPPER_BLOCK = registerBlock("waxed_compressed_copper_block", new Block(AbstractBlock.Settings.copy(COMPRESSED_COPPER_BLOCK)),ModItemGroups.SQUASHED);
    public static final Block WAXED_COMPRESSED_EXPOSED_COPPER = registerBlock("waxed_compressed_exposed_copper", new Block(AbstractBlock.Settings.copy(COMPRESSED_EXPOSED_COPPER)),ModItemGroups.SQUASHED);
    public static final Block WAXED_COMPRESSED_WEATHERED_COPPER = registerBlock("waxed_compressed_weathered_copper", new Block(AbstractBlock.Settings.copy(COMPRESSED_WEATHERED_COPPER)),ModItemGroups.SQUASHED);
    public static final Block WAXED_COMPRESSED_OXIDIZED_COPPER = registerBlock("waxed_compressed_oxidized_copper", new Block(AbstractBlock.Settings.copy(COMPRESSED_OXIDIZED_COPPER)),ModItemGroups.SQUASHED);

    // FOR:1.19.4
    // public static final Block COMPRESSED_CHERRY_LEAVES = registerBlock("compressed_cherry_leaves", new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f)),ModItemGroups.SQUASHED);
    // public static final Block COMPRESSED_CHERRY_LOG = registerBlock("compressed_cherry_log", new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f)),ModItemGroups.SQUASHED);
    // public static final Block COMPRESSED_CHERRY_SAPLING = registerBlock("compressed_cherry_sapling", new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f)),ModItemGroups.SQUASHED);

    public static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name,block,group);
        //if(block.getDefaultState().isOpaque()) { ModRenderLayers.registerCutout(block);  }
        return Registry.register(Registries.BLOCK, new Identifier(Super.MOD_ID, name), block);
    }


    private static StainedGlassBlock createCompressedAmethystBlock(DyeColor color) {
        return new StainedGlassBlock(color, AbstractBlock.Settings.of(Material.GLASS, color).strength(0.5f).sounds(BlockSoundGroup.AMETHYST_BLOCK).nonOpaque().allowsSpawning(ModBlocks::never).solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never));
    }

    private static StainedGlassBlock createCompressedQuartzBlock(DyeColor color) {
        return new StainedGlassBlock(color, AbstractBlock.Settings.of(Material.GLASS, color).strength(0.5f).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(ModBlocks::never).solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never));
    }

    private static boolean never(BlockState blockState, BlockView blockView, BlockPos blockPos) {
        return false;
    }

    public static boolean never(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return false;
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
