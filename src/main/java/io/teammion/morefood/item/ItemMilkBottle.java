package io.teammion.morefood.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 05.06.16.
 */
public class ItemMilkBottle extends ItemDrink
{
    public ItemMilkBottle()
    {
        super("milk_bottle", 2, false);
    }
    
    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        player.clearActivePotions();
        
        super.onFoodEaten(stack, worldIn, player);
    }
}
