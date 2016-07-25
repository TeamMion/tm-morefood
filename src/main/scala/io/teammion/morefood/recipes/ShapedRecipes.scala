package io.teammion.morefood.recipes

import io.teammion.morefood.{Items, Registry}
import net.minecraft.item.ItemStack

/**
  * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 24.07.16.
  */
object ShapedRecipes
{
    def register() : Unit =
    {
        Registry.addShapedRecipe(
            Items.COCOA_BEAN_GROUND.stack,
            "AA",
            "AA",
            char2Character('A'), Items.COCOA_BEAN_ROASTED
        )
        
        Registry.addShapedRecipe(
            Items.CHOCOLATE.stack,
            "AAA",
            "BCB",
            "AAA",
            char2Character('A'), Items.COCOA_BEAN_GROUND,
            char2Character('B'), Items.SUGAR,
            char2Character('C'), Items.MILK_BUCKET
        )
        
        Registry.addShapedRecipe(
            Items.CHOCOLATE.stack,
            "ABA",
            "ACA",
            "ABA",
            char2Character('A'), Items.COCOA_BEAN_GROUND,
            char2Character('B'), Items.SUGAR,
            char2Character('C'), Items.MILK_BUCKET
        )
        
        Registry.addShapedRecipe(
            Items.SANDWICH_FISH.stack,
            "A",
            "B",
            "A",
            char2Character('A'), Items.BREAD_SLICE,
            char2Character('B'), Items.COOKED_FISH
        )
        
        Registry.addShapedRecipe(
            Items.SANDWICH_CHICKEN.stack,
            "A",
            "B",
            "A",
            char2Character('A'), Items.BREAD_SLICE,
            char2Character('B'), Items.COOKED_CHICKEN
        )
        
        Registry.addShapedRecipe(
            Items.SANDWICH_PORKCHOP.stack,
            "A",
            "B",
            "A",
            char2Character('A'), Items.BREAD_SLICE,
            char2Character('B'), Items.COOKED_PORKCHOP
        )
        
        Registry.addShapedRecipe(
            Items.SANDWICH_SCHNITZEL.stack,
            "A",
            "B",
            "A",
            char2Character('A'), Items.BREAD_SLICE,
            char2Character('B'), Items.SCHNITZEL
        )
    }
}
