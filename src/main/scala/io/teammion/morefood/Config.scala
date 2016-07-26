package io.teammion.morefood

import net.minecraftforge.common.config.Configuration
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

/**
  * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 24.07.16.
  */
object Config
{
    var OVERRIDE_BREAD_RECIPE : Boolean = true
    
    def load(e : FMLPreInitializationEvent) : Unit =
    {
        val config: Configuration = new Configuration(e.getSuggestedConfigurationFile)
        
        config.load()
        
        OVERRIDE_BREAD_RECIPE = config.get(
            "general",
            "override_bread_recipe",
            OVERRIDE_BREAD_RECIPE,
            "If true the bread recipe will be overridden"
        ).getBoolean
        
        config.save()
    }
}
