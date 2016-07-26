package io.teammion.morefood.proxy

import java.util

import io.teammion.morefood.recipes.{ShapedRecipes, ShapelessRecipes, SmeltingRecipes}
import io.teammion.morefood.{Config, EventHandler, ItemRegistry, Items}
import net.minecraft.item.crafting.{CraftingManager, IRecipe}
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}

/**
  * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 24.07.16.
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
        
        MinecraftForge.EVENT_BUS.register(new EventHandler)
    }
    
    override def postInit(e : FMLPostInitializationEvent) : Unit =
    {
        if (Config.OVERRIDE_BREAD_RECIPE)
        {
            val itr : util.Iterator[IRecipe] = CraftingManager.getInstance().getRecipeList.iterator()
            
            while (itr.hasNext)
            {
                val stack = itr.next().getRecipeOutput
                
                if (stack != null && stack.getItem == Items.BREAD)
                    itr.remove()
            }
        }
    }
}
