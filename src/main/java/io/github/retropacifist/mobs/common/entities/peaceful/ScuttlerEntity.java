package io.github.retropacifist.mobs.common.entities.peaceful;

import io.github.retropacifist.mobs.common.entities.AnimatedEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.world.World;

public class ScuttlerEntity extends AnimatedEntity {

    public ScuttlerEntity(EntityType<? extends ScuttlerEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public static AttributeModifierMap createAttributes() {
        return func_233666_p_().create();
    }
}
