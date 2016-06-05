package io.teammion.morefood.item;

import io.teammion.morefood.CreativeTabs;

/**
 * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 05.06.16.
 */
public class Item extends net.minecraft.item.Item
{
    public Item(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        
        setCreativeTab(CreativeTabs.FOOD);
    }
}
