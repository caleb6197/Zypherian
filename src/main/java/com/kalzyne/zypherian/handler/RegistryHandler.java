package com.kalzyne.zypherian.handler;

import com.kalzyne.zypherian.gen.OreGen;
import com.kalzyne.zypherian.init.BlockInit;
import com.kalzyne.zypherian.init.ItemInit;
import com.kalzyne.zypherian.utility.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

//Registry of Blocks and Items
@EventBusSubscriber
public class RegistryHandler
{
    //Registers all Items in the called array
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    //Registers all Blocks in the called array
    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }

    //Registers Models that use IHasModel interface
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event)
    {
        for(Item item : ItemInit.ITEMS)
        {
            if(item instanceof IHasModel)
            {
                ((IHasModel)item).registerModels();
            }
        }
        for(Block block : BlockInit.BLOCKS)
        {
            if(block instanceof IHasModel)
            {
                ((IHasModel)block).registerModels();
            }
        }
    }

    public static void otherRegistries()
    {
        GameRegistry.registerWorldGenerator(new OreGen(), 0);
    }
}
