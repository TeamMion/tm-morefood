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

package io.teammion.morefood.item

import net.minecraft.entity.item.EntityItem
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.init.Items
import net.minecraft.item.ItemStack
import net.minecraft.world.World

/**
  * ItemDrink base class
  *
  * @param name Registry / Unlocalized name
  * @param amount Amount of food to regain when eating
  * @param saturation Saturation for food. Default: .6f
  * @param isWolfFood Defines if food can be given to Wolfs (Dogs). Default: false
  * @author Stefan Wimmer <stefanwimmer128@gmail.com>
  */
class ItemDrink(name : String, amount : Int, saturation : Float, isWolfFood : Boolean)
    extends ItemFood(name, amount, saturation, isWolfFood)
{
    def this(name : String, amount : Int) =
        this(name, amount, .6f, false)
    
    override def onFoodEaten(stack: ItemStack, worldIn: World, player: EntityPlayer) : Unit =
    {
        val bottle : ItemStack = new ItemStack(Items.GLASS_BOTTLE) 
        
        if (! player.inventory.addItemStackToInventory(bottle))
            worldIn.spawnEntityInWorld(new EntityItem(
                worldIn, player.posX, player.posY, player.posZ, bottle
            ))
        
        super.onFoodEaten(stack, worldIn, player)
    }
}
