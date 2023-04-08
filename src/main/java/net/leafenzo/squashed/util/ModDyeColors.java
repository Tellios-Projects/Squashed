package net.leafenzo.squashed.util;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.block.MapColor;
import net.minecraft.util.DyeColor;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.function.ValueLists;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

//TODO REPLACEME
public enum ModDyeColors implements StringIdentifiable {
    AMETHYST(0, "amethyst", 0xa678f1, MapColor.WHITE, 0xa678f1, 0xa678f1);
    private static final IntFunction<DyeColor> BY_ID;
    private static final Int2ObjectOpenHashMap<DyeColor> BY_FIREWORK_COLOR;
    public static final StringIdentifiable.Codec<DyeColor> CODEC;
    private final int id;
    private final String name;
    private final MapColor mapColor;
    private final float[] colorComponents;
    private final int fireworkColor;
    private final int signColor;

   private ModDyeColors(int id, String name, int color, MapColor mapColor, int fireworkColor, int signColor) {
        this.id = id;
        this.name = name;
        this.mapColor = mapColor;
        this.signColor = signColor;
        int j = (color & 0xFF0000) >> 16;
        int k = (color & 0xFF00) >> 8;
        int l = (color & 0xFF) >> 0;
        this.colorComponents = new float[]{(float)j / 255.0f, (float)k / 255.0f, (float)l / 255.0f};
        this.fireworkColor = fireworkColor;
    }

    /**
     * {@return the integer ID of the dye color}
     */
    public int getId() {
        return this.id;
    }

    /**
     * {@return the name of the dye color}
     */
    public String getName() {
        return this.name;
    }

    /**
     * {@return the float array containing the red, green and blue components of this dye color}
     *
     * <p>Each value of the array is between {@code 0.0} and {@code 255.0} (both inclusive).
     */
    public float[] getColorComponents() {
        return this.colorComponents;
    }

    /**
     * {@return the corresponding map color}
     */
    public MapColor getMapColor() {
        return this.mapColor;
    }

    /**
     * {@return the color used for colored fireworks as RGB integer}
     *
     * <p>The returned value is between {@code 0} and {@code 0xFFFFFF}.
     */
    public int getFireworkColor() {
        return this.fireworkColor;
    }

    /**
     * {@return the color used for dyed signs as RGB integer}
     *
     * <p>The returned value is between {@code 0} and {@code 0xFFFFFF}.
     */
    public int getSignColor() {
        return this.signColor;
    }

    /**
     * {@return the dye color whose ID is {@code id}}
     *
     * @apiNote If out-of-range IDs are passed, this returns
     */
    public static DyeColor byId(int id) {
        return BY_ID.apply(id);
    }

    /**
     * {@return the dye color whose name is {@code name}, or {@code defaultColor} if
     * there is no such color}
     *
     * @apiNote This returns {@code null} only if {@code defaultColor} is {@code null}.
     */
    @Nullable
    @Contract(value="_,!null->!null;_,null->_")
    public static DyeColor byName(String name, @Nullable DyeColor defaultColor) {
        DyeColor dyeColor = CODEC.byId(name);
        return dyeColor != null ? dyeColor : defaultColor;
    }

    /**
     * {@return the dye color whose firework color is {@code color}, or {@code null}
     * if there is no such color}
     */
    @Nullable
    public static DyeColor byFireworkColor(int color) {
        return BY_FIREWORK_COLOR.get(color);
    }

    public String toString() {
        return this.name;
    }

    @Override
    public String asString() {
        return this.name;
    }

    static {
        BY_ID = ValueLists.createIdToValueFunction(DyeColor::getId, DyeColor.values(), ValueLists.OutOfBoundsHandling.ZERO);
        BY_FIREWORK_COLOR = new Int2ObjectOpenHashMap<DyeColor>(Arrays.stream(DyeColor.values()).collect(Collectors.toMap(color -> color.getFireworkColor(), color -> color)));
        CODEC = StringIdentifiable.createCodec(DyeColor::values);
    }
}

/*
https://discordapp.com/channels/507304429255393322/507982478276034570/1039868268254597133
 */
