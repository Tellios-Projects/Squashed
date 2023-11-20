package net.leafenzo.squashed.datageneration;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.leafenzo.squashed.block.ModBlocks;
import net.leafenzo.squashed.registry.tag.ModBlockTags;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends FabricTagProvider<Block> {
    /**
     * Constructs a new {@link FabricTagProvider} with the default computed path.
     *
     * <p>Common implementations of this class are provided.
     *
     * @param output           the {@link FabricDataOutput} instance
     * @param registriesFuture the backing registry for the tag type
     */
    public ModBlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, Registries.BLOCK.getKey(), registriesFuture);
    }


   //BlockTags & ItemTags are vanilla

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModBlockTags.ANY_MINABLE);
        getOrCreateTagBuilder(ModBlockTags.CAT_PLAYS_WITH);

        for(Block block : ModBlocks.COMPACTED_SOUL_SAND) {
            getOrCreateTagBuilder(BlockTags.WITHER_SUMMON_BASE_BLOCKS).add(block);
            getOrCreateTagBuilder(BlockTags.SOUL_SPEED_BLOCKS).add(block);
            getOrCreateTagBuilder(BlockTags.SOUL_FIRE_BASE_BLOCKS).add(block);
        }
        for(Block block : Arrays.stream(ModBlocks.COMPACTED_SOUL_SAND).toList().subList(0,2)) {
            getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE).add(block);
        }
        for(Block block : Arrays.stream(ModBlocks.COMPACTED_SOUL_SAND).toList().subList(2,4)) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
        }

        for(Block block : ModBlocks.COMPACTED_SOUL_SOIL) {
            getOrCreateTagBuilder(BlockTags.WITHER_SUMMON_BASE_BLOCKS).add(block);
            getOrCreateTagBuilder(BlockTags.SOUL_SPEED_BLOCKS).add(block);
            getOrCreateTagBuilder(BlockTags.SOUL_FIRE_BASE_BLOCKS).add(block);
        }
        for(Block block : Arrays.stream(ModBlocks.COMPACTED_SOUL_SOIL).toList().subList(0,2)) {
            getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE).add(block);
        }
        for(Block block : Arrays.stream(ModBlocks.COMPACTED_SOUL_SOIL).toList().subList(2,4)) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
        }

        for(Block block : ModBlocks.COMPACTED_COBBLESTONE) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_STONE) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_ANDESITE) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
        }
        for(Block block : Arrays.stream(ModBlocks.COMPACTED_GRAVEL).toList().subList(0,2)) {
            getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE).add(block);
        }
        for(Block block : Arrays.stream(ModBlocks.COMPACTED_GRAVEL).toList().subList(2,4)) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_TUFF) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_BLACKSTONE) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_OBSIDIAN) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
            getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL).add(block);
            getOrCreateTagBuilder(BlockTags.WITHER_IMMUNE).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_DEEPSLATE) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_NETHERRACK) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
            getOrCreateTagBuilder(BlockTags.INFINIBURN_OVERWORLD).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_END_STONE) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_DIORITE) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_GRANITE) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_DIRT) {
            getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE).add(block);
            getOrCreateTagBuilder(BlockTags.DIRT).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_SAND) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
            getOrCreateTagBuilder(BlockTags.SAND).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_RED_SAND) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
            getOrCreateTagBuilder(BlockTags.SAND).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_DRIPSTONE_BLOCKS) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_CALCITE) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
        }
//        for(Block block : ModBlocks.COMPACTED_MUD) {
//            getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE).add(block);
//        }
        for(Block block : Arrays.stream(ModBlocks.COMPACTED_MUD).toList().subList(0,2)) {
            getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE).add(block);
        }
        for(Block block : Arrays.stream(ModBlocks.COMPACTED_MUD).toList().subList(2,4)) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
        }

        for(Block block : ModBlocks.COMPACTED_MOSS_BLOCKS) {
            getOrCreateTagBuilder(BlockTags.HOE_MINEABLE).add(block);
        }
        for(Block block : Arrays.stream(ModBlocks.COMPACTED_CLAY).toList().subList(0,2)) {
            getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE).add(block);
        }
        for(Block block : Arrays.stream(ModBlocks.COMPACTED_CLAY).toList().subList(2,4)) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_MAGMA_BLOCKS) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
        }

//        for(Block block : ModBlocks.COMPACTED_SNOW_BLOCKS) {
            //getOrCreateTagBuilder(BlockTags.SNOW).add(block); // i have a hunch that all this does it make it melt near light, which would be kinda weird for this
//        }
        for(Block block : Arrays.stream(ModBlocks.COMPACTED_SNOW_BLOCKS).toList().subList(0,2)) {
            getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE).add(block);
        }
        for(Block block : Arrays.stream(ModBlocks.COMPACTED_SNOW_BLOCKS).toList().subList(2,4)) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
        }

        for(Block block : ModBlocks.COMPACTED_BASALT) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_COBBLED_DEEPSLATE) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_SCULK) {
            getOrCreateTagBuilder(BlockTags.HOE_MINEABLE).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_PRISMARINE) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_BLUE_ICE) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
            getOrCreateTagBuilder(BlockTags.ICE).add(block);
        }
//        for(Block block : ModBlocks.COMPACTED_GLOWSTONE_BLOCKS) { }
        for(Block block : ModBlocks.COMPACTED_RAW_IRON_BLOCKS) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
            getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_RAW_GOLD_BLOCKS) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
            getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL).add(block);
            getOrCreateTagBuilder(BlockTags.GUARDED_BY_PIGLINS).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_RAW_COPPER_BLOCKS) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
            getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_REDSTONE_BLOCKS) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_COAL_BLOCKS) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
            getOrCreateTagBuilder(BlockTags.INFINIBURN_OVERWORLD).add(block); //TODO Make sure we want this!
        }
        for(Block block : ModBlocks.COMPACTED_QUARTZ_BLOCKS) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_IRON_BLOCKS) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
            getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).add(block);
            getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_NETHERITE_BLOCKS) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
            getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL).add(block);
            getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_GOLD_BLOCKS) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
            getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL).add(block);
            getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_DIAMOND_BLOCKS) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
            getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL).add(block);
            getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_EMERALD_BLOCKS) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
            getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL).add(block);
            getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_LAPIS_BLOCKS) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
            getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_AMETHYST_BLOCKS) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
            getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).add(block);
            getOrCreateTagBuilder(BlockTags.CRYSTAL_SOUND_BLOCKS).add(block);
            getOrCreateTagBuilder(BlockTags.VIBRATION_RESONATORS).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_BONE_BLOCKS) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
        }
        for(Block block : ModBlocks.COMPACTED_COPPER_BLOCKS) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
            getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).add(block);
        }

    for(Block block : ModBlocks.COMPACTED_OAK_LOGS) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE).add(block);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN).add(block);
    }
    for(Block block : ModBlocks.COMPACTED_SPRUCE_LOGS) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE).add(block);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN).add(block);
    }
    for(Block block : ModBlocks.COMPACTED_BIRCH_LOGS) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE).add(block);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN).add(block);
    }
    for(Block block : ModBlocks.COMPACTED_JUNGLE_LOGS) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE).add(block);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN).add(block);
    }
    for(Block block : ModBlocks.COMPACTED_ACACIA_LOGS) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE).add(block);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN).add(block);
    }
    for(Block block : ModBlocks.COMPACTED_DARK_OAK_LOGS) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE).add(block);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN).add(block);
    }
    for(Block block : ModBlocks.COMPACTED_MANGROVE_LOGS) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE).add(block);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN).add(block);
    }
    for(Block block : ModBlocks.COMPACTED_CHERRY_LOGS) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE).add(block);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN).add(block);
    }
    for(Block block : ModBlocks.COMPACTED_CRIMSON_STEMS) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE).add(block);
        getOrCreateTagBuilder(BlockTags.LOGS).add(block);
    }
    for(Block block : ModBlocks.COMPACTED_WARPED_STEMS) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE).add(block);
        getOrCreateTagBuilder(BlockTags.LOGS).add(block);
    }
    for(Block block : ModBlocks.COMPACTED_BAMBOO_BLOCKS) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE).add(block);
    }
    for(Block block : ModBlocks.ALL_COMPACTED_WOOL_BLOCKS) {
        getOrCreateTagBuilder(BlockTags.WOOL).add(block);
        getOrCreateTagBuilder(ModBlockTags.CAT_PLAYS_WITH).add(block);
    }

    for(Block block : ModBlocks.TROPICAL_FISH_BLOCKS) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE).add(block);
    }

    for(Block block : ModBlocks.DYE_BLOCKS) {
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE).add(block);
    }
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .addTag(ModBlockTags.ANY_MINABLE)
//             .add(ModBlocks.COMPRESSED_COPPER_BLOCK) // covered by compressed copper blocks
                .add(ModBlocks.EXPOSED_COMPRESSED_COPPER_BLOCK)
                .add(ModBlocks.WEATHERED_COMPRESSED_COPPER_BLOCK)
                .add(ModBlocks.OXIDIZED_COMPRESSED_COPPER_BLOCK)
                .add(ModBlocks.WAXED_COMPRESSED_COPPER_BLOCK)
                .add(ModBlocks.WAXED_EXPOSED_COMPRESSED_COPPER_BLOCK)
                .add(ModBlocks.WAXED_WEATHERED_COMPRESSED_COPPER_BLOCK)
                .add(ModBlocks.WAXED_OXIDIZED_COMPRESSED_COPPER_BLOCK)
                .add(ModBlocks.SCUTE_BLOCK)
                .add(ModBlocks.BLAZE_ROD_BLOCK)
                .add(ModBlocks.FIRE_CHARGE_BLOCK)
                .add(ModBlocks.PRISMARINE_CRYSTAL_BLOCK)
                .add(ModBlocks.SCUTE_BLOCK)
                .add(ModBlocks.GHAST_TEAR_BLOCK)
                .add(ModBlocks.BONES_BLOCK)
                .add(ModBlocks.ECHO_SHARD_BLOCK)
                .add(ModBlocks.AMETHYST_SHARD_BLOCK)
                .add(ModBlocks.CRYSTAL_QUARTZ_BLOCK)
                .add(ModBlocks.HEART_OF_THE_SEA_BLOCK)
                .add(ModBlocks.NAUTILUS_SHELL_BLOCK)
                .add(ModBlocks.NETHER_STAR_BLOCK)
                .add(ModBlocks.BRICKS_BLOCK)
                .add(ModBlocks.NETHER_BRICKS_BLOCK)
        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
//            .add(ModBlocks.COMPRESSED_COPPER_BLOCK) // covered by compressed copper blocks
                .add(ModBlocks.EXPOSED_COMPRESSED_COPPER_BLOCK)
                .add(ModBlocks.WEATHERED_COMPRESSED_COPPER_BLOCK)
                .add(ModBlocks.OXIDIZED_COMPRESSED_COPPER_BLOCK)
                .add(ModBlocks.WAXED_COMPRESSED_COPPER_BLOCK)
                .add(ModBlocks.WAXED_EXPOSED_COMPRESSED_COPPER_BLOCK)
                .add(ModBlocks.WAXED_WEATHERED_COMPRESSED_COPPER_BLOCK)
                .add(ModBlocks.WAXED_OXIDIZED_COMPRESSED_COPPER_BLOCK)
        ;

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .addTag(ModBlockTags.ANY_MINABLE)
                .add(ModBlocks.RAW_SALMON_BLOCK)
                .add(ModBlocks.COOKED_SALMON_BLOCK)
                .add(ModBlocks.RAW_COD_BLOCK)
                .add(ModBlocks.COOKED_COD_BLOCK)
                .add(ModBlocks.RAW_RABBIT_BLOCK)
                .add(ModBlocks.COOKED_RABBIT_BLOCK)
                .add(ModBlocks.RAW_MUTTON_BLOCK)
                .add(ModBlocks.COOKED_MUTTON_BLOCK)
                .add(ModBlocks.RAW_CHICKEN_BLOCK)
                .add(ModBlocks.COOKED_CHICKEN_BLOCK)
                .add(ModBlocks.RAW_BEEF_BLOCK)
                .add(ModBlocks.COOKED_BEEF_BLOCK)
                .add(ModBlocks.RAW_PORK_BLOCK)
                .add(ModBlocks.COOKED_PORK_BLOCK)
                .add(ModBlocks.ROTTEN_FLESH_BLOCK)
                .add(ModBlocks.SPIDER_EYE_BLOCK)
                .add(ModBlocks.GLOW_INK_SAC_BLOCK)
                .add(ModBlocks.EGG_BLOCK)
                .add(ModBlocks.PUFFERFISH_BLOCK)
                .add(ModBlocks.COMPRESSED_SPONGE)
                .add(ModBlocks.PAPER_BLOCK)
                .add(ModBlocks.ENDER_EYE_BLOCK)
                .add(ModBlocks.ENDER_PEARL_BLOCK)
                .add(ModBlocks.STICK_BLOCK)
                .add(ModBlocks.DEAD_BUSH_BLOCK)
                .add(ModBlocks.COMPRESSED_PUMPKIN)
                .add(ModBlocks.COMPRESSED_MELON)
                .add(ModBlocks.SUGARCANE_BLOCK)
                .add(ModBlocks.BOOK_BLOCK)
                .add(ModBlocks.CHORUS_FRUIT_BLOCK)
                .add(ModBlocks.COMPRESSED_CACTUS)
                .add(ModBlocks.COMPRESSED_NETHER_WART_BLOCK)
                .add(ModBlocks.COMPRESSED_WARPED_WART_BLOCK)
                .add(ModBlocks.MANGROVE_ROOTS_BLOCK)
                .add(ModBlocks.COMPRESSED_SCAFFOLDING)
                .add(ModBlocks.FERMENTED_SPIDER_EYE_BLOCK)
                .add(ModBlocks.GLISTERING_MELON_BLOCK)
                .add(ModBlocks.COMPRESSED_GLISTERING_MELON_BLOCK)
        ;

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .addTag(ModBlockTags.ANY_MINABLE)
                .add(ModBlocks.CARROT_BLOCK)
                .add(ModBlocks.GOLDEN_CARROT_BLOCK)
                .add(ModBlocks.APPLE_BLOCK)
                .add(ModBlocks.GOLDEN_APPLE_BLOCK)
                .add(ModBlocks.POTATO_BLOCK)
                .add(ModBlocks.POISONOUS_POTATO_BLOCK)
                .add(ModBlocks.BAKED_POTATO_BLOCK)
                .add(ModBlocks.BEETROOT_BLOCK)
                .add(ModBlocks.COMPRESSED_SHROOMLIGHT)
        ;

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .addTag(ModBlockTags.ANY_MINABLE)
                .add(ModBlocks.BLAZE_POWDER_BLOCK)
                .add(ModBlocks.WHEAT_SEED_BLOCK)
                .add(ModBlocks.PUMPKIN_SEED_BLOCK)
                .add(ModBlocks.BEETROOT_SEED_BLOCK)
                .add(ModBlocks.MELON_SEED_BLOCK)
                .add(ModBlocks.COCOA_BEANS_BLOCK)
                .add(ModBlocks.COMPRESSED_OAK_SAPLING)
                .add(ModBlocks.COMPRESSED_SPRUCE_SAPLING)
                .add(ModBlocks.COMPRESSED_BIRCH_SAPLING)
                .add(ModBlocks.COMPRESSED_JUNGLE_SAPLING)
                .add(ModBlocks.COMPRESSED_ACACIA_SAPLING)
                .add(ModBlocks.COMPRESSED_DARK_OAK_SAPLING)
                .add(ModBlocks.COMPRESSED_AZALEA_SAPLING)
                .add(ModBlocks.COMPRESSED_FLOWERING_AZALEA_SAPLING)
                .add(ModBlocks.COMPRESSED_MANGROVE_PROPAGULE)
                .add(ModBlocks.COMPRESSED_CRIMSON_FUNGUS)
                .add(ModBlocks.COMPRESSED_WARPED_FUNGUS)
                .add(ModBlocks.COMPRESSED_CHERRY_SAPLING)
                .add(ModBlocks.FLINT_BLOCK)
                .add(ModBlocks.SUGAR_BLOCK)
                .add(ModBlocks.GUNPOWDER_BLOCK)
                .add(ModBlocks.SNOWBALL_BLOCK)
                .add(ModBlocks.GLOWSTONE_DUST_BLOCK)
                .add(ModBlocks.REDSTONE_DUST_BLOCK)
                .add(ModBlocks.CLAY_BALL_BLOCK)
        ;

        getOrCreateTagBuilder(BlockTags.SMALL_DRIPLEAF_PLACEABLE)
                .add(ModBlocks.CLAY_BALL_BLOCK);

        getOrCreateTagBuilder(BlockTags.BIG_DRIPLEAF_PLACEABLE)
                .add(ModBlocks.CLAY_BALL_BLOCK);

        getOrCreateTagBuilder(BlockTags.DIRT)
                .add(ModBlocks.COMPRESSED_CHERRY_SAPLING)
                .add(ModBlocks.COMPRESSED_OAK_SAPLING)
                .add(ModBlocks.COMPRESSED_SPRUCE_SAPLING)
                .add(ModBlocks.COMPRESSED_BIRCH_SAPLING)
                .add(ModBlocks.COMPRESSED_JUNGLE_SAPLING)
                .add(ModBlocks.COMPRESSED_ACACIA_SAPLING)
                .add(ModBlocks.COMPRESSED_DARK_OAK_SAPLING)
                .add(ModBlocks.COMPRESSED_AZALEA_SAPLING)
                .add(ModBlocks.COMPRESSED_FLOWERING_AZALEA_SAPLING)
                .add(ModBlocks.COMPRESSED_MANGROVE_PROPAGULE)
                .add(ModBlocks.COMPRESSED_CRIMSON_FUNGUS)
                .add(ModBlocks.COMPRESSED_WARPED_FUNGUS)
                .add(ModBlocks.WHEAT_SEED_BLOCK)
                .add(ModBlocks.PUMPKIN_SEED_BLOCK)
                .add(ModBlocks.BEETROOT_SEED_BLOCK)
                .add(ModBlocks.MELON_SEED_BLOCK)
                .add(ModBlocks.GRASS_CLIPPINGS_BLOCK)
                .add(ModBlocks.FERN_BLOCK)
                .add(ModBlocks.VINE_BLOCK)
                .add(ModBlocks.GLOW_LICHEN_BLOCK)
                .add(ModBlocks.COMPRESSED_HAY_BLOCK)
        ;

        getOrCreateTagBuilder(BlockTags.MUSHROOM_GROW_BLOCK)
                .add(ModBlocks.COMPRESSED_CHERRY_SAPLING)
                .add(ModBlocks.COMPRESSED_OAK_SAPLING)
                .add(ModBlocks.COMPRESSED_SPRUCE_SAPLING)
                .add(ModBlocks.COMPRESSED_BIRCH_SAPLING)
                .add(ModBlocks.COMPRESSED_JUNGLE_SAPLING)
                .add(ModBlocks.COMPRESSED_ACACIA_SAPLING)
                .add(ModBlocks.COMPRESSED_DARK_OAK_SAPLING)
                .add(ModBlocks.COMPRESSED_AZALEA_SAPLING)
                .add(ModBlocks.COMPRESSED_FLOWERING_AZALEA_SAPLING)
                .add(ModBlocks.COMPRESSED_MANGROVE_PROPAGULE)
                .add(ModBlocks.COMPRESSED_CRIMSON_FUNGUS)
                .add(ModBlocks.COMPRESSED_WARPED_FUNGUS)
                .add(ModBlocks.ROTTEN_FLESH_BLOCK)
                .add(ModBlocks.SPIDER_EYE_BLOCK)
                .add(ModBlocks.FERMENTED_SPIDER_EYE_BLOCK)
//                .add(ModBlocks.ENDER_PEARL_BLOCK)
//                .add(ModBlocks.ENDER_EYE_BLOCK)
                .add(ModBlocks.RAW_BEEF_BLOCK)
                .add(ModBlocks.RAW_CHICKEN_BLOCK)
                .add(ModBlocks.RAW_COD_BLOCK)
                .add(ModBlocks.RAW_SALMON_BLOCK)
                .add(ModBlocks.RAW_PORK_BLOCK)
                .add(ModBlocks.RAW_MUTTON_BLOCK)
                .add(ModBlocks.RAW_RABBIT_BLOCK)
        ;

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(ModBlocks.COMPRESSED_OAK_LEAVES)
                .add(ModBlocks.COMPRESSED_SPRUCE_LEAVES)
                .add(ModBlocks.COMPRESSED_BIRCH_LEAVES)
                .add(ModBlocks.COMPRESSED_JUNGLE_LEAVES)
                .add(ModBlocks.COMPRESSED_ACACIA_LEAVES)
                .add(ModBlocks.COMPRESSED_DARK_OAK_LEAVES)
                .add(ModBlocks.COMPRESSED_MANGROVE_LEAVES)
                .add(ModBlocks.COMPRESSED_AZALEA_LEAVES)
                .add(ModBlocks.COMPRESSED_FLOWERING_AZALEA_LEAVES)
                .add(ModBlocks.COMPRESSED_CHERRY_LEAVES)

                //just so that shears can mine it easier
                .add(ModBlocks.COMPRESSED_SEAGRASS)
                .add(ModBlocks.VINE_BLOCK)
                .add(ModBlocks.KELP_BLOCK)
                .add(ModBlocks.PINK_PETAL_BLOCK)
                .add(ModBlocks.LILY_PAD_BLOCK);


        getOrCreateTagBuilder(ModBlockTags.CAT_PLAYS_WITH)
                .add(ModBlocks.STRING_BLOCK);

        getOrCreateTagBuilder(BlockTags.WOOL)
                    //just so that shears can mine it easier
                    .add(ModBlocks.LEATHER_BLOCK)
                    .add(ModBlocks.COMPRESSED_COBWEB_BLOCK)
                    .add(ModBlocks.RABBIT_HIDE_BLOCK)
                    .add(ModBlocks.STRING_BLOCK)
                    .add(ModBlocks.FEATHER_BLOCK);

        getOrCreateTagBuilder(BlockTags.INFINIBURN_OVERWORLD)
                .add(ModBlocks.BLAZE_ROD_BLOCK)
                .add(ModBlocks.CHARCOAL_BLOCK);

        getOrCreateTagBuilder(BlockTags.CLIMBABLE)
                .add(ModBlocks.COMPRESSED_COBWEB_BLOCK);

        getOrCreateTagBuilder(BlockTags.DEAD_BUSH_MAY_PLACE_ON)
                .add(ModBlocks.RAW_COD_BLOCK) //because it looks a bit like desert ground, for builders really
                .add(ModBlocks.DEAD_BUSH_BLOCK);

        getOrCreateTagBuilder(BlockTags.CRYSTAL_SOUND_BLOCKS)
                .add(ModBlocks.AMETHYST_SHARD_BLOCK);

        getOrCreateTagBuilder(BlockTags.VIBRATION_RESONATORS)
                .add(ModBlocks.AMETHYST_SHARD_BLOCK);

        getOrCreateTagBuilder(BlockTags.ENCHANTMENT_POWER_PROVIDER)
                .add(ModBlocks.BOOK_BLOCK);

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.NETHERITE_SCRAP_BLOCK);
    }
}

