package io.teammion.morefood;

import io.teammion.morefood.item.Item;
import io.teammion.morefood.item.ItemDrink;
import io.teammion.morefood.item.ItemFood;
import io.teammion.morefood.item.ItemMilkBottle;

/**
 * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 05.06.16.
 */
public class Items extends net.minecraft.init.Items
{
    public static final ItemMilkBottle milk_bottle = new ItemMilkBottle();
    public static final Item cocoaBean_roasted = new Item("cocoaBean_roasted");
    public static final Item cocoaBean_ground = new Item("cocoaBean_ground");
    public static final ItemFood chocolate = new ItemFood("chocolate", 8, false);
    public static final ItemFood chocolate_piece = new ItemFood("chocolate_piece", 1, false);
    public static final ItemDrink chocolate_drink = new ItemDrink("chocolate_drink", 4, false);
    
    public static void register()
    {
        Registry.register(milk_bottle);
        Registry.register(cocoaBean_roasted);
        Registry.register(cocoaBean_ground);
        Registry.register(chocolate);
        Registry.register(chocolate_piece);
        Registry.register(chocolate_drink);
    }
    
    public static void render()
    {
        Registry.render(milk_bottle);
        Registry.render(cocoaBean_roasted);
        Registry.render(cocoaBean_ground);
        Registry.render(chocolate);
        Registry.render(chocolate_piece);
        Registry.render(chocolate_drink);
    }
}
