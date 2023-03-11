package net.leafenzo.squashed;

import net.fabricmc.api.ClientModInitializer;
import net.leafenzo.squashed.block.ModBlocks;
import net.leafenzo.squashed.item.ModItems;

public class ModClientInit implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
