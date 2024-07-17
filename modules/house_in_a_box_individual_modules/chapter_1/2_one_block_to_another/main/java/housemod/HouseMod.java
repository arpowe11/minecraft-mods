package housemod;

import housemod.CodakidFiles.Codakid;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(HouseMod.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HouseMod
{
    public static final String MODID = "houseinabox";
    public static final String MODNAME = "YOUR MOD NAME HERE";
    public static String VERSION = "0.0.1";

    public static HouseMod instance;
    private static final Logger LOGGER = LogManager.getLogger();

    //*********** DECLARE VARIABLES ******************
    public static CustomStructureBlock  myStructure;

    public HouseMod() {

        //*********** INITIALIZE VARIABLES ******************
        myStructure = new CustomStructureBlock();


        // ****************** REGISTER BLOCKS ******************
        Codakid.registerBlock(myStructure, "my_structure");


    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        Codakid.doBlockRegistry(event);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){ Codakid.doItemRegistry(event); }

}
