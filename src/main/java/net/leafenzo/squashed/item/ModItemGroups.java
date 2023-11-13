package net.leafenzo.squashed.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.leafenzo.squashed.Super;
import net.leafenzo.squashed.block.ModBlocks;
import net.leafenzo.squashed.util.ModUtil;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;



public class ModItemGroups {

    public static ItemGroup SQUASHED = Registry.register(Registries.ITEM_GROUP, new Identifier(Super.MOD_ID, "squashed"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.squashed"))
                    .icon(() -> new ItemStack(ModBlocks.COMPRESSED_SPONGE)).entries((displayContext, entries) -> {

                        //TODO REPLACEME!! this is just a quick lil thing so i can debug stuff- it's NOT optimized
                        for(Identifier id : ModUtil.allBlockIdsInNamespace(Super.MOD_ID)) {
                            entries.add(Registries.BLOCK.get(id));
                        }

                    }).build());

    /*
    public static final ItemGroup SQUASHED_BLOCKS = FabricItemGroup.builder(new Identifier(Super.MOD_ID))
            .displayName(Text.literal("Squashed Blocks"))
            .icon(() -> new ItemStack(ModBlocks.COMPRESSED_STONE))
            .build();
    public static final ItemGroup SQUASHED_COLORED_BLOCKS = FabricItemGroup.builder(new Identifier(Super.MOD_ID))
            .displayName(Text.literal("Squashed Natural Blocks"))
            .icon(() -> new ItemStack(ModBlocks.COMPRESSED_STONE))
            .build();
    public static final ItemGroup SQUASHED_COMPRESSED = FabricItemGroup.builder(new Identifier(Super.MOD_ID))
            .displayName(Text.literal("Squashed Compressed Blocks"))
            .icon(() -> new ItemStack(ModBlocks.COMPRESSED_STONE))
            .build();
    */
}
