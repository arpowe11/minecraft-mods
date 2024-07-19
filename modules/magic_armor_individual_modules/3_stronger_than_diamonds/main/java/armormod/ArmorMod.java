package armormod;

import armormod.CodakidFiles.Codakid;

import armormod.CodakidFiles.ArmorHelper;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ArmorMod.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ArmorMod
{
    public static final String MODID = "magicarmor";
    public static final String MODNAME = "YOUR MOD NAME HERE";
    public static String VERSION = "0.0.1";

    public static ArmorMod instance;
    private static final Logger LOGGER = LogManager.getLogger();

    //*********** DECLARE VARIABLES ******************
    public static CustomArmor myHelmet;
    public static CustomArmor myChestplate;
    public static CustomArmor myLeggings;
    public static CustomArmor myBoots;
    public static ArmorMaterial myArmorMaterial;
    

    public ArmorMod() {

        //*********** INITIALIZE MATERIALS ******************
        myArmorMaterial = ArmorHelper.addArmorMaterial(
            MODNAME + ":my_armor", 
            100, 
            new int[]{5, 12, 10, 8}, 
            50, 
            SoundEvents.DOLPHIN_PLAY, 
            8F, 
            100F, 
            Ingredient.of(Items.BREAD));
        

        //*********** INITIALIZE VARIABLES ******************
        myHelmet = new CustomArmor(EquipmentSlot.HEAD);
        myChestplate = new CustomArmor(EquipmentSlot.CHEST);
        myLeggings = new CustomArmor(EquipmentSlot.LEGS);
        myBoots = new CustomArmor(EquipmentSlot.FEET);
        

        // ****************** REGISTER ITEMS ******************
        Codakid.registerItem(myHelmet, "my_helmet");
        Codakid.registerItem(myChestplate, "my_chestplate");
        Codakid.registerItem(myLeggings, "my_leggings");
        Codakid.registerItem(myBoots, "my_boots");
        

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){ Codakid.doItemRegistry(event); }

}
