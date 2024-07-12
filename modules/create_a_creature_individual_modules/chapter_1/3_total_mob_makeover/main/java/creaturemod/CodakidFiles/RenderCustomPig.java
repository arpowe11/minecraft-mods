package creaturemod.CodakidFiles;

import creaturemod.CreatureMod;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.PigRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Pig;

public class RenderCustomPig extends PigRenderer {

    public static final ResourceLocation TEXTURE = new ResourceLocation(CreatureMod.MODID, "mobs/pig_texture.png");

    public RenderCustomPig(EntityRendererProvider.Context p_174452_) {
        super(p_174452_);
    }

    @Override
    public ResourceLocation getTextureLocation(Pig p_116526_) {
        return TEXTURE;
    }


}

