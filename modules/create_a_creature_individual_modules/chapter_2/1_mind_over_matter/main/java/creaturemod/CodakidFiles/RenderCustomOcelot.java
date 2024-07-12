package creaturemod.CodakidFiles;

import creaturemod.CreatureMod;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.OcelotRenderer;
import net.minecraft.client.renderer.entity.VillagerRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Ocelot;
import net.minecraft.world.entity.npc.Villager;

public class RenderCustomOcelot extends OcelotRenderer {

    public static final ResourceLocation TEXTURE = new ResourceLocation(CreatureMod.MODID, "mobs/ocelot_texture.png");

    public RenderCustomOcelot(EntityRendererProvider.Context p_174452_) {
        super(p_174452_);
    }

    @Override
    public ResourceLocation getTextureLocation(Ocelot p_116526_) {
        return TEXTURE;
    }


}

