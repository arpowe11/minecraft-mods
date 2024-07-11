package epicmod;

import epicmod.CodakidFiles.Codakid;
import epicmod.CodakidFiles.EpicHelper;
import epicmod.EpicWeapons.EntityLavaTrail;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;

public class LavaLauncher extends Item {

    public LavaLauncher() {
        super(new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {

        ItemStack launcher = player.getItemInHand(hand);

        // Make sure the code only runs on the server
        if (!level.isClientSide) {

            EntityLavaTrail lavaTrail = new EntityLavaTrail(EpicHelper.ENTITY_LAVA_TRAIL, level);
            // Put the lava trail in front if the player
            lavaTrail.setPos(player.getEyePosition());
            // Tell the lava trail which direction to move in
            lavaTrail.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 2F, 0F);
            // Spawn the lava trail
            level.addFreshEntity(lavaTrail);

        }

        // Tell Minecraft that the lava was indeed launched
        return InteractionResultHolder.success(launcher);
    }
}
