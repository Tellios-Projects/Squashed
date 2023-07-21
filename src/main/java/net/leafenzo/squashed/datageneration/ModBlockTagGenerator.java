package net.leafenzo.squashed.datageneration;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.leafenzo.squashed.block.ModBlocks;
import net.leafenzo.squashed.registry.tag.ModBlockTags;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

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
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.COMPRESSED_COBBLESTONE)
                .add(ModBlocks.SUPER_COMPRESSED_COBBLESTONE)
                .add(ModBlocks.COMPRESSED_STONE)
                .add(ModBlocks.SUPER_COMPRESSED_STONE)
                .add(ModBlocks.COMPRESSED_ANDESITE)
                .add(ModBlocks.SUPER_COMPRESSED_ANDESITE)
                .add(ModBlocks.COMPRESSED_TUFF)
                .add(ModBlocks.SUPER_COMPRESSED_TUFF)
                .add(ModBlocks.COMPRESSED_BLACKSTONE)
                .add(ModBlocks.SUPER_COMPRESSED_BLACKSTONE)
                .add(ModBlocks.COMPRESSED_DEEPSLATE)
                .add(ModBlocks.SUPER_COMPRESSED_DEEPSLATE)
                .add(ModBlocks.COMPRESSED_NETHERRACK)
                .add(ModBlocks.SUPER_COMPRESSED_NETHERRACK)
                .add(ModBlocks.COMPRESSED_END_STONE)
                .add(ModBlocks.SUPER_COMPRESSED_END_STONE)
                .add(ModBlocks.COMPRESSED_DIORITE)
                .add(ModBlocks.SUPER_COMPRESSED_DIORITE)
                .add(ModBlocks.COMPRESSED_GRANITE)
                .add(ModBlocks.SUPER_COMPRESSED_GRANITE)
                .add(ModBlocks.COMPRESSED_DRIPSTONE)
                .add(ModBlocks.COMPRESSED_CALCITE)
                .add(ModBlocks.COMPRESSED_BASALT)
                .add(ModBlocks.SUPER_COMPRESSED_BASALT)
                .add(ModBlocks.SCUTE_BLOCK)
                .add(ModBlocks.COMPRESSED_RAW_IRON_BLOCK)
                .add(ModBlocks.COMPRESSED_RAW_GOLD_BLOCK)
                .add(ModBlocks.COMPRESSED_RAW_COPPER_BLOCK)
                .add(ModBlocks.COMPRESSED_IRON_BLOCK)
                .add(ModBlocks.COMPRESSED_REDSTONE_BLOCK)
                .add(ModBlocks.COMPRESSED_COAL_BLOCK)
                .add(ModBlocks.COMPRESSED_QUARTZ_BLOCK)
                .add(ModBlocks.COMPRESSED_NETHERITE_BLOCK)
                .add(ModBlocks.COMPRESSED_GOLD_BLOCK)
                .add(ModBlocks.COMPRESSED_DIAMOND_BLOCK)
                .add(ModBlocks.COMPRESSED_EMERALD_BLOCK)
                .add(ModBlocks.COMPRESSED_LAPIS_BLOCK)
                .add(ModBlocks.COMPRESSED_AMETHYST_BLOCK)
                .add(ModBlocks.COMPRESSED_COPPER_BLOCK)
                .add(ModBlocks.COMPRESSED_EXPOSED_COPPER)
                .add(ModBlocks.COMPRESSED_WEATHERED_COPPER)
                .add(ModBlocks.COMPRESSED_OXIDIZED_COPPER)
                .add(ModBlocks.COMPRESSED_COBBLED_DEEPSLATE)
                .add(ModBlocks.SUPER_COMPRESSED_COBBLED_DEEPSLATE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.COMPRESSED_OBSIDIAN)
                .add(ModBlocks.SUPER_COMPRESSED_OBSIDIAN);

        getOrCreateTagBuilder(ModBlockTags.ANY_MINABLE)
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
                .add(ModBlocks.TROPICAL_FISH_BLOCK_A)
                .add(ModBlocks.TROPICAL_FISH_BLOCK_B)
                .add(ModBlocks.TROPICAL_FISH_BLOCK_C)
                .add(ModBlocks.TROPICAL_FISH_BLOCK_D)
                .add(ModBlocks.TROPICAL_FISH_BLOCK_E)
                .add(ModBlocks.TROPICAL_FISH_BLOCK_F)
                .add(ModBlocks.TROPICAL_FISH_BLOCK_G)
                .add(ModBlocks.TROPICAL_FISH_BLOCK_H)
                .add(ModBlocks.TROPICAL_FISH_BLOCK_I)
                .add(ModBlocks.TROPICAL_FISH_BLOCK_J)
                .add(ModBlocks.TROPICAL_FISH_BLOCK_K)
                .add(ModBlocks.TROPICAL_FISH_BLOCK_L)
                .add(ModBlocks.TROPICAL_FISH_BLOCK_M)
                .add(ModBlocks.TROPICAL_FISH_BLOCK_N)
                .add(ModBlocks.TROPICAL_FISH_BLOCK_O)
                .add(ModBlocks.TROPICAL_FISH_BLOCK_P)
                .add(ModBlocks.TROPICAL_FISH_BLOCK_Q)
                .add(ModBlocks.TROPICAL_FISH_BLOCK_R)
                .add(ModBlocks.TROPICAL_FISH_BLOCK_S)
                .add(ModBlocks.TROPICAL_FISH_BLOCK_T)
                .add(ModBlocks.GLOW_INK_SAC_BLOCK)
                .add(ModBlocks.EGG_BLOCK)
                .add(ModBlocks.PUFFERFISH_BLOCK)
                .add(ModBlocks.COMPRESSED_SPONGE)
                .add(ModBlocks.PAPER_BLOCK)
                .add(ModBlocks.ENDER_EYE_BLOCK)
                .add(ModBlocks.ENDER_PEARL_BLOCK);


        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .addTag(ModBlockTags.ANY_MINABLE)
                .add(ModBlocks.STICK_BLOCK)
                .add(ModBlocks.DEAD_BUSH_BLOCK)
                .add(ModBlocks.PUMPKIN_PILE)
                .add(ModBlocks.MELON_PILE)
                .add(ModBlocks.SUGARCANE_BLOCK)
                .add(ModBlocks.BOOK_BLOCK)
                .add(ModBlocks.COMPRESSED_OAK_LOG)
                .add(ModBlocks.COMPRESSED_SPRUCE_LOG)
                .add(ModBlocks.COMPRESSED_BIRCH_LOG)
                .add(ModBlocks.COMPRESSED_JUNGLE_LOG)
                .add(ModBlocks.COMPRESSED_ACACIA_LOG)
                .add(ModBlocks.COMPRESSED_DARK_OAK_LOG)
                .add(ModBlocks.COMPRESSED_MANGROVE_LOG)
                .add(ModBlocks.COMPRESSED_CRIMSON_STEM)
                .add(ModBlocks.COMPRESSED_WARPED_STEM)
                .add(ModBlocks.COMPRESSED_BAMBOO)
                .add(ModBlocks.CHORUS_FRUIT_BLOCK)
                .add(ModBlocks.COMPRESSED_CACTUS)
                .add(ModBlocks.COMPRESSED_NETHER_WART_BLOCK)
                .add(ModBlocks.COMPRESSED_WARPED_WART_BLOCK)
                .add(ModBlocks.MANGROVE_ROOTS_BLOCK)
                .add(ModBlocks.COMPRESSED_SCAFFOLDING)
                .add(ModBlocks.COMPRESSED_CHERRY_LOG);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .addTag(ModBlockTags.ANY_MINABLE)
                .add(ModBlocks.COMPRESSED_MOSS)
                .add(ModBlocks.CARROT_BLOCK)
                .add(ModBlocks.GOLDEN_CARROT_BLOCK)
                .add(ModBlocks.APPLE_BLOCK)
                .add(ModBlocks.GOLDEN_APPLE_BLOCK)
                .add(ModBlocks.POTATO_BLOCK)
                .add(ModBlocks.POISONOUS_POTATO_BLOCK)
                .add(ModBlocks.BAKED_POTATO_BLOCK)
                .add(ModBlocks.BEETROOT_BLOCK);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .addTag(ModBlockTags.ANY_MINABLE)
                .add(ModBlocks.BLAZE_ROD_BLOCK)
                .add(ModBlocks.FIRE_CHARGE_BLOCK)
                .add(ModBlocks.SUPER_COMPRESSED_SOUL_SAND)
                .add(ModBlocks.COMPRESSED_COBBLESTONE)
                .add(ModBlocks.SUPER_COMPRESSED_COBBLESTONE)
                .add(ModBlocks.COMPRESSED_STONE)
                .add(ModBlocks.SUPER_COMPRESSED_STONE)
                .add(ModBlocks.COMPRESSED_ANDESITE)
                .add(ModBlocks.SUPER_COMPRESSED_ANDESITE)
                .add(ModBlocks.COMPRESSED_TUFF)
                .add(ModBlocks.SUPER_COMPRESSED_TUFF)
                .add(ModBlocks.COMPRESSED_BLACKSTONE)
                .add(ModBlocks.SUPER_COMPRESSED_BLACKSTONE)
                .add(ModBlocks.COMPRESSED_OBSIDIAN)
                .add(ModBlocks.SUPER_COMPRESSED_OBSIDIAN)
                .add(ModBlocks.COMPRESSED_DEEPSLATE)
                .add(ModBlocks.SUPER_COMPRESSED_DEEPSLATE)
                .add(ModBlocks.COMPRESSED_NETHERRACK)
                .add(ModBlocks.SUPER_COMPRESSED_NETHERRACK)
                .add(ModBlocks.COMPRESSED_END_STONE)
                .add(ModBlocks.SUPER_COMPRESSED_END_STONE)
                .add(ModBlocks.COMPRESSED_DIORITE)
                .add(ModBlocks.SUPER_COMPRESSED_DIORITE)
                .add(ModBlocks.COMPRESSED_GRANITE)
                .add(ModBlocks.SUPER_COMPRESSED_GRANITE)
                .add(ModBlocks.COMPRESSED_DRIPSTONE)
                .add(ModBlocks.COMPRESSED_CALCITE)
                .add(ModBlocks.COMPRESSED_CLAY)
                .add(ModBlocks.COMPRESSED_MAGMA_BLOCK)
                .add(ModBlocks.COMPRESSED_BASALT)
                .add(ModBlocks.SUPER_COMPRESSED_BASALT)
                .add(ModBlocks.PRISMARINE_CRYSTAL_BLOCK)
                .add(ModBlocks.SCUTE_BLOCK)
                .add(ModBlocks.GHAST_TEAR_BLOCK)
                .add(ModBlocks.COMPRESSED_BONE)
                .add(ModBlocks.COMPRESSED_GLOWSTONE)
                .add(ModBlocks.COMPRESSED_RAW_IRON_BLOCK)
                .add(ModBlocks.COMPRESSED_RAW_GOLD_BLOCK)
                .add(ModBlocks.COMPRESSED_RAW_COPPER_BLOCK)
                .add(ModBlocks.COMPRESSED_IRON_BLOCK)
                .add(ModBlocks.COMPRESSED_REDSTONE_BLOCK)
                .add(ModBlocks.COMPRESSED_COAL_BLOCK)
                .add(ModBlocks.COMPRESSED_QUARTZ_BLOCK)
                .add(ModBlocks.COMPRESSED_NETHERITE_BLOCK)
                .add(ModBlocks.COMPRESSED_GOLD_BLOCK)
                .add(ModBlocks.COMPRESSED_DIAMOND_BLOCK)
                .add(ModBlocks.COMPRESSED_EMERALD_BLOCK)
                .add(ModBlocks.COMPRESSED_LAPIS_BLOCK)
                .add(ModBlocks.COMPRESSED_AMETHYST_BLOCK)
                .add(ModBlocks.COMPRESSED_COPPER_BLOCK)
                .add(ModBlocks.COMPRESSED_EXPOSED_COPPER)
                .add(ModBlocks.COMPRESSED_WEATHERED_COPPER)
                .add(ModBlocks.COMPRESSED_OXIDIZED_COPPER)
                .add(ModBlocks.ECHO_SHARD_BLOCK)
                .add(ModBlocks.COMPRESSED_COBBLED_DEEPSLATE)
                .add(ModBlocks.SUPER_COMPRESSED_COBBLED_DEEPSLATE)
                .add(ModBlocks.WAXED_COMPRESSED_COPPER_BLOCK)
                .add(ModBlocks.WAXED_COMPRESSED_EXPOSED_COPPER)
                .add(ModBlocks.WAXED_COMPRESSED_WEATHERED_COPPER)
                .add(ModBlocks.WAXED_COMPRESSED_OXIDIZED_COPPER)
                .add(ModBlocks.COMPRESSED_PRISMARINE);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .addTag(ModBlockTags.ANY_MINABLE)
                .add(ModBlocks.BLAZE_POWDER_BLOCK)
                .add(ModBlocks.WHEAT_SEED_BLOCK)
                .add(ModBlocks.PUMPKIN_SEED_BLOCK)
                .add(ModBlocks.BEETROOT_SEED_BLOCK)
                .add(ModBlocks.MELON_SEED_BLOCK)
                .add(ModBlocks.COCOA_BEAN_BLOCK)
                .add(ModBlocks.COMPRESSED_SOUL_SAND)
                .add(ModBlocks.COMPRESSED_GRAVEL)
                .add(ModBlocks.SUPER_COMPRESSED_GRAVEL)
                .add(ModBlocks.COMPRESSED_DIRT)
                .add(ModBlocks.SUPER_COMPRESSED_DIRT)
                .add(ModBlocks.COMPRESSED_SAND)
                .add(ModBlocks.SUPER_COMPRESSED_SAND)
                .add(ModBlocks.COMPRESSED_MUD)
                .add(ModBlocks.COMPRESSED_RED_SAND)
                .add(ModBlocks.SUPER_COMPRESSED_RED_SAND)
                .add(ModBlocks.WHITE_DYE_BLOCK)
                .add(ModBlocks.ORANGE_DYE_BLOCK)
                .add(ModBlocks.MAGENTA_DYE_BLOCK)
                .add(ModBlocks.LIGHT_BLUE_DYE_BLOCK)
                .add(ModBlocks.YELLOW_DYE_BLOCK)
                .add(ModBlocks.LIME_DYE_BLOCK)
                .add(ModBlocks.PINK_DYE_BLOCK)
                .add(ModBlocks.GRAY_DYE_BLOCK)
                .add(ModBlocks.LIGHT_GRAY_DYE_BLOCK)
                .add(ModBlocks.CYAN_DYE_BLOCK)
                .add(ModBlocks.PURPLE_DYE_BLOCK)
                .add(ModBlocks.BLUE_DYE_BLOCK)
                .add(ModBlocks.BROWN_DYE_BLOCK)
                .add(ModBlocks.GREEN_DYE_BLOCK)
                .add(ModBlocks.RED_DYE_BLOCK)
                .add(ModBlocks.BLACK_DYE_BLOCK)
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
                .add(ModBlocks.GUNPOWDER_BLOCK);

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

                //just so that shears can mine it easier
                .add(ModBlocks.COMPRESSED_SEAGRASS)
                .add(ModBlocks.VINE_BLOCK)
                .add(ModBlocks.KELP_BLOCK)
                .add(ModBlocks.LILY_PAD_BLOCK);
//                .add(ModBlocks.COMPRESSED_CHERRY_LEAVES);

        getOrCreateTagBuilder(ModBlockTags.CAT_PLAYS_WITH)
                .add(ModBlocks.WHITE_COMPRESSED_WOOL)
                .add(ModBlocks.ORANGE_COMPRESSED_WOOL)
                .add(ModBlocks.MAGENTA_COMPRESSED_WOOL)
                .add(ModBlocks.LIGHT_BLUE_COMPRESSED_WOOL)
                .add(ModBlocks.YELLOW_COMPRESSED_WOOL)
                .add(ModBlocks.LIME_COMPRESSED_WOOL)
                .add(ModBlocks.PINK_COMPRESSED_WOOL)
                .add(ModBlocks.GRAY_COMPRESSED_WOOL)
                .add(ModBlocks.LIGHT_GRAY_COMPRESSED_WOOL)
                .add(ModBlocks.CYAN_COMPRESSED_WOOL)
                .add(ModBlocks.PURPLE_COMPRESSED_WOOL)
                .add(ModBlocks.BLUE_COMPRESSED_WOOL)
                .add(ModBlocks.BROWN_COMPRESSED_WOOL);

        getOrCreateTagBuilder(BlockTags.WOOL)
                    .add(ModBlocks.WHITE_COMPRESSED_WOOL)
                    .add(ModBlocks.ORANGE_COMPRESSED_WOOL)
                    .add(ModBlocks.MAGENTA_COMPRESSED_WOOL)
                    .add(ModBlocks.LIGHT_BLUE_COMPRESSED_WOOL)
                    .add(ModBlocks.YELLOW_COMPRESSED_WOOL)
                    .add(ModBlocks.LIME_COMPRESSED_WOOL)
                    .add(ModBlocks.PINK_COMPRESSED_WOOL)
                    .add(ModBlocks.GRAY_COMPRESSED_WOOL)
                    .add(ModBlocks.LIGHT_GRAY_COMPRESSED_WOOL)
                    .add(ModBlocks.CYAN_COMPRESSED_WOOL)
                    .add(ModBlocks.PURPLE_COMPRESSED_WOOL)
                    .add(ModBlocks.BLUE_COMPRESSED_WOOL)
                    .add(ModBlocks.BROWN_COMPRESSED_WOOL)

                    //just so that shears can mine it easier
                    .add(ModBlocks.LEATHER_BLOCK)
                    .add(ModBlocks.DENSE_COBWEB_BLOCK)
                    .add(ModBlocks.RABBIT_HIDE_BLOCK);

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.COMPRESSED_IRON_BLOCK)
                .add(ModBlocks.COMPRESSED_GOLD_BLOCK)
                .add(ModBlocks.COMPRESSED_DIAMOND_BLOCK)
                .add(ModBlocks.COMPRESSED_EMERALD_BLOCK)
                .add(ModBlocks.COMPRESSED_NETHERITE_BLOCK);

        getOrCreateTagBuilder(BlockTags.CRYSTAL_SOUND_BLOCKS)
                .add(ModBlocks.COMPRESSED_AMETHYST_BLOCK);

        getOrCreateTagBuilder(BlockTags.INFINIBURN_OVERWORLD)
                .add(ModBlocks.COMPRESSED_NETHERRACK)
                .add(ModBlocks.SUPER_COMPRESSED_NETHERRACK)
                .add(ModBlocks.BLAZE_ROD_BLOCK);

        getOrCreateTagBuilder(BlockTags.SOUL_FIRE_BASE_BLOCKS)
                .add(ModBlocks.COMPRESSED_SOUL_SAND)
                .add(ModBlocks.SUPER_COMPRESSED_SOUL_SAND);

        getOrCreateTagBuilder(BlockTags.SOUL_SPEED_BLOCKS)
                .add(ModBlocks.COMPRESSED_SOUL_SAND)
                .add(ModBlocks.SUPER_COMPRESSED_SOUL_SAND);

        getOrCreateTagBuilder(BlockTags.WITHER_IMMUNE)
                .add(ModBlocks.COMPRESSED_OBSIDIAN)
                .add(ModBlocks.SUPER_COMPRESSED_OBSIDIAN)
                .add(ModBlocks.SUPER_COMPRESSED_TUFF)
                .add(ModBlocks.SUPER_COMPRESSED_DEEPSLATE)
                .add(ModBlocks.SUPER_COMPRESSED_NETHERRACK)
                .add(ModBlocks.SUPER_COMPRESSED_END_STONE)
                .add(ModBlocks.SUPER_COMPRESSED_DIORITE)
                .add(ModBlocks.SUPER_COMPRESSED_GRANITE)
                .add(ModBlocks.SUPER_COMPRESSED_COBBLED_DEEPSLATE);

        getOrCreateTagBuilder(BlockTags.GUARDED_BY_PIGLINS)
                .add(ModBlocks.COMPRESSED_GOLD_BLOCK)
                .add(ModBlocks.COMPRESSED_RAW_GOLD_BLOCK);

        getOrCreateTagBuilder(BlockTags.CLIMBABLE)
                .add(ModBlocks.DENSE_COBWEB_BLOCK);

        getOrCreateTagBuilder(BlockTags.SAND)
                .add(ModBlocks.COMPRESSED_SAND)
                .add(ModBlocks.SUPER_COMPRESSED_SAND)
                .add(ModBlocks.COMPRESSED_RED_SAND)
                .add(ModBlocks.SUPER_COMPRESSED_RED_SAND);

        getOrCreateTagBuilder(BlockTags.DIRT)
                .add(ModBlocks.COMPRESSED_DIRT)
                .add(ModBlocks.SUPER_COMPRESSED_DIRT);

        getOrCreateTagBuilder(BlockTags.DEAD_BUSH_MAY_PLACE_ON)
                .add(ModBlocks.RAW_COD_BLOCK)
                .add(ModBlocks.DEAD_BUSH_BLOCK);
    }
}

