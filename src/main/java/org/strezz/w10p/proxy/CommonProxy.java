package org.strezz.w10p.proxy;

import net.minecraft.client.resources.I18n;
import net.minecraft.item.Item;

import java.io.File;

public class CommonProxy implements IProxy {

    @Override
    public void registerCraftingRecipes() {

    }

    @Override
    public void registerEvents() {

    }

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {

    }

    @Override
    public void registerRenderers() {

    }

    @Override
    public void registerConfiguration(File configFile) {

    }

    @Override
    public String localize(String unlocalized, Object... args) {
        return I18n.format(unlocalized, args);
    }
}
