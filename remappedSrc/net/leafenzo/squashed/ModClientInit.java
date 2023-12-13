package net.leafenzo.squashed;

import net.fabricmc.api.ClientModInitializer;
import net.leafenzo.squashed.client.render.ModColorHandler;
import net.leafenzo.squashed.client.render.ModRenderLayers;
import net.leafenzo.squashed.entity.ModEntityRenderers;
import net.leafenzo.squashed.item.ModItemGroups;

public class ModClientInit implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModRenderLayers.registerRenderLayers();
        ModColorHandler.registerBlockColorProviders();
        ModEntityRenderers.registerEntityRenderers();
        ModItemGroups.registerModItemGroups(); // TODO check if this is safe to only do client-side like this

//        HudRenderCallback.EVENT.register(new DenseCobwebHudOverlay());
    }
}
