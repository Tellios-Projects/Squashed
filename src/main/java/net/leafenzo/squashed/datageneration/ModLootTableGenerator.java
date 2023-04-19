package net.leafenzo.squashed.datageneration;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.leafenzo.squashed.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

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
        //addDrop(ModBlocks.CYAN_DYE_BLOCK);
//        addDrop(ModBlocks.FIRE_CHARGE_BLOCK);

        //addDrop(ModBlocks.COMPRESSED_BIRCH_LEAVES, dropsWithShears(ModBlocks.COMPRESSED_BIRCH_LEAVES));







        this.addDrop(ModBlocks.COMPRESSED_BIRCH_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.BIRCH_SAPLING, SAPLING_DROP_CHANCE));

        addDrop(ModBlocks.COMPRESSED_BIRCH_LEAVES, dropsWithShears(ModBlocks.COMPRESSED_BIRCH_LEAVES));
        addDrop(ModBlocks.COMPRESSED_BIRCH_LEAVES, dropsWithSilkTouch(ModBlocks.COMPRESSED_BIRCH_LEAVES));




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
