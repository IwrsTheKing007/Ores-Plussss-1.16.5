package net.iwrstheking007.omiam.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class AnthraciteOreEXPDrop extends OreBlock {
    public AnthraciteOreEXPDrop(AbstractBlock.Properties properties) {
        super(properties);
    }

    @Override
    protected int xpOnDrop(Random p_220281_1_) {
        return MathHelper.nextInt(p_220281_1_, 8, 10);
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? this.xpOnDrop(RANDOM) : 0;
    }
}