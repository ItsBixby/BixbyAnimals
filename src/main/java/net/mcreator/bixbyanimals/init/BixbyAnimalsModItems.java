
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bixbyanimals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.bixbyanimals.item.ExoticaSwordItem;
import net.mcreator.bixbyanimals.item.ExoticaShovelItem;
import net.mcreator.bixbyanimals.item.ExoticaPickaxeItem;
import net.mcreator.bixbyanimals.item.ExoticaIngotItem;
import net.mcreator.bixbyanimals.item.ExoticaHoeItem;
import net.mcreator.bixbyanimals.item.ExoticaAxeItem;
import net.mcreator.bixbyanimals.item.ExoticaArmorArmorItem;
import net.mcreator.bixbyanimals.item.ExocticaItem;
import net.mcreator.bixbyanimals.BixbyAnimalsMod;

public class BixbyAnimalsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BixbyAnimalsMod.MODID);
	public static final RegistryObject<Item> FENNEC = REGISTRY.register("fennec_spawn_egg",
			() -> new ForgeSpawnEggItem(BixbyAnimalsModEntities.FENNEC, -3368449, -1,
					new Item.Properties().tab(BixbyAnimalsModTabs.TAB_BIXBY_ANIMALS)));
	public static final RegistryObject<Item> EXOTICA_INGOT = REGISTRY.register("exotica_ingot", () -> new ExoticaIngotItem());
	public static final RegistryObject<Item> EXOCTICA = REGISTRY.register("exoctica", () -> new ExocticaItem());
	public static final RegistryObject<Item> EXOTICA_ORE = block(BixbyAnimalsModBlocks.EXOTICA_ORE, BixbyAnimalsModTabs.TAB_BIXBY_ANIMALS);
	public static final RegistryObject<Item> EXOTICA_BLOCK = block(BixbyAnimalsModBlocks.EXOTICA_BLOCK, BixbyAnimalsModTabs.TAB_BIXBY_ANIMALS);
	public static final RegistryObject<Item> EXOTIC_WOOD_WOOD = block(BixbyAnimalsModBlocks.EXOTIC_WOOD_WOOD, BixbyAnimalsModTabs.TAB_BIXBY_ANIMALS);
	public static final RegistryObject<Item> EXOTIC_WOOD_LOG = block(BixbyAnimalsModBlocks.EXOTIC_WOOD_LOG, BixbyAnimalsModTabs.TAB_BIXBY_ANIMALS);
	public static final RegistryObject<Item> EXOTIC_WOOD_PLANKS = block(BixbyAnimalsModBlocks.EXOTIC_WOOD_PLANKS,
			BixbyAnimalsModTabs.TAB_BIXBY_ANIMALS);
	public static final RegistryObject<Item> EXOTIC_WOOD_LEAVES = block(BixbyAnimalsModBlocks.EXOTIC_WOOD_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> EXOTIC_WOOD_STAIRS = block(BixbyAnimalsModBlocks.EXOTIC_WOOD_STAIRS,
			BixbyAnimalsModTabs.TAB_BIXBY_ANIMALS);
	public static final RegistryObject<Item> EXOTIC_WOOD_SLAB = block(BixbyAnimalsModBlocks.EXOTIC_WOOD_SLAB, BixbyAnimalsModTabs.TAB_BIXBY_ANIMALS);
	public static final RegistryObject<Item> EXOTIC_WOOD_FENCE = block(BixbyAnimalsModBlocks.EXOTIC_WOOD_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> EXOTIC_WOOD_FENCE_GATE = block(BixbyAnimalsModBlocks.EXOTIC_WOOD_FENCE_GATE,
			CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> EXOTIC_WOOD_PRESSURE_PLATE = block(BixbyAnimalsModBlocks.EXOTIC_WOOD_PRESSURE_PLATE,
			CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> EXOTIC_WOOD_BUTTON = block(BixbyAnimalsModBlocks.EXOTIC_WOOD_BUTTON,
			BixbyAnimalsModTabs.TAB_BIXBY_ANIMALS);
	public static final RegistryObject<Item> EXOTICA_ARMOR_ARMOR_HELMET = REGISTRY.register("exotica_armor_armor_helmet",
			() -> new ExoticaArmorArmorItem.Helmet());
	public static final RegistryObject<Item> EXOTICA_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("exotica_armor_armor_chestplate",
			() -> new ExoticaArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> EXOTICA_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("exotica_armor_armor_leggings",
			() -> new ExoticaArmorArmorItem.Leggings());
	public static final RegistryObject<Item> EXOTICA_ARMOR_ARMOR_BOOTS = REGISTRY.register("exotica_armor_armor_boots",
			() -> new ExoticaArmorArmorItem.Boots());
	public static final RegistryObject<Item> EXOTICA_PICKAXE = REGISTRY.register("exotica_pickaxe", () -> new ExoticaPickaxeItem());
	public static final RegistryObject<Item> EXOTICA_AXE = REGISTRY.register("exotica_axe", () -> new ExoticaAxeItem());
	public static final RegistryObject<Item> EXOTICA_SWORD = REGISTRY.register("exotica_sword", () -> new ExoticaSwordItem());
	public static final RegistryObject<Item> EXOTICA_SHOVEL = REGISTRY.register("exotica_shovel", () -> new ExoticaShovelItem());
	public static final RegistryObject<Item> EXOTICA_HOE = REGISTRY.register("exotica_hoe", () -> new ExoticaHoeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
