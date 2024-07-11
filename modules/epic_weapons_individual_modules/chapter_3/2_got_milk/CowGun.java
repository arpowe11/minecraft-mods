package epicmod;

import epicmod.CodakidFiles.EpicHelper;
import epicmod.EpicWeapons.EntityLavaTrail;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import java.util.Random;

public class CowGun extends Item {

    public CowGun() {
        super(new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {

        ItemStack cowGun = player.getItemInHand(hand);

        // Make sure the code only runs on the server
        if (!level.isClientSide) {

            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                // Make a new cow
                Cow newMob = new Cow(EntityType.COW, level);
                // Position it in front of the player
                newMob.setPos(player.getEyePosition());
                // Send the cow flying
                Vec3 movement = player.getViewVector(1F);
                movement = movement.scale(8);
                // Add some randomness to the movement
                Vec3 randomMovement = new Vec3(random.nextInt(-1, 2), random.nextInt(-1, 2), random.nextInt(-1, 2));
                movement = movement.add(randomMovement);
                // Apply the movement to the cow
                newMob.setDeltaMovement(movement);
                // Spawn the mob
                level.addFreshEntity(newMob);
            }

        }

        // Tell Minecraft that the lava was indeed launched
        return InteractionResultHolder.success(cowGun);
    }

}
