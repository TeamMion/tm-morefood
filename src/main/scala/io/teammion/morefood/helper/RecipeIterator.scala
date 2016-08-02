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

package io.teammion.morefood.helper

import java.util

import net.minecraft.item.crafting.IRecipe

/**
  * Created on 01.08.16 at 09:33
  *
  * @author Stefan Wimmer <stefanwimmer128@gmail.com>
  */
class RecipeIterator(recipes : util.List[IRecipe]) extends util.Iterator[IRecipe]
{
    private val itr : util.Iterator[IRecipe] = recipes.iterator()
    
    override def hasNext: Boolean =
        itr.hasNext

    override def next(): IRecipe =
        itr.next()

    override def remove() : Unit =
        itr.remove()
    
    def forEach(fn : (IRecipe, RecipeIterator) => Unit) : Unit =
    {
        val itr = new RecipeIterator(recipes)
        while (itr.hasNext)
            fn(itr.next(), itr)
    }
}
