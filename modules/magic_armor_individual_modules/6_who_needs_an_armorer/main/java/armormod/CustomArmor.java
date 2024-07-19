package armormod;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class CustomArmor extends ArmorItem {

    public CustomArmor(EquipmentSlot armorType) {
        super(ArmorMod.myArmorMaterial, armorType, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)); 
    }
    
    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player) {
        
        // Give a player a potion effect
        player.addEffect(new MobEffectInstance(MobEffects.GLOWING, 5, 5, false, false));

        // Helmet effects
        if (this.slot == EquipmentSlot.HEAD) {
            // Give the player night vision
            player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 5, 5, false, false));
        }

        // Chest effects
        if (this.slot == EquipmentSlot.CHEST) {
            // Give the player night vision
            player.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 5, 5, false, false));
        }

        // Leg effects
        if (this.slot == EquipmentSlot.LEGS) {
            // Give the player night vision
            player.addEffect(new MobEffectInstance(MobEffects.JUMP, 5, 10, false, false));
        }

        // Boot effects
        if (this.slot == EquipmentSlot.FEET) {
            // Give the player night vision
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 5, 5, false, false));
        }

    }
}
