package net.iwrstheking007.omiam.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class TestMateTwo extends Block {
    public TestMateTwo(Properties properties) {
        super(properties);
    }

    @Override
    public void fallOn(World world, BlockPos blockPos, Entity entity, float number) {
        ItemStack itemStack = new ItemStack(Items.DIAMOND_BLOCK);

        ItemEntity itementity = new ItemEntity(world, blockPos.getX(), blockPos.getY() + 1, blockPos.getZ(), itemStack);
        itementity.setDefaultPickUpDelay();
        world.addFreshEntity(itementity);
    }

    @Override
    public int getLightValue(BlockState state, IBlockReader world, BlockPos pos) {
        return 15;
    }

    @Override
    public boolean canConnectRedstone(BlockState state, IBlockReader world, BlockPos pos, @Nullable Direction side) {
        return true;
    }
}