package io.teammion.morefood;

import net.minecraft.item.Item;

/**
 * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 05.06.16.
 */
public class CreativeTabs extends net.minecraft.creativetab.CreativeTabs
{
    private Item tabIconItem;
    
    public CreativeTabs(String label, Item tabIconItem)
    {
        super(label);
        
        this.tabIconItem = tabIconItem;
    }
    
    @Override
    public Item getTabIconItem()
    {
        return tabIconItem;
    }
}
