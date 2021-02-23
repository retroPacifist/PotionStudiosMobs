package io.github.retropacifist.mobs.common.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;

public class TempleGuardEntity extends MonsterEntity {

    public TempleGuardEntity(EntityType<? extends TempleGuardEntity> type, World worldIn) {
        super(type, worldIn);
    }
}
