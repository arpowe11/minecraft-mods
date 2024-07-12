package creaturemod.CodakidFiles;

import creaturemod.CreatureMod;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.WolfRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Wolf;

public class RenderCustomWolf extends WolfRenderer {

    public static final ResourceLocation TEXTURE = new ResourceLocation(CreatureMod.MODID, "mobs/wolf_texture.png");

    public RenderCustomWolf(EntityRendererProvider.Context p_174452_) {
        super(p_174452_);
    }

    @Override
    public ResourceLocation getTextureLocation(Wolf p_116526_) {
        return TEXTURE;
    }

    @Override
    protected float getBob(Wolf p_116528_, float p_116529_) {
        return p_116528_.getTailAngle();
    }

}

