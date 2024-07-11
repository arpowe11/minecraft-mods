package epicmod.CodakidFiles;

import epicmod.EpicMod;
import epicmod.EpicWeapons.EntityLavaTrail;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class Codakid {

    public static ArrayList<Item> itemsToRegister = new ArrayList<>();
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, EpicMod.MODID);

    public static void registerItem(Item item, String registryName) {
        item.setRegistryName(registryName);
        itemsToRegister.add(item);
    }

    public static void spawnEntity(Level level, BlockPos pos, Entity entity) {
        Random random = new Random();
        entity.setPos(pos.getX()+random.nextInt(2), pos.getY()+random.nextInt(2), pos.getZ()+random.nextInt(2));
        level.addFreshEntity(entity);
    }

    public static void doItemRegistry(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(itemsToRegister.toArray(new Item[itemsToRegister.size()]));
    }

    public static Tier addTier(int miningLevel, int maxUses, float miningSpeed, float damageBonus, int enchantability){

        return new Tier() {
            @Override
            public int getUses() {return maxUses;}

            @Override
            public float getSpeed() {return miningSpeed;}

            @Override
            public float getAttackDamageBonus() {return damageBonus;}

            @Override
            public int getLevel() {return miningLevel;}

            @Override
            public int getEnchantmentValue() {return enchantability;}

            @Override
            public Ingredient getRepairIngredient() {return null;}
        };
    }

}
