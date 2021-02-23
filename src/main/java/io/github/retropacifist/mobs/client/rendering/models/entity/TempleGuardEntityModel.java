package io.github.retropacifist.mobs.client.rendering.models.entity;

import io.github.retropacifist.mobs.common.entities.TempleGuardEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib3.model.AnimatedGeoModel;

import static io.github.retropacifist.mobs.common.PotionStudiosMobs.createLocation;

@OnlyIn(Dist.CLIENT)
public class TempleGuardEntityModel<T extends TempleGuardEntity> extends AnimatedGeoModel<T> {

    @Override
    public ResourceLocation getModelLocation(T entity) {
        return createLocation("geo/temple_guard.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(T entity) {
        return createLocation("textures/entities/temple_guard.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(T entity) {
        return createLocation("animations/temple_guard.animation.json");
    }
}
