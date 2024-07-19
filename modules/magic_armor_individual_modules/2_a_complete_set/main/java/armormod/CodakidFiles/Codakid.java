package armormod.CodakidFiles;

import net.minecraft.world.item.*;
import net.minecraftforge.event.RegistryEvent;

import java.util.*;

public class Codakid {

    public static ArrayList<Item> itemsToRegister = new ArrayList<>();

    public static void registerItem(Item item, String registryName) {
        item.setRegistryName(registryName);
        itemsToRegister.add(item);
    }

    public static void doItemRegistry(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(itemsToRegister.toArray(new Item[itemsToRegister.size()]));
    }

}
