package io.teammion.morefood.item

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.ItemStack

/**
  * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 24.07.16.
  */
class Item(name : String) extends net.minecraft.item.Item
{
    setRegistryName(name)
    setUnlocalizedName(name)
    
    setCreativeTab(CreativeTabs.FOOD)
    
    def createStack(i : Int) : ItemStack =
        new ItemStack(this, i)
    
    def createStack : ItemStack =
        createStack(0)
}
