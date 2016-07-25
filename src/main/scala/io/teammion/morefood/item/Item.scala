package io.teammion.morefood.item

import io.teammion.morefood.CreativeTabs
import net.minecraft.item.ItemStack

/**
  * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 24.07.16.
  */
class Item(name : String) extends net.minecraft.item.Item
{
    setRegistryName(name)
    setUnlocalizedName(name)
    
    setCreativeTab(CreativeTabs.ITEM)
    
    def stack(i : Int) : ItemStack =
        new ItemStack(this, i)
    
    def stack : ItemStack =
        stack(0)
}
