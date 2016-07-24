package io.teammion.morefood

import java.util
import java.util.logging.Logger

import io.teammion.morefood.recipes.{ShapedRecipes, ShapelessRecipes, SmeltingRecipes}
import net.minecraft
import net.minecraft.item.ItemStack
import net.minecraft.item.crafting.{CraftingManager, IRecipe}
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}

/**
  * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 24.07.16.
  */
@Mod(modid = "tm-morefood", modLanguage = "scala")
object MoreFood
{
    val logger : Logger = Logger.getLogger(getClass.getName)
    
    logger.info("MoreFood initialized")
    
    @Mod.EventHandler
    def preInit(e : FMLPreInitializationEvent)
    {
        logger.info("PreInitialization")
        
        Config.load(e)
        
        Items.register()
    }
    
    def init(e : FMLInitializationEvent)
    {
        logger.info("Initialization")
        
        Items.render()
        
        ShapedRecipes.register()
        ShapelessRecipes.register()
        SmeltingRecipes.register()
        
        MinecraftForge.EVENT_BUS.register(new EventHandler)
    }
    
    def postInit(e : FMLPostInitializationEvent)
    {
        logger.info("PostInitialization")
        
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
