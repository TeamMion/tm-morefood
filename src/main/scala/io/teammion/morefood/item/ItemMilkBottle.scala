package io.teammion.morefood.item

import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.ItemStack
import net.minecraft.world.World

/**
  * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 24.07.16.
  */
class ItemMilkBottle
    extends ItemDrink("milk_bottle", 2)
{
    override def onFoodEaten(stack: ItemStack, worldIn: World, player: EntityPlayer)
    {
        player.clearActivePotions()
        
        super.onFoodEaten(stack, worldIn, player)
    }
}
