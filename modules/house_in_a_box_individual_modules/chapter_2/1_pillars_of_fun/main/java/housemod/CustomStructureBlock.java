package housemod;

import java.util.ArrayList;
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

    // Building Blocks
    BlockState L = Blocks.LAVA.defaultBlockState();
    BlockState O = Blocks.OBSIDIAN.defaultBlockState();
    BlockState W = Blocks.BLACK_WOOL.defaultBlockState();
    BlockState C = Blocks.CHEST.defaultBlockState();
    BlockState D = Blocks.DARK_OAK_PLANKS.defaultBlockState();

    // Array
    ArrayList<BlockState> blueprint = new ArrayList<>();

    public CustomStructureBlock() {
        super(Properties.of(Material.STONE).sound(SoundType.STONE).strength(0.2F));

        blueprint.add(D);
        blueprint.add(D);
        blueprint.add(D);
        blueprint.add(L);
    }

    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, LivingEntity entity, ItemStack stack) {
        for (int y = 0; y < blueprint.size(); y++) {
            level.setBlock(pos.offset(0, y, 0), blueprint.get(y), 0);
        }
    }

}
