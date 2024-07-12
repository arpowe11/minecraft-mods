package creaturemod.Creatures;

import creaturemod.CreatureMod;
import net.minecraft.client.model.VillagerModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RenderCustomMob extends MobRenderer<CustomMob, VillagerModel<CustomMob>> {

    public static final ResourceLocation TEXTURE = new ResourceLocation(CreatureMod.MODID, "mobs/my_mob.png");


    public RenderCustomMob(EntityRendererProvider.Context manager) {
        super(manager, new VillagerModel<>(manager.bakeLayer(ModelLayers.VILLAGER)), 0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(CustomMob mob) {
        return TEXTURE;
    }
}

