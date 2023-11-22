package net.leafenzo.squashed.client.render.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.leafenzo.squashed.block.ModBlocks;
import net.leafenzo.squashed.entity.PrimedGunpowderEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.BlockRenderManager;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.TntMinecartEntityRenderer;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;

@Environment(value= EnvType.CLIENT)
public class PrimedGunpowderEntityRenderer extends EntityRenderer<PrimedGunpowderEntity> {
    private final BlockRenderManager blockRenderManager;

    public PrimedGunpowderEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.shadowRadius = 0.5f;
        this.blockRenderManager = context.getBlockRenderManager();
    }

    @Override
    public void render(PrimedGunpowderEntity primedGunpowderEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.push();
        matrixStack.translate(0.0f, 0.5f, 0.0f);
        int j = primedGunpowderEntity.getFuse();
        if ((float)j - g + 1.0f < 10.0f) {
            float h = 1.0f - ((float)j - g + 1.0f) / 10.0f;
            h = MathHelper.clamp(h, 0.0f, 1.0f);
            h *= h;
            h *= h;
            float k = 1.0f + h * 0.2f; //          float k = 1.0f + h * 0.3f;
            matrixStack.scale(k, k, k);
        }
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-90.0f));
        matrixStack.translate(-0.5f, -0.5f, 0.5f);
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90.0f));

//        int flashInterval = 1; //Tnt is 5 by default //Don't go below 2, otherwise it will just be active on every tick.
//        TntMinecartEntityRenderer.renderFlashingBlock(this.blockRenderManager, ModBlocks.GUNPOWDER_BLOCK.getDefaultState(), matrixStack, vertexConsumerProvider, i, j / flashInterval % 2 == 0);
        TntMinecartEntityRenderer.renderFlashingBlock(this.blockRenderManager, ModBlocks.GUNPOWDER_BLOCK.getDefaultState(), matrixStack, vertexConsumerProvider, i, j < 3);
        matrixStack.pop();
        super.render(primedGunpowderEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    public Identifier getTexture(PrimedGunpowderEntity entity) {
        return SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE;
    }
}
