package io.teammion.morefood

import net.minecraft.client.Minecraft
import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.item.{Item, ItemStack}
import net.minecraftforge.fml.common.registry.GameRegistry

/**
  * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 24.07.16.
  */
object Registry
{
    def register(item : Item) : Unit =
        GameRegistry.register(item)
    
    def render(item : Item, meta : Int = 0, name : String = null) : Unit =
        Minecraft.getMinecraft.getRenderItem.getItemModelMesher.register(
            item, meta, new ModelResourceLocation(
                "tm-morefood:" + Option(name).getOrElse(item.getUnlocalizedName.substring(5)), "inventory"
            )
        )
    
    def addSmelting(in : Item, out : ItemStack) =
        GameRegistry.addSmelting(in, out, .2f)
    
    def addSmelting(in : ItemStack, out : ItemStack) =
        GameRegistry.addSmelting(in, out, .2f)
    
    def addShapelessRecipe(out : ItemStack, params : AnyRef*) : Unit =
        GameRegistry.addShapelessRecipe(out, params)
    
    def addShapedRecipe(out : ItemStack, params : AnyRef*) =
        GameRegistry.addShapedRecipe(out, params)
}
