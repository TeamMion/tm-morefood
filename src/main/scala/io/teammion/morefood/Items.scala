/*
 * Copyright (c) 2016, Team Mion
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package io.teammion.morefood

import io.teammion.morefood.item._
import net.minecraft

/**
  * Items (divided into Minecraft imports and Mod items, sorted alphabetically by name)
  *
  * @author Stefan Wimmer <stefanwimmer128@gmail.com>
  */
object Items
{
    /* Minecraft items */
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
    
    /* Mod items */
    val APPLE_CHOCOLATE : Item = new Item("apple_chocolate")
    val APPLE_CHOCOLATE_COATED : ItemFood = new ItemFood("apple_chocolate_coated", 8)
    val BREAD_DOUGH : Item = new Item("bread_dough")
    val BREAD_SLICE : Item = new Item("bread_slice")
    val CHOCOLATE : ItemFood = new ItemFood("chocolate", 8)
    val CHOCOLATE_DRINK : ItemDrink = new ItemDrink("chocolate_drink", 4)
    val CHOCOLATE_PIECE : ItemFood = new ItemFood("chocolate_piece", 1)
    val COCOA_BEAN_GROUND : Item = new Item("cocoa_bean_ground")
    val COCOA_BEAN_ROASTED : Item = new Item("cocoa_bean_roasted")
    val EGG_BOILED : ItemFood = new ItemFood("egg_boiled", 3)
    val FISH_STICK : ItemFood = new ItemFood("fish_stick", 6)
    val FISH_STICK_RAW : Item = new Item("fish_stick_raw")
    val FLOUR : Item = new Item("flour")
    val FRENCH_FRIES : ItemFood = new ItemFood("french_fries", 6)
    val FRENCH_FRIES_RAW : Item = new Item("french_fries_raw")
    val MILK_BOTTLE : ItemMilkBottle = new ItemMilkBottle
    val SANDWICH_CHICKEN : ItemFood = new ItemFood("sandwich_chicken", 5)
    val SANDWICH_FISH : ItemFood = new ItemFood("sandwich_fish", 5)
    val SANDWICH_PORKCHOP : ItemFood = new ItemFood("sandwich_porkchop", 5)
    val SANDWICH_SCHNITZEL : ItemFood = new ItemFood("sandwich_schnitzel", 5)
    val SCHNITZEL : ItemFood = new ItemFood("schnitzel", 4)
    val SCHNITZEL_RAW : Item = new Item("schnitzel_raw")
    val STRAWBERRY : ItemStrawberry = new ItemStrawberry
    val STRAWBERRY_CHOCOLATE : Item = new Item("strawberry_chocolate")
    val STRAWBERRY_CHOCOLATE_COATED : ItemFood = new ItemFood("strawberry_chocolate_coated", 8)

    /**
      * Register items
      */
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

    /**
      * Register render
      */
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
