package io.teammion.morefood

import io.teammion.morefood.item._
import net.minecraft

/**
  * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 24.07.16.
  */
object Items
{
    val APPLE : minecraft.item.Item = minecraft.init.Items.APPLE
    val BREAD : minecraft.item.Item = minecraft.init.Items.BREAD
    val COOKED_CHICKEN : minecraft.item.Item = minecraft.init.Items.COOKED_CHICKEN
    val COOKED_FISH : minecraft.item.Item = minecraft.init.Items.COOKED_FISH
    val COOKED_PORKCHOP : minecraft.item.Item = minecraft.init.Items.COOKED_PORKCHOP
    val DYE : minecraft.item.Item = minecraft.init.Items.DYE
    val EGG : minecraft.item.Item = minecraft.init.Items.EGG
    val FISH : minecraft.item.Item = minecraft.init.Items.FISH
    val GLASS_BOTTLE : minecraft.item.Item = minecraft.init.Items.GLASS_BOTTLE
    val MILK_BUCKET : minecraft.item.Item = minecraft.init.Items.MILK_BUCKET
    val PORKCHOP : minecraft.item.Item = minecraft.init.Items.PORKCHOP
    val POTATO : minecraft.item.Item = minecraft.init.Items.POTATO
    val SUGAR : minecraft.item.Item = minecraft.init.Items.SUGAR
    val WATER_BUCKET : minecraft.item.Item = minecraft.init.Items.WATER_BUCKET
    val WHEAT : minecraft.item.Item = minecraft.init.Items.WHEAT
    
    val MILK_BOTTLE : ItemMilkBottle = new ItemMilkBottle
    val COCOA_BEAN_ROASTED : Item = new Item("cocoa_bean_roasted")
    val COCOA_BEAN_GROUND : Item = new Item("cocoa_bean_ground")
    val CHOCOLATE : ItemFood = new ItemFood("chocolate", 8)
    val CHOCOLATE_PIECE : ItemFood = new ItemFood("chocolate_piece", 1)
    val CHOCOLATE_DRINK : ItemDrink = new ItemDrink("chocolate_drink", 4)
    val FLOUR : Item = new Item("flour")
    val SCHNITZEL_RAW : Item = new Item("schnitzel_raw")
    val SCHNITZEL : ItemFood = new ItemFood("schnitzel", 4)
    val EGG_BOILED : ItemFood = new ItemFood("egg_boiled", 3)
    val APPLE_CHOCOLATE : Item = new Item("apple_chocolate")
    val APPLE_CHOCOLATE_COATED : ItemFood = new ItemFood("apple_chocolate_coated", 8)
    val FISH_STICK_RAW : Item = new Item("fish_stick_raw")
    val FISH_STICK : ItemFood = new ItemFood("fish_stick", 6)
    val BREAD_SLICE : Item = new Item("bread_slice")
    val SANDWICH_SCHNITZEL : ItemFood = new ItemFood("sandwich_schnitzel", 5)
    val SANDWICH_PORKCHOP : ItemFood = new ItemFood("sandwich_porkchop", 5)
    val SANDWICH_CHICKEN : ItemFood = new ItemFood("sandwich_chicken", 5)
    val SANDWICH_FISH : ItemFood = new ItemFood("sandwich_fish", 5)
    val STRAWBERRY : ItemStrawberry = new ItemStrawberry
    val STRAWBERRY_CHOCOLATE : Item = new Item("strawberry_chocolate")
    val STRAWBERRY_CHOCOLATE_COATED : ItemFood = new ItemFood("strawberry_chocolate_coated", 8)
    val FRENCH_FRIES_RAW : Item = new Item("french_fries_raw")
    val FRENCH_FRIES : ItemFood = new ItemFood("french_fries", 6)
    val BREAD_DOUGH : Item = new Item("bread_dough")
    
    def register() : Unit =
    {
        Registry.register(MILK_BOTTLE)
        Registry.register(COCOA_BEAN_ROASTED)
        Registry.register(COCOA_BEAN_GROUND)
        Registry.register(CHOCOLATE)
        Registry.register(CHOCOLATE_PIECE)
        Registry.register(CHOCOLATE_DRINK)
        Registry.register(FLOUR)
        Registry.register(SCHNITZEL_RAW)
        Registry.register(SCHNITZEL)
        Registry.register(EGG_BOILED)
        Registry.register(APPLE_CHOCOLATE)
        Registry.register(APPLE_CHOCOLATE_COATED)
        Registry.register(FISH_STICK_RAW)
        Registry.register(FISH_STICK)
        Registry.register(BREAD_SLICE)
        Registry.register(SANDWICH_SCHNITZEL)
        Registry.register(SANDWICH_PORKCHOP)
        Registry.register(SANDWICH_CHICKEN)
        Registry.register(SANDWICH_FISH)
        Registry.register(STRAWBERRY)
        Registry.register(STRAWBERRY_CHOCOLATE)
        Registry.register(STRAWBERRY_CHOCOLATE_COATED)
        Registry.register(FRENCH_FRIES_RAW)
        Registry.register(FRENCH_FRIES)
        Registry.register(BREAD_DOUGH)
    }
    
    def render() : Unit =
    {
        Registry.render(MILK_BOTTLE)
        Registry.render(COCOA_BEAN_ROASTED)
        Registry.render(COCOA_BEAN_GROUND)
        Registry.render(CHOCOLATE)
        Registry.render(CHOCOLATE_PIECE)
        Registry.render(CHOCOLATE_DRINK)
        Registry.render(FLOUR)
        Registry.render(SCHNITZEL_RAW)
        Registry.render(SCHNITZEL)
        Registry.render(EGG_BOILED)
        Registry.render(APPLE_CHOCOLATE)
        Registry.render(APPLE_CHOCOLATE_COATED)
        Registry.render(FISH_STICK_RAW)
        Registry.render(FISH_STICK)
        Registry.render(BREAD_SLICE)
        Registry.render(SANDWICH_SCHNITZEL)
        Registry.render(SANDWICH_PORKCHOP)
        Registry.render(SANDWICH_CHICKEN)
        Registry.render(SANDWICH_FISH)
        Registry.render(STRAWBERRY)
        Registry.render(STRAWBERRY_CHOCOLATE)
        Registry.render(STRAWBERRY_CHOCOLATE_COATED)
        Registry.render(FRENCH_FRIES_RAW)
        Registry.render(FRENCH_FRIES)
        Registry.render(BREAD_DOUGH)
    }
}
