package net.leafenzo.squashed.datageneration;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.leafenzo.squashed.block.ModBlocks;
import net.minecraft.loot.entry.ItemEntry;

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
        // Bookshelf-like drop ingredients (these drop all as one lil clump, so it doesn't lag things too crazy for it to be a clump of 9)
    }
}
