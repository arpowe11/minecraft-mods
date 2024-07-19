package armormod;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;


public class CustomArmor extends ArmorItem {

    public CustomArmor(EquipmentSlot armorType) {
        super(ArmorMaterials.NETHERITE, armorType, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)); 
    }

}
