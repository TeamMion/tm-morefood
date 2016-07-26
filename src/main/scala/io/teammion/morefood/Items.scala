package io.teammion.morefood

import io.teammion.morefood.item._
import net.minecraft
import org.objectweb.asm.commons.SerialVersionUIDAdder.Item

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
    
    var APPLE_CHOCOLATE : Item = new Item("apple_chocolate")
    var APPLE_CHOCOLATE_COATED : ItemFood = new ItemFood("apple_chocolate_coated", 8)
    var BREAD_DOUGH : Item = new Item("bread_dough")
    var BREAD_SLICE : Item = new Item("bread_slice")
    var CHOCOLATE : ItemFood = new ItemFood("chocolate", 8)
    var CHOCOLATE_DRINK : ItemDrink = new ItemDrink("chocolate_drink", 4)
    var CHOCOLATE_PIECE : ItemFood = new ItemFood("chocolate_piece", 1)
    var COCOA_BEAN_GROUND : Item = new Item("cocoa_bean_ground")
    var COCOA_BEAN_ROASTED : Item = new Item("cocoa_bean_roasted")
    var EGG_BOILED : ItemFood = new ItemFood("egg_boiled", 3)
    var FISH_STICK : ItemFood = new ItemFood("fish_stick", 6)
    var FISH_STICK_RAW : Item = new Item("fish_stick_raw")
    var FLOUR : Item = new Item("flour")
    var FRENCH_FRIES : ItemFood = new ItemFood("french_fries", 6)
    var FRENCH_FRIES_RAW : Item = new Item("french_fries_raw")
    var MILK_BOTTLE : ItemMilkBottle = new ItemMilkBottle
    var SANDWICH_CHICKEN : ItemFood = new ItemFood("sandwich_chicken", 5)
    var SANDWICH_FISH : ItemFood = new ItemFood("sandwich_fish", 5)
    var SANDWICH_PORKCHOP : ItemFood = new ItemFood("sandwich_porkchop", 5)
    var SANDWICH_SCHNITZEL : ItemFood = new ItemFood("sandwich_schnitzel", 5)
    var SCHNITZEL : ItemFood = new ItemFood("schnitzel", 4)
    var SCHNITZEL_RAW : Item = new Item("schnitzel_raw")
    var STRAWBERRY : ItemStrawberry = new ItemStrawberry
    var STRAWBERRY_CHOCOLATE : Item = new Item("strawberry_chocolate")
    var STRAWBERRY_CHOCOLATE_COATED : ItemFood = new ItemFood("strawberry_chocolate_coated", 8)
    
    def register() : Unit =
    {
        Registry.register(APPLE_CHOCOLATE)
        Registry.register(APPLE_CHOCOLATE_COATED)
        Registry.register(BREAD_DOUGH)
        Registry.register(BREAD_SLICE)
        Registry.register(CHOCOLATE)
        Registry.register(CHOCOLATE_DRINK)
        Registry.register(CHOCOLATE_PIECE)
        Registry.register(COCOA_BEAN_GROUND)
        Registry.register(COCOA_BEAN_ROASTED)
        Registry.register(EGG_BOILED)
        Registry.register(FISH_STICK)
        Registry.register(FISH_STICK_RAW)
        Registry.register(FLOUR)
        Registry.register(FRENCH_FRIES)
        Registry.register(FRENCH_FRIES_RAW)
        Registry.register(MILK_BOTTLE)
        Registry.register(SANDWICH_CHICKEN)
        Registry.register(SANDWICH_FISH)
        Registry.register(SANDWICH_PORKCHOP)
        Registry.register(SANDWICH_SCHNITZEL)
        Registry.register(SCHNITZEL)
        Registry.register(SCHNITZEL_RAW)
        Registry.register(STRAWBERRY)
        Registry.register(STRAWBERRY_CHOCOLATE)
        Registry.register(STRAWBERRY_CHOCOLATE_COATED)
    }
    
    def render() : Unit =
    {
        Registry.render(APPLE_CHOCOLATE)
        Registry.render(APPLE_CHOCOLATE_COATED)
        Registry.render(BREAD_DOUGH)
        Registry.render(BREAD_SLICE)
        Registry.render(CHOCOLATE)
        Registry.render(CHOCOLATE_DRINK)
        Registry.render(CHOCOLATE_PIECE)
        Registry.render(COCOA_BEAN_GROUND)
        Registry.render(COCOA_BEAN_ROASTED)
        Registry.render(EGG_BOILED)
        Registry.render(FISH_STICK)
        Registry.render(FISH_STICK_RAW)
        Registry.render(FLOUR)
        Registry.render(FRENCH_FRIES)
        Registry.render(FRENCH_FRIES_RAW)
        Registry.render(MILK_BOTTLE)
        Registry.render(SANDWICH_CHICKEN)
        Registry.render(SANDWICH_FISH)
        Registry.render(SANDWICH_PORKCHOP)
        Registry.render(SANDWICH_SCHNITZEL)
        Registry.render(SCHNITZEL)
        Registry.render(SCHNITZEL_RAW)
        Registry.render(STRAWBERRY)
        Registry.render(STRAWBERRY_CHOCOLATE)
        Registry.render(STRAWBERRY_CHOCOLATE_COATED)
    }
}
