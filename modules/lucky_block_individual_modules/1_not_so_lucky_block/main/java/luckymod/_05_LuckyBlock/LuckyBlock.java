package luckymod._05_LuckyBlock;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Material;

public class LuckyBlock extends Block {

    public LuckyBlock(){
        super(Properties.of(Material.STONE)
            .sound(SoundType.STONE)
            .strength(1.0F)
        );
               
    }

    @Override
    public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
        

        return super.onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid);
    }


}
