package creaturemod.CodakidFiles;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;

import java.util.function.Supplier;

public class MobEggSupplier implements Supplier {

    EntityType<? extends Mob> entityType;
    public MobEggSupplier(EntityType<? extends Mob> entityType){
        this.entityType = entityType;
    }

    @Override
    public EntityType<? extends Mob> get() {
        return entityType;
    }
}
