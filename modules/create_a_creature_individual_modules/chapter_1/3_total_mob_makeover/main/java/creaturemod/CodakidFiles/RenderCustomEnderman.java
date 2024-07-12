package creaturemod.CodakidFiles;

import com.mojang.blaze3d.vertex.PoseStack;
import creaturemod.CreatureMod;
import net.minecraft.client.model.EndermanModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EndermanRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

import java.util.Random;

public class RenderCustomEnderman extends EndermanRenderer {

    public static final ResourceLocation TEXTURE = new ResourceLocation(CreatureMod.MODID, "mobs/enderman_texture.png");
    private final Random random = new Random();

    public RenderCustomEnderman(EntityRendererProvider.Context p_174452_) {
        super(p_174452_);
    }

    public void render(EnderMan p_114339_, float p_114340_, float p_114341_, PoseStack p_114342_, MultiBufferSource p_114343_, int p_114344_) {
        BlockState blockstate = p_114339_.getCarriedBlock();
        EndermanModel<EnderMan> endermanmodel = (EndermanModel)this.getModel();
        endermanmodel.carrying = blockstate != null;
        endermanmodel.creepy = p_114339_.isCreepy();
        super.render(p_114339_, p_114340_, p_114341_, p_114342_, p_114343_, p_114344_);
    }

    public Vec3 getRenderOffset(EnderMan p_114336_, float p_114337_) {
        if (p_114336_.isCreepy()) {
            double d0 = 0.02D;
            return new Vec3(this.random.nextGaussian() * 0.02D, 0.0D, this.random.nextGaussian() * 0.02D);
        } else {
            return super.getRenderOffset(p_114336_, p_114337_);
        }
    }

    @Override
    public ResourceLocation getTextureLocation(EnderMan p_114334_) {
        return TEXTURE;
    }


}

