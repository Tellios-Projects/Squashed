package net.leafenzo.squashed.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricMaterialBuilder;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;

public class ModMaterial {
    //public static final Material DENSE_COBWEB = new Material.Builder(MapColor.GRAY).notSolid().allowsMovement().lightPassesThrough().build();
    public static final Material DENSE_COBWEB = new FabricMaterialBuilder(MapColor.GRAY).notSolid().allowsMovement().lightPassesThrough().build();
    public static final Material COMPRESSED_SPONGE = new FabricMaterialBuilder(MapColor.YELLOW).lightPassesThrough().destroyedByPiston().build();
}
