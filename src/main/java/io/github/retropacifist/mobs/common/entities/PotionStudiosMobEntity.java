package io.github.retropacifist.mobs.common.entities;

import net.minecraft.entity.Entity;
import software.bernie.geckolib3.core.IAnimatable;

public interface PotionStudiosMobEntity<T extends Entity> extends IAnimatable {

    default boolean isWalking(T entity) {
        return false;
    }

    default boolean onRoof(T entity) {
        return false;
    }
}
