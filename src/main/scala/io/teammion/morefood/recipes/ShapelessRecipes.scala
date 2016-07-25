package io.teammion.morefood.recipes

import io.teammion.morefood.{Items, Registry}
import net.minecraft.item.ItemStack

/**
  * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 24.07.16.
  */
object ShapelessRecipes
{
    def register() : Unit =
    {
        Registry.addShapelessRecipe(
            Items.APPLE_CHOCOLATE.stack,
            Items.APPLE,
            Items.CHOCOLATE_PIECE,
            Items.CHOCOLATE_PIECE
        )
        
        Registry.addShapelessRecipe(
            Items.BREAD_DOUGH.stack(2),
            Items.FLOUR,
            Items.FLOUR,
            Items.FLOUR,
            Items.FLOUR,
            Items.WATER_BUCKET
        )
        
        Registry.addShapelessRecipe(
            Items.BREAD_SLICE.stack(2),
            Items.BREAD
        )
        
        Registry.addShapelessRecipe(
            Items.CHOCOLATE_DRINK.stack,
            Items.MILK_BOTTLE,
            Items.COCOA_BEAN_GROUND,
            Items.COCOA_BEAN_GROUND,
            Items.SUGAR,
            Items.SUGAR
        )
        
        Registry.addShapelessRecipe(
            Items.CHOCOLATE_PIECE.stack(8),
            Items.CHOCOLATE
        )
        
        Registry.addShapelessRecipe(
            Items.FISH_STICK_RAW.stack,
            Items.FISH,
            Items.EGG,
            Items.FLOUR,
            Items.FLOUR
        )
        
        Registry.addShapelessRecipe(
            Items.FLOUR.stack(2),
            Items.WHEAT
        )
        
        Registry.addShapelessRecipe(
            Items.FRENCH_FRIES_RAW.stack(8),
            Items.POTATO,
            Items.POTATO
        )
        
        Registry.addShapelessRecipe(
            Items.MILK_BOTTLE.stack(4),
            Items.MILK_BUCKET,
            Items.GLASS_BOTTLE,
            Items.GLASS_BOTTLE,
            Items.GLASS_BOTTLE,
            Items.GLASS_BOTTLE
        )
        
        Registry.addShapelessRecipe(
            Items.SCHNITZEL_RAW.stack,
            Items.PORKCHOP,
            Items.EGG,
            Items.FLOUR,
            Items.FLOUR
        )
        
        Registry.addShapelessRecipe(
            Items.STRAWBERRY_CHOCOLATE.stack,
            Items.STRAWBERRY,
            Items.CHOCOLATE_PIECE,
            Items.CHOCOLATE_PIECE
        )
    }
}
