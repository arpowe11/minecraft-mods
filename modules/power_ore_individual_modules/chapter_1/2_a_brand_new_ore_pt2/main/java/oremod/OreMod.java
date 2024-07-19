package oremod;

import oremod.CodakidFiles.Codakid;
import oremod._02_PowerOre.CustomOre;
import net.minecraft.server.bossevents.CustomBossEvent;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(OreMod.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OreMod
{
    public static final String MODID = "powerore";
    public static final String MODNAME = "YOUR MOD NAME HERE";
    public static String VERSION = "0.0.1";

    public static OreMod instance;
    private static final Logger LOGGER = LogManager.getLogger();

    //*********** DECLARE VARIABLES ******************
    public static CustomOre myOre;

    public OreMod() {

        //*********** INITIALIZE MATERIALS ******************


        //*********** INITIALIZE VARIABLES ******************
        myOre = new CustomOre();

        // ****************** REGISTER BLOCKS AND ITEMS ******************
        Codakid.registerBlock(myOre, "my_ore");
        

        // ****************** REGISTER WORLD GEN ******************
        
    }


    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        Codakid.doBlockRegistry(event);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){ Codakid.doItemRegistry(event); }

}
