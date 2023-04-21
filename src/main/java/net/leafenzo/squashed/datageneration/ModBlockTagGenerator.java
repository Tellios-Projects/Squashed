package net.leafenzo.squashed.datageneration;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.leafenzo.squashed.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends FabricTagProvider<Block> {
    /**
     * Constructs a new {@link FabricTagProvider} with the default computed path.
     *
     * <p>Common implementations of this class are provided.
     *
     * @param output           the {@link FabricDataOutput} instance
     * @param registriesFuture the backing registry for the tag type
     */
    public ModBlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, Registries.BLOCK.getKey(), registriesFuture);
    }


   //BlockTags & ItemTags are vanilla

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.WOOL)
                    .add(ModBlocks.WHITE_COMPRESSED_WOOL)
                    .add(ModBlocks.ORANGE_COMPRESSED_WOOL)
                    .add(ModBlocks.MAGENTA_COMPRESSED_WOOL)
                    .add(ModBlocks.LIGHT_BLUE_COMPRESSED_WOOL)
                    .add(ModBlocks.YELLOW_COMPRESSED_WOOL)
                    .add(ModBlocks.LIME_COMPRESSED_WOOL)
                    .add(ModBlocks.PINK_COMPRESSED_WOOL)
                    .add(ModBlocks.GRAY_COMPRESSED_WOOL)
                    .add(ModBlocks.LIGHT_GRAY_COMPRESSED_WOOL)
                    .add(ModBlocks.CYAN_COMPRESSED_WOOL)
                    .add(ModBlocks.PURPLE_COMPRESSED_WOOL)
                    .add(ModBlocks.BLUE_COMPRESSED_WOOL)
                    .add(ModBlocks.BROWN_COMPRESSED_WOOL);

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.COMPRESSED_IRON_BLOCK)
                .add(ModBlocks.COMPRESSED_GOLD_BLOCK)
                .add(ModBlocks.COMPRESSED_DIAMOND_BLOCK)
                .add(ModBlocks.COMPRESSED_EMERALD_BLOCK)
                .add(ModBlocks.COMPRESSED_NETHERITE_BLOCK);

        getOrCreateTagBuilder(BlockTags.CRYSTAL_SOUND_BLOCKS)
                .add(ModBlocks.COMPRESSED_AMETHYST_BLOCK);

        getOrCreateTagBuilder(BlockTags.INFINIBURN_OVERWORLD)
                .add(ModBlocks.COMPRESSED_NETHERRACK)
                .add(ModBlocks.SUPER_COMPRESSED_NETHERRACK)
                .add(ModBlocks.BLAZE_ROD_BLOCK);

        getOrCreateTagBuilder(BlockTags.SOUL_FIRE_BASE_BLOCKS)
                .add(ModBlocks.COMPRESSED_SOUL_SAND)
                .add(ModBlocks.SUPER_COMPRESSED_SOUL_SAND);

        getOrCreateTagBuilder(BlockTags.SOUL_SPEED_BLOCKS)
                .add(ModBlocks.COMPRESSED_SOUL_SAND)
                .add(ModBlocks.SUPER_COMPRESSED_SOUL_SAND);

        getOrCreateTagBuilder(BlockTags.WITHER_IMMUNE)
                .add(ModBlocks.COMPRESSED_OBSIDIAN)
                .add(ModBlocks.SUPER_COMPRESSED_OBSIDIAN)
                .add(ModBlocks.SUPER_COMPRESSED_TUFF)
                .add(ModBlocks.SUPER_COMPRESSED_DEEPSLATE)
                .add(ModBlocks.SUPER_COMPRESSED_NETHERRACK)
                .add(ModBlocks.SUPER_COMPRESSED_END_STONE)
                .add(ModBlocks.SUPER_COMPRESSED_DIORITE)
                .add(ModBlocks.SUPER_COMPRESSED_GRANITE)
                .add(ModBlocks.SUPER_COMPRESSED_COBBLED_DEEPSLATE);

        getOrCreateTagBuilder(BlockTags.GUARDED_BY_PIGLINS)
                .add(ModBlocks.COMPRESSED_GOLD_BLOCK)
                .add(ModBlocks.COMPRESSED_RAW_GOLD_BLOCK);

        //getOrCreateTagBuilder(.GRASS)


    }
}

