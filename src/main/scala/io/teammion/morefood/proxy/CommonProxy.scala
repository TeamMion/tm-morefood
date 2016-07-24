package io.teammion.morefood.proxy

import java.util

import io.teammion.morefood.recipes.{ShapedRecipes, ShapelessRecipes, SmeltingRecipes}
import io.teammion.morefood.{Config, EventHandler, Items}
import net.minecraft
import net.minecraft.item.ItemStack
import net.minecraft.item.crafting.{CraftingManager, IRecipe}
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}

/**
  * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 24.07.16.
  */
class CommonProxy
{
    def preInit(e : FMLPreInitializationEvent) : Unit =
    {
        Config.load(e)
        
        Items.register()
    }
    
    def init(e : FMLInitializationEvent) : Unit =
    {
        ShapedRecipes.register()
        ShapelessRecipes.register()
        SmeltingRecipes.register()
        
        MinecraftForge.EVENT_BUS.register(new EventHandler)
    }
    
    def postInit(e : FMLPostInitializationEvent) : Unit =
    {
        if (Config.OVERRIDE_BREAD_RECIPE)
        {
            val itr : util.Iterator[IRecipe] = CraftingManager.getInstance().getRecipeList.iterator()
            
            while (itr.hasNext)
            {
                val stack : ItemStack = itr.next().getRecipeOutput
                
                if (stack != null && stack.getItem == minecraft.init.Items.BREAD)
                    itr.remove()
            }
        }
    }
}
