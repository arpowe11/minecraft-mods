package epicmod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;

public class ThunderHammer extends SwordItem {

    public ThunderHammer() {
        super(Tiers.NETHERITE, 0, 0F, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }
}
