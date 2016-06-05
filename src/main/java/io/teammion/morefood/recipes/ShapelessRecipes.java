package io.teammion.morefood.recipes;

import io.teammion.morefood.Items;
import io.teammion.morefood.Registry;
import net.minecraft.item.ItemStack;

/**
 * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 05.06.16.
 */
public class ShapelessRecipes
{
    public static void register()
    {
        Registry.addShapelessRecipe(
                new ItemStack(Items.milk_bottle, 4),
                Items.MILK_BUCKET,
                Items.GLASS_BOTTLE,
                Items.GLASS_BOTTLE,
                Items.GLASS_BOTTLE,
                Items.GLASS_BOTTLE
        );
        
        Registry.addShapelessRecipe(
                new ItemStack(Items.chocolate_piece, 8),
                Items.chocolate
        );
        
        Registry.addShapelessRecipe(
                new ItemStack(Items.chocolate_drink),
                Items.milk_bottle,
                Items.cocoaBean_ground,
                Items.cocoaBean_ground,
                Items.SUGAR,
                Items.SUGAR
        );
    }
}
