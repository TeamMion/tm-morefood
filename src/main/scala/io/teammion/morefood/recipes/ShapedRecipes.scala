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

/**
  * Shaped recipes (sorted alphabetically by output)
  *
  * @author Stefan Wimmer <stefanwimmer128@gmail.com>
  */
object ShapedRecipes
{
    def register() : Unit =
    {
        Registry.addShapedRecipe(
            Items.COCOA_BEAN_GROUND.stack,
            "AA",
            "AA",
            char2Character('A'), Items.COCOA_BEAN_ROASTED
        )
        
        Registry.addShapedRecipe(
            Items.CHOCOLATE.stack,
            "AAA",
            "BCB",
            "AAA",
            char2Character('A'), Items.COCOA_BEAN_GROUND,
            char2Character('B'), Items.SUGAR,
            char2Character('C'), Items.MILK_BUCKET
        )
        
        Registry.addShapedRecipe(
            Items.CHOCOLATE.stack,
            "ABA",
            "ACA",
            "ABA",
            char2Character('A'), Items.COCOA_BEAN_GROUND,
            char2Character('B'), Items.SUGAR,
            char2Character('C'), Items.MILK_BUCKET
        )
        
        Registry.addShapedRecipe(
            Items.SANDWICH_FISH.stack,
            "A",
            "B",
            "A",
            char2Character('A'), Items.BREAD_SLICE,
            char2Character('B'), Items.COOKED_FISH
        )
        
        Registry.addShapedRecipe(
            Items.SANDWICH_CHICKEN.stack,
            "A",
            "B",
            "A",
            char2Character('A'), Items.BREAD_SLICE,
            char2Character('B'), Items.COOKED_CHICKEN
        )
        
        Registry.addShapedRecipe(
            Items.SANDWICH_PORKCHOP.stack,
            "A",
            "B",
            "A",
            char2Character('A'), Items.BREAD_SLICE,
            char2Character('B'), Items.COOKED_PORKCHOP
        )
        
        Registry.addShapedRecipe(
            Items.SANDWICH_SCHNITZEL.stack,
            "A",
            "B",
            "A",
            char2Character('A'), Items.BREAD_SLICE,
            char2Character('B'), Items.SCHNITZEL
        )
    }
}
