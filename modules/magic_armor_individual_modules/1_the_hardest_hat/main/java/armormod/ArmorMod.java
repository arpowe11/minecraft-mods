package armormod;

import armormod.CodakidFiles.Codakid;

import armormod.CodakidFiles.ArmorHelper;
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
    

    public ArmorMod() {

        //*********** INITIALIZE MATERIALS ******************
        

        //*********** INITIALIZE VARIABLES ******************
        myHelmet = new CustomArmor();
        

        // ****************** REGISTER ITEMS ******************
        Codakid.registerItem(myHelmet, "my_helmet");
        

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){ Codakid.doItemRegistry(event); }

}
