/*
 * Copyright (c) 2016, Team Mion
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package io.teammion.morefood

import io.teammion.morefood.proxy.IProxy
import io.teammion.morefood.util.Logger
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}
import net.minecraftforge.fml.common.{Mod, SidedProxy}

/**
  * Mod base object
  *
  * @author Stefan Wimmer <stefanwimmer128@gmail.com>
  */
@Mod(modid = "tm-morefood", modLanguage = "scala")
object MoreFood
{
    @SidedProxy(
        serverSide = IProxy.SERVER,
        clientSide = IProxy.CLIENT
    )
    var proxy : IProxy = _
    
    @Mod.EventHandler
    def preInit(e : FMLPreInitializationEvent) : Unit =
    {
        Logger.info ("MoreFood preinitializing...")
        
        proxy.preInit(e)
        
        Logger.info("MoreFood preinitialized")
    }
    
    @Mod.EventHandler    
    def init(e : FMLInitializationEvent) : Unit =
    {
        Logger.info("MoreFood initializing...")
        
        proxy.init(e)
        
        Logger.info("MoreFood initialized")
    }
    
    @Mod.EventHandler
    def postInit(e : FMLPostInitializationEvent) : Unit =
    {
        Logger.info("MoreFood postinitializing...")
        
        proxy.postInit(e)
        
        Logger.info("MoreFood postinitialized")
    }
}
