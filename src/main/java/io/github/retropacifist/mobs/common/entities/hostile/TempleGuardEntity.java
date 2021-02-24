package io.github.retropacifist.mobs.common.entities.hostile;

import io.github.retropacifist.mobs.common.entities.AnimatedEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.monster.IMob;
import net.minecraft.world.World;

public class TempleGuardEntity extends AnimatedEntity implements IMob {

    public TempleGuardEntity(EntityType<? extends TempleGuardEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public static AttributeModifierMap createAttributes() {
        return func_233666_p_().create();
    }
}
