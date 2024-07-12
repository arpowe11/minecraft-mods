package creaturemod.CodakidFiles.CustomModels;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import creaturemod.CreatureMod;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class CustomDonkeyModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
		new ResourceLocation(CreatureMod.MODID, "custom_donkey"), "main");
	private final ModelPart head;
	private final ModelPart mouth;
	private final ModelPart left_ear;
	private final ModelPart right_ear;
	private final ModelPart neck;
	private final ModelPart mane;
	private final ModelPart body;
	private final ModelPart tail;
	private final ModelPart front_left_leg;
	private final ModelPart front_right_leg;
	private final ModelPart back_left_leg;
	private final ModelPart back_right_leg;
	private final ModelPart child_front_left_leg;
	private final ModelPart child_front_right_leg;
	private final ModelPart child_back_left_leg;
	private final ModelPart child_back_right_leg;
	private final ModelPart headpiece;
	private final ModelPart noseband;
	private final ModelPart left_bit;
	private final ModelPart right_bit;
	private final ModelPart left_rein;
	private final ModelPart right_rein;
	private final ModelPart saddle;
	private final ModelPart left_chest;
	private final ModelPart right_chest;

	public CustomDonkeyModel(ModelPart root) {
		this.head = root.getChild("head");
		this.mouth = root.getChild("mouth");
		this.left_ear = root.getChild("left_ear");
		this.right_ear = root.getChild("right_ear");
		this.neck = root.getChild("neck");
		this.mane = root.getChild("mane");
		this.body = root.getChild("body");
		this.tail = root.getChild("tail");
		this.front_left_leg = root.getChild("front_left_leg");
		this.front_right_leg = root.getChild("front_right_leg");
		this.back_left_leg = root.getChild("back_left_leg");
		this.back_right_leg = root.getChild("back_right_leg");
		this.child_front_left_leg = root.getChild("child_front_left_leg");
		this.child_front_right_leg = root.getChild("child_front_right_leg");
		this.child_back_left_leg = root.getChild("child_back_left_leg");
		this.child_back_right_leg = root.getChild("child_back_right_leg");
		this.headpiece = root.getChild("headpiece");
		this.noseband = root.getChild("noseband");
		this.left_bit = root.getChild("left_bit");
		this.right_bit = root.getChild("right_bit");
		this.left_rein = root.getChild("left_rein");
		this.right_rein = root.getChild("right_rein");
		this.saddle = root.getChild("saddle");
		this.left_chest = root.getChild("left_chest");
		this.right_chest = root.getChild("right_chest");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 13).addBox(-3.0F, -11.0F, -2.0F, 6.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, -9.0F));

		PartDefinition mouth = partdefinition.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(0, 25).addBox(-2.0F, -11.0F, -7.0F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, -9.0F));

		PartDefinition left_ear = partdefinition.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -7.1F, 0.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, -7.9F, -5.0F));

		PartDefinition right_ear = partdefinition.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -7.1F, 0.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, -7.9F, -5.0F));

		PartDefinition neck = partdefinition.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(0, 35).addBox(-2.05F, -6.0F, -2.0F, 4.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, -9.0F));

		PartDefinition mane = partdefinition.addOrReplaceChild("mane", CubeListBuilder.create().texOffs(56, 36).addBox(-1.0F, -11.0F, 5.01F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, -9.01F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 32).addBox(-5.0F, -8.0F, -17.0F, 10.0F, 10.0F, 22.0F, new CubeDeformation(0.05F)), PartPose.offset(0.0F, 11.0F, 6.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(42, 36).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 11.0F));

		PartDefinition front_left_leg = partdefinition.addOrReplaceChild("front_left_leg", CubeListBuilder.create().texOffs(48, 21).mirror().addBox(-3.0F, -1.0F, -1.9F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(4.0F, 14.0F, -9.0F));

		PartDefinition front_right_leg = partdefinition.addOrReplaceChild("front_right_leg", CubeListBuilder.create().texOffs(48, 21).addBox(-1.0F, -1.0F, -1.9F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 14.0F, -9.0F));

		PartDefinition back_left_leg = partdefinition.addOrReplaceChild("back_left_leg", CubeListBuilder.create().texOffs(48, 21).mirror().addBox(-3.0F, -1.0F, -1.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(4.0F, 14.0F, 8.0F));

		PartDefinition back_right_leg = partdefinition.addOrReplaceChild("back_right_leg", CubeListBuilder.create().texOffs(48, 21).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 14.0F, 8.0F));

		PartDefinition child_front_left_leg = partdefinition.addOrReplaceChild("child_front_left_leg", CubeListBuilder.create().texOffs(48, 21).mirror().addBox(-3.0F, -6.5F, -2.0F, 4.0F, 22.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(4.0F, 14.0F, -9.0F));

		PartDefinition child_front_right_leg = partdefinition.addOrReplaceChild("child_front_right_leg", CubeListBuilder.create().texOffs(48, 21).addBox(-1.0F, -6.5F, -2.0F, 4.0F, 22.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 14.0F, -9.0F));

		PartDefinition child_back_left_leg = partdefinition.addOrReplaceChild("child_back_left_leg", CubeListBuilder.create().texOffs(48, 21).mirror().addBox(-3.0F, -6.5F, -1.0F, 4.0F, 22.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(4.0F, 14.0F, 8.0F));

		PartDefinition child_back_right_leg = partdefinition.addOrReplaceChild("child_back_right_leg", CubeListBuilder.create().texOffs(48, 21).addBox(-1.0F, -6.5F, -1.0F, 4.0F, 22.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 14.0F, 8.0F));

		PartDefinition headpiece = partdefinition.addOrReplaceChild("headpiece", CubeListBuilder.create().texOffs(1, 1).addBox(-3.0F, -11.0F, -1.9F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 2.0F, -8.9F));

		PartDefinition noseband = partdefinition.addOrReplaceChild("noseband", CubeListBuilder.create().texOffs(19, 0).addBox(-2.0F, -11.0F, -4.0F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 2.0F, -9.0F));

		PartDefinition left_bit = partdefinition.addOrReplaceChild("left_bit", CubeListBuilder.create().texOffs(29, 5).addBox(2.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, -9.0F));

		PartDefinition right_bit = partdefinition.addOrReplaceChild("right_bit", CubeListBuilder.create().texOffs(29, 5).addBox(-3.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, -9.0F));

		PartDefinition left_rein = partdefinition.addOrReplaceChild("left_rein", CubeListBuilder.create().texOffs(32, 0).addBox(3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.5F, -5.5F));

		PartDefinition right_rein = partdefinition.addOrReplaceChild("right_rein", CubeListBuilder.create().texOffs(32, 0).addBox(-3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.5F, -5.5F));

		PartDefinition saddle = partdefinition.addOrReplaceChild("saddle", CubeListBuilder.create().texOffs(26, 0).addBox(-5.0F, -8.0F, -9.0F, 10.0F, 9.0F, 9.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 11.0F, 6.0F));

		PartDefinition left_chest = partdefinition.addOrReplaceChild("left_chest", CubeListBuilder.create().texOffs(26, 24).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 3.0F, 6.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition right_chest = partdefinition.addOrReplaceChild("right_chest", CubeListBuilder.create().texOffs(26, 24).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 3.0F, 6.0F, 0.0F, 1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		mouth.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_ear.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_ear.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		neck.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		mane.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		front_left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		front_right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		back_left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		back_right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		child_front_left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		child_front_right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		child_back_left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		child_back_right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		headpiece.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		noseband.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_bit.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_bit.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_rein.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_rein.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		saddle.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_chest.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_chest.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}