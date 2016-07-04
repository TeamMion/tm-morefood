package io.teammion.morefood.recipes;

import io.teammion.morefood.Items;
import io.teammion.morefood.Registry;
import net.minecraft.item.ItemStack;

/**
 * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 05.06.16.
 */
public class ShapedRecipes
{
    public static void register()
    {
        Registry.addShapedRecipe(
                new ItemStack(Items.COCOA_BEAN_GROUND),
                "AA", "AA",
                'A', Items.COCOA_BEAN_ROASTED
        );
        
        Registry.addShapedRecipe(
                new ItemStack(Items.CHOCOLATE),
                "AAA", "BCB", "AAA",
                'A', Items.COCOA_BEAN_GROUND,
                'B', Items.SUGAR,
                'C', Items.MILK_BUCKET
        );
        
        Registry.addShapedRecipe(
                new ItemStack(Items.CHOCOLATE),
                "ABA", "ACA", "ABA",
                'A', Items.COCOA_BEAN_GROUND,
                'B', Items.SUGAR,
                'C', Items.MILK_BUCKET
        );
        
        Registry.addShapedRecipe(
                new ItemStack(Items.SANDWICH_SCHNITZEL),
                "A", "B", "A",
                'A', Items.BREAD_SLICE,
                'B', Items.SCHNITZEL
        );
    }
}
