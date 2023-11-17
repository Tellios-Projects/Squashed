package net.leafenzo.squashed.datageneration;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.leafenzo.squashed.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
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
        this.addDrop(ModBlocks.COCOA_BEANS_BLOCK);
        this.addDrop(ModBlocks.DEAD_BUSH_BLOCK);
        this.addDrop(ModBlocks.GLOW_BERRIES_BLOCK);
        this.addDrop(ModBlocks.SWEET_BERRIES_BLOCK);
        this.addDrop(ModBlocks.GRASS_CLIPPINGS_BLOCK, (Block block) -> this.drops((Block)block, block));
        this.addDrop(ModBlocks.FERN_BLOCK);
        this.addDrop(ModBlocks.GLOW_LICHEN_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_PUMPKIN);
        this.addDrop(ModBlocks.COMPRESSED_HAY_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_MELON);
        this.addDrop(ModBlocks.SUGARCANE_BLOCK);
        this.addDrop(ModBlocks.SEA_PICKLE_BLOCK);
        for(Block block : ModBlocks.COMPACTED_SOUL_SAND) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_SOUL_SOIL) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_COBBLESTONE) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_STONE) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_ANDESITE) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_GRAVEL) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_TUFF) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_BLACKSTONE) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_OBSIDIAN) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_DEEPSLATE) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_NETHERRACK) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_END_STONE) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_DIORITE) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_GRANITE) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_DIRT) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_SAND) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_RED_SAND) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_DRIPSTONE_BLOCKS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_CALCITE) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_MUD) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_MOSS_BLOCKS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_CLAY) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_MAGMA_BLOCKS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_BASALT) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_COBBLED_DEEPSLATE) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_SCULK) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_PRISMARINE) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_BLUE_ICE) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_GLOWSTONE_BLOCKS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_RAW_IRON_BLOCKS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_RAW_GOLD_BLOCKS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_RAW_COPPER_BLOCKS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_REDSTONE_BLOCKS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_COAL_BLOCKS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_QUARTZ_BLOCKS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_IRON_BLOCKS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_NETHERITE_BLOCKS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_GOLD_BLOCKS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_DIAMOND_BLOCKS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_EMERALD_BLOCKS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_LAPIS_BLOCKS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_AMETHYST_BLOCKS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_BONE_BLOCKS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_COPPER_BLOCKS) { this.addDrop(block); }
        this.addDrop(ModBlocks.EXPOSED_COMPRESSED_COPPER_BLOCK);
        this.addDrop(ModBlocks.WEATHERED_COMPRESSED_COPPER_BLOCK);
        this.addDrop(ModBlocks.OXIDIZED_COMPRESSED_COPPER_BLOCK);
        this.addDrop(ModBlocks.WAXED_COMPRESSED_COPPER_BLOCK);
        this.addDrop(ModBlocks.WAXED_EXPOSED_COMPRESSED_COPPER_BLOCK);
        this.addDrop(ModBlocks.WAXED_WEATHERED_COMPRESSED_COPPER_BLOCK);
        this.addDrop(ModBlocks.WAXED_OXIDIZED_COMPRESSED_COPPER_BLOCK);
        for(Block block : ModBlocks.DYE_BLOCKS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPRESSED_WOOL_BLOCKS) { this.addDrop(block); }
        this.addDrop(ModBlocks.BOOK_BLOCK, (Block block) -> this.drops((Block)block, Items.BOOK, ConstantLootNumberProvider.create(9.0f)));
        this.addDrop(ModBlocks.COMPRESSED_OAK_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.OAK_SAPLING, SAPLING_DROP_CHANCE));
        this.addDrop(ModBlocks.COMPRESSED_SPRUCE_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.SPRUCE_SAPLING, SAPLING_DROP_CHANCE));
        this.addDrop(ModBlocks.COMPRESSED_BIRCH_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.BIRCH_SAPLING, SAPLING_DROP_CHANCE));
        this.addDrop(ModBlocks.COMPRESSED_JUNGLE_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.JUNGLE_SAPLING, SAPLING_DROP_CHANCE));
        this.addDrop(ModBlocks.COMPRESSED_ACACIA_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.ACACIA_SAPLING, SAPLING_DROP_CHANCE));
        this.addDrop(ModBlocks.COMPRESSED_DARK_OAK_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.DARK_OAK_SAPLING, SAPLING_DROP_CHANCE));
        this.addDrop(ModBlocks.COMPRESSED_MANGROVE_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.MANGROVE_PROPAGULE, SAPLING_DROP_CHANCE));
        this.addDrop(ModBlocks.COMPRESSED_AZALEA_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.AZALEA, SAPLING_DROP_CHANCE));
        this.addDrop(ModBlocks.COMPRESSED_FLOWERING_AZALEA_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.FLOWERING_AZALEA, SAPLING_DROP_CHANCE));
        this.addDrop(ModBlocks.LEATHER_BLOCK);
        for(Block block : ModBlocks.COMPACTED_OAK_LOGS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_SPRUCE_LOGS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_BIRCH_LOGS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_JUNGLE_LOGS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_ACACIA_LOGS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_DARK_OAK_LOGS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_MANGROVE_LOGS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_CHERRY_LOGS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_CRIMSON_STEMS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_WARPED_STEMS) { this.addDrop(block); }
        for(Block block : ModBlocks.COMPACTED_BAMBOO_BLOCKS) { this.addDrop(block); }
        this.addDrop(ModBlocks.COMPRESSED_OAK_SAPLING);
        this.addDrop(ModBlocks.COMPRESSED_SPRUCE_SAPLING);
        this.addDrop(ModBlocks.COMPRESSED_BIRCH_SAPLING);
        this.addDrop(ModBlocks.COMPRESSED_JUNGLE_SAPLING);
        this.addDrop(ModBlocks.COMPRESSED_ACACIA_SAPLING);
        this.addDrop(ModBlocks.COMPRESSED_DARK_OAK_SAPLING);
        this.addDrop(ModBlocks.COMPRESSED_AZALEA_SAPLING);
        this.addDrop(ModBlocks.COMPRESSED_FLOWERING_AZALEA_SAPLING);
        this.addDrop(ModBlocks.COMPRESSED_MANGROVE_PROPAGULE);
        this.addDrop(ModBlocks.COMPRESSED_CHERRY_SAPLING);
        this.addDrop(ModBlocks.COMPRESSED_CRIMSON_FUNGUS);
        this.addDrop(ModBlocks.COMPRESSED_WARPED_FUNGUS);
        this.addDrop(ModBlocks.CHORUS_FRUIT_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_SEAGRASS);
        this.addDrop(ModBlocks.COMPRESSED_CACTUS);
        for(Block block : ModBlocks.TROPICAL_FISH_BLOCKS) { this.addDrop(block); }
        this.addDrop(ModBlocks.PRISMARINE_CRYSTAL_BLOCK);
        this.addDrop(ModBlocks.GLOW_INK_SAC_BLOCK);
        this.addDrop(ModBlocks.SCUTE_BLOCK);
        this.addDrop(ModBlocks.FEATHER_BLOCK);
        this.addDrop(ModBlocks.GHAST_TEAR_BLOCK);
        this.addDrop(ModBlocks.PHANTOM_MEMBRANE_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_NETHER_WART_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_WARPED_WART_BLOCK);
        this.addDrop(ModBlocks.MANGROVE_ROOTS_BLOCK);
        this.addDrop(ModBlocks.VINE_BLOCK, (Block block) -> this.drops((Block)block, block));
        this.addDropWithSilkTouch(ModBlocks.EGG_BLOCK);
        this.addDrop(ModBlocks.PUFFERFISH_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_SPONGE);
        this.addDrop(ModBlocks.BONES_BLOCK);
        this.addDrop(ModBlocks.PAPER_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_SCAFFOLDING);
        this.addDrop(ModBlocks.KELP_BLOCK);
//        this.addDrop(ModBlocks.LILY_PAD_BLOCK);
        this.addDrop(ModBlocks.ENDER_EYE_BLOCK);
        this.addDrop(ModBlocks.ENDER_PEARL_BLOCK);
        this.addDrop(ModBlocks.ECHO_SHARD_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_COBWEB_BLOCK);
        this.addDrop(ModBlocks.RABBIT_HIDE_BLOCK);
        this.addDrop(ModBlocks.CARROT_BLOCK);
        this.addDrop(ModBlocks.GOLDEN_CARROT_BLOCK);
        this.addDrop(ModBlocks.APPLE_BLOCK);
        this.addDrop(ModBlocks.GOLDEN_APPLE_BLOCK);
        this.addDrop(ModBlocks.POTATO_BLOCK);
        this.addDrop(ModBlocks.POISONOUS_POTATO_BLOCK);
        this.addDrop(ModBlocks.BAKED_POTATO_BLOCK);
        this.addDrop(ModBlocks.BEETROOT_BLOCK);
        this.addDrop(ModBlocks.FLINT_BLOCK);
        this.addDrop(ModBlocks.SUGAR_BLOCK);
        this.addDrop(ModBlocks.GUNPOWDER_BLOCK);
        this.addDrop(ModBlocks.CHARCOAL_BLOCK);
        this.addDrop(ModBlocks.SNOWBALL_BLOCK);
        this.addDrop(ModBlocks.AMETHYST_SHARD_BLOCK);
        this.addDrop(ModBlocks.CRYSTAL_QUARTZ_BLOCK);
        this.addDrop(ModBlocks.HEART_OF_THE_SEA_BLOCK);
        this.addDrop(ModBlocks.NAUTILUS_SHELL_BLOCK);
        this.addDrop(ModBlocks.NETHER_STAR_BLOCK);
        this.addDrop(ModBlocks.BRICKS_BLOCK);
        this.addDrop(ModBlocks.NETHER_BRICKS_BLOCK);
        this.addDrop(ModBlocks.FERMENTED_SPIDER_EYE_BLOCK);
        this.addDrop(ModBlocks.GLISTERING_MELON_BLOCK);
        this.addDrop(ModBlocks.COMPRESSED_GLISTERING_MELON_BLOCK);
    }
}
