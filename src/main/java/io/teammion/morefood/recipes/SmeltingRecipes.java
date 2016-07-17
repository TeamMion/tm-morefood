package io.teammion.morefood.recipes;

import io.teammion.morefood.Items;
import io.teammion.morefood.Registry;
import net.minecraft.item.ItemStack;

/**
 * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 05.06.16.
 */
public class SmeltingRecipes
{
    public static void register()
    {
        Registry.addSmelting(
                new ItemStack(Items.DYE, 1, 3),
                new ItemStack(Items.COCOA_BEAN_ROASTED)
        );
        
        Registry.addSmelting(
                Items.SCHNITZEL_RAW,
                new ItemStack(Items.SCHNITZEL)
        );
        
        Registry.addSmelting(
                Items.EGG,
                new ItemStack(Items.EGG_BOILED)
        );
        
        Registry.addSmelting(
                Items.APPLE_CHOCOLATE,
                new ItemStack(Items.APPLE_CHOCOLATE_COATED)
        );
        
        Registry.addSmelting(
                Items.FISH_STICK_RAW,
                new ItemStack(Items.FISH_STICK)
        );
        
        Registry.addSmelting(
                Items.STRAWBERRY_CHOCOLATE,
                new ItemStack(Items.STRAWBERRY_CHOCOLATE_COATED)
        );
        
        Registry.addSmelting(
                Items.FRENCH_FRIES_RAW,
                new ItemStack(Items.FRENCH_FRIES)
        );
    }
}
