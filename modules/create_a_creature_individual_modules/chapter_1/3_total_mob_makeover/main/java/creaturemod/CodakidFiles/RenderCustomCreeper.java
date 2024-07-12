package creaturemod.CodakidFiles;

import creaturemod.CreatureMod;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.CreeperRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Creeper;

public class RenderCustomCreeper extends CreeperRenderer {

    public static final ResourceLocation TEXTURE = new ResourceLocation(CreatureMod.MODID, "mobs/creeper_texture.png");

    public RenderCustomCreeper(EntityRendererProvider.Context p_174452_) {
        super(p_174452_);
    }

    @Override
    public ResourceLocation getTextureLocation(Creeper p_116526_) {
        return TEXTURE;
    }


}

