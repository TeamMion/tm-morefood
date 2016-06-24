package io.teammion.morefood;

import net.minecraft.item.Item;

/**
 * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 05.06.16.
 */
public abstract class CreativeTabs extends net.minecraft.creativetab.CreativeTabs
{
    public static final CreativeTabs MOREFOOD_ITEMS = new Impl("morefood", Items.COCOA_BEAN_GROUND);
    public static final CreativeTabs MOREFOOD_FOOD = new Impl("morefood", Items.CHOCOLATE);
    
    public CreativeTabs(String label, Item tabIconItem)
    {
        super(label);
        
        this.setTabIconItem(tabIconItem);
    }
    
    public CreativeTabs(int index, String label, Item tabIconItem)
    {
        super(index, label);
        
        this.setTabIconItem(tabIconItem);
    }
    
    public abstract void setTabIconItem(Item tabIconItem);
    
    public static class Impl extends CreativeTabs
    {
        private Item tabIconItem;
        
        public Impl(String label, Item tabIconItem)
        {
            super(label, tabIconItem);
        }
        
        public Impl(int index, String label, Item tabIconItem)
        {
            super(index, label, tabIconItem);
        }
        
        @Override
        public void setTabIconItem(Item tabIconItem)
        {
            this.tabIconItem = tabIconItem;
        }
        
        @Override
        public Item getTabIconItem()
        {
            return this.tabIconItem;
        }
    }
}
