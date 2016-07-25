package io.teammion.morefood.recipes

import io.teammion.morefood.{Items, Registry}
import net.minecraft.item.ItemStack

/**
  * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 24.07.16.
  */
object SmeltingRecipes
{
    def register() : Unit =
    {
        Registry.addSmelting(
            Items.APPLE_CHOCOLATE,
            Items.APPLE_CHOCOLATE_COATED.stack
        )
        
        Registry.addSmelting(
            Items.BREAD_DOUGH,
            new ItemStack(Items.BREAD)
        )
        
        Registry.addSmelting(
            Items.EGG,
            Items.EGG_BOILED.stack
        )
        
        Registry.addSmelting(
            Items.FISH_STICK_RAW,
            Items.FISH_STICK.stack
        )
        
        Registry.addSmelting(
            Items.FRENCH_FRIES_RAW,
            Items.FRENCH_FRIES.stack
        )
        
        Registry.addSmelting(
            new ItemStack(Items.DYE, 1, 3),
            Items.COCOA_BEAN_ROASTED.stack
        )
        
        Registry.addSmelting(
            Items.SCHNITZEL_RAW,
            Items.SCHNITZEL.stack
        )
        
        Registry.addSmelting(
            Items.STRAWBERRY_CHOCOLATE,
            Items.STRAWBERRY_CHOCOLATE_COATED.stack
        )
    }
}
