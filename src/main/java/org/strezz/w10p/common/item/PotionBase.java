package org.strezz.w10p.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPotion;
import org.strezz.w10p.W10P;
import org.strezz.w10p.W10PCreativeTabs;

public class PotionBase extends ItemPotion {

    protected String name;

    public PotionBase(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);

        setCreativeTab(W10PCreativeTabs.items);
    }

    public void registerItemModel() {
        W10P.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public PotionBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
