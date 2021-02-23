package io.github.retropacifist.mobs.common.entities;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import static io.github.retropacifist.mobs.common.PotionStudiosMobs.MOD_ID;
import static net.minecraftforge.registries.ForgeRegistries.ENTITIES;

public class PotionStudiosMobsEntities {
    public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ENTITIES, MOD_ID);

    public static final RegistryObject<EntityType<ScuttlerEntity>> SCUTTLER = REGISTRY.register("scutter", () -> EntityType.Builder.create(ScuttlerEntity::new, EntityClassification.CREATURE).size(1.0F, 1.0F).build("scuttler"));
    public static final RegistryObject<EntityType<TempleGuardEntity>> TEMPLE_GUARD = REGISTRY.register("temple_guard", () -> EntityType.Builder.create(TempleGuardEntity::new, EntityClassification.MONSTER).size(1.0F, 1.7F).build("temple_guard"));

    // prevent instantiating.
    private PotionStudiosMobsEntities() {
    }
}
