package creaturemod.Creatures;

import creaturemod.CodakidFiles.CreatureHelper;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
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

        float moveSpeed = 0.35F;
        float attackDamage = 5F;
        float maxHealth = 15F;

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

    // Customize the sounds the creature makes
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.WOLF_HOWL;
    }

    @Override
    protected SoundEvent getHurtSound(@NotNull DamageSource damageSource) {
        return SoundEvents.SALMON_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.BAMBOO_FALL;
    }


}
