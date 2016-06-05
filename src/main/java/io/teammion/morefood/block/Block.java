package io.teammion.morefood.block;

import io.teammion.morefood.Registry;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

/**
 * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 05.06.16.
 */
public class Block extends net.minecraft.block.Block
{
    public Block(String name, Material blockMaterialIn, MapColor blockMapColorIn)
    {
        super(blockMaterialIn, blockMapColorIn);
        
        setUnlocalizedName(name);

        Registry.register(this);
    }
    
    public Block(String name, Material materialIn)
    {
        super(materialIn);
        
        setUnlocalizedName(name);

        Registry.register(this);
    }
}
