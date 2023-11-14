package net.leafenzo.squashed.entity;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.leafenzo.squashed.client.render.entity.GunpowderBlockEntityRenderer;
import net.minecraft.client.render.entity.TntEntityRenderer;
import net.minecraft.entity.EntityType;

public class ModEntityRenderers {
    public static void registerEntityRenderers() {
        EntityRendererRegistry.register(ModEntityTypes.GUNPOWDER_BLOCK_ENTITY, GunpowderBlockEntityRenderer::new);
    }
}
