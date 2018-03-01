package com.kalzyne.zypherian.objects.blocks;

import com.kalzyne.zypherian.Zypherian;
import com.kalzyne.zypherian.init.BlockInit;
import com.kalzyne.zypherian.init.ItemInit;
import com.kalzyne.zypherian.utility.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

//Base class for all basic blocks in mod
public class BlockBase extends Block implements IHasModel
{
    //sets defaults for all blocks put under BlockBase class
    public BlockBase(String name, Material material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Zypherian.zypheriantab);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    //allows rendering of Basic Blocks under BlockBase class
    @Override
    public void registerModels()
    {
        Zypherian.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}