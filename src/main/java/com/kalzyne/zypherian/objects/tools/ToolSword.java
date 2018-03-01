package com.kalzyne.zypherian.objects.tools;

import com.kalzyne.zypherian.Zypherian;
import com.kalzyne.zypherian.init.ItemInit;
import com.kalzyne.zypherian.utility.IHasModel;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel
{
    public ToolSword(String name, ToolMaterial material)
    {
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
