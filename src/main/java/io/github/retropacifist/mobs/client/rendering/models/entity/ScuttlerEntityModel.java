package io.github.retropacifist.mobs.client.rendering.models.entity;

import io.github.retropacifist.mobs.common.entities.ScuttlerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib3.model.AnimatedGeoModel;

import static io.github.retropacifist.mobs.common.PotionStudiosMobs.createLocation;

@OnlyIn(Dist.CLIENT)
public class ScuttlerEntityModel<T extends ScuttlerEntity> extends AnimatedGeoModel<T> {

    @Override
    public ResourceLocation getModelLocation(T t) {
        return createLocation("geo/scuttler.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(T t) {
        return createLocation("textures/entities/scuttler.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(T t) {
        return createLocation("animations/scuttler.animation.json");
    }
}
