package io.github.retropacifist.mobs.client.rendering.renderers.entity;

import io.github.retropacifist.mobs.client.rendering.models.entity.ScuttlerEntityModel;
import io.github.retropacifist.mobs.common.entities.ScuttlerEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@OnlyIn(Dist.CLIENT)
public class ScuttlerEntityRenderer<T extends ScuttlerEntity> extends GeoEntityRenderer<T> {

    public ScuttlerEntityRenderer(EntityRendererManager manager) {
        super(manager, new ScuttlerEntityModel<>());
    }
}
