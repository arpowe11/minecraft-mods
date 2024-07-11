package epicmod.CodakidFiles;

import epicmod.EpicWeapons.EntityLavaTrail;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class EpicHelper {

    public static final EntityType<EntityLavaTrail> ENTITY_LAVA_TRAIL = EntityType.Builder.of(EntityLavaTrail::new, MobCategory.MISC).sized(0.25F, 0.25F).build("lava_trail");



}
