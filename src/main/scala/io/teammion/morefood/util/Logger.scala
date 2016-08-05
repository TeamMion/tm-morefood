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

package io.teammion.morefood.util

import net.minecraftforge.fml.common.FMLLog
import org.apache.logging.log4j.Level

/**
  * Created on 05.08.16 at 14:21
  *
  * @author Stefan Wimmer <stefanwimmer128@gmail.com>
  */
object Logger
{
    def log(level : Level, msg : String) : Unit =
        FMLLog.log("tm-morefood", level, msg)
    
    def info(msg : String) : Unit =
        log(Level.INFO, msg)
    
    def warn(msg : String) : Unit =
        log(Level.WARN, msg)
    
    def error(msg : String) : Unit =
        log(Level.ERROR, msg)
}
