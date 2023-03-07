package net.leafenzo.squashed;

import net.fabricmc.api.ClientModInitializer;
import net.leafenzo.squashed.block.AllBlocks;
import net.leafenzo.squashed.item.AllItems;

public class ModClientInit implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AllItems.registerModItems();
        AllBlocks.registerModBlocks();
    }
}
