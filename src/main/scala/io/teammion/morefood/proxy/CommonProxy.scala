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

package io.teammion.morefood.proxy

import java.util

import io.teammion.morefood.helper.FunctionHelper
import io.teammion.morefood.recipes.{ShapedRecipes, ShapelessRecipes, SmeltingRecipes}
import io.teammion.morefood.{Config, EventHandler, Items}
import net.minecraft.item.crafting.{CraftingManager, IRecipe}
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}

/**
  * Common proxy (will be used on server and client side)
  *
  * @author Stefan Wimmer <stefanwimmer128@gmail.com>
  */
class CommonProxy extends IProxy
{
    override def preInit(e : FMLPreInitializationEvent) : Unit =
    {
        Config.load(e)
        
        Items.register()
    }
    
    override def init(e : FMLInitializationEvent) : Unit =
    {
        ShapedRecipes.register()
        ShapelessRecipes.register()
        SmeltingRecipes.register()
        
        MinecraftForge.EVENT_BUS.register(EventHandler.instance)
    }
    
    override def postInit(e : FMLPostInitializationEvent) : Unit =
    {
        if (Config.OVERRIDE_BREAD_RECIPE)
        {
            val recipes : util.List[IRecipe] = CraftingManager.getInstance().getRecipeList
            
            recipes.clone().asInstanceOf[util.ArrayList[IRecipe]].forEach(
                FunctionHelper.toConsumer[IRecipe]((recipe : IRecipe) =>
                    if (recipe != null && recipe.getRecipeOutput != null && recipe.getRecipeOutput.getItem == Items.BREAD)
                        recipes.remove(recipe)
                )
            )
        }
    }
}
