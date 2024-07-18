package luckymod.CodakidFiles;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import java.util.Random;

public class LuckyHelper {

    public static void spawnItem(Level level, BlockPos pos, Item item, int count) {
        double x = pos.getX();
        double y = pos.getY();
        double z = pos.getZ();

        for(int i = 0; i < count; i++)
            level.addFreshEntity(new ItemEntity(level, x, y, z, new ItemStack(item)));
    }

    public static void spawnBlock(Level level, BlockPos pos, Block block, int count) {
        double x = pos.getX();
        double y = pos.getY();
        double z = pos.getZ();

        for(int i = 0; i < count; i++)
            level.addFreshEntity(new ItemEntity(level, x, y, z, new ItemStack(block)));
    }

    public static void spawnEntity(Level level, BlockPos pos, Entity entity) {
        Random random = new Random();
        entity.setPos(pos.getX()+random.nextInt(2), pos.getY()+random.nextInt(2), pos.getZ()+random.nextInt(2));
        level.addFreshEntity(entity);
    }
}
