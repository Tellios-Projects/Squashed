package net.leafenzo.squashed.client.render;


import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.leafenzo.squashed.block.ModBlocks;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.item.BlockItem;

public class ModColorHandler {
    public static void RegisterBlockColorProviders() {
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> pos != null && world != null ? BiomeColors.getFoliageColor(world, pos) : FoliageColors.getDefaultColor(),
                ModBlocks.GRASS_CLIPPINGS_BLOCK,
                ModBlocks.FERN_BLOCK
                );

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> ColorProviderRegistry.BLOCK.get(((BlockItem) stack.getItem()).getBlock()).getColor(((BlockItem) stack.getItem()).getBlock().getDefaultState(), null, null, tintIndex),
                ModBlocks.GRASS_CLIPPINGS_BLOCK,
                ModBlocks.FERN_BLOCK
        );
    }




    //ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x3495eb, ModBlocks.FERN_BLOCK);
    //BlockColor vineColor = (state, world, pos, tint) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.getDefaultColor();

}


// Sources:
// https://github.com/witches-kitchen/WK/blob/5457108485584d1e435b7d8701a41d6e3bf4e18b/src/main/java/cf/witcheskitchen/client/registry/WKColorProviderRegistry.java#LL13C10-L13C10