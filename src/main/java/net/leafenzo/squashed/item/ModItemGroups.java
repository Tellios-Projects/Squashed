package net.leafenzo.squashed.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.leafenzo.squashed.Super;
import net.leafenzo.squashed.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    /** Might place each item in a vanilla category? Not sure if that would make porting back harder*/
    public static final ItemGroup SQUASHED = FabricItemGroup.builder(new Identifier(Super.MOD_ID))
            .displayName(Text.literal("Squashed"))
            .icon(() -> new ItemStack(ModBlocks.COMPRESSED_STONE))
            .build();

}
