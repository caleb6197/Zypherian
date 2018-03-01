package com.kalzyne.zypherian.init;

import com.kalzyne.zypherian.objects.blocks.BlockOres;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

//Basic Block Initilization
public class BlockInit
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
    public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether");
    public static final Block ORE_END = new BlockOres("ore_end", "end");
}
