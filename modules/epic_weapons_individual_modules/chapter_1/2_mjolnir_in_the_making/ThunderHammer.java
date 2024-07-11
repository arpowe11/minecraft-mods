package epicmod;

import epicmod.CodakidFiles.Codakid;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.HitResult;


public class ThunderHammer extends SwordItem {

    public ThunderHammer() {
        super(Tiers.NETHERITE, 0, 0F, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {

        ItemStack hammer = player.getItemInHand(hand);

        // Get the position where the player is looking
        HitResult hit = player.pick(200D, player.getEyeHeight(), true);

        // Spawn the explosion and lighting
        level.explode(player, hit.getLocation().x, hit.getLocation().y, hit.getLocation().z, 5F, Explosion.BlockInteraction.BREAK);
        Codakid.spawnEntity(level, new BlockPos(hit.getLocation()), new LightningBolt(EntityType.LIGHTNING_BOLT, level));

        // Tell Minecraft that we successfully called down thunder!
        return InteractionResultHolder.success(hammer);
    }
}
