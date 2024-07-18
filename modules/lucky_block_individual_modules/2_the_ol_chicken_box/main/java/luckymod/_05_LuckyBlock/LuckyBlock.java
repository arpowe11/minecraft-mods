package luckymod._05_LuckyBlock;

import javax.swing.text.html.parser.Entity;

import luckymod.CodakidFiles.LuckyHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.player.Player;
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
   
        for (int i = 0; i < 9; i++) {
            LuckyHelper.spawnEntity(level, pos, new Chicken(EntityType.CHICKEN, level));
        }

        return super.onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid);
    }

}
