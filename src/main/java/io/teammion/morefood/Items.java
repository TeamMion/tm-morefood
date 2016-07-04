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
    public static final ItemMilkBottle MILK_BOTTLE = new ItemMilkBottle();
    public static final Item COCOA_BEAN_ROASTED = new Item("cocoa_bean_roasted");
    public static final Item COCOA_BEAN_GROUND = new Item("cocoa_bean_ground");
    public static final ItemFood CHOCOLATE = new ItemFood("chocolate", 8);
    public static final ItemFood CHOCOLATE_PIECE = new ItemFood("chocolate_piece", 1);
    public static final ItemDrink CHOCOLATE_DRINK = new ItemDrink("chocolate_drink", 4);
    public static final Item FLOUR = new Item("flour");
    public static final Item SCHNITZEL_RAW = new Item("schnitzel_raw");
    public static final ItemFood SCHNITZEL = new ItemFood("schnitzel", 4);
    public static final ItemFood EGG_BOILED = new ItemFood("egg_boiled", 3);
    public static final Item APPLE_CHOCOLATE = new Item("apple_chocolate");
    public static final ItemFood APPLE_CHOCOLATE_COATED = new ItemFood("apple_chocolate_coated", 8);
    public static final Item FISH_STICK_RAW = new Item("fish_stick_raw");
    public static final ItemFood FISH_STICK = new ItemFood("fish_stick", 6);
    public static final Item BREAD_SLICE = new Item("bread_slice");
    public static final ItemFood SANDWICH_SCHNITZEL = new ItemFood("sandwich_schnitzel", 5);
    
    static void register()
    {
        Registry.register(MILK_BOTTLE);
        Registry.register(COCOA_BEAN_ROASTED);
        Registry.register(COCOA_BEAN_GROUND);
        Registry.register(CHOCOLATE);
        Registry.register(CHOCOLATE_PIECE);
        Registry.register(CHOCOLATE_DRINK);
        Registry.register(FLOUR);
        Registry.register(SCHNITZEL_RAW);
        Registry.register(SCHNITZEL);
        Registry.register(EGG_BOILED);
        Registry.register(APPLE_CHOCOLATE);
        Registry.register(APPLE_CHOCOLATE_COATED);
        Registry.register(FISH_STICK_RAW);
        Registry.register(FISH_STICK);
        Registry.register(BREAD_SLICE);
        Registry.register(SANDWICH_SCHNITZEL);
    }
    
    static void render()
    {
        Registry.render(MILK_BOTTLE);
        Registry.render(COCOA_BEAN_ROASTED);
        Registry.render(COCOA_BEAN_GROUND);
        Registry.render(CHOCOLATE);
        Registry.render(CHOCOLATE_PIECE);
        Registry.render(CHOCOLATE_DRINK);
        Registry.render(FLOUR);
        Registry.render(SCHNITZEL_RAW);
        Registry.render(SCHNITZEL);
        Registry.render(EGG_BOILED);
        Registry.render(APPLE_CHOCOLATE);
        Registry.render(APPLE_CHOCOLATE_COATED);
        Registry.render(FISH_STICK_RAW);
        Registry.render(FISH_STICK);
        Registry.render(BREAD_SLICE);
        Registry.render(SANDWICH_SCHNITZEL);
    }
}
