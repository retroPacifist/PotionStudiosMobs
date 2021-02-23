package io.github.retropacifist.mobs.client;

import io.github.retropacifist.mobs.client.rendering.renderers.entity.ScuttlerEntityRenderer;
import io.github.retropacifist.mobs.client.rendering.renderers.entity.TempleGuardEntityRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import static io.github.retropacifist.mobs.common.entities.PotionStudiosMobsEntities.SCUTTLER;
import static io.github.retropacifist.mobs.common.entities.PotionStudiosMobsEntities.TEMPLE_GUARD;
import static net.minecraftforge.fml.client.registry.RenderingRegistry.registerEntityRenderingHandler;

@OnlyIn(Dist.CLIENT)
public class PotionStudiosMobsClient {

    // prevent instantiating.
    private PotionStudiosMobsClient() {
    }

    // called on the client/main thread aka what the opengl & glfw context are currently active on.
    public static void setup(FMLClientSetupEvent event) {
        registerEntityRenderingHandler(SCUTTLER.get(), ScuttlerEntityRenderer::new);
        registerEntityRenderingHandler(TEMPLE_GUARD.get(), TempleGuardEntityRenderer::new);
    }
}
