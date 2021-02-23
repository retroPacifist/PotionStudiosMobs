package io.github.retropacifist.mobs.client.rendering.renderers.entity;

import io.github.retropacifist.mobs.client.rendering.models.entity.TempleGuardEntityModel;
import io.github.retropacifist.mobs.common.entities.TempleGuardEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@OnlyIn(Dist.CLIENT)
public class TempleGuardEntityRenderer<T extends TempleGuardEntity> extends GeoEntityRenderer<T> {

    public TempleGuardEntityRenderer(EntityRendererManager manager) {
        super(manager, new TempleGuardEntityModel<>());
    }
}
