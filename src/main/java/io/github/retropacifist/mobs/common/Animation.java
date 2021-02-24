package io.github.retropacifist.mobs.common;

import net.minecraft.nbt.CompoundNBT;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public interface Animation {
    int mask = 0xFF;

    default void serialise(CompoundNBT compound) {
        compound.putInt("Animation", get());
    }

    default void deserialise(CompoundNBT compound) {
        set(compound.getInt("Animation"));
    }

    @OnlyIn(Dist.CLIENT)
    default float interpolate(float delta) {
        int[] unpacked = unpack();
        return ((unpacked[0] - unpacked[1]) * delta) + unpacked[0];
    }

    default int[] unpack() {
        int decimal = get();
        return new int[] {(decimal >> 16) & mask, (decimal >> 8) & mask};
    }

    default void pack(int current, int previous) {
        set((current & mask) << 16 | (previous & mask) << 8);
    }

    int get();

    void set(int decimal);
}
