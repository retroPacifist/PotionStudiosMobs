package io.github.retropacifist.mobs.common.entities;

import net.minecraft.entity.EntityType;
import net.minecraftforge.registries.DeferredRegister;

import static io.github.retropacifist.mobs.common.PotionStudiosMobs.MOD_ID;
import static net.minecraftforge.registries.ForgeRegistries.ENTITIES;

public class PotionStudiosMobsEntities {
    public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ENTITIES, MOD_ID);

    // prevent instantiating.
    private PotionStudiosMobsEntities() {
    }
}
