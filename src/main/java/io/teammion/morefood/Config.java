package io.teammion.morefood;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

/**
 * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 19.07.16.
 */
public class Config
{
    public static boolean OVERRIDE_BREAD_RECIPE;
    
    static void load(FMLPreInitializationEvent e)
    {
        Configuration config = new Configuration(e.getSuggestedConfigurationFile());
        
        config.load();
        
        OVERRIDE_BREAD_RECIPE = config.get("food", "override_bread_recipe", false).getBoolean();
        
        config.save();
    }
}
