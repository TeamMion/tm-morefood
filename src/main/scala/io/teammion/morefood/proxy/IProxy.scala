package io.teammion.morefood.proxy

import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}

/**
  * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 25.07.16.
  */
trait IProxy
{
    def preInit(e : FMLPreInitializationEvent) : Unit
    
    def init(e : FMLInitializationEvent) : Unit
    
    def postInit(e : FMLPostInitializationEvent) : Unit
}

object IProxy
{
    final val SERVER = "io.teammion.morefood.proxy.CommonProxy"
    final val CLIENT = "io.teammion.morefood.proxy.ClientProxy"
}
