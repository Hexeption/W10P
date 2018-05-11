package org.strezz.w10p;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.strezz.w10p.common.block.ModBlocks;
import org.strezz.w10p.common.item.ModItems;

@SideOnly(Side.CLIENT)
public class W10PCreativeTabs {

    public static final CreativeTabs items = new CreativeTabs(ModInfo.MOD_ID) {
        @Override
        public ItemStack getTabIconItem() {
            return ModItems.jar_white.getDefaultInstance();
        }

        @Override
        public String getTabLabel() {
            return ModInfo.MOD_ID + ".items";
        }
    };

    public static final CreativeTabs components = new CreativeTabs(ModInfo.MOD_ID) {
        @Override
        public ItemStack getTabIconItem() {
            return ModItems.jar_white.getDefaultInstance();
        }

        @Override
        public String getTabLabel() {
            return ModInfo.MOD_ID + ".components";
        }
    };
    public static final CreativeTabs blocks = new CreativeTabs(ModInfo.MOD_ID) {
        @Override
        public ItemStack getTabIconItem() {
            return Item.getItemFromBlock(ModBlocks.hard_glass).getDefaultInstance();
        }

        @Override
        public String getTabLabel() {
            return ModInfo.MOD_ID + ".blocks";
        }
    };
}
