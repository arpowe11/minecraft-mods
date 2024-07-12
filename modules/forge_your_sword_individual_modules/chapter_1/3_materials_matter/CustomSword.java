package swordmod;

import net.minecraft.world.item.*;

public class CustomSword extends SwordItem {

    public CustomSword(){
        // Write your code here!
        super(SwordMod.myTier, 0, 2F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
    }
}
