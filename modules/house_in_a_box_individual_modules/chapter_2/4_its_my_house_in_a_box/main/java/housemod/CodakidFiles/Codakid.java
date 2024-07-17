package housemod.CodakidFiles;

import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;

import java.util.*;

public class Codakid {

    public static ArrayList<Block> blocksToRegister = new ArrayList<>();
    public static ArrayList<Item> itemsToRegister = new ArrayList<>();

    public static void registerBlock(Block block, String registryName) {
        block.setRegistryName(registryName);
        ItemNameBlockItem itemBlock = new ItemNameBlockItem(block, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
        itemBlock.setRegistryName(registryName);
        blocksToRegister.add(block);
        itemsToRegister.add(itemBlock);
    }

    public static void doBlockRegistry(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(blocksToRegister.toArray(new Block[blocksToRegister.size()]));
    }

    public static void doItemRegistry(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(itemsToRegister.toArray(new Item[itemsToRegister.size()]));
    }

}
