package io.teammion.morefood

import io.teammion.morefood.proxy.CommonProxy
import net.minecraftforge.fml.common.{Mod, SidedProxy}
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}
import org.apache.logging.log4j.Logger

/**
  * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 24.07.16.
  */
@Mod(modid = "tm-morefood", modLanguage = "scala")
object MoreFood
{
    @SidedProxy(
        serverSide = "io.teammion.morefood.proxy.CommonProxy",
        clientSide = "io.teammion.morefood.proxy.ClientProxy"
    )
    var proxy : CommonProxy = _
    
    var logger : Logger = _
    
    @Mod.EventHandler
    def preInit(e : FMLPreInitializationEvent) : Unit =
    {
        logger = e.getModLog
        
        logger.info ("MoreFood preinitializing...")
        
        proxy.preInit(e)
        
        logger.info("MoreFood preinitialized")
    }
    
    @Mod.EventHandler    
    def init(e : FMLInitializationEvent) : Unit =
    {
        logger.info("MoreFood initializing...")
        
        proxy.init(e)
        
        logger.info("MoreFood initialized")
    }
    
    @Mod.EventHandler
    def postInit(e : FMLPostInitializationEvent) : Unit =
    {
        logger.info("MoreFood postinitializing...")
        
        proxy.postInit(e)
        
        logger.info("MoreFood postinitialized")
    }
}
