package com.kalzyne.zypherian.objects.tools;

import com.kalzyne.zypherian.Zypherian;
import com.kalzyne.zypherian.init.ItemInit;
import com.kalzyne.zypherian.utility.IHasModel;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ToolPickaxe extends ItemPickaxe implements IHasModel
{
    public ToolPickaxe(String name, ToolMaterial material){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Zypherian.zypheriantab);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        Zypherian.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
