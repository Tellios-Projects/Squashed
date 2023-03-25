package net.leafenzo.squashed;

import net.fabricmc.api.ClientModInitializer;
import net.leafenzo.squashed.block.ModRenderLayers;

public class ModClientInit implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModRenderLayers.registerBlockCutouts();

        //ModItems.registerModItems();
        //ModBlocks.registerModBlocks();
    }
}
