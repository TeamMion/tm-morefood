package io.teammion.morefood.item

import net.minecraft.entity.item.EntityItem
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.init.Items
import net.minecraft.item.ItemStack
import net.minecraft.world.World

/**
  * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 24.07.16.
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
