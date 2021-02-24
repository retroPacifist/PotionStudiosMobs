package io.github.retropacifist.mobs.common.entities;

import io.github.retropacifist.mobs.common.Animation;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class AnimatedEntity extends CreatureEntity implements Animation {
    private static final DataParameter<Integer> ANIMATION = EntityDataManager.createKey(AnimatedEntity.class, DataSerializers.VARINT);

    public AnimatedEntity(EntityType<? extends AnimatedEntity> type, World worldIn) {
        super(type, worldIn);
    }

    @Override
    protected void registerData() {
        super.registerData();
        dataManager.register(ANIMATION, 0);
    }

    @Override
    public void writeAdditional(CompoundNBT compound) {
        super.writeAdditional(compound);
        serialise(compound);
    }

    @Override
    public void readAdditional(CompoundNBT compound) {
        super.readAdditional(compound);
        deserialise(compound);
    }

    @Override
    public void tick() {
        if (!world.isRemote) tickAnimation();

        super.tick();
    }

    public void tickAnimation() {
        int[] unpacked = unpack();

        pack(onGround ? 1 : 0, unpacked[0]);
    }

    @Override
    public int get() {
        return dataManager.get(ANIMATION);
    }

    @Override
    public void set(int decimal) {
        dataManager.set(ANIMATION, decimal);
    }
}
