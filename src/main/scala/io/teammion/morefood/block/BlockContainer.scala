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

package io.teammion.morefood.block

import io.teammion.morefood.CreativeTabs
import net.minecraft.block
import net.minecraft.block.material.Material
import net.minecraft.item.ItemStack
import net.minecraft.tileentity.TileEntity
import net.minecraft.world.World

/**
  * Created on 06.08.16 at 09:16
  *
  * @author Stefan Wimmer <stefanwimmer128@gmail.com>
  */
class BlockContainer(name : String, material : Material, tileEntityClass : Class[_ <: TileEntity])
    extends block.BlockContainer(material)
{
    setRegistryName(name)
    setUnlocalizedName(name)
    
    setCreativeTab(CreativeTabs.BLOCK)

    override def createNewTileEntity(worldIn : World, meta : Int) : TileEntity =
        tileEntityClass.newInstance()
    
    /**
      * Returns an ItemStack with specified stackSize
      * @param stackSize stackSize of ItemStack. Default: 1
      * @return ItemStack with specified stackSize
      */
    def stack(stackSize : Int = 1) : ItemStack =
        new ItemStack(this, stackSize)
    
    /**
      * Returns an ItemStack with stackSize = 1
      * @return ItemStack with specified stackSize
      */
    def stack : ItemStack =
        stack(1)
}
