package io.teammion.morefood

import net.minecraft.creativetab
import net.minecraft.item.Item

/**
  * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 25.07.16.
  */
class CreativeTabs(label : String, tabIconItem : Item) extends creativetab.CreativeTabs(label)
{
    override def getTabIconItem : Item =
        tabIconItem
}

object CreativeTabs
{
    val ITEM : creativetab.CreativeTabs = creativetab.CreativeTabs.FOOD
    val FOOS : creativetab.CreativeTabs = creativetab.CreativeTabs.FOOD
}
