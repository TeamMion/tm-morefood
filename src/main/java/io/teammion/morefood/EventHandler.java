package io.teammion.morefood;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

/**
 * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 02.07.16.
 */
public class EventHandler
{
    @SubscribeEvent
    public void onDrop(LivingDropsEvent e)
    {
        World world = e.getEntity().worldObj;
        
        if (! world.isRemote)
        {
            world.spawnEntityInWorld(new EntityItem(
                    world,
                    e.getEntity().posX,
                    e.getEntity().posY,
                    e.getEntity().posZ,
                    new ItemStack(Items.STRAWBERRY, new Random().nextInt(3))
            ));
        }
    }
}
