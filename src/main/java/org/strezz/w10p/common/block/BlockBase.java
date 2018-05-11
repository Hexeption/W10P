package org.strezz.w10p.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import org.strezz.w10p.W10P;
import org.strezz.w10p.W10PCreativeTabs;

public class BlockBase extends Block {

    protected String name;

    public BlockBase(Material materialIn, String name) {
        super(materialIn);
        this.name = name;

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(W10PCreativeTabs.mainTab);
    }

    public void registerItemModel(Item itemblock) {
        W10P.proxy.registerItemRenderer(itemblock, 0, name);
    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }

    @Override
    public BlockBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
