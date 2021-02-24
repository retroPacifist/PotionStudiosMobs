package io.github.retropacifist.mobs.client.rendering.renderers.entity;

import io.github.retropacifist.mobs.client.rendering.models.entity.TempleGuardEntityModel;
import io.github.retropacifist.mobs.common.entities.hostile.TempleGuardEntity;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.ParametersAreNonnullByDefault;

import static io.github.retropacifist.mobs.common.PotionStudiosMobs.createLocation;

@OnlyIn(Dist.CLIENT)
@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class TempleGuardEntityRenderer<T extends TempleGuardEntity> extends MobRenderer<T, TempleGuardEntityModel<T>> {
    private static final ResourceLocation TEXTURE = createLocation("textures/entities/temple_guard.png");

    public TempleGuardEntityRenderer(EntityRendererManager manager) {
        super(manager, new TempleGuardEntityModel<>(), 0.5F);
    }

    @Override
    public ResourceLocation getEntityTexture(T entity) {
        return TEXTURE;
    }
}
