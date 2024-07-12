package creaturemod.CodakidFiles;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraftforge.common.world.MobSpawnSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CreatureHelper {

    public static Map<MobSpawnSettings.SpawnerData, Biome.BiomeCategory[]> mobSpawnBiomes = new HashMap<>();

    public static void addSpawn(EntityType<? extends LivingEntity> entity, int weightedProb, int min, int max, Biome.BiomeCategory... biomes)
    {
        mobSpawnBiomes.put(new MobSpawnSettings.SpawnerData(entity, weightedProb, min, max), biomes);
    }

    @SubscribeEvent
    public static void doAddSpawn(BiomeLoadingEvent event)
    {
        MobSpawnSettingsBuilder spawns = event.getSpawns();
        for (MobSpawnSettings.SpawnerData mobData : mobSpawnBiomes.keySet())
        {
            for (Biome.BiomeCategory biome : mobSpawnBiomes.get(mobData))
            {
                if (event.getCategory().equals(biome))
                {
                    spawns.getSpawner(mobData.type.getCategory()).add(mobData);
                }
            }
        }
    }

    public static void setMovementSpeed(LivingEntity mob, float value)
    {
        Objects.requireNonNull(mob.getAttribute(Attributes.MOVEMENT_SPEED)).setBaseValue(value);
    }
    public static void setAttackDamage(LivingEntity mob, float value)
    {
        Objects.requireNonNull(mob.getAttribute(Attributes.ATTACK_DAMAGE)).setBaseValue(value);
    }
    public static void setMaxHealth(LivingEntity mob, float value)
    {
        Objects.requireNonNull(mob.getAttribute(Attributes.MAX_HEALTH)).setBaseValue(value);
    }

}
