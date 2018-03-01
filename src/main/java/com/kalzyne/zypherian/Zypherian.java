package com.kalzyne.zypherian;

import com.kalzyne.zypherian.handler.RegistryHandler;
import com.kalzyne.zypherian.init.ItemInit;
import com.kalzyne.zypherian.proxy.CommonProxy;
import com.kalzyne.zypherian.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

//Basic Mod Information
@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME, version= Reference.VERSION)
public class Zypherian
{
    //Runs Instance of Mod in Forge Modloader
    @Instance
    public static Zypherian instance;

    //Sets up Creative Tab for Mod
    public static final CreativeTabs zypheriantab = new CreativeTabs("zypherian_tab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemInit.INFUSED_DIAMOND);
        }
    };

    //Assigns proper proxy for both client and server side
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    //PreInit, Init, and PostInit phases
    @EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
        RegistryHandler.otherRegistries();
    }
    @EventHandler
    public static void init(FMLInitializationEvent event) {}
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event){}
}
