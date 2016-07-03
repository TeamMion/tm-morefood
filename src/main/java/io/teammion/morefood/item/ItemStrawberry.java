package io.teammion.morefood.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 02.07.16.
 */
public class ItemStrawberry extends ItemFood
{
    public ItemStrawberry()
    {
        super("strawberry", 2);
        
        setAlwaysEdible();
    }
    
    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        player.heal(2);
        
        super.onFoodEaten(stack, worldIn, player);
    }
}
