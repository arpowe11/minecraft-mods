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
    BlockState P = Blocks.DARK_OAK_PLANKS.defaultBlockState();
    BlockState A = Blocks.AIR.defaultBlockState();
    BlockState D = Blocks.OAK_DOOR.defaultBlockState();
    BlockState G = Blocks.GLASS.defaultBlockState();
    BlockState n = null;

    // Array
    ArrayList<BlockState[][]> blueprint = new ArrayList<>();

    public CustomStructureBlock() {
        super(Properties.of(Material.STONE).sound(SoundType.STONE).strength(0.2F));
        
        // Layer 1
        blueprint.add(new BlockState[][]{
            {A, A, A, A, A, A, A},
            {A, O, O, A, O, O, A},
            {A, O, A, A, A, O, A},
            {A, O, A, A, A, O, A},
            {A, O, A, A, A, O, A},
            {A, O, O, O, O, O, A},
            {A, A, A, A, A, A, A}
        });

        // Layer 2
        blueprint.add(new BlockState[][]{
            {A, A, A, A, A, A, A},
            {A, O, O, A, O, O, A},
            {A, G, A, A, A, G, A},
            {A, O, A, A, A, O, A},
            {A, G, A, A, A, G, A},
            {A, O, O, O, O, O, A},
            {A, A, A, A, A, A, A}
        });

        // Layer 3
        blueprint.add(new BlockState[][]{
            {A, A, A, A, A, A, A},
            {A, O, O, O, O, O, A},
            {A, O, A, A, A, O, A},
            {A, O, A, A, A, O, A},
            {A, O, A, A, A, O, A},
            {A, O, O, O, O, O, A},
            {A, A, A, A, A, A, A}
        });

        // Layer 4
        blueprint.add(new BlockState[][]{
            {A, A, A, A, A, A, A},
            {A, O, O, O, O, O, A},
            {A, O, O, O, O, O, A},
            {A, O, O, O, O, O, A},
            {A, O, O, O, O, O, A},
            {A, O, O, O, O, O, A},
            {A, A, A, A, A, A, A}
        });
    }

    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, LivingEntity entity, ItemStack stack) {
        // Spawn blocks on y-axis
        for (int y = 0; y < blueprint.size(); y++) {

            // Spawn blocks on x-axis
            for (int x = 0; x < blueprint.get(y).length; x++) {

                // Spawn blocks on z-axis
                for (int z = 0; z < blueprint.get(y)[x].length; z++) {

                    // Spawn the blocks
                    if (blueprint.get(y)[x][z] != null) {
                        level.setBlock(pos.offset(x, y, z), blueprint.get(y)[x][z], 0);
                    }
                }
            }
        }
    }
}
