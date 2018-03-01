package com.kalzyne.zypherian.proxy;

import net.minecraft.item.Item;

//Common Proxy setting up Item Rendering
public class CommonProxy implements IProxy
{
    //Registering Item Renderer
    public void registerItemRenderer(Item item, int meta, String id){}
    public void registerVariantRenderer(Item item, int meta, String filename, String id){}
}
