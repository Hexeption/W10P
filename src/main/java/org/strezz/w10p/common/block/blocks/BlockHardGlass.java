package org.strezz.w10p.common.block.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.strezz.w10p.common.block.BlockBase;

import java.util.Random;

public class BlockHardGlass extends BlockBase {
    public BlockHardGlass(String name) {
        super(Material.GLASS, name);
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
    protected boolean canSilkHarvest() {
        return true;
    }
}
