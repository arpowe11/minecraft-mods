package creaturemod.CodakidFiles;

import creaturemod.CreatureMod;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SkeletonRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.AbstractSkeleton;

public class RenderCustomSkeleton extends SkeletonRenderer {

    public static final ResourceLocation TEXTURE = new ResourceLocation(CreatureMod.MODID, "mobs/skeleton_texture.png");

    public RenderCustomSkeleton(EntityRendererProvider.Context p_174452_) {
        super(p_174452_);
    }

    @Override
    public ResourceLocation getTextureLocation(AbstractSkeleton p_116526_) {
        return TEXTURE;
    }


}

