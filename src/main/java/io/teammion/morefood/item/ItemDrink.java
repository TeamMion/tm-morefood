package io.teammion.morefood.item;

import io.teammion.morefood.Items;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 05.06.16.
 */
public class ItemDrink extends ItemFood
{
    public ItemDrink(String name, int amount, float saturation, boolean isWolfFood)
    {
        super(name, amount, saturation, isWolfFood);
    }
    
    public ItemDrink(String name, int amount, boolean isWolfFood)
    {
        super(name, amount, isWolfFood);
    }
    
    @Override
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.DRINK;
    }
    
    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        stack.stackSize--;
        
        ItemStack bottle = new ItemStack(Items.glass_bottle);
        if (! player.inventory.addItemStackToInventory(bottle))
        {
            worldIn.spawnEntityInWorld(new EntityItem(worldIn, player.posX, player.posY, player.posZ, bottle));
        }
        
        super.onFoodEaten(stack, worldIn, player);
    }
}
