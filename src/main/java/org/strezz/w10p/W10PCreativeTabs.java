package org.strezz.w10p;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.strezz.w10p.common.item.ModItems;

@SideOnly(Side.CLIENT)
public class W10PCreativeTabs {

    public static final CreativeTabs mainTab = new CreativeTabs(ModInfo.MOD_ID) {
        @Override
        public ItemStack getTabIconItem() {
            return ModItems.jar_white.getDefaultInstance();
        }

        @Override
        public String getTabLabel() {
            return ModInfo.MOD_ID + ".mainTab";
        }
    };

}
