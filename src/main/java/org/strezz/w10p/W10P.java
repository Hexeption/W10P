package org.strezz.w10p;

import com.google.common.base.Stopwatch;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.strezz.w10p.common.config.Config;
import org.strezz.w10p.common.item.ModItems;
import org.strezz.w10p.common.utils.LogHelper;
import org.strezz.w10p.proxy.IProxy;

import java.util.concurrent.TimeUnit;

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.MOD_NAME, version = ModInfo.BUILD_VERSION)
public class W10P {


    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(ModInfo.MOD_ID)
    public static W10P INSTANCE;

    /**
     *
     */
    @SidedProxy(clientSide = ModInfo.CLIENT_PROXY_CLASS, serverSide = ModInfo.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    /**
     *
     */
    public static Configuration configuration;

    public static ModItems modItems = new ModItems();

    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        final Stopwatch stopwatch = Stopwatch.createStarted();
        LogHelper.info("Pre Initialization (Started)");

        proxy.registerConfiguration(event.getSuggestedConfigurationFile());
        proxy.registerEvents();
        proxy.registerRenderers();

        LogHelper.info("Pre Initialization (Ended after " + stopwatch.elapsed(TimeUnit.MILLISECONDS) + "ms)");
    }

    /**
     * This is the second initialization event. Register custom recipes
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        final Stopwatch stopwatch = Stopwatch.createStarted();
        LogHelper.info("Initialization (Started)");
        proxy.registerCraftingRecipes();
        LogHelper.info("Initialization (Ended after " + stopwatch.elapsed(TimeUnit.MILLISECONDS) + "ms)");
    }

    /**
     * This is the final initialization event. Register actions from other mods here
     */
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        final Stopwatch stopwatch = Stopwatch.createStarted();
        LogHelper.info("Post Initialization (Started)");
        LogHelper.info("Post Initialization (Ended after " + stopwatch.elapsed(TimeUnit.MILLISECONDS) + "ms)");
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void onConfigChangedOnConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equalsIgnoreCase(ModInfo.MOD_ID)) {
            Config.loadConfiguration();
        }
    }

    @Mod.EventBusSubscriber
    public static class RegsitrationHandler {

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            modItems.register(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
        }

        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event) {
            modItems.registerModels();
        }

    }
}
