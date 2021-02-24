package io.github.retropacifist.mobs.client.rendering.models.entity;

import io.github.retropacifist.mobs.common.entities.hostile.TempleGuardEntity;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.ParametersAreNonnullByDefault;

import static com.google.common.collect.ImmutableList.of;

@OnlyIn(Dist.CLIENT)
@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class TempleGuardEntityModel<T extends TempleGuardEntity> extends SegmentedModel<T> {
    private final ModelRenderer Main;
    private final ModelRenderer BackRight;
    private final ModelRenderer cube_r16;
    private final ModelRenderer LowerBR;
    private final ModelRenderer cube_r20;
    private final ModelRenderer FootBR;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r18;
    private final ModelRenderer BackLeft;
    private final ModelRenderer cube_r11;
    private final ModelRenderer LowerBL;
    private final ModelRenderer cube_r15;
    private final ModelRenderer FootBL;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r12;
    private final ModelRenderer FrontRight;
    private final ModelRenderer cube_r6;
    private final ModelRenderer LowerFR;
    private final ModelRenderer cube_r10;
    private final ModelRenderer FootFR;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r7;
    private final ModelRenderer FrontLeft;
    private final ModelRenderer cube_r1;
    private final ModelRenderer LowerFL;
    private final ModelRenderer cube_r5;
    private final ModelRenderer FootFL;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r2;
    private final ModelRenderer Torso;
    private final ModelRenderer FLESH;
    private final ModelRenderer LeftArm;
    private final ModelRenderer RightArm;
    private final ModelRenderer ClothF;
    private final ModelRenderer ClothB;

    public TempleGuardEntityModel() {
        textureWidth = 120;
        textureHeight = 120;

        Main = new ModelRenderer(this);
        Main.setRotationPoint(0.0F, 24.0F, 0.0F);


        BackRight = new ModelRenderer(this);
        BackRight.setRotationPoint(-5.0F, -14.0F, 2.0F);
        Main.addChild(BackRight);


        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        BackRight.addChild(cube_r16);
        setRotationAngle(cube_r16, -0.3927F, 0.7854F, -0.5236F);
        cube_r16.setTextureOffset(0, 55).addBox(-5.0F, -2.0F, -2.0F, 5.0F, 4.0F, 4.0F, 0.0F, true);
        cube_r16.setTextureOffset(18, 55).addBox(-10.0F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, true);

        LowerBR = new ModelRenderer(this);
        LowerBR.setRotationPoint(-6.5F, 3.5F, 8.0F);
        BackRight.addChild(LowerBR);


        cube_r20 = new ModelRenderer(this);
        cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        LowerBR.addChild(cube_r20);
        setRotationAngle(cube_r20, 0.3054F, -0.6981F, 0.0F);
        cube_r20.setTextureOffset(38, 54).addBox(-2.8F, 0.0F, -2.5F, 5.0F, 10.0F, 5.0F, 0.0F, true);

        FootBR = new ModelRenderer(this);
        FootBR.setRotationPoint(-2.0F, 9.0F, 2.0F);
        LowerBR.addChild(FootBR);


        cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(-4.8F, -1.5F, 5.0F);
        FootBR.addChild(cube_r17);
        setRotationAngle(cube_r17, 0.0F, -0.6981F, 0.0F);
        cube_r17.setTextureOffset(53, 56).addBox(-0.1F, -1.0F, -1.25F, 1.0F, 2.0F, 1.0F, 0.0F, true);

        cube_r19 = new ModelRenderer(this);
        cube_r19.setRotationPoint(2.0F, 1.5F, -2.0F);
        FootBR.addChild(cube_r19);
        setRotationAngle(cube_r19, 0.0F, -0.6981F, 0.0F);
        cube_r19.setTextureOffset(58, 54).addBox(-2.3F, -2.0F, 2.5F, 4.0F, 2.0F, 5.0F, 0.0F, true);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(2.0F, 1.5F, 5.0F);
        FootBR.addChild(cube_r18);
        setRotationAngle(cube_r18, 0.5236F, -0.6981F, 0.0F);
        cube_r18.setTextureOffset(58, 61).addBox(-5.8F, -1.0F, 1.5F, 2.0F, 2.0F, 3.0F, 0.0F, true);

        BackLeft = new ModelRenderer(this);
        BackLeft.setRotationPoint(5.0F, -14.0F, 2.0F);
        Main.addChild(BackLeft);


        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        BackLeft.addChild(cube_r11);
        setRotationAngle(cube_r11, -0.3927F, -0.7854F, 0.5236F);
        cube_r11.setTextureOffset(0, 55).addBox(0.0F, -2.0F, -2.0F, 5.0F, 4.0F, 4.0F, 0.0F, false);
        cube_r11.setTextureOffset(18, 55).addBox(5.0F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);

        LowerBL = new ModelRenderer(this);
        LowerBL.setRotationPoint(6.5F, 3.5F, 8.0F);
        BackLeft.addChild(LowerBL);


        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        LowerBL.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.3054F, 0.6981F, 0.0F);
        cube_r15.setTextureOffset(38, 54).addBox(-2.2F, 0.0F, -2.5F, 5.0F, 10.0F, 5.0F, 0.0F, false);

        FootBL = new ModelRenderer(this);
        FootBL.setRotationPoint(2.0F, 9.0F, 2.0F);
        LowerBL.addChild(FootBL);


        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(-2.0F, 1.5F, -2.0F);
        FootBL.addChild(cube_r14);
        setRotationAngle(cube_r14, 0.0F, 0.6981F, 0.0F);
        cube_r14.setTextureOffset(58, 54).addBox(-1.7F, -2.0F, 2.5F, 4.0F, 2.0F, 5.0F, 0.0F, false);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(-2.0F, 1.5F, 5.0F);
        FootBL.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.5236F, 0.6981F, 0.0F);
        cube_r13.setTextureOffset(58, 61).addBox(3.8F, -1.0F, 1.5F, 2.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(4.8F, -1.5F, 5.0F);
        FootBL.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.0F, 0.6981F, 0.0F);
        cube_r12.setTextureOffset(53, 56).addBox(-0.9F, -1.0F, -1.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        FrontRight = new ModelRenderer(this);
        FrontRight.setRotationPoint(-5.0F, -14.0F, -2.0F);
        Main.addChild(FrontRight);


        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        FrontRight.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.3927F, -0.7854F, -0.5236F);
        cube_r6.setTextureOffset(0, 40).addBox(-5.0F, -2.0F, -2.0F, 5.0F, 4.0F, 4.0F, 0.0F, true);
        cube_r6.setTextureOffset(18, 40).addBox(-10.0F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, true);

        LowerFR = new ModelRenderer(this);
        LowerFR.setRotationPoint(-6.5F, 3.5F, -8.0F);
        FrontRight.addChild(LowerFR);


        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        LowerFR.addChild(cube_r10);
        setRotationAngle(cube_r10, -0.3054F, 0.6981F, 0.0F);
        cube_r10.setTextureOffset(38, 39).addBox(-2.8F, 0.0F, -2.5F, 5.0F, 10.0F, 5.0F, 0.0F, true);

        FootFR = new ModelRenderer(this);
        FootFR.setRotationPoint(-2.0F, 9.0F, -2.0F);
        LowerFR.addChild(FootFR);


        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(2.0F, 1.5F, -5.0F);
        FootFR.addChild(cube_r8);
        setRotationAngle(cube_r8, -0.5236F, 0.6981F, 0.0F);
        cube_r8.setTextureOffset(58, 46).addBox(-5.8F, -1.0F, -4.5F, 2.0F, 2.0F, 3.0F, 0.0F, true);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(2.0F, 1.5F, 2.0F);
        FootFR.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, 0.6981F, 0.0F);
        cube_r9.setTextureOffset(58, 39).addBox(-2.3F, -2.0F, -7.5F, 4.0F, 2.0F, 5.0F, 0.0F, true);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(-4.8F, -1.5F, -5.0F);
        FootFR.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 0.6981F, 0.0F);
        cube_r7.setTextureOffset(53, 41).addBox(-0.1F, -1.0F, 0.25F, 1.0F, 2.0F, 1.0F, 0.0F, true);

        FrontLeft = new ModelRenderer(this);
        FrontLeft.setRotationPoint(5.0F, -14.0F, -2.0F);
        Main.addChild(FrontLeft);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        FrontLeft.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.3927F, 0.7854F, 0.5236F);
        cube_r1.setTextureOffset(0, 40).addBox(0.0F, -2.0F, -2.0F, 5.0F, 4.0F, 4.0F, 0.0F, false);
        cube_r1.setTextureOffset(18, 40).addBox(5.0F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);

        LowerFL = new ModelRenderer(this);
        LowerFL.setRotationPoint(6.5F, 3.5F, -8.0F);
        FrontLeft.addChild(LowerFL);


        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        LowerFL.addChild(cube_r5);
        setRotationAngle(cube_r5, -0.3054F, -0.6981F, 0.0F);
        cube_r5.setTextureOffset(38, 39).addBox(-2.2F, 0.0F, -2.5F, 5.0F, 10.0F, 5.0F, 0.0F, false);

        FootFL = new ModelRenderer(this);
        FootFL.setRotationPoint(2.0F, 9.0F, -2.0F);
        LowerFL.addChild(FootFL);


        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(-2.0F, 1.5F, 2.0F);
        FootFL.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, -0.6981F, 0.0F);
        cube_r4.setTextureOffset(58, 39).addBox(-1.7F, -2.0F, -7.5F, 4.0F, 2.0F, 5.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-2.0F, 1.5F, -5.0F);
        FootFL.addChild(cube_r3);
        setRotationAngle(cube_r3, -0.5236F, -0.6981F, 0.0F);
        cube_r3.setTextureOffset(58, 46).addBox(3.8F, -1.0F, -4.5F, 2.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(4.8F, -1.5F, -5.0F);
        FootFL.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, -0.6981F, 0.0F);
        cube_r2.setTextureOffset(53, 41).addBox(-0.9F, -1.0F, 0.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        Torso = new ModelRenderer(this);
        Torso.setRotationPoint(-1.0F, -11.0F, -5.0F);
        Main.addChild(Torso);
        Torso.setTextureOffset(56, 0).addBox(-6.5F, -6.0F, 0.0F, 15.0F, 2.0F, 10.0F, 0.0F, false);
        Torso.setTextureOffset(20, 0).addBox(-6.5F, -5.9F, 0.0F, 15.0F, 0.0F, 10.0F, 0.0F, false);

        FLESH = new ModelRenderer(this);
        FLESH.setRotationPoint(1.0F, -2.0F, 5.0F);
        Torso.addChild(FLESH);
        FLESH.setTextureOffset(0, 22).addBox(-6.5F, -10.0F, -4.0F, 13.0F, 10.0F, 8.0F, 0.0F, false);
        FLESH.setTextureOffset(0, 0).addBox(-9.0F, -22.0F, -5.0F, 18.0F, 12.0F, 10.0F, 0.0F, false);

        LeftArm = new ModelRenderer(this);
        LeftArm.setRotationPoint(9.0F, -20.0F, 1.0F);
        FLESH.addChild(LeftArm);
        LeftArm.setTextureOffset(34, 26).addBox(0.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        LeftArm.setTextureOffset(34, 22).addBox(7.0F, -0.5F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        LeftArm.setTextureOffset(34, 24).addBox(5.5F, -3.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        LeftArm.setTextureOffset(38, 22).addBox(8.0F, -3.5F, -6.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
        LeftArm.setTextureOffset(37, 23).addBox(8.0F, -2.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        LeftArm.setTextureOffset(42, 24).addBox(2.0F, -2.0F, -6.0F, 5.0F, 5.0F, 10.0F, 0.0F, false);
        LeftArm.setTextureOffset(62, 28).addBox(5.0F, -5.0F, -6.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
        LeftArm.setTextureOffset(65, 17).addBox(8.0F, -1.5F, -6.0F, 3.0F, 3.0F, 7.0F, 0.0F, false);

        RightArm = new ModelRenderer(this);
        RightArm.setRotationPoint(-9.0F, -20.0F, 1.0F);
        FLESH.addChild(RightArm);
        RightArm.setTextureOffset(34, 26).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);
        RightArm.setTextureOffset(34, 22).addBox(-8.0F, -0.5F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        RightArm.setTextureOffset(34, 24).addBox(-6.5F, -3.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        RightArm.setTextureOffset(38, 22).addBox(-9.0F, -3.5F, -6.0F, 1.0F, 1.0F, 3.0F, 0.0F, true);
        RightArm.setTextureOffset(37, 23).addBox(-9.0F, -2.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        RightArm.setTextureOffset(42, 24).addBox(-7.0F, -2.0F, -6.0F, 5.0F, 5.0F, 10.0F, 0.0F, true);
        RightArm.setTextureOffset(62, 28).addBox(-7.0F, -5.0F, -6.0F, 2.0F, 2.0F, 4.0F, 0.0F, true);
        RightArm.setTextureOffset(65, 17).addBox(-11.0F, -1.5F, -6.0F, 3.0F, 3.0F, 7.0F, 0.0F, true);

        ClothF = new ModelRenderer(this);
        ClothF.setRotationPoint(1.0F, -5.0F, 0.5F);
        Torso.addChild(ClothF);
        ClothF.setTextureOffset(56, 12).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 12.0F, 0.0F, 0.0F, false);

        ClothB = new ModelRenderer(this);
        ClothB.setRotationPoint(1.0F, -5.0F, 9.5F);
        Torso.addChild(ClothB);
        ClothB.setTextureOffset(56, 12).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 12.0F, 0.0F, 0.0F, false);
    }

    @Override
    public Iterable<ModelRenderer> getParts() {
        return of(Main);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
