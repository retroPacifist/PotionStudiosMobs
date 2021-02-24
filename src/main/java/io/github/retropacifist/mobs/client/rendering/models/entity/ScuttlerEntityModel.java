package io.github.retropacifist.mobs.client.rendering.models.entity;

import io.github.retropacifist.mobs.common.entities.peaceful.ScuttlerEntity;
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
public class ScuttlerEntityModel<T extends ScuttlerEntity> extends SegmentedModel<T> {
    private final ModelRenderer shell;
    private final ModelRenderer shellTop;
    private final ModelRenderer body;
    private final ModelRenderer stalks;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightClaw;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftClaw;
    private final ModelRenderer rightFrontLeg;
    private final ModelRenderer rightFrontLowerLeg;
    private final ModelRenderer rightMiddleLeg;
    private final ModelRenderer rightMiddleLowerLeg;
    private final ModelRenderer rightBackLeg;
    private final ModelRenderer rightBackLowerLeg;
    private final ModelRenderer leftFrontLeg;
    private final ModelRenderer leftFrontLowerLeg;
    private final ModelRenderer leftMiddleLeg;
    private final ModelRenderer leftMiddleLowerLeg;
    private final ModelRenderer leftBackLeg;
    private final ModelRenderer leftBackLowerLeg;

    public ScuttlerEntityModel() {
        shell = new ModelRenderer(this);
        shell.setRotationPoint(0.0F, 20.0F, 1.0F);
        setRotationAngle(shell, -0.6981F, 0.0F, 0.0F);
        shell.setTextureOffset(0, 0).addBox(-5.0F, -6.0F, -5.0F, 10.0F, 6.0F, 10.0F, 0.0F, false);

        shellTop = new ModelRenderer(this);
        shellTop.setRotationPoint(0.0F, -6.0F, 0.0F);
        shell.addChild(shellTop);
        shellTop.setTextureOffset(0, 16).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 4.0F, 8.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 20.0F, 0.0F);
        body.setTextureOffset(30, 1).addBox(-4.0F, -1.0F, -3.0F, 8.0F, 3.0F, 6.0F, 0.0F, false);

        stalks = new ModelRenderer(this);
        stalks.setRotationPoint(0.0F, -1.0F, -3.0F);
        body.addChild(stalks);
        setRotationAngle(stalks, 0.3927F, 0.0F, 0.0F);
        stalks.setTextureOffset(40, 10).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 4.0F, 0.0F, 0.0F, false);

        rightArm = new ModelRenderer(this);
        rightArm.setRotationPoint(-4.0F, 21.0F, -3.0F);
        setRotationAngle(rightArm, -1.5708F, 0.4363F, -0.2182F);
        rightArm.setTextureOffset(40, 14).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        rightClaw = new ModelRenderer(this);
        rightClaw.setRotationPoint(0.0F, 3.0F, 0.0F);
        rightArm.addChild(rightClaw);
        setRotationAngle(rightClaw, 0.0F, 0.0F, -0.7854F);
        rightClaw.setTextureOffset(48, 14).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 3.0F, 0.0F, false);

        leftArm = new ModelRenderer(this);
        leftArm.setRotationPoint(4.0F, 21.0F, -3.0F);
        setRotationAngle(leftArm, -1.5708F, -0.4363F, 0.2182F);
        leftArm.setTextureOffset(40, 14).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, true);

        leftClaw = new ModelRenderer(this);
        leftClaw.setRotationPoint(0.0F, 3.0F, 0.0F);
        leftArm.addChild(leftClaw);
        setRotationAngle(leftClaw, 0.0F, 0.0F, 0.7854F);
        leftClaw.setTextureOffset(48, 14).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 3.0F, 0.0F, true);

        rightFrontLeg = new ModelRenderer(this);
        rightFrontLeg.setRotationPoint(-4.5F, 21.0F, 0.0F);
        setRotationAngle(rightFrontLeg, -0.6981F, 0.0F, 1.3963F);
        rightFrontLeg.setTextureOffset(24, 16).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.25F, false);

        rightFrontLowerLeg = new ModelRenderer(this);
        rightFrontLowerLeg.setRotationPoint(0.0F, 3.5F, 0.0F);
        rightFrontLeg.addChild(rightFrontLowerLeg);
        setRotationAngle(rightFrontLowerLeg, 0.0F, 0.0F, -0.7854F);
        rightFrontLowerLeg.setTextureOffset(29, 16).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        rightMiddleLeg = new ModelRenderer(this);
        rightMiddleLeg.setRotationPoint(-4.5F, 21.0F, 1.0F);
        setRotationAngle(rightMiddleLeg, 0.1309F, 0.0F, 1.3963F);
        rightMiddleLeg.setTextureOffset(24, 16).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.25F, false);

        rightMiddleLowerLeg = new ModelRenderer(this);
        rightMiddleLowerLeg.setRotationPoint(0.0F, 3.5F, 0.0F);
        rightMiddleLeg.addChild(rightMiddleLowerLeg);
        setRotationAngle(rightMiddleLowerLeg, 0.0F, 0.0F, -0.7854F);
        rightMiddleLowerLeg.setTextureOffset(29, 16).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        rightBackLeg = new ModelRenderer(this);
        rightBackLeg.setRotationPoint(-4.5F, 21.0F, 2.0F);
        setRotationAngle(rightBackLeg, 0.7854F, 0.0F, 1.3963F);
        rightBackLeg.setTextureOffset(24, 16).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.25F, false);

        rightBackLowerLeg = new ModelRenderer(this);
        rightBackLowerLeg.setRotationPoint(0.0F, 3.5F, 0.0F);
        rightBackLeg.addChild(rightBackLowerLeg);
        setRotationAngle(rightBackLowerLeg, 0.0F, 0.0F, -0.7854F);
        rightBackLowerLeg.setTextureOffset(29, 16).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        leftFrontLeg = new ModelRenderer(this);
        leftFrontLeg.setRotationPoint(4.5F, 21.0F, 0.0F);
        setRotationAngle(leftFrontLeg, -0.6981F, 0.0F, -1.3963F);
        leftFrontLeg.setTextureOffset(24, 16).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.25F, true);

        leftFrontLowerLeg = new ModelRenderer(this);
        leftFrontLowerLeg.setRotationPoint(0.0F, 3.5F, 0.0F);
        leftFrontLeg.addChild(leftFrontLowerLeg);
        setRotationAngle(leftFrontLowerLeg, 0.0F, 0.0F, 0.7854F);
        leftFrontLowerLeg.setTextureOffset(29, 16).addBox(0.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);

        leftMiddleLeg = new ModelRenderer(this);
        leftMiddleLeg.setRotationPoint(4.5F, 21.0F, 1.0F);
        setRotationAngle(leftMiddleLeg, 0.1309F, 0.0F, -1.3963F);
        leftMiddleLeg.setTextureOffset(24, 16).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.25F, true);

        leftMiddleLowerLeg = new ModelRenderer(this);
        leftMiddleLowerLeg.setRotationPoint(0.0F, 3.5F, 0.0F);
        leftMiddleLeg.addChild(leftMiddleLowerLeg);
        setRotationAngle(leftMiddleLowerLeg, 0.0F, 0.0F, 0.7854F);
        leftMiddleLowerLeg.setTextureOffset(29, 16).addBox(0.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);

        leftBackLeg = new ModelRenderer(this);
        leftBackLeg.setRotationPoint(4.5F, 21.0F, 2.0F);
        setRotationAngle(leftBackLeg, 0.7854F, 0.0F, -1.3963F);
        leftBackLeg.setTextureOffset(24, 16).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.25F, true);

        leftBackLowerLeg = new ModelRenderer(this);
        leftBackLowerLeg.setRotationPoint(0.0F, 3.5F, 0.0F);
        leftBackLeg.addChild(leftBackLowerLeg);
        setRotationAngle(leftBackLowerLeg, 0.0F, 0.0F, 0.7854F);
        leftBackLowerLeg.setTextureOffset(29, 16).addBox(0.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
    }

    @Override
    public Iterable<ModelRenderer> getParts() {
        return of(shell, body, rightArm, leftArm, rightFrontLeg, rightMiddleLeg, rightBackLeg, leftFrontLeg, leftMiddleLeg, leftBackLeg);
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
