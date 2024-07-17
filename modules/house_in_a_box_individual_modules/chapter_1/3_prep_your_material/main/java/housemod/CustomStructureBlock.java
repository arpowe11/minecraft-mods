package housemod;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;


public class CustomStructureBlock extends Block{

    BlockState L = Blocks.LAVA.defaultBlockState();
    BlockState O = Blocks.OBSIDIAN.defaultBlockState();
    BlockState W = Blocks.BLACK_WOOL.defaultBlockState();
    BlockState C = Blocks.CHEST.defaultBlockState();
    BlockState D = Blocks.DIAMOND_BLOCK.defaultBlockState();

    public CustomStructureBlock() {
        super(Properties.of(Material.STONE).sound(SoundType.STONE).strength(0.2F));
    }

    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, LivingEntity entity, ItemStack stack) {
        level.setBlock(pos, L, 0);
    }

}
