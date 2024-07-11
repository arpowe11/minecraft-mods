package epicmod.CodakidFiles;

import epicmod.EpicWeapons.EntityLavaTrail;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;

public class RenderLavaTrail extends ThrownItemRenderer<EntityLavaTrail> {

    public RenderLavaTrail(EntityRendererProvider.Context manager){
        super(manager);
    }

}
