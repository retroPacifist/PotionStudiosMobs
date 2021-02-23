package io.github.retropacifist.mobs.common.entities;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class ScuttlerEntity extends CreatureEntity implements PotionStudiosMobEntity<ScuttlerEntity> {
    protected final AnimationFactory factory = new AnimationFactory(this);

    public ScuttlerEntity(EntityType<? extends ScuttlerEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public static AttributeModifierMap createAttributes() {
        return func_233666_p_().create();
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<>(this, "controller", 12, this::predicate));
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        return PlayState.STOP;
    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }
}
