package io.teammion.morefood

import java.util.Random

import net.minecraft.entity.item.EntityItem
import net.minecraft.item.ItemStack
import net.minecraft.world.World
import net.minecraftforge.event.entity.living.LivingDropsEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent

/**
  * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 24.07.16.
  */
class EventHandler
{
    @SubscribeEvent
    def onDrop(e : LivingDropsEvent) : Unit =
    {
        val world : World = e.getEntity.worldObj
        
        if (!world.isRemote)
            world.spawnEntityInWorld(new EntityItem(
                world, e.getEntity.posX, e.getEntity.posY, e.getEntity.posZ,
                new ItemStack(Items.STRAWBERRY, new Random().nextInt(2))
            ))
    }
}
