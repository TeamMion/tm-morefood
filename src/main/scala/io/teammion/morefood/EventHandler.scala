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

import net.minecraft.entity.item.EntityItem
import net.minecraftforge.event.entity.living.LivingDropsEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent

/**
  * Handles events
  *
  * @author Stefan Wimmer <stefanwimmer128@gmail.com>
  */
class EventHandler
{
    @SubscribeEvent
    def onDrop(e : LivingDropsEvent) : Unit =
    {
        e.getDrops.add(new EntityItem(
            e.getEntity.worldObj,
            e.getEntity.posX,
            e.getEntity.posY,
            e.getEntity.posZ,
            Items.STRAWBERRY.stack
        ))
    }
}

/**
  * To get EventHandler class
  *
  * @author Stefan Wimmer <stefanwimmer128@gmail.com>
  */
object EventHandler
{
    /**
      * Get EventHandler instance
      * @return EventHandler instance
      */
    def instance : EventHandler =
        new EventHandler
}
