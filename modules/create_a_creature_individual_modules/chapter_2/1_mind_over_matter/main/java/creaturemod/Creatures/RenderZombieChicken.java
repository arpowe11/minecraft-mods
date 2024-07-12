package creaturemod.Creatures;

import creaturemod.CreatureMod;
import net.minecraft.client.model.ChickenModel;
import net.minecraft.client.model.VillagerModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RenderZombieChicken extends MobRenderer<ZombieChicken, ChickenModel<ZombieChicken>> {

    public static final ResourceLocation TEXTURE = new ResourceLocation(CreatureMod.MODID, "mobs/chicken_zombie_texture.png");


    public RenderZombieChicken(EntityRendererProvider.Context manager) {
        super(manager, new ChickenModel<>(manager.bakeLayer(ModelLayers.CHICKEN)), 0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(ZombieChicken mob) {
        return TEXTURE;
    }
}

