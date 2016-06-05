package io.teammion.morefood.item;

import io.teammion.morefood.CreativeTabs;

/**
 * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 05.06.16.
 */
public class ItemFood extends net.minecraft.item.ItemFood
{
    public ItemFood(String name, int amount, float saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);
        
        setUnlocalizedName(name);
        setRegistryName(name);
        
        setCreativeTab(CreativeTabs.tabFood);
    }
    
    public ItemFood(String name, int amount, boolean isWolfFood)
    {
        super(amount, isWolfFood);
        
        setUnlocalizedName(name);
        setRegistryName(name);
        
        setCreativeTab(CreativeTabs.tabFood);
    }
}
