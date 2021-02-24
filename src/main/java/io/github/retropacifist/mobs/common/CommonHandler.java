package io.github.retropacifist.mobs.common;

import io.github.retropacifist.mobs.common.entities.PotionStudiosMobsEntities;
import io.github.retropacifist.mobs.common.entities.peaceful.ScuttlerEntity;
import io.github.retropacifist.mobs.common.entities.hostile.TempleGuardEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PotionStudiosMobs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonHandler {

    @SubscribeEvent
    public static void attributeCreationEvent(EntityAttributeCreationEvent event) {
        event.put(PotionStudiosMobsEntities.SCUTTLER.get(), ScuttlerEntity.createAttributes());
        event.put(PotionStudiosMobsEntities.TEMPLE_GUARD.get(), TempleGuardEntity.createAttributes());
    }
}
