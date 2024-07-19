package oremod._02_PowerOre;

import oremod.CodakidFiles.OreHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Material;

public class CustomOre extends Block {

    public CustomOre()
    {
        super(Properties.of(Material.STONE)
            .sound(SoundType.STONE)
            .strength(20F)
        );
    }

    @Override
    public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
        OreHelper.spawnBlock(level, pos, this, 1);

        return super.onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid);
    }

}
