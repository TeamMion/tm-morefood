package io.teammion.morefood.recipes

import io.teammion.morefood.{Items, Registry}
import net.minecraft.item.ItemStack

/**
  * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 24.07.16.
  */
object ShapelessRecipes
{
    def register()
    {
        Registry.addShapelessRecipe(
            new ItemStack(Items.MILK_BOTTLE, 4),
            Items.MILK_BUCKET,
            Items.GLASS_BOTTLE,
            Items.GLASS_BOTTLE,
            Items.GLASS_BOTTLE,
            Items.GLASS_BOTTLE
        )
        
        Registry.addShapelessRecipe(
            new ItemStack(Items.CHOCOLATE_PIECE, 8),
            Items.CHOCOLATE
        )
        
        Registry.addShapelessRecipe(
            new ItemStack(Items.CHOCOLATE_DRINK),
            Items.MILK_BOTTLE,
            Items.COCOA_BEAN_GROUND,
            Items.COCOA_BEAN_GROUND,
            Items.SUGAR,
            Items.SUGAR
        )
        
        Registry.addShapelessRecipe(
            new ItemStack(Items.FLOUR, 2),
            Items.WHEAT
        )
        
        Registry.addShapelessRecipe(
            new ItemStack(Items.SCHNITZEL_RAW),
            Items.PORKCHOP,
            Items.EGG,
            Items.FLOUR,
            Items.FLOUR
        )
        
        Registry.addShapelessRecipe(
            new ItemStack(Items.APPLE_CHOCOLATE),
            Items.APPLE,
            Items.CHOCOLATE_PIECE,
            Items.CHOCOLATE_PIECE
        )
        
        Registry.addShapelessRecipe(
            new ItemStack(Items.FISH_STICK_RAW),
            Items.FISH,
            Items.EGG,
            Items.FLOUR,
            Items.FLOUR
        )
        
        Registry.addShapelessRecipe(
            new ItemStack(Items.BREAD_SLICE, 2),
            Items.BREAD
        )
        
        Registry.addShapelessRecipe(
            new ItemStack(Items.STRAWBERRY_CHOCOLATE),
            Items.STRAWBERRY,
            Items.CHOCOLATE_PIECE,
            Items.CHOCOLATE_PIECE
        )
        
        Registry.addShapelessRecipe(
            new ItemStack(Items.FRENCH_FRIES_RAW, 8),
            Items.POTATO,
            Items.POTATO
        )
        
        Registry.addShapelessRecipe(
            new ItemStack(Items.BREAD_DOUGH, 2),
            Items.FLOUR,
            Items.FLOUR,
            Items.FLOUR,
            Items.FLOUR,
            Items.WATER_BUCKET
        )
    }
}
