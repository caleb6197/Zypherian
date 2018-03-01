package com.kalzyne.zypherian.init;

import com.kalzyne.zypherian.objects.armor.ArmorBase;
import com.kalzyne.zypherian.objects.items.ItemBase;
import com.kalzyne.zypherian.objects.tools.*;
import com.kalzyne.zypherian.reference.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

//Base Item Initilization
public class ItemInit
{
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //MATERIAL
    public static final Item.ToolMaterial DIAMOND_INFUSED_TOOL = EnumHelper.addToolMaterial("tool_diamond_infused",3, 2030, 20.0F, 5.5F, 12);
    public static final ItemArmor.ArmorMaterial DIAMOND_INFUSED_ARMOR = EnumHelper.addArmorMaterial("armor_diamond_infused",Reference.MOD_ID + ":diamond_infused",40, new int[]{5, 8, 8, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

    //ITEMS
    public static final Item INFUSED_DUST = new ItemBase("dust_infused");
    public static final Item INFUSED_DIAMOND = new ItemBase("diamond_infused");
    //TOOLS
    public static final Item INFUSED_DIAMOND_AXE = new ToolAxe("axe_diamond_infused", DIAMOND_INFUSED_TOOL);
    public static final Item INFUSED_DIAMOND_HOE = new ToolHoe("hoe_diamond_infused", DIAMOND_INFUSED_TOOL);
    public static final Item INFUSED_DIAMOND_PICKAXE = new ToolPickaxe("pickaxe_diamond_infused", DIAMOND_INFUSED_TOOL);
    public static final Item INFUSED_DIAMOND_SHOVEL = new ToolShovel("shovel_diamond_infused", DIAMOND_INFUSED_TOOL);
    public static final Item INFUSED_DIAMOND_SWORD = new ToolSword("sword_diamond_infused", DIAMOND_INFUSED_TOOL);
    //ARMOR
    public static final Item INFUSED_DIAMOND_HELMET = new ArmorBase("helmet_diamond_infused", DIAMOND_INFUSED_ARMOR, 1, EntityEquipmentSlot.HEAD);
    public static final Item INFUSED_DIAMOND_CHESTPLATE = new ArmorBase("chestplate_diamond_infused", DIAMOND_INFUSED_ARMOR, 1, EntityEquipmentSlot.CHEST);
    public static final Item INFUSED_DIAMOND_LEGGINGS = new ArmorBase("leggings_diamond_infused", DIAMOND_INFUSED_ARMOR, 2, EntityEquipmentSlot.LEGS);
    public static final Item INFUSED_DIAMOND_BOOTS = new ArmorBase("boots_diamond_infused", DIAMOND_INFUSED_ARMOR, 1, EntityEquipmentSlot.FEET);
}
