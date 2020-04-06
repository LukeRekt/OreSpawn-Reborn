package com.lukerekt.orespawn.init;

import java.util.function.Supplier;

import com.lukerekt.orespawn.OreSpawn;

import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;;



@Mod.EventBusSubscriber(modid = OreSpawn.MOD_ID, bus = Bus.MOD)
@ObjectHolder(OreSpawn.MOD_ID)
public class ItemInit {
	//@ObjectHolder(OreSpawn.MOD_ID + "teste_item")
	
	//criacao
	public static final Item ametista = null;
	
	//Ferramentas
	
	//ametista
	public static final Item espada_ametista = null;
	public static final Item picareta_ametista = null;
	public static final Item pa_ametista = null;
	public static final Item enxada_ametista = null;
	
	//ruby
	public static final Item espada_ruby = null;
	
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
	event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("ametista"));
	
	
	//Ferramentas
	
	//ametista
		event.getRegistry().register(new SwordItem(ModItemTier.ESPADA_AMETISTA, 7, 5.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("espada_ametista"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.ESPADA_AMETISTA, 4, 5.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("picareta_ametista"));
		event.getRegistry().register(new ShovelItem(ModItemTier.ESPADA_AMETISTA, 2, 5.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("pa_ametista"));
		event.getRegistry().register(new AxeItem(ModItemTier.ESPADA_AMETISTA, 11, 5.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("machado_ametista"));
		event.getRegistry().register(new HoeItem(ModItemTier.ESPADA_AMETISTA, 5.0f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("enxada_ametista"));
		
		//ruby
	event.getRegistry().register(new SwordItem(ModItemTier.ESPADA_AMETISTA, 8, 5.0F, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("espada_ruby"));
	
	}
	
	public enum ModItemTier implements IItemTier{
		ESPADA_AMETISTA(4, 1500, 15.0F, 7.0F, 250, () -> {
			return Ingredient.fromItems(ItemInit.ametista);
		});
		
		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial;
		
		private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.attackDamage = attackDamage;
			this.enchantability = enchantability;
			this.repairMaterial = new LazyValue<>(repairMaterial);
			
	}

		@Override
		public int getMaxUses() {
			// TODO Auto-generated method stub
			return this.maxUses;
		}

		@Override
		public float getEfficiency() {
			// TODO Auto-generated method stub
			return this.efficiency;
		}

		@Override
		public float getAttackDamage() {
			// TODO Auto-generated method stub
			return this.attackDamage;
		}

		@Override
		public int getHarvestLevel() {
			// TODO Auto-generated method stub
			return this.harvestLevel;
		}

		@Override
		public int getEnchantability() {
			// TODO Auto-generated method stub
			return this.enchantability;
		}

		@Override
		public Ingredient getRepairMaterial() {
			// TODO Auto-generated method stub
			return this.repairMaterial.getValue();
		}
   }
}
