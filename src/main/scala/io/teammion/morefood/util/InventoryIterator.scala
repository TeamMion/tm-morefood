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

import java.util

import net.minecraft.inventory.IInventory
import net.minecraft.item.ItemStack

/**
  * Provides easy iteration over IInventory
  *
  * @author Stefan Wimmer <stefanwimmer128@gmail.com>
  */
class InventoryIterator(inv : IInventory)
    extends util.Iterator[ItemStack]
{
    private var i : Int = -1
    
    /**
      * Iterator has more elements
      * @return "true" if correct
      */
    override def hasNext : Boolean =
        i < inv.getSizeInventory - 1
    
    /**
      * Gets next element and add 1 to index
      * @return Next element
      */
    override def next() : ItemStack =
    {
        i += 1
        inv.getStackInSlot(i)
    }
    
    /**
      * Get index of last element
      * @return Index of last element
      */
    def getIndex : Int =
        i

    /**
      * Get inventory
      * @return Inventory
      */
    def getInventory : IInventory =
        inv
    
    /**
      * Will call function for each element remaining
      * @param fn Function to call
      */
    def forEach(fn : (ItemStack, InventoryIterator) => Unit) : Unit =
    {
        val itr : InventoryIterator = new InventoryIterator(inv)
        while (itr.hasNext)
            fn(itr.next(), itr)
    }
}
