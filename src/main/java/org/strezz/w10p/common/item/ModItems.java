package org.strezz.w10p.common.item;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import org.strezz.w10p.common.item.items.ItemMedicineBlindness;
import org.strezz.w10p.common.item.items.ItemMedicineNausea;
import org.strezz.w10p.common.item.items.ItemMedicinePoison;
import org.strezz.w10p.common.item.items.ItemMedicineWeakness;

import java.lang.reflect.Field;

public class ModItems {
    /**
     * Compoents
     */
    public static ItemBase bleach = new ItemBase("bleach");
    public static ItemBase garbage = new ItemBase("garbage");
    public static ItemBase glue = new ItemBase("glue");
    public static ItemBase salt = new ItemBase("salt");


    /**
     * Containers
     */
    public static ItemBase bleach_bottle = new ItemBase("bleach_bottle");

    public static ItemBase beaker_black = new ItemBase("beaker_black");
    public static ItemBase beaker_blue = new ItemBase("beaker_blue");
    public static ItemBase beaker_brown = new ItemBase("beaker_brown");
    public static ItemBase beaker_clear = new ItemBase("beaker_clear");
    public static ItemBase beaker_dark_grey = new ItemBase("beaker_dark_grey");
    public static ItemBase beaker_green = new ItemBase("beaker_green");
    public static ItemBase beaker_indigo = new ItemBase("beaker_indigo");
    public static ItemBase beaker_light_grey = new ItemBase("beaker_light_grey");
    public static ItemBase beaker_orange = new ItemBase("beaker_orange");
    public static ItemBase beaker_purple = new ItemBase("beaker_purple");
    public static ItemBase beaker_red = new ItemBase("beaker_red");
    public static ItemBase beaker_white = new ItemBase("beaker_white");
    public static ItemBase beaker_yellow = new ItemBase("beaker_yellow");

    public static ItemBase flask_black = new ItemBase("flask_black");
    public static ItemBase flask_blue = new ItemBase("flask_blue");
    public static ItemBase flask_brown = new ItemBase("flask_brown");
    public static ItemBase flask_clear = new ItemBase("flask_clear");
    public static ItemBase flask_dark_grey = new ItemBase("flask_dark_grey");
    public static ItemBase flask_green = new ItemBase("flask_green");
    public static ItemBase flask_indigo = new ItemBase("flask_indigo");
    public static ItemBase flask_light_grey = new ItemBase("flask_light_grey");
    public static ItemBase flask_orange = new ItemBase("flask_orange");
    public static ItemBase flask_purple = new ItemBase("flask_purple");
    public static ItemBase flask_red = new ItemBase("flask_red");
    public static ItemBase flask_white = new ItemBase("flask_white");
    public static ItemBase flask_yellow = new ItemBase("flask_yellow");

    public static ItemBase jar_black = new ItemBase("jar_black");
    public static ItemBase jar_blue = new ItemBase("jar_blue");
    public static ItemBase jar_brown = new ItemBase("jar_brown");
    public static ItemBase jar_clear = new ItemBase("jar_clear");
    public static ItemBase jar_dark_grey = new ItemBase("jar_dark_grey");
    public static ItemBase jar_green = new ItemBase("jar_green");
    public static ItemBase jar_indigo = new ItemBase("jar_indigo");
    public static ItemBase jar_light_grey = new ItemBase("jar_light_grey");
    public static ItemBase jar_orange = new ItemBase("jar_orange");
    public static ItemBase jar_purple = new ItemBase("jar_purple");
    public static ItemBase jar_red = new ItemBase("jar_red");
    public static ItemBase jar_white = new ItemBase("jar_white");
    public static ItemBase jar_yellow = new ItemBase("jar_yellow");


    /**
     * Items
     */
    public static ItemBase ice_bomb = new ItemBase("ice_bomb");
    public static ItemBase rapid_fertilizer = new ItemBase("rapid_fertilizer");
    public static ItemBase sparkler_blue = new ItemBase("sparkler_blue");
    public static ItemBase sparkler_green = new ItemBase("sparkler_green");
    public static ItemBase sparkler_orange = new ItemBase("sparkler_orange");
    public static ItemBase sparkler_purple = new ItemBase("sparkler_purple");
    public static ItemBase sparkler_red = new ItemBase("sparkler_red");

    /**
     * Potions
     */
    public static ItemBase medicine_blindness = new ItemMedicineBlindness();
    public static ItemBase medicine_nausea = new ItemMedicineNausea();
    public static ItemBase medicine_poison = new ItemMedicinePoison();
    public static ItemBase medicine_weakness = new ItemMedicineWeakness();

    public void register(IForgeRegistry<Item> registry) {
        for (Field field : ModItems.class.getFields()) {
            if (field.getType().isAssignableFrom(ItemBase.class)) {
                try {
                    ItemBase item = (ItemBase) field.get(this);
                    registry.register(item);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void registerModels() {
        for (Field field : ModItems.class.getFields()) {
            if (field.getType().isAssignableFrom(ItemBase.class)) {
                try {
                    ItemBase item = (ItemBase) field.get(this);
                    item.registerItemModel();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
