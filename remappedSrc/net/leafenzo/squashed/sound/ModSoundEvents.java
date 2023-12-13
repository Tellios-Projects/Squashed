package net.leafenzo.squashed.sound;

import net.leafenzo.squashed.Super;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSoundEvents {
    public static final SoundEvent BLOCK_BLAZE_ROD_BLOCK_BREAK = registerSoundEvent("blaze_rod_block.break");
    public static final SoundEvent BLOCK_BLAZE_ROD_BLOCK_STEP = registerSoundEvent("blaze_rod_block.step");
    public static final SoundEvent BLOCK_BLAZE_ROD_BLOCK_PLACE = registerSoundEvent("blaze_rod_block.place");
    public static final SoundEvent BLOCK_BLAZE_ROD_BLOCK_HIT = registerSoundEvent("blaze_rod_block.hit");
    public static final SoundEvent BLOCK_BLAZE_ROD_BLOCK_FALL = registerSoundEvent("blaze_rod_block.fall");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Super.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
}
