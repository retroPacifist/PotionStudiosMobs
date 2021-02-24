package io.github.retropacifist.mobs.common;

import io.github.retropacifist.mobs.common.entities.PotionStudiosMobsEntities;
import io.github.retropacifist.mobs.common.items.PotionStudiosMobsItems;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.StampedLock;

import static java.util.concurrent.Executors.newSingleThreadExecutor;
import static net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext.get;
import static org.apache.logging.log4j.LogManager.getLogger;

@Mod(PotionStudiosMobs.MOD_ID)
public class PotionStudiosMobs {
    public static final String MOD_ID = "mobs";

    public static final Logger LOGGER = getLogger(MOD_ID);

    public PotionStudiosMobs() {
        IEventBus bus = get().getModEventBus();

        StampedLock lock = new StampedLock();

        ExecutorService service = newSingleThreadExecutor();

        long stamp = lock.writeLock();

        try {
            service.submit(() -> {
                LOGGER.debug("Registering Entity Types.");
                PotionStudiosMobsEntities.REGISTRY.register(bus);

                LOGGER.debug("Registering Items.");
                PotionStudiosMobsItems.REGISTRY.register(bus);
            });
        } finally {
            service.shutdown();

            lock.unlockWrite(stamp);
        }
    }

    public static ResourceLocation createLocation(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
