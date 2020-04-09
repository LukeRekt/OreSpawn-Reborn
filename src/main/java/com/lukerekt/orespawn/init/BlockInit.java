package com.lukerekt.orespawn.init;

import com.lukerekt.orespawn.OreSpawn;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(OreSpawn.MOD_ID)
@Mod.EventBusSubscriber(modid = OreSpawn.MOD_ID, bus = Bus.MOD)
public class BlockInit 
{
   public static final Block minerio_ametista = null;

   
   @SubscribeEvent
   public static void registerBlocks(final RegistryEvent.Register<Block> event) 
   {
	   event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(0.7f, 15).sound(SoundType.STONE)).setRegistryName("minerio_ametista"));
	   
   }
   
   @SubscribeEvent
   public static void registerBlockItems(final RegistryEvent.Register<Item> event) 
   {
	   event.getRegistry().register(new BlockItem(minerio_ametista, new Item.Properties().maxStackSize(16)).setRegistryName("minerio_ametista"));
   }
}
