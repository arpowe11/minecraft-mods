package luckymod;

import luckymod.CodakidFiles.Codakid;
import luckymod._05_LuckyBlock.LuckyBlock;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(LuckyMod.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LuckyMod
{
    public static final String MODID = "luckyblock";
    public static final String MODNAME = "YOUR MOD NAME HERE";
    public static String VERSION = "0.0.1";

    public static LuckyMod instance;
    private static final Logger LOGGER = LogManager.getLogger();

    //*********** DECLARE VARIABLES ******************
    public static LuckyBlock luckyBlock;
    

    public LuckyMod() {

        //*********** INITIALIZE VARIABLES ******************
        luckyBlock = new LuckyBlock();
        

        // ****************** REGISTER BLOCKS ******************
        Codakid.registerBlock(luckyBlock, "lucky_block");
        
    }


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){ Codakid.doItemRegistry(event); }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        Codakid.doBlockRegistry(event);
    }
}
