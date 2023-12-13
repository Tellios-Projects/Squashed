package net.leafenzo.squashed.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.leafenzo.squashed.ModInit;
import net.leafenzo.squashed.Super;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModEntityTypes {
    public static final EntityType<PrimedGunpowderEntity> GUNPOWDER_BLOCK_ENTITY = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Super.MOD_ID, "gunpowder_block_entity"),
            FabricEntityTypeBuilder.<PrimedGunpowderEntity>create(SpawnGroup.MISC, PrimedGunpowderEntity::new)
                    .dimensions(EntityDimensions.fixed(1.0f, 1.0f))
                    .build()
    );

    public static void registerModEntityTypes() {
        ModInit.LOGGER.debug("Registering entity types for " + Super.MOD_ID);
    }
}
