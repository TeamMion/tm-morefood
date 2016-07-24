package io.teammion.morefood

import io.teammion.morefood.proxy.CommonProxy
import net.minecraftforge.fml.common.{Mod, SidedProxy}
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}

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
    
    @Mod.EventHandler
    def preInit(e : FMLPreInitializationEvent) : Unit =
        proxy.preInit(e)
    
    @Mod.EventHandler    
    def init(e : FMLInitializationEvent) : Unit =
        proxy.init(e)
    
    @Mod.EventHandler
    def postInit(e : FMLPostInitializationEvent) : Unit =
        proxy.postInit(e)
}
