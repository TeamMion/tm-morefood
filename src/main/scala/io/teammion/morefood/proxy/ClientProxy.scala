package io.teammion.morefood.proxy

import io.teammion.morefood.Items
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}
import org.apache.logging.log4j.{LogManager, Logger}

/**
  * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 24.07.16.
  */
class ClientProxy extends CommonProxy
{
    override def preInit(e : FMLPreInitializationEvent) : Unit =
    {
        super.preInit(e)
    }
    
    override def init(e : FMLInitializationEvent) : Unit =
    {
        super.init(e)
        
        Items.render()
    }
    
    override def postInit(e : FMLPostInitializationEvent) : Unit =
    {
        super.postInit(e)
    }
}
