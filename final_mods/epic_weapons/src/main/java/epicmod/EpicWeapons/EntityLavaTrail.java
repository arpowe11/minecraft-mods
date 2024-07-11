package epicmod.EpicWeapons;

import epicmod.EpicMod;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;

public class EntityLavaTrail extends ThrowableItemProjectile {

    public EntityLavaTrail(EntityType<? extends ThrowableItemProjectile> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public void tick() {
        super.tick();
        level.setBlock(this.blockPosition(), Blocks.LAVA.defaultBlockState(), 1);
    }

    @Override
    protected Item getDefaultItem() {
        return null;
    }


}
