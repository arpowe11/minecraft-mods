package luckymod._05_LuckyBlock;

import java.util.Random;

import javax.swing.text.html.parser.Entity;

import luckymod.CodakidFiles.LuckyHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Material;


public class LuckyBlock extends Block {

    public LuckyBlock(){
        // Change the properties of the lucky block
        super(Properties.of(Material.STONE)
            .sound(SoundType.STONE)
            .strength(1.0F)
        );
               
    }

    @Override
    public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {

        // Random number between 0-100
        Random random = new Random();
        int number = random.nextInt(101);

        // 10% chance to spawn diamonds and emeralds
        if (number <= 10) {
            LuckyHelper.spawnItem(level, pos, Items.DIAMOND, 10);
            LuckyHelper.spawnItem(level, pos, Items.EMERALD, 10);
        }

        // 40% chance to spawn chickens
        else if (number <= 50) {
            for (int i = 0; i < 11; i++) {
                LuckyHelper.spawnEntity(level, pos, new Chicken(EntityType.CHICKEN, level));
            }
        }

        // 20% chance to spawn a sword
        else if (number <= 70) {
            LuckyHelper.spawnItem(level, pos, Items.NETHERITE_SWORD, 1);
        }

        // 25% chance to spawn an Enderman
        else if (number <= 95) {
            LuckyHelper.spawnEntity(level, pos, new EnderMan(EntityType.ENDERMAN, level));
        }

        // 5% chance to spawn a diamond block
        else {
            LuckyHelper.spawnItem(level, pos, Items.DIAMOND_BLOCK, 1);
        }

        return super.onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid);
    }

}
