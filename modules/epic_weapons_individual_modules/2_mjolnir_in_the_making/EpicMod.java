package epicmod;

import epicmod.CodakidFiles.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(EpicMod.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EpicMod {
    public static final String MODID = "epicweapons";
    public static final String MODNAME = "YOUR MOD NAME HERE";
    public static String VERSION = "0.0.1";

    public static EpicMod instance;
    private static final Logger LOGGER = LogManager.getLogger();

    //*********** DECLARE VARIABLES ******************
    public static ThunderHammer myHammer;

    public EpicMod() {
        // Register the setup method for modloading
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::registerRenderers);
        Codakid.ENTITIES.register(modEventBus);

        //*********** INITIALIZE MATERIALS ******************

        //*********** INITIALIZE VARIABLES ******************
        myHammer = new ThunderHammer();

        // ****************** REGISTER ITEMS ******************
        Codakid.registerItem(myHammer, "my_hammer");

    }

    public void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {

        // ****************** REGISTER RENDERERS ******************
        event.registerEntityRenderer(EpicHelper.ENTITY_LAVA_TRAIL, RenderLavaTrail::new);

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){ Codakid.doItemRegistry(event); }

}
