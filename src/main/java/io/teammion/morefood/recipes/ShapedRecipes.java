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
                new ItemStack(Items.cocoaBean_ground),
                "AA", "AA",
                'A', Items.cocoaBean_roasted
        );
        
        Registry.addShapedRecipe(
                new ItemStack(Items.chocolate),
                "AAA", "BCB", "AAA",
                'A', Items.cocoaBean_ground,
                'B', Items.SUGAR,
                'C', Items.MILK_BUCKET
        );
        
        Registry.addShapedRecipe(
                new ItemStack(Items.chocolate),
                "ABA", "ACA", "ABA",
                'A', Items.cocoaBean_ground,
                'B', Items.SUGAR,
                'C', Items.MILK_BUCKET
        );
    }
}
