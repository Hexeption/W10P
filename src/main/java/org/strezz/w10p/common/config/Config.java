package org.strezz.w10p.common.config;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;
import org.strezz.w10p.ModInfo;
import org.strezz.w10p.W10P;
import scala.actors.threadpool.Arrays;

import java.io.File;

public class Config extends GuiConfig {

    public static Configuration configuration;

    public Config(GuiScreen parentScreen) {
        super(parentScreen, Arrays.asList(new IConfigElement[]{
                new ConfigElement(W10P.configuration.getCategory("TestData"))
        }), ModInfo.MOD_ID, false, false, ModInfo.MOD_NAME + " Configuration");
        titleLine2 = W10P.configuration.getConfigFile().getAbsolutePath();
    }

    public static Configuration initConfig(File configFile) {
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }

        return configuration;
    }

    public static void loadConfiguration() {
        ConfigTest.init(configuration);
        configuration.save();
    }

}
