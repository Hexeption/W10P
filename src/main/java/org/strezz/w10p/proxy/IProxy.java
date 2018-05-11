package org.strezz.w10p.proxy;

import net.minecraft.item.Item;

import java.io.File;

public interface IProxy {

    void registerCraftingRecipes();

    void registerEvents();

    void registerItemRenderer(Item item, int meta, String id);

    void registerRenderers();

    void registerConfiguration(File configFile);

    String localize(String unlocalized, Object... args);
}
