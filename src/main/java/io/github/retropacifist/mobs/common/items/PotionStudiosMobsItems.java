package io.github.retropacifist.mobs.common.items;

import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;

import static io.github.retropacifist.mobs.common.PotionStudiosMobs.MOD_ID;
import static net.minecraftforge.registries.ForgeRegistries.ITEMS;

public class PotionStudiosMobsItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ITEMS, MOD_ID);

    // prevent instantiating.
    private PotionStudiosMobsItems() {
    }
}
