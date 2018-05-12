package org.strezz.w10p.common.block.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.strezz.w10p.common.block.BlockBase;

import java.util.Random;

public class BlockHardGlass extends BlockBase {
    public BlockHardGlass(String name) {
        super(Material.GLASS, name);
        setHardness(5f);
        setResistance(10f);
        setHarvestLevel("pickaxe", 1);
    }

    @Override
    public int quantityDropped(Random random) {
        return 0;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }


    @Override
    @Deprecated
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    protected boolean canSilkHarvest() {
        return true;
    }
}
