package net.leafenzo.squashed.block;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.leafenzo.squashed.ModInit;
import net.leafenzo.squashed.Super;
import net.leafenzo.squashed.item.PhantomBlockItem;
import net.leafenzo.squashed.sound.ModBlockSoundGroup;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;

public class ModBlocks {
    public static final String[] compressionTierNames = {"compressed", "crammed", "dense", "squashed"};
    public static final HashMap<Block, Integer> COMPRESSION_TIER_FROM_BLOCK = new HashMap<Block, Integer>();
    public static final ArrayList<Block> TROPICAL_FISH_BLOCKS = new ArrayList<Block>();
    public static final ArrayList<Block> DYE_BLOCKS = new ArrayList<Block>();
    public static final ArrayList<Block> ALL_COMPACTED_WOOL_BLOCKS = new ArrayList<Block>();


    public static final Block BLAZE_ROD_BLOCK = registerBlock("blaze_rod_block", new ReversiblePillarBlock(FabricBlockSettings.create().mapColor(MapColor.TERRACOTTA_YELLOW).requiresTool().strength(2.0f).sounds(ModBlockSoundGroup.BLAZE_ROD_BLOCK).luminance(state -> 15))/*,ModItemGroups.SQUASHED*/);
    public static final Block INK_SAC_BLOCK = registerBlock("ink_sac_block", new Block(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(0.5f).sounds(BlockSoundGroup.MUD))/*,ModItemGroups.SQUASHED*/);
    public static final Block STICK_BLOCK = registerBlock("stick_block", new PillarBlock(FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).strength(2.0f).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable())/*,ModItemGroups.SQUASHED*/);
    public static final Block FIRE_CHARGE_BLOCK = registerBlock("fire_charge_block", new FireChargeBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).strength(0.5f).sounds(BlockSoundGroup.GRAVEL))/*,ModItemGroups.SQUASHED*/);
    public static final Block MAGMA_CREAM_BLOCK = registerBlock("magma_cream_block", new MagmaCreamBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).sounds(BlockSoundGroup.HONEY).nonOpaque().luminance(state -> 7))/*,ModItemGroups.SQUASHED*/);
    public static final Block BLAZE_POWDER_BLOCK = registerBlock("blaze_powder_block", new FallingBlock(FabricBlockSettings.create().mapColor(MapColor.TERRACOTTA_YELLOW).strength(0.5f).sounds(BlockSoundGroup.SNOW).luminance(state -> 11))/*,ModItemGroups.SQUASHED*/);
    public static final Block RAW_SALMON_BLOCK = registerBlock("raw_salmon_block", new Block(FabricBlockSettings.create().mapColor(MapColor.TERRACOTTA_PINK).strength(0.5f).sounds(BlockSoundGroup.MUD))/*,ModItemGroups.SQUASHED*/);
    public static final Block COOKED_SALMON_BLOCK = registerBlock("cooked_salmon_block", new Block(FabricBlockSettings.create().mapColor(MapColor.BRIGHT_RED).strength(0.5f).sounds(BlockSoundGroup.FUNGUS))/*,ModItemGroups.SQUASHED*/);
    public static final Block RAW_COD_BLOCK = registerBlock("raw_cod_block", new Block(FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).strength(0.5f).sounds(BlockSoundGroup.MUD))/*,ModItemGroups.SQUASHED*/);
    public static final Block COOKED_COD_BLOCK = registerBlock("cooked_cod_block", new Block(FabricBlockSettings.create().mapColor(MapColor.RAW_IRON_PINK).strength(0.5f).sounds(BlockSoundGroup.FUNGUS))/*,ModItemGroups.SQUASHED*/);
    public static final Block RAW_RABBIT_BLOCK = registerBlock("raw_rabbit_block", new Block(FabricBlockSettings.create().mapColor(MapColor.TERRACOTTA_WHITE).strength(0.5f).sounds(BlockSoundGroup.MUD))/*,ModItemGroups.SQUASHED*/);
    public static final Block COOKED_RABBIT_BLOCK = registerBlock("cooked_rabbit_block", new Block(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5f).sounds(BlockSoundGroup.FUNGUS))/*,ModItemGroups.SQUASHED*/);
    public static final Block RAW_MUTTON_BLOCK = registerBlock("raw_mutton_block", new Block(FabricBlockSettings.create().mapColor(MapColor.TERRACOTTA_PINK).strength(0.5f).sounds(BlockSoundGroup.MUD))/*,ModItemGroups.SQUASHED*/);
    public static final Block COOKED_MUTTON_BLOCK = registerBlock("cooked_mutton_block", new Block(FabricBlockSettings.create().mapColor(MapColor.DIRT_BROWN).strength(0.5f).sounds(BlockSoundGroup.FUNGUS))/*,ModItemGroups.SQUASHED*/);
    public static final Block RAW_CHICKEN_BLOCK = registerBlock("raw_chicken_block", new Block(FabricBlockSettings.create().mapColor(MapColor.TERRACOTTA_WHITE).strength(0.5f).sounds(BlockSoundGroup.MUD))/*,ModItemGroups.SQUASHED*/);
    public static final Block COOKED_CHICKEN_BLOCK = registerBlock("cooked_chicken_block", new Block(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5f).sounds(BlockSoundGroup.FUNGUS))/*,ModItemGroups.SQUASHED*/);
    public static final Block RAW_BEEF_BLOCK = registerBlock("raw_beef_block", new Block(FabricBlockSettings.create().mapColor(MapColor.RED).strength(0.5f).sounds(BlockSoundGroup.MUD))/*,ModItemGroups.SQUASHED*/);
    public static final Block COOKED_BEEF_BLOCK = registerBlock("cooked_beef_block", new Block(FabricBlockSettings.create().mapColor(MapColor.DIRT_BROWN).strength(0.5f).sounds(BlockSoundGroup.FUNGUS))/*,ModItemGroups.SQUASHED*/);
    public static final Block RAW_PORK_BLOCK = registerBlock("raw_pork_block", new Block(FabricBlockSettings.create().mapColor(MapColor.PINK).strength(0.5f).sounds(BlockSoundGroup.MUD))/*,ModItemGroups.SQUASHED*/);
    public static final Block COOKED_PORK_BLOCK = registerBlock("cooked_pork_block", new Block(FabricBlockSettings.create().mapColor(MapColor.RAW_IRON_PINK).strength(0.5f).sounds(BlockSoundGroup.FUNGUS))/*,ModItemGroups.SQUASHED*/);
    public static final Block ROTTEN_FLESH_BLOCK = registerBlock("rotten_flesh_block", new Block(FabricBlockSettings.create().mapColor(MapColor.DARK_RED).strength(0.5f).sounds(BlockSoundGroup.MUD))/*,ModItemGroups.SQUASHED*/);
    public static final Block SPIDER_EYE_BLOCK = registerBlock("spider_eye_block", new Block(FabricBlockSettings.create().mapColor(MapColor.DARK_CRIMSON).strength(0.5f).sounds(BlockSoundGroup.MUD))/*,ModItemGroups.SQUASHED*/);
    public static final Block WHEAT_SEED_BLOCK = registerBlock("wheat_seed_block", new Block(FabricBlockSettings.create().mapColor(MapColor.EMERALD_GREEN).strength(0.5f).sounds(BlockSoundGroup.AZALEA))/*,ModItemGroups.SQUASHED*/);
    public static final Block PUMPKIN_SEED_BLOCK = registerBlock("pumpkin_seed_block", new Block(FabricBlockSettings.create().mapColor(MapColor.RAW_IRON_PINK).strength(0.5f).sounds(BlockSoundGroup.AZALEA))/*,ModItemGroups.SQUASHED*/);
    public static final Block BEETROOT_SEED_BLOCK = registerBlock("beetroot_seed_block", new Block(FabricBlockSettings.create().mapColor(MapColor.RAW_IRON_PINK).strength(0.5f).sounds(BlockSoundGroup.AZALEA))/*,ModItemGroups.SQUASHED*/);
    public static final Block MELON_SEED_BLOCK = registerBlock("melon_seed_block", new Block(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(0.5f).sounds(BlockSoundGroup.AZALEA))/*,ModItemGroups.SQUASHED*/);
    public static final Block COCOA_BEANS_BLOCK = registerBlock("cocoa_beans_block", new Block(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(0.5f).sounds(BlockSoundGroup.AZALEA))/*,ModItemGroups.SQUASHED*/);
    public static final Block DEAD_BUSH_BLOCK = registerBlock("dead_bush_block", new Block(FabricBlockSettings.create().mapColor(MapColor.TERRACOTTA_ORANGE).strength(2.0f).sounds(BlockSoundGroup.WOOD).burnable().nonOpaque().allowsSpawning(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never).pistonBehavior(PistonBehavior.DESTROY).solidBlock(ModBlocks::never))/*,ModItemGroups.SQUASHED*/);
    public static final Block GLOW_BERRIES_BLOCK = registerBlock("glow_berries_block", new WaterloggableFullBlock(FabricBlockSettings.create().mapColor(MapColor.GREEN).strength(0.2f).sounds(BlockSoundGroup.GRASS).luminance(state -> 7).burnable().nonOpaque().allowsSpawning(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never).pistonBehavior(PistonBehavior.DESTROY).solidBlock(ModBlocks::never))/*,ModItemGroups.SQUASHED*/);
    public static final Block SWEET_BERRIES_BLOCK = registerBlock("sweet_berries_block", new WaterloggableFullBlock(FabricBlockSettings.create().mapColor(MapColor.GREEN).strength(0.2f).sounds(BlockSoundGroup.SWEET_BERRY_BUSH).burnable().nonOpaque().allowsSpawning(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never).pistonBehavior(PistonBehavior.DESTROY).solidBlock(ModBlocks::never))/*,ModItemGroups.SQUASHED*/);
    public static final Block GRASS_CLIPPINGS_BLOCK = registerBlock("grass_clippings_block", new FallingBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).strength(0.2f).sounds(BlockSoundGroup.MOSS_BLOCK).burnable())/*,ModItemGroups.SQUASHED*/);
    public static final Block FERN_BLOCK = registerBlock("fern_block", new FallingBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).strength(0.2f).burnable().sounds(BlockSoundGroup.MOSS_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block GLOW_LICHEN_BLOCK = registerBlock("glow_lichen_block", new Block(FabricBlockSettings.create().mapColor(MapColor.LICHEN_GREEN).strength(0.2f).sounds(BlockSoundGroup.MOSS_BLOCK).luminance(state -> 7))/*,ModItemGroups.SQUASHED*/);
    public static final Block COMPRESSED_PUMPKIN = registerBlock("compressed_pumpkin", new FallingBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(2.0f).sounds(BlockSoundGroup.WOOD))/*,ModItemGroups.SQUASHED*/);
    public static final Block COMPRESSED_HAY_BLOCK = registerBlock("compressed_hay_block", new HayBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).strength(0.2f).sounds(BlockSoundGroup.GRASS).burnable())/*,ModItemGroups.SQUASHED*/);
    public static final Block COMPRESSED_MELON = registerBlock("compressed_melon", new FallingBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).strength(2.0f).sounds(BlockSoundGroup.WOOD))/*,ModItemGroups.SQUASHED*/);
    public static final Block SUGARCANE_BLOCK = registerBlock("sugarcane_block", new Block(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).strength(2.0f).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable())/*,ModItemGroups.SQUASHED*/);
    public static final Block SEA_PICKLE_BLOCK = registerBlock("sea_pickle_block", new SeaPickleBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_GREEN).luminance(ModBlocks.createLightLevelFromProperty(15, Properties.WATERLOGGED)).strength(2.0f).sounds(BlockSoundGroup.CORAL))/*, ModItemGroups.SQUASHED*/);

    public static final Block[] COMPACTED_SOUL_SAND = registerCompactedBlockSet("soul_sand",
            new SoulSandBlock(FabricBlockSettings.copyOf(Blocks.SOUL_SAND).mapColor(MapColor.DIAMOND_BLUE).strength(0.5f).instrument(Instrument.COW_BELL).sounds(BlockSoundGroup.SOUL_SAND).luminance(state -> 7)),
            new SoulSandBlock(FabricBlockSettings.copyOf(Blocks.SOUL_SAND).mapColor(MapColor.DIAMOND_BLUE).strength(0.5f).instrument(Instrument.COW_BELL).sounds(BlockSoundGroup.SOUL_SOIL).luminance(state -> 15)),
            new SoulSandBlock(FabricBlockSettings.copyOf(Blocks.SOUL_SAND).mapColor(MapColor.DARK_CRIMSON).strength(1.2f, 6.0f).instrument(Instrument.COW_BELL).sounds(BlockSoundGroup.SHROOMLIGHT).emissiveLighting(ModBlocks::always)),
            new SoulSandBlock(FabricBlockSettings.copyOf(Blocks.SOUL_SAND).mapColor(MapColor.DARK_CRIMSON).strength(3.0f, 99.0f).instrument(Instrument.COW_BELL).sounds(BlockSoundGroup.SHROOMLIGHT).emissiveLighting(ModBlocks::always))
    );
    public static final Block[] COMPACTED_SOUL_SOIL = registerCompactedBlockSet("soul_soil",
            new Block(FabricBlockSettings.copyOf(Blocks.SOUL_SOIL).mapColor(MapColor.BROWN).strength(0.8f).sounds(BlockSoundGroup.SOUL_SOIL)),
            new Block(FabricBlockSettings.copyOf(Blocks.SOUL_SOIL).mapColor(MapColor.BROWN).strength(1.2f).sounds(BlockSoundGroup.SOUL_SOIL)),
            new Block(FabricBlockSettings.copyOf(Blocks.SOUL_SOIL).mapColor(MapColor.BROWN).strength(1.4f, 6.0f).sounds(BlockSoundGroup.STONE)),
            new Block(FabricBlockSettings.copyOf(Blocks.SOUL_SOIL).mapColor(MapColor.BROWN).strength(1.4f, 99.0f).sounds(BlockSoundGroup.STONE))
    );
    public static final Block[] COMPACTED_COBBLESTONE = registerCompactedBlockSet("cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).sounds(BlockSoundGroup.STONE).strength(2.0f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).sounds(BlockSoundGroup.STONE).strength(2.0f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).sounds(BlockSoundGroup.STONE).strength(3.0f, 99.0f).requiresTool().instrument(Instrument.BASEDRUM))
    );
    public static final Block[] COMPACTED_STONE = registerCompactedBlockSet("stone",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.5f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.5f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.5f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.5f, 99.0f).requiresTool().instrument(Instrument.BASEDRUM))
    );
    public static final Block[] COMPACTED_ANDESITE = registerCompactedBlockSet("andesite",
            new Block(FabricBlockSettings.copyOf(Blocks.ANDESITE).strength(1.5f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.ANDESITE).strength(1.5f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.ANDESITE).strength(1.5f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.ANDESITE).strength(2.0f, 99.0f).requiresTool().instrument(Instrument.BASEDRUM))
    );
    public static final Block[] COMPACTED_GRAVEL = registerCompactedBlockSet("gravel",
            new FallingBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL).strength(0.8f).instrument(Instrument.SNARE)),
            new FallingBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL).strength(1.2f).instrument(Instrument.SNARE)),
            new Block(FabricBlockSettings.copyOf(Blocks.GRAVEL).strength(1.2f, 6.0f).instrument(Instrument.SNARE).requiresTool().sounds(BlockSoundGroup.STONE)),
            new Block(FabricBlockSettings.copyOf(Blocks.GRAVEL).strength(2.0f, 99.0f).instrument(Instrument.SNARE).requiresTool().sounds(BlockSoundGroup.STONE))
    );
    public static final Block[] COMPACTED_TUFF = registerCompactedBlockSet("tuff",
            new Block(FabricBlockSettings.copyOf(Blocks.TUFF).strength(1.5f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.TUFF).strength(1.5f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.TUFF).strength(1.5f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.TUFF).strength(2.0f, 99.0f).requiresTool().instrument(Instrument.BASEDRUM))
    );
    public static final Block[] COMPACTED_BLACKSTONE = registerCompactedBlockSet("blackstone",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACKSTONE).strength(1.5f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.BLACKSTONE).strength(1.5f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.BLACKSTONE).strength(1.5f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.BLACKSTONE).strength(2.0f, 99.0f).requiresTool().instrument(Instrument.BASEDRUM))
    );
    public static final Block[] COMPACTED_OBSIDIAN = registerCompactedBlockSet("obsidian",
            new TintedGlassBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).strength(10.0f, 1200.0f).requiresTool().sounds(BlockSoundGroup.GLASS).instrument(Instrument.BASEDRUM).nonOpaque().allowsSpawning(ModBlocks::never).solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never)),
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).strength(50.0f, 1200.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).strength(50.0f, 1200.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).strength(50.0f, 1200.0f).requiresTool().instrument(Instrument.BASEDRUM))
    );
    public static final Block[] COMPACTED_DEEPSLATE = registerCompactedBlockSet("deepslate",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(3.2f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(3.2f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(3.2f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(3.5f, 99.0f).requiresTool().instrument(Instrument.BASEDRUM))
    );
    public static final Block[] COMPACTED_NETHERRACK = registerCompactedBlockSet("netherrack",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERRACK).strength(1.2f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERRACK).strength(1.2f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERRACK).strength(1.4f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERRACK).strength(1.4f, 99.0f).requiresTool().instrument(Instrument.BASEDRUM))
    );
    public static final Block[] COMPACTED_END_STONE = registerCompactedBlockSet("end_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(3.0f, 9.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(3.0f, 9.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(3.0f, 9.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(3.0f, 99.0f).requiresTool().instrument(Instrument.BASEDRUM))
    );
    public static final Block[] COMPACTED_DIORITE = registerCompactedBlockSet("diorite",
            new Block(FabricBlockSettings.copyOf(Blocks.DIORITE).strength(1.5f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.DIORITE).strength(1.5f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.DIORITE).strength(1.5f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.DIORITE).strength(2.0f, 99.0f).requiresTool().instrument(Instrument.BASEDRUM))
    );
    public static final Block[] COMPACTED_GRANITE = registerCompactedBlockSet("granite",
            new Block(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(1.5f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(1.5f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(1.5f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2.0f, 99.0f).requiresTool().instrument(Instrument.BASEDRUM))
    );
    public static final Block[] COMPACTED_DIRT = registerCompactedBlockSet("dirt",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).strength(0.8f)),
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).strength(0.8f)),
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).strength(1.0f, 6.0f)),
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).strength(1.2f, 99.0f))
    );
    public static final Block[] COMPACTED_SAND = registerCompactedBlockSet("sand",
            new Block(FabricBlockSettings.copyOf(Blocks.SAND).strength(0.8f).instrument(Instrument.SNARE).requiresTool().sounds(BlockSoundGroup.STONE)),
            new Block(FabricBlockSettings.copyOf(Blocks.SAND).strength(1.2f).instrument(Instrument.SNARE).requiresTool().sounds(BlockSoundGroup.STONE)),
            new Block(FabricBlockSettings.copyOf(Blocks.SAND).strength(1.2f, 6.0f).instrument(Instrument.SNARE).requiresTool().sounds(BlockSoundGroup.STONE)),
            new Block(FabricBlockSettings.copyOf(Blocks.SAND).strength(2.0f, 99.0f).instrument(Instrument.SNARE).requiresTool().sounds(BlockSoundGroup.STONE))
    );
    public static final Block[] COMPACTED_RED_SAND = registerCompactedBlockSet("red_sand",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_SAND).strength(0.8f).instrument(Instrument.SNARE).requiresTool().sounds(BlockSoundGroup.STONE)),
            new Block(FabricBlockSettings.copyOf(Blocks.RED_SAND).strength(1.2f).instrument(Instrument.SNARE).requiresTool().sounds(BlockSoundGroup.STONE)),
            new Block(FabricBlockSettings.copyOf(Blocks.RED_SAND).strength(1.2f, 6.0f).instrument(Instrument.SNARE).requiresTool().sounds(BlockSoundGroup.STONE)),
            new Block(FabricBlockSettings.copyOf(Blocks.RED_SAND).strength(2.0f, 99.0f).instrument(Instrument.SNARE).requiresTool().sounds(BlockSoundGroup.STONE))
    );
    public static final Block[] COMPACTED_DRIPSTONE_BLOCKS = registerCompactedBlockSet("dripstone_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).strength(1.2f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).strength(1.5f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).strength(1.5f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).strength(2.0f, 99.0f).requiresTool().instrument(Instrument.BASEDRUM))
    );
    public static final Block[] COMPACTED_CALCITE = registerCompactedBlockSet("calcite",
            new Block(FabricBlockSettings.copyOf(Blocks.CALCITE).strength(1.5f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.CALCITE).strength(1.5f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.CALCITE).strength(1.5f, 6.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.CALCITE).strength(2.0f, 99.0f).requiresTool().instrument(Instrument.BASEDRUM))
    );
    public static final Block[] COMPACTED_MUD = registerCompactedBlockSet("mud",
            new MudBlock(FabricBlockSettings.copyOf(Blocks.MUD).strength(1.0f)),
            new MudBlock(FabricBlockSettings.copyOf(Blocks.MUD).strength(1.0f)),
            new MudBlock(FabricBlockSettings.copyOf(Blocks.MUD).strength(1.0f, 6.0f)),
            new MudBlock(FabricBlockSettings.copyOf(Blocks.MUD).strength(1.4f, 99.0f))
    );
    public static final Block[] COMPACTED_MOSS_BLOCKS = registerCompactedBlockSet("moss_block",
            new MossBlock(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK).strength(0.8f)),
            new MossBlock(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK).strength(0.8f)),
            new MossBlock(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK).strength(1.4f, 6.0f)),
            new MossBlock(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK).strength(1.4f, 99.0f))
    );
    public static final Block[] COMPACTED_CLAY = registerCompactedBlockSet("clay",
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).strength(0.6f).instrument(Instrument.FLUTE)),
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).strength(0.8f).instrument(Instrument.FLUTE)),
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).strength(1.4f, 6.0f).instrument(Instrument.FLUTE).requiresTool().sounds(BlockSoundGroup.STONE)),
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).strength(1.4f, 99.0f).instrument(Instrument.FLUTE).requiresTool().sounds(BlockSoundGroup.STONE))
    );
    public static final Block[] COMPACTED_MAGMA_BLOCKS = registerCompactedBlockSet("magma_block",
            new MagmaBlock(FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK).strength(0.5f).instrument(Instrument.BASEDRUM)),
            new MagmaBlock(FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK).strength(0.5f).instrument(Instrument.BASEDRUM)),
            new MagmaBlock(FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK).strength(1.4f, 6.0f).instrument(Instrument.BASEDRUM)),
            new MagmaBlock(FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK).strength(1.4f, 99.0f).instrument(Instrument.BASEDRUM))
    );
    public static final Block[] COMPACTED_SNOW_BLOCKS = registerCompactedBlockSet("snow_block",
            new Block(FabricBlockSettings.create().strength(0.2f).mapColor(MapColor.WHITE).sounds(BlockSoundGroup.SNOW)),
            new Block(FabricBlockSettings.create().strength(0.2f).mapColor(MapColor.WHITE).sounds(BlockSoundGroup.SNOW)),
            new Block(FabricBlockSettings.create().strength(1.4f, 6.0f).mapColor(MapColor.WHITE).sounds(BlockSoundGroup.STONE)),
            new Block(FabricBlockSettings.create().strength(1.4f, 99.0f).mapColor(MapColor.WHITE).sounds(BlockSoundGroup.STONE))
    );
    public static final Block[] COMPACTED_BASALT = registerCompactedBlockSet("basalt",
            new Block(FabricBlockSettings.copyOf(Blocks.BASALT).strength(1.25f, 4.2f).sounds(BlockSoundGroup.BASALT).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.BASALT).strength(1.25f, 4.2f).sounds(BlockSoundGroup.BASALT).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.BASALT).strength(1.4f, 6.0f).sounds(BlockSoundGroup.BASALT).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.BASALT).strength(1.4f, 99.0f).sounds(BlockSoundGroup.BASALT).requiresTool().instrument(Instrument.BASEDRUM))
    );
    public static final Block[] COMPACTED_COBBLED_DEEPSLATE = registerCompactedBlockSet("cobbled_deepslate",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE).strength(3.5f, 6.0f).requiresTool()),
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE).strength(3.5f, 6.0f).requiresTool()),
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE).strength(3.5f, 6.0f).requiresTool()),
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE).strength(3.5f, 99.0f).requiresTool())
    );
    public static final Block[] COMPACTED_SCULK = registerCompactedBlockSet("sculk",
            new Block(FabricBlockSettings.copyOf(Blocks.SCULK).mapColor(MapColor.BLACK).strength(0.2f).sounds(BlockSoundGroup.SCULK).luminance(state -> 15)),
            new Block(FabricBlockSettings.copyOf(Blocks.SCULK).mapColor(MapColor.BLACK).strength(0.4f).sounds(BlockSoundGroup.SCULK)),
            new Block(FabricBlockSettings.copyOf(Blocks.SCULK).mapColor(MapColor.BLACK).strength(1.2f, 6.0f).sounds(BlockSoundGroup.SCULK)),
            new Block(FabricBlockSettings.copyOf(Blocks.SCULK).mapColor(MapColor.BLACK).strength(2.0f, 99.0f).sounds(BlockSoundGroup.SCULK))
    );
    public static final Block[] COMPACTED_PRISMARINE = registerCompactedBlockSet("prismarine",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE).strength(1.5f, 6.0f).mapColor(MapColor.CYAN).instrument(Instrument.BASEDRUM).requiresTool().sounds(BlockSoundGroup.STONE)),
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE).strength(1.5f, 6.0f).mapColor(MapColor.CYAN).instrument(Instrument.BASEDRUM).requiresTool().sounds(BlockSoundGroup.STONE)),
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE).strength(2.0f, 6.0f).mapColor(MapColor.CYAN).instrument(Instrument.BASEDRUM).requiresTool().sounds(BlockSoundGroup.STONE)),
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE).strength(3.0f, 99.0f).mapColor(MapColor.CYAN).instrument(Instrument.BASEDRUM).requiresTool().sounds(BlockSoundGroup.STONE))
    );
    public static final Block[] COMPACTED_BLUE_ICE = registerCompactedBlockSet("blue_ice",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_ICE).strength(3.0f, 6.0f).mapColor(MapColor.PALE_PURPLE).slipperiness(0.989f).sounds(BlockSoundGroup.GLASS)),
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_ICE).strength(3.0f, 6.0f).mapColor(MapColor.PALE_PURPLE).slipperiness(0.989f).sounds(BlockSoundGroup.GLASS)),
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_ICE).strength(3.0f, 6.0f).mapColor(MapColor.PALE_PURPLE).slipperiness(0.989f).sounds(BlockSoundGroup.GLASS)),
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_ICE).strength(4.0f, 99.0f).mapColor(MapColor.PALE_PURPLE).slipperiness(0.989f).sounds(BlockSoundGroup.GLASS))
    );

    // TODO (maybe) custom block behavior that allows these to illuminate a much larger area that would typically be allowed
    public static final Block[] COMPACTED_GLOWSTONE_BLOCKS = registerCompactedBlockSet("glowstone",
            new Block(FabricBlockSettings.create().mapColor(MapColor.GOLD).strength(0.3f).instrument(Instrument.PLING).sounds(BlockSoundGroup.GLASS).luminance(state -> 15).solidBlock(ModBlocks::never)),
            new Block(FabricBlockSettings.create().mapColor(MapColor.GOLD).strength(0.3f).instrument(Instrument.PLING).sounds(BlockSoundGroup.GLASS).luminance(state -> 15).solidBlock(ModBlocks::never)),
            new Block(FabricBlockSettings.create().mapColor(MapColor.GOLD).strength(0.5f).instrument(Instrument.PLING).sounds(BlockSoundGroup.GLASS).luminance(state -> 15).solidBlock(ModBlocks::never)),
            new Block(FabricBlockSettings.create().mapColor(MapColor.GOLD).strength(0.5f).instrument(Instrument.PLING).sounds(BlockSoundGroup.GLASS).luminance(state -> 15).solidBlock(ModBlocks::never))
            );
    public static final Block[] COMPACTED_RAW_IRON_BLOCKS = registerCompactedBlockSet("raw_iron_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().instrument(Instrument.BASEDRUM))
    );
    public static final Block[] COMPACTED_RAW_GOLD_BLOCKS = registerCompactedBlockSet("raw_gold_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_GOLD_BLOCK).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_GOLD_BLOCK).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_GOLD_BLOCK).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_GOLD_BLOCK).requiresTool().instrument(Instrument.BASEDRUM))
    );
    public static final Block[] COMPACTED_RAW_COPPER_BLOCKS = registerCompactedBlockSet("raw_copper_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_COPPER_BLOCK).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_COPPER_BLOCK).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_COPPER_BLOCK).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_COPPER_BLOCK).requiresTool().instrument(Instrument.BASEDRUM))
    );
    public static final Block[] COMPACTED_REDSTONE_BLOCKS = registerCompactedBlockSet("redstone_block",
            new RedstoneBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).strength(5.0f, 6.0f).requiresTool().luminance(11)),
            new RedstoneBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).strength(5.0f, 6.0f).requiresTool().luminance(9)),
            new RedstoneBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).strength(5.0f, 6.0f).requiresTool().luminance(9)),
            new RedstoneBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).strength(5.0f, 99.0f).requiresTool().luminance(9))
    );
    public static final Block[] COMPACTED_COAL_BLOCKS = registerCompactedBlockSet("coal_block",
            new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK).requiresTool().burnable().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK).requiresTool().burnable().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK).requiresTool().burnable().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK).requiresTool().burnable().instrument(Instrument.BASEDRUM))
    );
    public static final Block[] COMPACTED_QUARTZ_BLOCKS = registerCompactedBlockSet("quartz_block",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).strength(1.0f).requiresTool().instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(ModBlocks::never).solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never)),
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).strength(1.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).strength(1.0f).requiresTool().instrument(Instrument.BASEDRUM)),
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).strength(1.4f).requiresTool().instrument(Instrument.BASEDRUM))
    );
    public static final Block[] COMPACTED_IRON_BLOCKS = registerCompactedBlockSet("iron_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().instrument(Instrument.IRON_XYLOPHONE)),
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().instrument(Instrument.IRON_XYLOPHONE)),
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().instrument(Instrument.IRON_XYLOPHONE)),
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().instrument(Instrument.IRON_XYLOPHONE))
    );
    public static final Block[] COMPACTED_NETHERITE_BLOCKS = registerCompactedBlockSet("netherite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).sounds(BlockSoundGroup.NETHERITE).requiresTool()),
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).sounds(BlockSoundGroup.NETHERITE).requiresTool()),
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).sounds(BlockSoundGroup.NETHERITE).requiresTool()),
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).sounds(BlockSoundGroup.NETHERITE).requiresTool())
    );
    public static final Block[] COMPACTED_GOLD_BLOCKS = registerCompactedBlockSet("gold_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).requiresTool().instrument(Instrument.BELL)),
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).requiresTool().instrument(Instrument.BELL)),
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).requiresTool().instrument(Instrument.BELL)),
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).requiresTool().instrument(Instrument.BELL))
    );
    public static final Block[] COMPACTED_DIAMOND_BLOCKS = registerCompactedBlockSet("diamond_block",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).mapColor(MapColor.DIAMOND_BLUE).instrument(Instrument.HAT).requiresTool().sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(ModBlocks::never).solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never)),
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).mapColor(MapColor.DIAMOND_BLUE).requiresTool()),
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).mapColor(MapColor.DIAMOND_BLUE).requiresTool()),
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).mapColor(MapColor.DIAMOND_BLUE).requiresTool())
    );
    public static final Block[] COMPACTED_EMERALD_BLOCKS = registerCompactedBlockSet("emerald_block",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(ModBlocks::never).solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never)),
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool()),
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool()),
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool())
    );
    public static final Block[] COMPACTED_LAPIS_BLOCKS = registerCompactedBlockSet("lapis_block",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.LAPIS_BLUE).requiresTool()),
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.LAPIS_BLUE).requiresTool()),
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.LAPIS_BLUE).requiresTool()),
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.LAPIS_BLUE).requiresTool())
    );
    public static final Block[] COMPACTED_AMETHYST_BLOCKS = registerCompactedBlockSet("amethyst_block",
            new AmethystGlassBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).strength(1.5f).requiresTool().instrument(Instrument.HAT).nonOpaque().allowsSpawning(ModBlocks::never).solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never)),
            new AmethystBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).strength(1.5f).requiresTool()),
            new AmethystBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).strength(2.0f).requiresTool()),
            new AmethystBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).strength(2.0f).requiresTool())
    );
    public static final Block[] COMPACTED_BONE_BLOCKS = registerCompactedBlockSet("bone_block",
            new Block(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK).requiresTool().instrument(Instrument.XYLOPHONE)),
            new Block(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK).requiresTool().instrument(Instrument.XYLOPHONE)),
            new Block(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK).requiresTool().instrument(Instrument.XYLOPHONE)),
            new Block(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK).requiresTool().instrument(Instrument.XYLOPHONE)) //.instrument(Instrument.SKELETON) <- sadly this instrument only works when the block is placed above the noteblock
    );
    public static final Block[] COMPACTED_COPPER_BLOCKS = registerCompactedBlockSet("copper_block",
            new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.create().mapColor(MapColor.ORANGE).requiresTool().strength(1.5f,6.0f).sounds(BlockSoundGroup.COPPER)),
            new Block(FabricBlockSettings.create().mapColor(MapColor.ORANGE).requiresTool().strength(1.5f,6.0f).sounds(BlockSoundGroup.COPPER)),
            new Block(FabricBlockSettings.create().mapColor(MapColor.ORANGE).requiresTool().strength(1.5f,6.0f).sounds(BlockSoundGroup.COPPER)),
            new Block(FabricBlockSettings.create().mapColor(MapColor.ORANGE).requiresTool().strength(1.5f,6.0f).sounds(BlockSoundGroup.COPPER))
    );
    public static final Block COMPRESSED_COPPER_BLOCK = COMPACTED_COPPER_BLOCKS[0]; // silly, but it's for a temporary convenience
    public static final Block EXPOSED_COMPRESSED_COPPER_BLOCK = registerBlockWithCompressionTier("exposed_compressed_copper_block", 0, new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.create().mapColor(MapColor.ORANGE).requiresTool().strength(1.5f,6.0f).sounds(BlockSoundGroup.COPPER))/*,ModItemGroups.SQUASHED*/);
    public static final Block WEATHERED_COMPRESSED_COPPER_BLOCK = registerBlockWithCompressionTier("weathered_compressed_copper_block", 0, new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.create().mapColor(MapColor.LICHEN_GREEN).requiresTool().strength(1.5f,6.0f).sounds(BlockSoundGroup.COPPER))/*,ModItemGroups.SQUASHED*/);
    public static final Block OXIDIZED_COMPRESSED_COPPER_BLOCK = registerBlockWithCompressionTier("oxidized_compressed_copper_block", 0, new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.create().mapColor(MapColor.BRIGHT_TEAL).requiresTool().strength(1.5f,6.0f).sounds(BlockSoundGroup.COPPER))/*,ModItemGroups.SQUASHED*/);
    public static final Block WAXED_COMPRESSED_COPPER_BLOCK = registerBlockWithCompressionTier("waxed_compressed_copper_block", 0, new Block(AbstractBlock.Settings.copy(COMPRESSED_COPPER_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block WAXED_EXPOSED_COMPRESSED_COPPER_BLOCK = registerBlockWithCompressionTier("waxed_exposed_compressed_copper_block", 0, new Block(AbstractBlock.Settings.copy(EXPOSED_COMPRESSED_COPPER_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block WAXED_WEATHERED_COMPRESSED_COPPER_BLOCK = registerBlockWithCompressionTier("waxed_weathered_compressed_copper_block", 0, new Block(AbstractBlock.Settings.copy(WEATHERED_COMPRESSED_COPPER_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block WAXED_OXIDIZED_COMPRESSED_COPPER_BLOCK = registerBlockWithCompressionTier("waxed_oxidized_compressed_copper_block", 0, new Block(AbstractBlock.Settings.copy(OXIDIZED_COMPRESSED_COPPER_BLOCK))/*,ModItemGroups.SQUASHED*/);

    public static final Block WHITE_DYE_BLOCK = registerBlock("white_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.WHITE).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN))/*,ModItemGroups.SQUASHED*/);
    public static final Block ORANGE_DYE_BLOCK = registerBlock("orange_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN))/*,ModItemGroups.SQUASHED*/);
    public static final Block MAGENTA_DYE_BLOCK = registerBlock("magenta_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.MAGENTA).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN))/*,ModItemGroups.SQUASHED*/);
    public static final Block LIGHT_BLUE_DYE_BLOCK = registerBlock("light_blue_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.LIGHT_BLUE).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN))/*,ModItemGroups.SQUASHED*/);
    public static final Block YELLOW_DYE_BLOCK = registerBlock("yellow_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.YELLOW).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN))/*,ModItemGroups.SQUASHED*/);
    public static final Block LIME_DYE_BLOCK = registerBlock("lime_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.LIME).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN))/*,ModItemGroups.SQUASHED*/);
    public static final Block PINK_DYE_BLOCK = registerBlock("pink_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.PINK).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN))/*,ModItemGroups.SQUASHED*/);
    public static final Block GRAY_DYE_BLOCK = registerBlock("gray_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN))/*,ModItemGroups.SQUASHED*/);
    public static final Block LIGHT_GRAY_DYE_BLOCK = registerBlock("light_gray_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.LIGHT_GRAY).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN))/*,ModItemGroups.SQUASHED*/);
    public static final Block CYAN_DYE_BLOCK = registerBlock("cyan_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.CYAN).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN))/*,ModItemGroups.SQUASHED*/);
    public static final Block PURPLE_DYE_BLOCK = registerBlock("purple_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.PURPLE).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN))/*,ModItemGroups.SQUASHED*/);
    public static final Block BLUE_DYE_BLOCK = registerBlock("blue_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.BLUE).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN))/*,ModItemGroups.SQUASHED*/);
    public static final Block BROWN_DYE_BLOCK = registerBlock("brown_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN))/*,ModItemGroups.SQUASHED*/);
    public static final Block GREEN_DYE_BLOCK = registerBlock("green_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.GREEN).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN))/*,ModItemGroups.SQUASHED*/);
    public static final Block RED_DYE_BLOCK = registerBlock("red_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.RED).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN))/*,ModItemGroups.SQUASHED*/);
    public static final Block BLACK_DYE_BLOCK = registerBlock("black_dye_block", createDyeBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.FROGSPAWN))/*,ModItemGroups.SQUASHED*/);
    //TODO add mint compat for more dye blocks


    public static final Block WHITE_COMPRESSED_WOOL = registerBlock("white_compressed_wool", createCompressedWoolBlock(DyeColor.WHITE)/*,ModItemGroups.SQUASHED*/);
    public static final Block ORANGE_COMPRESSED_WOOL = registerBlock("orange_compressed_wool", createCompressedWoolBlock(DyeColor.ORANGE)/*,ModItemGroups.SQUASHED*/);
    public static final Block MAGENTA_COMPRESSED_WOOL = registerBlock("magenta_compressed_wool", createCompressedWoolBlock(DyeColor.MAGENTA)/*,ModItemGroups.SQUASHED*/);
    public static final Block LIGHT_BLUE_COMPRESSED_WOOL = registerBlock("light_blue_compressed_wool", createCompressedWoolBlock(DyeColor.LIGHT_BLUE)/*,ModItemGroups.SQUASHED*/);
    public static final Block YELLOW_COMPRESSED_WOOL = registerBlock("yellow_compressed_wool", createCompressedWoolBlock(DyeColor.YELLOW)/*,ModItemGroups.SQUASHED*/);
    public static final Block LIME_COMPRESSED_WOOL = registerBlock("lime_compressed_wool", createCompressedWoolBlock(DyeColor.LIME)/*,ModItemGroups.SQUASHED*/);
    public static final Block PINK_COMPRESSED_WOOL = registerBlock("pink_compressed_wool", createCompressedWoolBlock(DyeColor.PINK)/*,ModItemGroups.SQUASHED*/);
    public static final Block GRAY_COMPRESSED_WOOL = registerBlock("gray_compressed_wool", createCompressedWoolBlock(DyeColor.GRAY)/*,ModItemGroups.SQUASHED*/);
    public static final Block LIGHT_GRAY_COMPRESSED_WOOL = registerBlock("light_gray_compressed_wool", createCompressedWoolBlock(DyeColor.LIGHT_GRAY)/*,ModItemGroups.SQUASHED*/);
    public static final Block CYAN_COMPRESSED_WOOL = registerBlock("cyan_compressed_wool", createCompressedWoolBlock(DyeColor.CYAN)/*,ModItemGroups.SQUASHED*/);
    public static final Block PURPLE_COMPRESSED_WOOL = registerBlock("purple_compressed_wool", createCompressedWoolBlock(DyeColor.PURPLE)/*,ModItemGroups.SQUASHED*/);
    public static final Block BLUE_COMPRESSED_WOOL = registerBlock("blue_compressed_wool", createCompressedWoolBlock(DyeColor.BLUE)/*,ModItemGroups.SQUASHED*/);
    public static final Block BROWN_COMPRESSED_WOOL = registerBlock("brown_compressed_wool", createCompressedWoolBlock(DyeColor.BROWN)/*,ModItemGroups.SQUASHED*/);
    public static final Block GREEN_COMPRESSED_WOOL = registerBlock("green_compressed_wool", createCompressedWoolBlock(DyeColor.GREEN)/*,ModItemGroups.SQUASHED*/);
    public static final Block RED_COMPRESSED_WOOL = registerBlock("red_compressed_wool", createCompressedWoolBlock(DyeColor.RED)/*,ModItemGroups.SQUASHED*/);
    public static final Block BLACK_COMPRESSED_WOOL = registerBlock("black_compressed_wool", createCompressedWoolBlock(DyeColor.BLACK)/*,ModItemGroups.SQUASHED*/);

    public static final Block BOOK_BLOCK = registerBlock("book_block", new Block(FabricBlockSettings.create().mapColor(MapColor.DIRT_BROWN).strength(2.0f).sounds(BlockSoundGroup.NETHER_WOOD).burnable())/*,ModItemGroups.SQUASHED*/);

    public static final Block COMPRESSED_OAK_LEAVES = registerBlock("compressed_oak_leaves", createCompressedLeavesBlock(MapColor.ORANGE, BlockSoundGroup.AZALEA_LEAVES));
    public static final Block COMPRESSED_SPRUCE_LEAVES = registerBlock("compressed_spruce_leaves", createCompressedLeavesBlock(MapColor.TERRACOTTA_RED, BlockSoundGroup.FLOWERING_AZALEA));
    public static final Block COMPRESSED_BIRCH_LEAVES = registerBlock("compressed_birch_leaves", createCompressedLeavesBlock(MapColor.TERRACOTTA_YELLOW, BlockSoundGroup.AZALEA_LEAVES));
    public static final Block COMPRESSED_JUNGLE_LEAVES = registerBlock("compressed_jungle_leaves", createCompressedLeavesBlock(MapColor.PALE_GREEN, BlockSoundGroup.AZALEA_LEAVES));
    public static final Block COMPRESSED_ACACIA_LEAVES = registerBlock("compressed_acacia_leaves", createCompressedLeavesBlock(MapColor.TERRACOTTA_LIGHT_GRAY, BlockSoundGroup.AZALEA_LEAVES));
    public static final Block COMPRESSED_DARK_OAK_LEAVES = registerBlock("compressed_dark_oak_leaves", createCompressedLeavesBlock(MapColor.TERRACOTTA_BROWN, BlockSoundGroup.AZALEA_LEAVES));
    public static final Block COMPRESSED_MANGROVE_LEAVES = registerBlock("compressed_mangrove_leaves", createCompressedLeavesBlock(MapColor.DARK_RED, BlockSoundGroup.AZALEA_LEAVES));
    public static final Block COMPRESSED_CHERRY_LEAVES = registerBlock("compressed_cherry_leaves", createCompressedLeavesBlock(MapColor.PINK, BlockSoundGroup.AZALEA_LEAVES));
    public static final Block COMPRESSED_AZALEA_LEAVES = registerBlock("compressed_azalea_leaves", createCompressedLeavesBlock(MapColor.DULL_PINK, BlockSoundGroup.AZALEA_LEAVES));
    public static final Block COMPRESSED_FLOWERING_AZALEA_LEAVES = registerBlock("compressed_flowering_azalea_leaves", createCompressedLeavesBlock(MapColor.MAGENTA, BlockSoundGroup.AZALEA_LEAVES));

    public static final Block LEATHER_BLOCK = registerBlock("leather_block", new PillarBlock(FabricBlockSettings.create().mapColor(MapColor.TERRACOTTA_ORANGE).strength(0.8f).sounds(BlockSoundGroup.FUNGUS))/*,ModItemGroups.SQUASHED*/);

    public static final Block[] COMPACTED_OAK_LOGS = registerCompactedBlockSet("oak_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2.0f, 6.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2.0f, 99.0f))
    );
    public static final Block[] COMPACTED_SPRUCE_LOGS = registerCompactedBlockSet("spruce_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LOG).strength(2.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LOG).strength(2.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LOG).strength(2.0f, 6.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LOG).strength(2.0f, 99.0f))
    );
    public static final Block[] COMPACTED_BIRCH_LOGS = registerCompactedBlockSet("birch_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_LOG).strength(2.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_LOG).strength(2.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_LOG).strength(2.0f, 6.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_LOG).strength(2.0f, 99.0f))
    );
    public static final Block[] COMPACTED_JUNGLE_LOGS = registerCompactedBlockSet("jungle_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LOG).strength(2.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LOG).strength(2.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LOG).strength(2.0f, 6.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LOG).strength(2.0f, 99.0f))
    );
    public static final Block[] COMPACTED_ACACIA_LOGS = registerCompactedBlockSet("acacia_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG).strength(2.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG).strength(2.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG).strength(2.0f, 6.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG).strength(2.0f, 99.0f))
    );
    public static final Block[] COMPACTED_DARK_OAK_LOGS = registerCompactedBlockSet("dark_oak_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_LOG).strength(2.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_LOG).strength(2.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_LOG).strength(2.0f, 6.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_LOG).strength(2.0f, 99.0f))
    );
    public static final Block[] COMPACTED_MANGROVE_LOGS = registerCompactedBlockSet("mangrove_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_LOG).strength(2.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_LOG).strength(2.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_LOG).strength(2.0f, 6.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_LOG).strength(2.0f, 99.0f))
    );
    public static final Block[] COMPACTED_CHERRY_LOGS = registerCompactedBlockSet("cherry_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LOG).strength(2.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LOG).strength(2.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LOG).strength(2.0f, 6.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LOG).strength(2.0f, 99.0f))
    );
    public static final Block[] COMPACTED_CRIMSON_STEMS = registerCompactedBlockSet("crimson_stem",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_STEM).strength(2.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_STEM).strength(2.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_STEM).strength(2.0f, 6.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_STEM).strength(2.0f, 99.0f))
    );
    public static final Block[] COMPACTED_WARPED_STEMS = registerCompactedBlockSet("warped_stem",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.WARPED_STEM).strength(2.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.WARPED_STEM).strength(2.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.WARPED_STEM).strength(2.0f, 6.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.WARPED_STEM).strength(2.0f, 99.0f))
    );
    public static final Block[] COMPACTED_BAMBOO_BLOCKS = registerCompactedBlockSet("bamboo_block",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_BLOCK).strength(2.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_BLOCK).strength(2.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_BLOCK).strength(2.0f, 6.0f)),
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_BLOCK).strength(2.0f, 99.0f))
    );

    public static final Block COMPRESSED_CHERRY_SAPLING = registerBlock("compressed_cherry_sapling", new Block(FabricBlockSettings.create().mapColor(MapColor.PINK).strength(0.5f).sounds(BlockSoundGroup.ROOTED_DIRT).burnable())/*,ModItemGroups.SQUASHED*/);
    public static final Block COMPRESSED_OAK_SAPLING = registerBlock("compressed_oak_sapling", new Block(FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).strength(0.5f).sounds(BlockSoundGroup.ROOTED_DIRT).burnable())/*,ModItemGroups.SQUASHED*/);
    public static final Block COMPRESSED_SPRUCE_SAPLING = registerBlock("compressed_spruce_sapling", new Block(FabricBlockSettings.create().mapColor(MapColor.SPRUCE_BROWN).strength(0.5f).sounds(BlockSoundGroup.ROOTED_DIRT).burnable())/*,ModItemGroups.SQUASHED*/);
    public static final Block COMPRESSED_BIRCH_SAPLING = registerBlock("compressed_birch_sapling", new Block(FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).strength(0.5f).sounds(BlockSoundGroup.ROOTED_DIRT).burnable())/*,ModItemGroups.SQUASHED*/);
    public static final Block COMPRESSED_JUNGLE_SAPLING = registerBlock("compressed_jungle_sapling", new Block(FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).strength(0.5f).sounds(BlockSoundGroup.ROOTED_DIRT).burnable())/*,ModItemGroups.SQUASHED*/);
    public static final Block COMPRESSED_ACACIA_SAPLING = registerBlock("compressed_acacia_sapling", new Block(FabricBlockSettings.create().mapColor(MapColor.TERRACOTTA_ORANGE).strength(0.5f).sounds(BlockSoundGroup.ROOTED_DIRT).burnable())/*,ModItemGroups.SQUASHED*/);
    public static final Block COMPRESSED_DARK_OAK_SAPLING = registerBlock("compressed_dark_oak_sapling", new Block(FabricBlockSettings.create().mapColor(MapColor.TERRACOTTA_GRAY).strength(0.5f).sounds(BlockSoundGroup.ROOTED_DIRT).burnable())/*,ModItemGroups.SQUASHED*/);
    public static final Block COMPRESSED_AZALEA_SAPLING = registerBlock("compressed_azalea_sapling", new Block(FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).strength(0.5f).sounds(BlockSoundGroup.ROOTED_DIRT).burnable())/*,ModItemGroups.SQUASHED*/);
    public static final Block COMPRESSED_FLOWERING_AZALEA_SAPLING = registerBlock("compressed_flowering_azalea_sapling", new Block(FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).strength(0.5f).sounds(BlockSoundGroup.ROOTED_DIRT).burnable())/*,ModItemGroups.SQUASHED*/);
    public static final Block COMPRESSED_MANGROVE_PROPAGULE = registerBlock("compressed_mangrove_propagule", new Block(FabricBlockSettings.create().mapColor(MapColor.DARK_CRIMSON).strength(0.5f).sounds(BlockSoundGroup.ROOTED_DIRT).burnable())/*,ModItemGroups.SQUASHED*/);
    public static final Block COMPRESSED_CRIMSON_FUNGUS = registerBlock("compressed_crimson_fungus", new Block(FabricBlockSettings.create().mapColor(MapColor.DARK_DULL_PINK).strength(0.5f).sounds(BlockSoundGroup.WART_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block COMPRESSED_WARPED_FUNGUS = registerBlock("compressed_warped_fungus", new Block(FabricBlockSettings.create().mapColor(MapColor.BRIGHT_TEAL).strength(0.5f).sounds(BlockSoundGroup.WART_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block CHORUS_FRUIT_BLOCK = registerBlock("chorus_fruit_block", new Block(FabricBlockSettings.create().mapColor(MapColor.DARK_DULL_PINK).strength(2.0f).sounds(BlockSoundGroup.WART_BLOCK))/*,ModItemGroups.SQUASHED*/);

    public static final Block COMPRESSED_SEAGRASS = registerBlock("compressed_seagrass", new Block(FabricBlockSettings.create().mapColor(MapColor.DARK_GREEN).strength(0.2f).sounds(BlockSoundGroup.WET_GRASS))/*,ModItemGroups.SQUASHED*/);
    public static final Block COMPRESSED_CACTUS = registerBlock("compressed_cactus", new PillarBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable())/*,ModItemGroups.SQUASHED*/);
    public static final Block TROPICAL_FISH_BLOCK_A = registerBlock("tropical_fish_block_a", createTropicalFishBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5f).sounds(ModBlockSoundGroup.TROPICAL_FISH_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block TROPICAL_FISH_BLOCK_B = registerBlock("tropical_fish_block_b", createTropicalFishBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5f).sounds(ModBlockSoundGroup.TROPICAL_FISH_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block TROPICAL_FISH_BLOCK_C = registerBlock("tropical_fish_block_c", createTropicalFishBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5f).sounds(ModBlockSoundGroup.TROPICAL_FISH_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block TROPICAL_FISH_BLOCK_D = registerBlock("tropical_fish_block_d", createTropicalFishBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5f).sounds(ModBlockSoundGroup.TROPICAL_FISH_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block TROPICAL_FISH_BLOCK_E = registerBlock("tropical_fish_block_e", createTropicalFishBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5f).sounds(ModBlockSoundGroup.TROPICAL_FISH_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block TROPICAL_FISH_BLOCK_F = registerBlock("tropical_fish_block_f", createTropicalFishBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5f).sounds(ModBlockSoundGroup.TROPICAL_FISH_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block TROPICAL_FISH_BLOCK_G = registerBlock("tropical_fish_block_g", createTropicalFishBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5f).sounds(ModBlockSoundGroup.TROPICAL_FISH_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block TROPICAL_FISH_BLOCK_H = registerBlock("tropical_fish_block_h", createTropicalFishBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5f).sounds(ModBlockSoundGroup.TROPICAL_FISH_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block TROPICAL_FISH_BLOCK_I = registerBlock("tropical_fish_block_i", createTropicalFishBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5f).sounds(ModBlockSoundGroup.TROPICAL_FISH_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block TROPICAL_FISH_BLOCK_J = registerBlock("tropical_fish_block_j", createTropicalFishBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5f).sounds(ModBlockSoundGroup.TROPICAL_FISH_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block TROPICAL_FISH_BLOCK_K = registerBlock("tropical_fish_block_k", createTropicalFishBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5f).sounds(ModBlockSoundGroup.TROPICAL_FISH_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block TROPICAL_FISH_BLOCK_L = registerBlock("tropical_fish_block_l", createTropicalFishBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5f).sounds(ModBlockSoundGroup.TROPICAL_FISH_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block TROPICAL_FISH_BLOCK_M = registerBlock("tropical_fish_block_m", createTropicalFishBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5f).sounds(ModBlockSoundGroup.TROPICAL_FISH_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block TROPICAL_FISH_BLOCK_N = registerBlock("tropical_fish_block_n", createTropicalFishBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5f).sounds(ModBlockSoundGroup.TROPICAL_FISH_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block TROPICAL_FISH_BLOCK_O = registerBlock("tropical_fish_block_o", createTropicalFishBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5f).sounds(ModBlockSoundGroup.TROPICAL_FISH_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block TROPICAL_FISH_BLOCK_P = registerBlock("tropical_fish_block_p", createTropicalFishBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5f).sounds(ModBlockSoundGroup.TROPICAL_FISH_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block TROPICAL_FISH_BLOCK_Q = registerBlock("tropical_fish_block_q", createTropicalFishBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5f).sounds(ModBlockSoundGroup.TROPICAL_FISH_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block TROPICAL_FISH_BLOCK_R = registerBlock("tropical_fish_block_r", createTropicalFishBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5f).sounds(ModBlockSoundGroup.TROPICAL_FISH_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block TROPICAL_FISH_BLOCK_S = registerBlock("tropical_fish_block_s", createTropicalFishBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5f).sounds(ModBlockSoundGroup.TROPICAL_FISH_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block TROPICAL_FISH_BLOCK_T = registerBlock("tropical_fish_block_t", createTropicalFishBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5f).sounds(ModBlockSoundGroup.TROPICAL_FISH_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block TROPICAL_FISH_BLOCK_U = registerBlock("tropical_fish_block_u", createTropicalFishBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5f).sounds(ModBlockSoundGroup.TROPICAL_FISH_BLOCK))/*,ModItemGroups.SQUASHED*/);

    public static final Block PRISMARINE_CRYSTAL_BLOCK = registerBlock("prismarine_crystal_block", new Block(FabricBlockSettings.create().instrument(Instrument.HAT).mapColor(MapColor.OFF_WHITE).strength(3.0f, 6.0f).sounds(BlockSoundGroup.TUFF).luminance(state -> 15))/*,ModItemGroups.SQUASHED*/);
    public static final Block GLOW_INK_SAC_BLOCK = registerBlock("glow_ink_sac_block", new Block(FabricBlockSettings.create().mapColor(MapColor.BRIGHT_TEAL).strength(0.5f).sounds(BlockSoundGroup.MUD).luminance(state -> 7))/*,ModItemGroups.SQUASHED*/);
    public static final Block SCUTE_BLOCK = registerBlock("scute_block", new Block(FabricBlockSettings.create().mapColor(MapColor.DARK_GREEN).strength(1.5f,6.0f).sounds(BlockSoundGroup.CANDLE))/*,ModItemGroups.SQUASHED*/);
    public static final Block FEATHER_BLOCK = registerBlock("feather_block", new FeatherBlock(FabricBlockSettings.create().mapColor(MapColor.OFF_WHITE).instrument(Instrument.BANJO).strength(0.2f).sounds(BlockSoundGroup.WOOL).burnable().nonOpaque().allowsSpawning(ModBlocks::always).solidBlock(ModBlocks::always).blockVision(ModBlocks::always).suffocates(ModBlocks::always))/*,ModItemGroups.SQUASHED*/);
    public static final Block GHAST_TEAR_BLOCK = registerBlock("ghast_tear_block", new Block(FabricBlockSettings.create().mapColor(MapColor.OFF_WHITE).strength(3.0f, 6.0f).sounds(BlockSoundGroup.TUFF))/*,ModItemGroups.SQUASHED*/);
    public static final Block PHANTOM_MEMBRANE_BLOCK = registerBlockWithoutBlockItem("phantom_membrane_block", new Block(FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).sounds(BlockSoundGroup.CORAL))/*,ModItemGroups.SQUASHED*/);
    static { Registry.register(Registries.ITEM, new Identifier(Super.MOD_ID, "phantom_membrane_block"), new PhantomBlockItem(PHANTOM_MEMBRANE_BLOCK, new FabricItemSettings())); }

    public static final Block COMPRESSED_NETHER_WART_BLOCK = registerBlock("compressed_nether_wart_block", new Block(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).strength(0.5f).sounds(BlockSoundGroup.WART_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block COMPRESSED_WARPED_WART_BLOCK = registerBlock("compressed_warped_wart_block", new Block(FabricBlockSettings.create().mapColor(MapColor.BRIGHT_TEAL).strength(0.5f).sounds(BlockSoundGroup.WART_BLOCK))/*,ModItemGroups.SQUASHED*/);
    public static final Block MANGROVE_ROOTS_BLOCK = registerBlock("mangrove_roots_block", new PillarBlock(FabricBlockSettings.create().mapColor(MapColor.TERRACOTTA_GRAY).strength(2.0f).sounds(BlockSoundGroup.WOOD).burnable())/*,ModItemGroups.SQUASHED*/);
    public static final Block VINE_BLOCK = registerBlock("vine_block", new Block(FabricBlockSettings.create().mapColor(MapColor.DARK_GREEN).strength(0.2f).sounds(BlockSoundGroup.MOSS_BLOCK).burnable())/*,ModItemGroups.SQUASHED*/);
    public static final Block EGG_BLOCK = registerBlock("egg_block", new EggsBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).strength(0.5f).sounds(BlockSoundGroup.CANDLE))/*,ModItemGroups.SQUASHED*/);
    public static final Block PUFFERFISH_BLOCK = registerBlock("pufferfish_block", new PufferfishBlock(FabricBlockSettings.create().mapColor(MapColor.YELLOW).strength(0.5f).sounds(BlockSoundGroup.CORAL))/*,ModItemGroups.SQUASHED*/);
    public static final Block COMPRESSED_SPONGE = registerBlock("compressed_sponge", new CompressedSpongeBlock(FabricBlockSettings.copyOf(Blocks.POWDER_SNOW).mapColor(MapColor.YELLOW).strength(0.6f).sounds(BlockSoundGroup.CANDLE).nonOpaque().allowsSpawning(ModBlocks::never).solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never).pistonBehavior(PistonBehavior.NORMAL))/*,ModItemGroups.SQUASHED*/);
    public static final Block BONES_BLOCK = registerBlock("bones_block", new PillarBlock(FabricBlockSettings.create().mapColor(MapColor.OFF_WHITE).strength(1.5f,6.0f).instrument(Instrument.XYLOPHONE).sounds(BlockSoundGroup.BONE))/*,ModItemGroups.SQUASHED*/);
    public static final Block PAPER_BLOCK = registerBlock("paper_block", new Block(FabricBlockSettings.create().mapColor(MapColor.OFF_WHITE).strength(0.5f).sounds(BlockSoundGroup.BIG_DRIPLEAF).burnable())/*,ModItemGroups.SQUASHED*/);
    public static final Block COMPRESSED_SCAFFOLDING = registerBlock("compressed_scaffolding", new PillarBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).strength(2.0f).sounds(BlockSoundGroup.SCAFFOLDING).burnable())/*,ModItemGroups.SQUASHED*/);
    public static final Block KELP_BLOCK = registerBlock("kelp_block", new Block(FabricBlockSettings.create().mapColor(MapColor.DARK_GREEN).strength(0.2f).sounds(BlockSoundGroup.WET_GRASS))/*,ModItemGroups.SQUASHED*/);
    public static final Block LILY_PAD_BLOCK = registerBlock("lily_pad_block", new Block(FabricBlockSettings.create().mapColor(MapColor.DARK_GREEN).strength(0.2f).sounds(BlockSoundGroup.WET_GRASS))/*,ModItemGroups.SQUASHED*/);
    public static final Block ENDER_EYE_BLOCK = registerBlock("ender_eye_block", new Block(FabricBlockSettings.create().mapColor(MapColor.BRIGHT_TEAL).strength(0.5f).sounds(BlockSoundGroup.FROGLIGHT))/*,ModItemGroups.SQUASHED*/);
    public static final Block ENDER_PEARL_BLOCK = registerBlock("ender_pearl_block", new Block(FabricBlockSettings.create().mapColor(MapColor.BRIGHT_TEAL).strength(0.5f).sounds(BlockSoundGroup.FROGLIGHT))/*,ModItemGroups.SQUASHED*/);
    public static final Block ECHO_SHARD_BLOCK = registerBlock("echo_shard_block", new Block(FabricBlockSettings.create().mapColor(MapColor.TERRACOTTA_GRAY).strength(0.5f).sounds(BlockSoundGroup.SCULK_CATALYST))/*,ModItemGroups.SQUASHED*/);
    public static final Block COMPRESSED_COBWEB_BLOCK = registerBlock("compressed_cobweb_block", new /*CompressedCobwebBlock*/Block(FabricBlockSettings.copyOf(Blocks.POWDER_SNOW).mapColor(MapColor.OFF_WHITE).strength(4.0f).sounds(BlockSoundGroup.WOOL).dynamicBounds().nonOpaque().notSolid())/*,ModItemGroups.SQUASHED*/);
    public static final Block RABBIT_HIDE_BLOCK = registerBlock("rabbit_hide_block", new PillarBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).strength(0.5f).sounds(BlockSoundGroup.FUNGUS))/*,ModItemGroups.SQUASHED*/);
    //TODO add to composting registry
    public static final Block CARROT_BLOCK = registerBlock("carrot_block", new Block(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5f).sounds(BlockSoundGroup.AZALEA))/*,ModItemGroups.SQUASHED*/);
    public static final Block GOLDEN_CARROT_BLOCK = registerBlock("golden_carrot_block", new Block(FabricBlockSettings.create().mapColor(MapColor.GOLD).strength(0.5f).sounds(BlockSoundGroup.NETHER_ORE))/*,ModItemGroups.SQUASHED*/);
    public static final Block APPLE_BLOCK = registerBlock("apple_block", new Block(FabricBlockSettings.create().mapColor(MapColor.BRIGHT_RED).strength(0.5f).sounds(BlockSoundGroup.AZALEA))/*,ModItemGroups.SQUASHED*/);
    public static final Block GOLDEN_APPLE_BLOCK = registerBlock("golden_apple_block", new Block(FabricBlockSettings.create().mapColor(MapColor.GOLD).strength(0.5f).sounds(BlockSoundGroup.NETHER_ORE))/*,ModItemGroups.SQUASHED*/);
    public static final Block POTATO_BLOCK = registerBlock("potato_block", new Block(FabricBlockSettings.create().mapColor(MapColor.RAW_IRON_PINK).strength(0.5f).sounds(BlockSoundGroup.AZALEA))/*,ModItemGroups.SQUASHED*/);
    public static final Block POISONOUS_POTATO_BLOCK = registerBlock("poisonous_potato_block", new Block(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).strength(0.5f).sounds(BlockSoundGroup.AZALEA))/*,ModItemGroups.SQUASHED*/);
    public static final Block BAKED_POTATO_BLOCK = registerBlock("baked_potato_block", new Block(FabricBlockSettings.create().mapColor(MapColor.RAW_IRON_PINK).strength(0.5f).sounds(BlockSoundGroup.AZALEA))/*,ModItemGroups.SQUASHED*/);
    public static final Block BEETROOT_BLOCK = registerBlock("beetroot_block", new Block(FabricBlockSettings.create().mapColor(MapColor.BRIGHT_RED).strength(0.5f).sounds(BlockSoundGroup.AZALEA))/*,ModItemGroups.SQUASHED*/);
    public static final Block FLINT_BLOCK = registerBlock("flint_block", new FallingBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).strength(1.5f,6.0f).sounds(BlockSoundGroup.TUFF))/*,ModItemGroups.SQUASHED*/);
    public static final Block SUGAR_BLOCK = registerBlock("sugar_block", new SugarBlock(FabricBlockSettings.create().mapColor(MapColor.OFF_WHITE).strength(0.5f).sounds(BlockSoundGroup.SAND).burnable())/*,ModItemGroups.SQUASHED*/);
    public static final Block GUNPOWDER_BLOCK = registerBlock("gunpowder_block", new GunpowderBlock(FabricBlockSettings.create().mapColor(MapColor.LIGHT_GRAY).strength(0.5f).sounds(BlockSoundGroup.SAND).burnable().solidBlock(ModBlocks::never))/*,ModItemGroups.SQUASHED*/);
    public static final Block CHARCOAL_BLOCK = registerBlock("charcoal_block", new PillarBlock(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK).burnable()));
    public static final Block SNOWBALL_BLOCK = registerBlock("snowball_block", new NoisyFallingBlock(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK), SoundEvents.BLOCK_SNOW_PLACE, 1.2f, 0.8f)/*,ModItemGroups.SQUASHED*/);
    public static final Block AMETHYST_SHARD_BLOCK = registerBlock("amethyst_shard_block", new AmethystShardBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK))/*, ModItemGroups.SQUASHED*/);
    public static final Block CRYSTAL_QUARTZ_BLOCK = registerBlock("crystal_quartz_block", new ReversiblePillarBlock(FabricBlockSettings.create().instrument(Instrument.SNARE).strength(0.75f))/*, ModItemGroups.SQUASHED*/);
    public static final Block HEART_OF_THE_SEA_BLOCK = registerBlock("heart_of_the_sea_block", new Block(FabricBlockSettings.create().mapColor(MapColor.DIAMOND_BLUE).strength(1.2f).requiresTool().sounds(BlockSoundGroup.METAL))/*, ModItemGroups.SQUASHED*/);
    public static final Block NAUTILUS_SHELL_BLOCK = registerBlock("nautilus_shell_block", new FallingBlock(FabricBlockSettings.create().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.SUSPICIOUS_SAND).strength(0.75f))/*, ModItemGroups.SQUASHED*/);
    public static final Block NETHER_STAR_BLOCK = registerBlock("nether_star_block", new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).instrument(Instrument.HAT).nonOpaque().allowsSpawning(ModBlocks::never).solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never).mapColor(MapColor.PALE_YELLOW).sounds(BlockSoundGroup.GLASS).requiresTool().strength(3.0f).luminance(state -> 15))/*, ModItemGroups.SQUASHED*/);
    public static final Block BRICKS_BLOCK = registerBlock("bricks_block", new BricksBlock(FabricBlockSettings.copyOf(Blocks.BRICKS).requiresTool().strength(1.2f).sounds(BlockSoundGroup.NETHER_BRICKS))/*, ModItemGroups.SQUASHED*/);
    public static final Block NETHER_BRICKS_BLOCK = registerBlock("nether_bricks_block", new BricksBlock(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS).requiresTool().strength(1.2f))/*, ModItemGroups.SQUASHED*/);
    public static final Block FERMENTED_SPIDER_EYE_BLOCK = registerBlock("fermented_spider_eye_block", new Block(FabricBlockSettings.copyOf(ModBlocks.SPIDER_EYE_BLOCK))/*, ModItemGroups.SQUASHED*/);
    public static final Block GLISTERING_MELON_BLOCK = registerBlock("glistering_melon_block", new Block(FabricBlockSettings.copyOf(Blocks.MELON))/*, ModItemGroups.SQUASHED*/);
    public static final Block COMPRESSED_GLISTERING_MELON_BLOCK = registerBlock("compressed_glistering_melon_block", new FallingBlock(FabricBlockSettings.copyOf(ModBlocks.COMPRESSED_MELON))/*, ModItemGroups.SQUASHED*/);
    //public static final Block BREAD_BLOCK = registerBlock("bread_block", new BreadBlock(FabricBlockSettings.copyOf(Blocks.CAKE))/*, ModItemGroups.SQUASHED*/); //TODO ADDME
    //public static final Block COOKIE_BLOCK = registerBlock("cookie_block", new CookieBlock(FabricBlockSettings.copyOf(Blocks.CAKE))/*, ModItemGroups.SQUASHED*/); //TODO ADDME

    public static final Block STRING_BLOCK = registerBlock("string_block", new PillarBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).mapColor(MapColor.WHITE_GRAY).burnable().instrument(Instrument.GUITAR).strength(0.8f).sounds(BlockSoundGroup.WOOL)));
    public static final Block COMPRESSED_TNT = registerBlock("compressed_tnt", new CompressedTntBlock(FabricBlockSettings.copyOf(Blocks.TNT).mapColor(MapColor.BRIGHT_RED).breakInstantly().sounds(BlockSoundGroup.GRASS).burnable().solidBlock(ModBlocks::never)));
    public static final Block GLOWSTONE_DUST_BLOCK = registerBlock("glowstone_dust_block", new FallingBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).instrument(Instrument.PLING).strength(0.5f).sounds(BlockSoundGroup.SAND).luminance(state -> 15)));
    public static final Block REDSTONE_DUST_BLOCK = registerBlock("redstone_dust_block", new RedstoneDustBlock(FabricBlockSettings.create().mapColor(MapColor.BRIGHT_RED).strength(0.5f).sounds(BlockSoundGroup.SAND)));
    public static final Block COMPRESSED_SHROOMLIGHT = registerBlock("compressed_shroomlight", new Block(FabricBlockSettings.create().mapColor(MapColor.RED).strength(1.0f).sounds(BlockSoundGroup.SHROOMLIGHT).luminance(state -> 15)));
    public static final Block COMPRESSED_HONEY_BLOCK = registerBlock("compressed_honey_block", new HoneyBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).velocityMultiplier(0.4f).jumpVelocityMultiplier(0.5f).sounds(BlockSoundGroup.HONEY)));
    public static final Block COMPRESSED_SLIME_BLOCK = registerBlock("compressed_slime_block", new SlimeBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).slipperiness(0.8f).sounds(BlockSoundGroup.SLIME)));
    public static final Block CLAY_BALL_BLOCK = registerBlock("clay_ball_block", new NoisyFallingBlock(FabricBlockSettings.create().mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.FLUTE).strength(0.6f).sounds(BlockSoundGroup.MUD), SoundEvents.BLOCK_MUD_STEP, 1.8f, 1.0f));
    public static final Block EXPERIENCE_BLOCK = registerBlock("experience_block", new ExperienceBlock(FabricBlockSettings.create().mapColor(MapColor.YELLOW).strength(0.2f).sounds(ModBlockSoundGroup.EXPERIENCE_BLOCK).emissiveLighting(ModBlocks::always).luminance(state -> 1))); //TODO consider making a custom BlockSoundGroup for this
    public static final Block NETHERITE_SCRAP_BLOCK = registerBlock("netherite_scrap_block", new Block(FabricBlockSettings.create().requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.NETHERITE)));
    public static final Block COMPRESSED_HONEYCOMB_BLOCK = registerBlock("compressed_honeycomb_block", new Block(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.6f).sounds(BlockSoundGroup.CORAL)));
    public static final Block PINK_PETAL_BLOCK = registerBlock("pink_petal_block", new Block(FabricBlockSettings.create().mapColor(MapColor.PINK).strength(0.2f).sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque().burnable().allowsSpawning(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never).pistonBehavior(PistonBehavior.DESTROY).solidBlock(ModBlocks::never)));
    public static Block registerBlock(String name, Block block, ItemGroup group) {
        return registerBlock(name, block);
    }
    public static Block registerBlock(String name, Block block) {
//                System.out.println("registering " + name + "!");
//                ModInit.LOGGER.debug("registering " + name + "!");
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, new Identifier(Super.MOD_ID, name), block);
    }
    public static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(Super.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        BlockItem blockItem = new BlockItem(block, new FabricItemSettings());
        //ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(blockItem));
        return Registry.register(Registries.ITEM, new Identifier(Super.MOD_ID, name), blockItem);
    }
    private static Item registerBlockItem(String name, Block block) {
        BlockItem blockItem = new BlockItem(block, new FabricItemSettings());
        return Registry.register(Registries.ITEM, new Identifier(Super.MOD_ID, name), blockItem);
    }
    public static Block[] registerCompactedBlockSet(String name, Block... blocks) {
        for (int i = 0; i < blocks.length; i++) {
            String newName = compressionTierNames[i] + "_" + name;
//                System.out.println("registering compacted block with name: " + newName + " and compression tier of " + i);
            registerBlockWithCompressionTier(newName, i, blocks[i]);
        }
        return blocks;
    }

//    public static Block[] registerCompactedBlockSet(String name, int compressionTierAmount, Block baseBlock) {
//        Block[] blocks = new Block[compressionTierAmount];
//        for (int i = 0; i < compressionTierAmount; i++) {
//            String newName = compressionTierNames[i] + "_" + name;
//                    System.out.println("registering compacted block with name: " + newName + " and compression tier of " + i);
//            blocks[i] = registerBlockWithCompressionTier(newName, i, new Block(FabricBlockSettings.copyOf(baseBlock)));
//        }
//        return blocks;
//    }
    public static Block registerBlockWithCompressionTier(String name, int tier, Block block) {
        COMPRESSION_TIER_FROM_BLOCK.put(block, tier);
        return registerBlock(name, block);
    }
    public static Block registerBlockWithCompressionTier(String name, int tier, Block block, ItemGroup itemGroup) {
        COMPRESSION_TIER_FROM_BLOCK.put(block, tier);
        return registerBlock(name, block);
    }

    private static ReversiblePillarBlock createTropicalFishBlock(FabricBlockSettings settings) {
        ReversiblePillarBlock block = new ReversiblePillarBlock(settings);
        TROPICAL_FISH_BLOCKS.add(block);
        return block;
    }

    private static PillarBlock createCompressedWoolBlock(DyeColor color) {
        PillarBlock block = new PillarBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).mapColor(color).burnable().strength(0.8f).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));
        ALL_COMPACTED_WOOL_BLOCKS.add(block);
        return block;
    }

    private static Block createDyeBlock(FabricBlockSettings settings) {
        Block block = new Block(settings);
        DYE_BLOCKS.add(block);
        return block;
    }

    public static LeafPileBlock createCompressedLeavesBlock(MapColor mapColor, BlockSoundGroup blockSoundGroup) {
        return new LeafPileBlock(FabricBlockSettings.create().mapColor(mapColor).strength(0.2f).sounds(blockSoundGroup).nonOpaque().allowsSpawning(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never).burnable().pistonBehavior(PistonBehavior.DESTROY).solidBlock(ModBlocks::never));
    }

    private static boolean never(BlockState blockState, BlockView blockView, BlockPos blockPos) {
        return false;
    }

    public static boolean never(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return false;
    }

    private static boolean always(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) { return true; }

    private static boolean always(BlockState blockState, BlockView blockView, BlockPos blockPos) {
        return true;
    }

    private static ToIntFunction<BlockState> createLightLevelFromProperty(int litLevel, BooleanProperty property) {
        return state -> state.get(property) != false ? litLevel : 0;
    }

    public static void registerModBlocks() {
        ModInit.LOGGER.debug("Registering blocks and blockItems for " + Super.MOD_ID);
    }
}
