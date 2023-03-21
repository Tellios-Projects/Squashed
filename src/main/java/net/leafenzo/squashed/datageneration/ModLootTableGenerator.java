package net.leafenzo.squashed.datageneration;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.leafenzo.squashed.block.ModBlocks;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootTableEntry;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //addDrop(ModBlocks.CYAN_DYE_BLOCK);
        addDrop(ModBlocks.FIRE_CHARGE_BLOCK);
        //addDrop(ModBlocks.CYAN_DYE_BLOCK, dropsWithSilkTouchOrShears(ModBlocks.CYAN_DYE_BLOCK, null));

        addDrop(ModBlocks.CYAN_DYE_BLOCK, x -> {
            return dropsWithSilkTouchOrShears(x, ItemEntry.builder(ModBlocks.CYAN_DYE_BLOCK));
                });

        //BlockLootTableGenerator.dropsWithSilkTouchOrShears(ModBlocks.CYAN_DYE_BLOCK, addDrop(ModBlocks.CYAN_DYE_BLOCK));

        //addDropWithSilkTouch(ModBlocks.FIRE_CHARGE_BLOCK);
        //leavesDrops()


        //TODO
        // Leaves-like only drop with silk touch
        // Bookshelf-like drop ingredients
    }
}
