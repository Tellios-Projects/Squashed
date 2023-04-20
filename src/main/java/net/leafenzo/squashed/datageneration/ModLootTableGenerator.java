package net.leafenzo.squashed.datageneration;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.leafenzo.squashed.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.item.Items;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
//    private static final LootCondition.Builder WITH_SILK_TOUCH;
//    private static final LootCondition.Builder WITHOUT_SILK_TOUCH;
//    private static final LootCondition.Builder WITH_SHEARS;
//    private static final LootCondition.Builder WITH_SILK_TOUCH_OR_SHEARS;
//    private static final LootCondition.Builder WITHOUT_SILK_TOUCH_NOR_SHEARS;
//    private static final Set<Item> EXPLOSION_IMMUNE;
//    private static final float[] SAPLING_DROP_CHANCE;
//    private static final float[] JUNGLE_SAPLING_DROP_CHANCE;
//    private final Map<Identifier, LootTable.Builder> lootTables = Maps.newHashMap();


    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        this.addDrop(ModBlocks.BLAZE_ROD_BLOCK);
        this.addDrop(ModBlocks.INK_SAC_BLOCK);
        this.addDrop(ModBlocks.STICK_BLOCK);
        this.addDrop(ModBlocks.FIRE_CHARGE_BLOCK);
        this.addDrop(ModBlocks.MAGMA_CREAM_BLOCK);
        this.addDrop(ModBlocks.BLAZE_POWDER_BLOCK);
        this.addDrop(ModBlocks.RAW_SALMON_BLOCK);
        this.addDrop(ModBlocks.COOKED_SALMON_BLOCK);
        this.addDrop(ModBlocks.RAW_COD_BLOCK);
        this.addDrop(ModBlocks.COOKED_COD_BLOCK);
        this.addDrop(ModBlocks.RAW_RABBIT_BLOCK);
        this.addDrop(ModBlocks.COOKED_RABBIT_BLOCK);
        this.addDrop(ModBlocks.RAW_MUTTON_BLOCK);
        this.addDrop(ModBlocks.COOKED_MUTTON_BLOCK);
        this.addDrop(ModBlocks.RAW_CHICKEN_BLOCK);
        this.addDrop(ModBlocks.COOKED_CHICKEN_BLOCK);
        this.addDrop(ModBlocks.RAW_BEEF_BLOCK);
        this.addDrop(ModBlocks.COOKED_BEEF_BLOCK);
        this.addDrop(ModBlocks.RAW_PORK_BLOCK);
        this.addDrop(ModBlocks.COOKED_PORK_BLOCK);
        this.addDrop(ModBlocks.ROTTEN_FLESH_BLOCK);
        this.addDrop(ModBlocks.SPIDER_EYE_BLOCK);
        this.addDrop(ModBlocks.WHEAT_SEED_BLOCK);
        this.addDrop(ModBlocks.PUMPKIN_SEED_BLOCK);
        this.addDrop(ModBlocks.BEETROOT_SEED_BLOCK);
        this.addDrop(ModBlocks.MELON_SEED_BLOCK);
        this.addDrop(ModBlocks.COCOA_BEAN_BLOCK);
        this.addDrop(ModBlocks.DEAD_BUSH_BLOCK);
        this.addDrop(ModBlocks.GLOW_BERRIES_BLOCK);
        this.addDrop(ModBlocks.SWEET_BERRIES_BLOCK);
        this.addDrop(ModBlocks.GRASS_CLIPPINGS_BLOCK);
        this.addDrop(ModBlocks.FERN_BLOCK);
        this.addDrop(ModBlocks.GLOW_LICHEN_BLOCK);
        this.addDrop(ModBlocks.PUMPKIN_PILE);
        this.addDrop(ModBlocks.HAY_PILE);
        this.addDrop(ModBlocks.MELON_PILE);
        this.addDrop(ModBlocks.SUGARCANE_BLOCK);
        this.addDrop(ModBlocks.SEA_PICKLE_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_SOUL_SAND);
        this.addDrop(ModBlocks.SUPER_COMPRESSED_SOUL_SAND);
        this.addDrop(ModBlocks.COMPRESSED_COBBLESTONE);
        this.addDrop(ModBlocks.SUPER_COMPRESSED_COBBLESTONE);
        this.addDrop(ModBlocks.COMPRESSED_STONE);
        this.addDrop(ModBlocks.SUPER_COMPRESSED_STONE);
        this.addDrop(ModBlocks.COMPRESSED_ANDESITE);
        this.addDrop(ModBlocks.SUPER_COMPRESSED_ANDESITE);
        this.addDrop(ModBlocks.COMPRESSED_GRAVEL);
        this.addDrop(ModBlocks.SUPER_COMPRESSED_GRAVEL);
        this.addDrop(ModBlocks.COMPRESSED_TUFF);
        this.addDrop(ModBlocks.SUPER_COMPRESSED_TUFF);
        this.addDrop(ModBlocks.COMPRESSED_BLACKSTONE);
        this.addDrop(ModBlocks.SUPER_COMPRESSED_BLACKSTONE);
        this.addDrop(ModBlocks.COMPRESSED_OBSIDIAN);
        this.addDrop(ModBlocks.SUPER_COMPRESSED_OBSIDIAN);
        this.addDrop(ModBlocks.COMPRESSED_DEEPSLATE);
        this.addDrop(ModBlocks.SUPER_COMPRESSED_DEEPSLATE);
        this.addDrop(ModBlocks.COMPRESSED_NETHERRACK);
        this.addDrop(ModBlocks.SUPER_COMPRESSED_NETHERRACK);
        this.addDrop(ModBlocks.COMPRESSED_END_STONE);
        this.addDrop(ModBlocks.SUPER_COMPRESSED_END_STONE);
        this.addDrop(ModBlocks.COMPRESSED_DIORITE);
        this.addDrop(ModBlocks.SUPER_COMPRESSED_DIORITE);
        this.addDrop(ModBlocks.COMPRESSED_GRANITE);
        this.addDrop(ModBlocks.SUPER_COMPRESSED_GRANITE);
        this.addDrop(ModBlocks.COMPRESSED_DIRT);
        this.addDrop(ModBlocks.SUPER_COMPRESSED_DIRT);
        this.addDrop(ModBlocks.COMPRESSED_SAND);
        this.addDrop(ModBlocks.SUPER_COMPRESSED_SAND);
        this.addDrop(ModBlocks.COMPRESSED_DRIPSTONE);
        this.addDrop(ModBlocks.COMPRESSED_CALCITE);
        this.addDrop(ModBlocks.COMPRESSED_MUD);
        this.addDrop(ModBlocks.COMPRESSED_MOSS);
        this.addDrop(ModBlocks.COMPRESSED_CLAY);
        this.addDrop(ModBlocks.COMPRESSED_RED_SAND);
        this.addDrop(ModBlocks.SUPER_COMPRESSED_RED_SAND);
        this.addDrop(ModBlocks.COMPRESSED_MAGMA_BLOCK);
        this.addDrop(ModBlocks.WHITE_DYE_BLOCK);
        this.addDrop(ModBlocks.ORANGE_DYE_BLOCK);
        this.addDrop(ModBlocks.MAGENTA_DYE_BLOCK);
        this.addDrop(ModBlocks.LIGHT_BLUE_DYE_BLOCK);
        this.addDrop(ModBlocks.YELLOW_DYE_BLOCK);
        this.addDrop(ModBlocks.LIME_DYE_BLOCK);
        this.addDrop(ModBlocks.PINK_DYE_BLOCK);
        this.addDrop(ModBlocks.GRAY_DYE_BLOCK);
        this.addDrop(ModBlocks.LIGHT_GRAY_DYE_BLOCK);
        this.addDrop(ModBlocks.CYAN_DYE_BLOCK);
        this.addDrop(ModBlocks.PURPLE_DYE_BLOCK);
        this.addDrop(ModBlocks.BLUE_DYE_BLOCK);
        this.addDrop(ModBlocks.BROWN_DYE_BLOCK);
        this.addDrop(ModBlocks.GREEN_DYE_BLOCK);
        this.addDrop(ModBlocks.RED_DYE_BLOCK);
        this.addDrop(ModBlocks.BLACK_DYE_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_BASALT);
        this.addDrop(ModBlocks.SUPER_COMPRESSED_BASALT);
        this.addDrop(ModBlocks.WHITE_COMPRESSED_WOOL);
        this.addDrop(ModBlocks.ORANGE_COMPRESSED_WOOL);
        this.addDrop(ModBlocks.MAGENTA_COMPRESSED_WOOL);
        this.addDrop(ModBlocks.LIGHT_BLUE_COMPRESSED_WOOL);
        this.addDrop(ModBlocks.YELLOW_COMPRESSED_WOOL);
        this.addDrop(ModBlocks.LIME_COMPRESSED_WOOL);
        this.addDrop(ModBlocks.PINK_COMPRESSED_WOOL);
        this.addDrop(ModBlocks.GRAY_COMPRESSED_WOOL);
        this.addDrop(ModBlocks.LIGHT_GRAY_COMPRESSED_WOOL);
        this.addDrop(ModBlocks.CYAN_COMPRESSED_WOOL);
        this.addDrop(ModBlocks.PURPLE_COMPRESSED_WOOL);
        this.addDrop(ModBlocks.BLUE_COMPRESSED_WOOL);
        this.addDrop(ModBlocks.BROWN_COMPRESSED_WOOL);
        this.addDrop(ModBlocks.GREEN_COMPRESSED_WOOL);
        this.addDrop(ModBlocks.RED_COMPRESSED_WOOL);
        this.addDrop(ModBlocks.BLACK_COMPRESSED_WOOL);
        this.addDrop(ModBlocks.BOOK_BLOCK, (Block block) -> this.drops((Block)block, Items.BOOK, ConstantLootNumberProvider.create(9.0f)));;
        this.addDrop(ModBlocks.COMPRESSED_OAK_LEAVES);
        this.addDrop(ModBlocks.COMPRESSED_SPRUCE_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.OAK_SAPLING, SAPLING_DROP_CHANCE));;
        this.addDrop(ModBlocks.COMPRESSED_BIRCH_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.SPRUCE_SAPLING, SAPLING_DROP_CHANCE));;
        this.addDrop(ModBlocks.COMPRESSED_JUNGLE_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.BIRCH_SAPLING, SAPLING_DROP_CHANCE));;
        this.addDrop(ModBlocks.COMPRESSED_ACACIA_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.JUNGLE_SAPLING, SAPLING_DROP_CHANCE));;
        this.addDrop(ModBlocks.COMPRESSED_DARK_OAK_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.ACACIA_SAPLING, SAPLING_DROP_CHANCE));;
        this.addDrop(ModBlocks.COMPRESSED_MANGROVE_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.DARK_OAK_SAPLING, SAPLING_DROP_CHANCE));;
        this.addDrop(ModBlocks.COMPRESSED_AZALEA_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.AZALEA, SAPLING_DROP_CHANCE));;
        this.addDrop(ModBlocks.COMPRESSED_FLOWERING_AZALEA_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.FLOWERING_AZALEA, SAPLING_DROP_CHANCE));;
        this.addDrop(ModBlocks.LEATHER_BLOCK);
        // this.addDrop(ModBlocks.CHOIR_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_OAK_LOG);
        this.addDrop(ModBlocks.COMPRESSED_SPRUCE_LOG);
        this.addDrop(ModBlocks.COMPRESSED_BIRCH_LOG);
        this.addDrop(ModBlocks.COMPRESSED_JUNGLE_LOG);
        this.addDrop(ModBlocks.COMPRESSED_ACACIA_LOG);
        this.addDrop(ModBlocks.COMPRESSED_DARK_OAK_LOG);
        this.addDrop(ModBlocks.COMPRESSED_MANGROVE_LOG);
        this.addDrop(ModBlocks.COMPRESSED_CRIMSON_STEM);
        this.addDrop(ModBlocks.COMPRESSED_WARPED_STEM);
        this.addDrop(ModBlocks.COMPRESSED_BAMBOO);
        this.addDrop(ModBlocks.COMPRESSED_OAK_SAPLING);
        this.addDrop(ModBlocks.COMPRESSED_SPRUCE_SAPLING);
        this.addDrop(ModBlocks.COMPRESSED_BIRCH_SAPLING);
        this.addDrop(ModBlocks.COMPRESSED_JUNGLE_SAPLING);
        this.addDrop(ModBlocks.COMPRESSED_ACACIA_SAPLING);
        this.addDrop(ModBlocks.COMPRESSED_DARK_OAK_SAPLING);
        this.addDrop(ModBlocks.COMPRESSED_AZALEA_SAPLING);
        this.addDrop(ModBlocks.COMPRESSED_FLOWERING_AZALEA_SAPLING);
        this.addDrop(ModBlocks.COMPRESSED_MANGROVE_PROPAGULE);
        this.addDrop(ModBlocks.COMPRESSED_CRIMSON_FUNGUS);
        this.addDrop(ModBlocks.COMPRESSED_WARPED_FUNGUS);
        this.addDrop(ModBlocks.CHORUS_FRUIT_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_SEAGRASS);
        this.addDrop(ModBlocks.COMPRESSED_CACTUS);
        this.addDrop(ModBlocks.TROPICAL_FISH_BLOCK_A);
        this.addDrop(ModBlocks.TROPICAL_FISH_BLOCK_B);
        this.addDrop(ModBlocks.TROPICAL_FISH_BLOCK_C);
        this.addDrop(ModBlocks.TROPICAL_FISH_BLOCK_D);
        this.addDrop(ModBlocks.TROPICAL_FISH_BLOCK_E);
        this.addDrop(ModBlocks.TROPICAL_FISH_BLOCK_F);
        this.addDrop(ModBlocks.TROPICAL_FISH_BLOCK_G);
        this.addDrop(ModBlocks.TROPICAL_FISH_BLOCK_H);
        this.addDrop(ModBlocks.TROPICAL_FISH_BLOCK_I);
        this.addDrop(ModBlocks.TROPICAL_FISH_BLOCK_J);
        this.addDrop(ModBlocks.TROPICAL_FISH_BLOCK_K);
        this.addDrop(ModBlocks.TROPICAL_FISH_BLOCK_L);
        this.addDrop(ModBlocks.TROPICAL_FISH_BLOCK_M);
        this.addDrop(ModBlocks.TROPICAL_FISH_BLOCK_N);
        this.addDrop(ModBlocks.TROPICAL_FISH_BLOCK_O);
        this.addDrop(ModBlocks.TROPICAL_FISH_BLOCK_P);
        this.addDrop(ModBlocks.TROPICAL_FISH_BLOCK_Q);
        this.addDrop(ModBlocks.TROPICAL_FISH_BLOCK_R);
        this.addDrop(ModBlocks.TROPICAL_FISH_BLOCK_S);
        this.addDrop(ModBlocks.TROPICAL_FISH_BLOCK_T);
        this.addDrop(ModBlocks.PRISMARINE_CRYSTAL_BLOCK);
        this.addDrop(ModBlocks.GLOW_INK_SAC_BLOCK);
        this.addDrop(ModBlocks.SCUTE_BLOCK);
        this.addDrop(ModBlocks.FEATHER_BLOCK);
        this.addDrop(ModBlocks.GHAST_TEAR_BLOCK);
        this.addDrop(ModBlocks.PHANTOM_MEMBRANE_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_NETHER_WART_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_WARPED_WART_BLOCK);
        this.addDrop(ModBlocks.MANGROVE_ROOTS_BLOCK);
        this.addDrop(ModBlocks.VINE_BLOCK);
        this.addDrop(ModBlocks.EGG_BLOCK, (Block block) -> this.drops((Block)block));;
        this.addDrop(ModBlocks.PUFFERFISH_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_SPONGE);
        this.addDrop(ModBlocks.COMPRESSED_BONE);
        this.addDrop(ModBlocks.PAPER_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_SCAFFOLDING);
        this.addDrop(ModBlocks.KELP_BLOCK);
        this.addDrop(ModBlocks.LILY_PAD_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_GLOWSTONE);
        this.addDrop(ModBlocks.COMPRESSED_RAW_IRON_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_RAW_GOLD_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_RAW_COPPER_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_IRON_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_REDSTONE_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_COAL_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_QUARTZ_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_NETHERITE_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_GOLD_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_DIAMOND_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_EMERALD_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_LAPIS_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_AMETHYST_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_COPPER_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_EXPOSED_COPPER);
        this.addDrop(ModBlocks.COMPRESSED_WEATHERED_COPPER);
        this.addDrop(ModBlocks.COMPRESSED_OXIDIZED_COPPER);
//        this.addDrop(ModBlocks.COMPRESSED_CHERRY_LEAVES);
//        this.addDrop(ModBlocks.COMPRESSED_CHERRY_LOG);
//        this.addDrop(ModBlocks.COMPRESSED_CHERRY_SAPLING);
        this.addDrop(ModBlocks.ENDER_EYE_BLOCK);
        this.addDrop(ModBlocks.ENDER_PEARL_BLOCK);
        this.addDrop(ModBlocks.ECHO_SHARD_BLOCK);
        this.addDrop(ModBlocks.DENSE_COBWEB_BLOCK);
        this.addDrop(ModBlocks.RABBIT_HIDE_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_COBBLED_DEEPSLATE);
        this.addDrop(ModBlocks.SUPER_COMPRESSED_COBBLED_DEEPSLATE);
        this.addDrop(ModBlocks.CARROT_BLOCK);
        this.addDrop(ModBlocks.GOLDEN_CARROT_BLOCK);
        this.addDrop(ModBlocks.APPLE_BLOCK);
        this.addDrop(ModBlocks.GOLDEN_APPLE_BLOCK);
        this.addDrop(ModBlocks.POTATO_BLOCK);
        this.addDrop(ModBlocks.POISONOUS_POTATO_BLOCK);
        this.addDrop(ModBlocks.BAKED_POTATO_BLOCK);
        this.addDrop(ModBlocks.BEETROOT_BLOCK);
        this.addDrop(ModBlocks.FLINT_BLOCK);
        this.addDrop(ModBlocks.WAXED_COMPRESSED_COPPER_BLOCK);
        this.addDrop(ModBlocks.WAXED_COMPRESSED_EXPOSED_COPPER);
        this.addDrop(ModBlocks.WAXED_COMPRESSED_WEATHERED_COPPER);
        this.addDrop(ModBlocks.WAXED_COMPRESSED_OXIDIZED_COPPER);



        //addDrop(ModBlocks.CYAN_DYE_BLOCK);
//        addDrop(ModBlocks.FIRE_CHARGE_BLOCK);

        //addDrop(ModBlocks.COMPRESSED_BIRCH_LEAVES, dropsWithShears(ModBlocks.COMPRESSED_BIRCH_LEAVES));


//        this.addDrop(ModBlocks.EGG_BLOCK, (Block block) -> this.drops((Block)block));
//
//        this.addDrop(ModBlocks.COMPRESSED_BIRCH_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.BIRCH_SAPLING, SAPLING_DROP_CHANCE));
//
//        addDrop(ModBlocks.COMPRESSED_BIRCH_LEAVES, dropsWithShears(ModBlocks.COMPRESSED_BIRCH_LEAVES));
//        addDrop(ModBlocks.COMPRESSED_BIRCH_LEAVES, dropsWithSilkTouch(ModBlocks.COMPRESSED_BIRCH_LEAVES));
//
//
//

        //addDrop(ModBlocks.CYAN_DYE_BLOCK, dropsWithSilkTouchOrShears(ModBlocks.CYAN_DYE_BLOCK, null));
//
//        addDrop(ModBlocks.CYAN_DYE_BLOCK, x -> {
//            return dropsWithSilkTouchOrShears(x, ItemEntry.builder(ModBlocks.CYAN_DYE_BLOCK));
//                });

        //BlockLootTableGenerator.dropsWithSilkTouchOrShears(ModBlocks.CYAN_DYE_BLOCK, addDrop(ModBlocks.CYAN_DYE_BLOCK));

        //addDropWithSilkTouch(ModBlocks.FIRE_CHARGE_BLOCK);
        //leavesDrops()


        //TODO
        // Leaves-like only drop with silk touch
        // Bookshelf-like drop ingredients (these drop all as one lil clump, so it doesn't lag things too crazy for it to be a clump of 9)
    }
}
