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

import net.minecraftforge.common.config.Configuration
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

/**
  * Config file loader
  *
  * @author Stefan Wimmer <stefanwimmer128@gmail.com>
  */
object Config
{
    var OVERRIDE_BREAD_RECIPE : Boolean = true
    
    /**
      * Loads config file on preInit
      * @param e preInit FMLEvent
      */
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
