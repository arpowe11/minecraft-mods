package creaturemod.Creatures;

import creaturemod.CodakidFiles.CreatureHelper;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.animal.Cod;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class CustomMob extends Wolf {

    private static EntityType<? extends CustomMob> myEntityType;

    public CustomMob(EntityType<? extends CustomMob> entityType, Level level) {
        super(entityType, level);

        float moveSpeed = 0.3F;
        float attackDamage = 1F;
        float maxHealth = 10F;

        CreatureHelper.setMovementSpeed(this, moveSpeed);
        CreatureHelper.setAttackDamage(this, attackDamage);
        CreatureHelper.setMaxHealth(this, maxHealth);

        this.setHealth(maxHealth);
        myEntityType = entityType;
    }

    // For mobs that have offspring
    // @Override
    // public CustomMob getBreedOffspring(@NotNull ServerLevel serverLevel, @NotNull AgeableMob ageableMob) {

    //     return myEntityType.create(serverLevel);
    // }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.PIG_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound(@NotNull DamageSource damageSource) {
        return null;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return null;
    }


}
