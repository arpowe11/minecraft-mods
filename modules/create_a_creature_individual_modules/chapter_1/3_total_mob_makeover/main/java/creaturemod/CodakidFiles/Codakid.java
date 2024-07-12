package creaturemod.CodakidFiles;

import creaturemod.CreatureMod;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.*;

public class Codakid {

    public static ArrayList<Item> itemsToRegister = new ArrayList<>();
    public static ArrayList<EntityType<? extends LivingEntity>> livingEntityList = new ArrayList<>();
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, CreatureMod.MODID);

    public static void registerMobEntity(EntityType<? extends Mob> entityType,  String name, int Color1, int Color2){

        ENTITIES.register(name, entityType.delegate);
        MobEggSupplier mobEggSupplier = new MobEggSupplier(entityType);
        livingEntityList.add(entityType);
        ForgeSpawnEggItem spawnEggItem = new ForgeSpawnEggItem(mobEggSupplier, Color1, Color2, new Item.Properties().tab(CreativeModeTab.TAB_MISC));

        spawnEggItem.setRegistryName(CreatureMod.MODID, name+"_egg");
        itemsToRegister.add(spawnEggItem);
    }

    public static void doEntityAttributeRegistry(EntityAttributeCreationEvent event)
    {
        for (EntityType<? extends LivingEntity> entityType : livingEntityList) {
            event.put(entityType, LivingEntity.createLivingAttributes().add(Attributes.MAX_HEALTH, 1F).add(Attributes.MOVEMENT_SPEED, 0.3F).add(Attributes.ATTACK_DAMAGE, 1F).add(Attributes.FOLLOW_RANGE, 16F).add(Attributes.SPAWN_REINFORCEMENTS_CHANCE, 0F).add(Attributes.ATTACK_KNOCKBACK).add(Attributes.FLYING_SPEED, 0.4F).add(Attributes.JUMP_STRENGTH, 0.6f).build());
        }
    }

    public static void doItemRegistry(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(itemsToRegister.toArray(new Item[itemsToRegister.size()]));
    }

}
