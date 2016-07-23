package io.teammion.morefood;

import io.teammion.morefood.item.*;

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
    public static final ItemFood SANDWICH_PORKCHOP = new ItemFood("sandwich_porkchop", 5);
    public static final ItemFood SANDWICH_CHICKEN = new ItemFood("sandwich_chicken", 5);
    public static final ItemFood SANDWICH_FISH = new ItemFood("sandwich_fish", 5);
    public static final ItemFood STRAWBERRY = new ItemStrawberry();
    public static final Item STRAWBERRY_CHOCOLATE = new Item("strawberry_chocolate");
    public static final ItemFood STRAWBERRY_CHOCOLATE_COATED = new ItemFood("strawberry_chocolate_coated", 8);
    public static final Item FRENCH_FRIES_RAW = new Item("french_fries_raw");
    public static final ItemFood FRENCH_FRIES = new ItemFood("french_fries", 6);
    public static final Item BREAD_DOUGH = new Item("bread_dough");
    
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
        Registry.register(SANDWICH_PORKCHOP);
        Registry.register(SANDWICH_CHICKEN);
        Registry.register(SANDWICH_FISH);
        Registry.register(STRAWBERRY);
        Registry.register(STRAWBERRY_CHOCOLATE);
        Registry.register(STRAWBERRY_CHOCOLATE_COATED);
        Registry.register(FRENCH_FRIES_RAW);
        Registry.register(FRENCH_FRIES);
        Registry.register(BREAD_DOUGH);
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
        Registry.render(SANDWICH_PORKCHOP);
        Registry.render(SANDWICH_CHICKEN);
        Registry.render(SANDWICH_FISH);
        Registry.render(STRAWBERRY);
        Registry.render(STRAWBERRY_CHOCOLATE);
        Registry.render(STRAWBERRY_CHOCOLATE_COATED);
        Registry.render(FRENCH_FRIES_RAW);
        Registry.render(FRENCH_FRIES);
        Registry.render(BREAD_DOUGH);
    }
}
