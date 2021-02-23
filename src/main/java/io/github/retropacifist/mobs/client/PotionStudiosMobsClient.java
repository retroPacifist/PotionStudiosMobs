package io.github.retropacifist.mobs.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@OnlyIn(Dist.CLIENT)
public class PotionStudiosMobsClient {

    // prevent instantiating.
    private PotionStudiosMobsClient() {
    }

    // called on the client/main thread aka what the opengl & glfw context are currently active on.
    public static void setup(FMLClientSetupEvent event) {

    }
}
