package org.strezz.w10p.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import org.strezz.w10p.common.utils.LogHelper;

import java.lang.reflect.Field;

public class ModBlocks {

    public static BlockBase hard_glass = new BlockBase(Material.GLASS, "hard_glass");

    public void register(IForgeRegistry<Block> registry) {
        LogHelper.info("work?");
        for (Field field : ModBlocks.class.getFields()) {
            if (field.getType().isAssignableFrom(BlockBase.class)) {
                try {
                    BlockBase block = (BlockBase) field.get(this);
                    registry.register(block);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void registerItemBlocks(IForgeRegistry<Item> registry) {
        for (Field field : ModBlocks.class.getFields()) {
            if (field.getType().isAssignableFrom(BlockBase.class)) {
                try {
                    BlockBase item = (BlockBase) field.get(this);
                    item.createItemBlock();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void registerModels() {
        for (Field field : ModBlocks.class.getFields()) {
            if (field.getType().isAssignableFrom(BlockBase.class)) {
                try {
                    BlockBase item = (BlockBase) field.get(this);
                    item.registerItemModel(Item.getItemFromBlock(item));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
