package io.teammion.morefood;

import io.teammion.morefood.recipes.ShapedRecipes;
import io.teammion.morefood.recipes.ShapelessRecipes;
import io.teammion.morefood.recipes.SmeltingRecipes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 05.06.16.
 */
@Mod(modid = "tm-morefood")
public class MoreFood
{
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        Items.register();
        Blocks.register();
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent e)
    {
        if (e.getSide() == Side.CLIENT)
        {
            Items.render();
            Blocks.render();
        }
        
        ShapedRecipes.register();
        ShapelessRecipes.register();
        SmeltingRecipes.register();
        
        MinecraftForge.EVENT_BUS.register(new EventHandler());
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
    }
}
