package io.github.retropacifist.mobs.common;

import io.github.retropacifist.mobs.client.PotionStudiosMobsClient;
import io.github.retropacifist.mobs.common.entities.PotionStudiosMobsEntities;
import io.github.retropacifist.mobs.common.items.PotionStudiosMobsItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

import static net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext.get;

@Mod(PotionStudiosMobs.MOD_ID)
public class PotionStudiosMobs {
    public static final String MOD_ID = "mobs";

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public PotionStudiosMobs() {
        GeckoLib.initialize(); // init geckolib

        IEventBus bus = get().getModEventBus();

        // event listeners below
        bus.addListener(PotionStudiosMobsClient::setup);

        // registration below
        PotionStudiosMobsEntities.REGISTRY.register(bus);
        PotionStudiosMobsItems.REGISTRY.register(bus); // register items after entities and blocks have been registered
    }
}
