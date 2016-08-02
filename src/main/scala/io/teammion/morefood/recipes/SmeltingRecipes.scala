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

package io.teammion.morefood.recipes

import io.teammion.morefood.{Items, Registry}
import net.minecraft.item.ItemStack

/**
  * Smelting recipes (sorted alphabetically by output)
  *
  * @author Stefan Wimmer <stefanwimmer128@gmail.com>
  */
object SmeltingRecipes
{
    def register() : Unit =
    {
        Registry.addSmelting(
            Items.APPLE_CHOCOLATE,
            Items.APPLE_CHOCOLATE_COATED.stack
        )
        
        Registry.addSmelting(
            Items.BREAD_DOUGH,
            new ItemStack(Items.BREAD)
        )
        
        Registry.addSmelting(
            Items.EGG,
            Items.EGG_BOILED.stack
        )
        
        Registry.addSmelting(
            Items.FISH_STICK_RAW,
            Items.FISH_STICK.stack
        )
        
        Registry.addSmelting(
            Items.FRENCH_FRIES_RAW,
            Items.FRENCH_FRIES.stack
        )
        
        Registry.addSmelting(
            new ItemStack(Items.DYE, 1, 3),
            Items.COCOA_BEAN_ROASTED.stack
        )
        
        Registry.addSmelting(
            Items.SCHNITZEL_RAW,
            Items.SCHNITZEL.stack
        )
        
        Registry.addSmelting(
            Items.STRAWBERRY_CHOCOLATE,
            Items.STRAWBERRY_CHOCOLATE_COATED.stack
        )
    }
}
