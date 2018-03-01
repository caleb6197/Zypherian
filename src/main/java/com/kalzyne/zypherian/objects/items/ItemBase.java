package com.kalzyne.zypherian.objects.items;

import com.kalzyne.zypherian.Zypherian;
import com.kalzyne.zypherian.init.ItemInit;
import com.kalzyne.zypherian.utility.IHasModel;
import net.minecraft.item.Item;

//Base class for all basic items in mod
public class ItemBase extends Item implements IHasModel
{
    //sets defaults for all items put under ItemBase class
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Zypherian.zypheriantab);

        ItemInit.ITEMS.add(this);
    }

    //allows rendering of Basic Items under ItemBase class
    @Override
    public void registerModels()
    {
        Zypherian.proxy.registerItemRenderer(this,0, "inventory");
    }
}
