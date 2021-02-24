package io.github.retropacifist.mobs.client;

import io.github.retropacifist.mobs.client.rendering.renderers.entity.ScuttlerEntityRenderer;
import io.github.retropacifist.mobs.client.rendering.renderers.entity.TempleGuardEntityRenderer;
import io.github.retropacifist.mobs.common.PotionStudiosMobs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import static io.github.retropacifist.mobs.common.entities.PotionStudiosMobsEntities.SCUTTLER;
import static io.github.retropacifist.mobs.common.entities.PotionStudiosMobsEntities.TEMPLE_GUARD;
import static net.minecraftforge.fml.client.registry.RenderingRegistry.registerEntityRenderingHandler;

@Mod.EventBusSubscriber(modid = PotionStudiosMobs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientHandler {

    @SubscribeEvent
    public static void clientSetupEvent(FMLClientSetupEvent event) {
        registerEntityRenderingHandler(SCUTTLER.get(), ScuttlerEntityRenderer::new);
        registerEntityRenderingHandler(TEMPLE_GUARD.get(), TempleGuardEntityRenderer::new);
    }
}
