package oremod._02_PowerOre;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import oremod.OreMod;

public class CustomPickaxe extends PickaxeItem{

    public CustomPickaxe() {
        super(OreMod.myTier, 0, 0F, new Properties().tab(CreativeModeTab.TAB_TOOLS));
    }

}
