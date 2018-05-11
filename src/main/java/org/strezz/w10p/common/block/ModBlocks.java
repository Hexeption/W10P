package org.strezz.w10p.common.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import org.strezz.w10p.common.block.blocks.BlockHardGlass;

import java.lang.reflect.Field;

public class ModBlocks {

    public static BlockBase hard_glass = new BlockHardGlass("hard_glass");
    public static BlockBase hard_glass_black = new BlockHardGlass("hard_glass_black");
    public static BlockBase hard_glass_blue = new BlockHardGlass("hard_glass_blue");
    public static BlockBase hard_glass_brown = new BlockHardGlass("hard_glass_brown");
    public static BlockBase hard_glass_cyan = new BlockHardGlass("hard_glass_cyan");
    public static BlockBase hard_glass_green = new BlockHardGlass("hard_glass_green");
    public static BlockBase hard_glass_light_blue = new BlockHardGlass("hard_glass_light_blue");
    public static BlockBase hard_glass_lime = new BlockHardGlass("hard_glass_lime");
    public static BlockBase hard_glass_magenta = new BlockHardGlass("hard_glass_magenta");
    public static BlockBase hard_glass_orange = new BlockHardGlass("hard_glass_orange");
    public static BlockBase hard_glass_pink = new BlockHardGlass("hard_glass_pink");
    public static BlockBase hard_glass_purple = new BlockHardGlass("hard_glass_purple");
    public static BlockBase hard_glass_red = new BlockHardGlass("hard_glass_red");
    public static BlockBase hard_glass_silver = new BlockHardGlass("hard_glass_silver");
    public static BlockBase hard_glass_white = new BlockHardGlass("hard_glass_white");
    public static BlockBase hard_glass_yellow = new BlockHardGlass("hard_glass_yellow");

    public void register(IForgeRegistry<Block> registry) {
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
                    registry.register(item.createItemBlock());
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
