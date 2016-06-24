package io.teammion.morefood;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 05.06.16.
 */
public class Registry extends GameRegistry
{
    public static void render(Item item)
    {
        render(item, 0, item.getUnlocalizedName().substring(5));
    }
    
    public static void render(Item item, int meta, String modelResourceLocation)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
                item, meta, new ModelResourceLocation(
                        "morefood:" + modelResourceLocation, "inventory"
                )
        );
    }
    
    public static void addSmelting(Item item, ItemStack stack)
    {
        addSmelting(item, stack, .8f);
    }
    
    public static void addSmelting(ItemStack stack0, ItemStack stack1)
    {
        addSmelting(stack0, stack1, .8f);
    }
    
    public static void addSmelting(Block item, ItemStack stack)
    {
        addSmelting(item, stack, .8f);
    }
}
