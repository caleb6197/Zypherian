package com.kalzyne.zypherian.objects.armor;

import com.kalzyne.zypherian.Zypherian;
import com.kalzyne.zypherian.init.ItemInit;
import com.kalzyne.zypherian.utility.IHasModel;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel
{
    public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Zypherian.zypheriantab);

        ItemInit.ITEMS.add(this);
    }
    @Override
    public void registerModels()
    {
        Zypherian.proxy.registerItemRenderer(this,0, "inventory");
    }
}

