package creaturemod;

import creaturemod.CodakidFiles.*;
import creaturemod.Creatures.*;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome.BiomeCategory;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.awt.*;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CreatureMod.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreatureMod
{
    public static final String MODID = "createacreature";
    public static final String MODNAME = "YOUR MOD NAME HERE";
    public static String VERSION = "0.0.1";

    public static CreatureMod instance;
    private static final Logger LOGGER = LogManager.getLogger();

    //*********** DECLARE VARIABLES ******************
    public static EntityType<CustomMob> myMobType;

    public CreatureMod() {
        // Register the setup method for modloading
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::registerRenderers);
        Codakid.ENTITIES.register(modEventBus);


        // ****************** INITIALIZE VARIABLES ******************
        myMobType = EntityType.Builder.of(CustomMob::new, MobCategory.CREATURE).sized(1F, 1F).build("my_mob");


        // ****************** REGISTER MOBS ******************
        Codakid.registerMobEntity(myMobType, "my_mob", Color.orange.getRGB(), Color.black.getRGB());


    }

     // ****************** REGISTER LAYERS ******************


    public void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {

        // ****************** REGISTER RENDERERS ******************
        event.registerEntityRenderer(myMobType, RenderCustomWolf::new);

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){ Codakid.doItemRegistry(event); }

    @SubscribeEvent
    public static void registerEntityAttributes(EntityAttributeCreationEvent event) { Codakid.doEntityAttributeRegistry(event); }

}
