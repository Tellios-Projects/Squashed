package net.leafenzo.squashed;

import net.fabricmc.api.ClientModInitializer;
import net.leafenzo.squashed.client.render.ModRenderLayers;
import net.leafenzo.squashed.client.render.ModColorHandler;

public class ModClientInit implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModRenderLayers.registerBlockCutouts();
        ModColorHandler.registerBlockColorProviders();

        //ModItems.registerModItems();
        //ModBlocks.registerModBlocks();
    }
}
