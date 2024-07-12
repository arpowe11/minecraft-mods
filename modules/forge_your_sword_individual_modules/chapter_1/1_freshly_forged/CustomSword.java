package swordmod;

import net.minecraft.world.item.*;

public class CustomSword extends SwordItem {

    public CustomSword(){
        // Write your code here!
        super(Tiers.DIAMOND, 0, 0F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
        
    }
}
