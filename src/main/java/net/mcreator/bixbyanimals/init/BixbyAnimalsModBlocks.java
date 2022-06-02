
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bixbyanimals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.bixbyanimals.block.ExoticaOreBlock;
import net.mcreator.bixbyanimals.block.ExoticaBlockBlock;
import net.mcreator.bixbyanimals.block.ExoticWoodWoodBlock;
import net.mcreator.bixbyanimals.block.ExoticWoodStairsBlock;
import net.mcreator.bixbyanimals.block.ExoticWoodSlabBlock;
import net.mcreator.bixbyanimals.block.ExoticWoodPressurePlateBlock;
import net.mcreator.bixbyanimals.block.ExoticWoodPlanksBlock;
import net.mcreator.bixbyanimals.block.ExoticWoodLogBlock;
import net.mcreator.bixbyanimals.block.ExoticWoodLeavesBlock;
import net.mcreator.bixbyanimals.block.ExoticWoodFenceGateBlock;
import net.mcreator.bixbyanimals.block.ExoticWoodFenceBlock;
import net.mcreator.bixbyanimals.block.ExoticWoodButtonBlock;
import net.mcreator.bixbyanimals.block.ExocticaPortalBlock;
import net.mcreator.bixbyanimals.BixbyAnimalsMod;

public class BixbyAnimalsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BixbyAnimalsMod.MODID);
	public static final RegistryObject<Block> EXOCTICA_PORTAL = REGISTRY.register("exoctica_portal", () -> new ExocticaPortalBlock());
	public static final RegistryObject<Block> EXOTICA_ORE = REGISTRY.register("exotica_ore", () -> new ExoticaOreBlock());
	public static final RegistryObject<Block> EXOTICA_BLOCK = REGISTRY.register("exotica_block", () -> new ExoticaBlockBlock());
	public static final RegistryObject<Block> EXOTIC_WOOD_WOOD = REGISTRY.register("exotic_wood_wood", () -> new ExoticWoodWoodBlock());
	public static final RegistryObject<Block> EXOTIC_WOOD_LOG = REGISTRY.register("exotic_wood_log", () -> new ExoticWoodLogBlock());
	public static final RegistryObject<Block> EXOTIC_WOOD_PLANKS = REGISTRY.register("exotic_wood_planks", () -> new ExoticWoodPlanksBlock());
	public static final RegistryObject<Block> EXOTIC_WOOD_LEAVES = REGISTRY.register("exotic_wood_leaves", () -> new ExoticWoodLeavesBlock());
	public static final RegistryObject<Block> EXOTIC_WOOD_STAIRS = REGISTRY.register("exotic_wood_stairs", () -> new ExoticWoodStairsBlock());
	public static final RegistryObject<Block> EXOTIC_WOOD_SLAB = REGISTRY.register("exotic_wood_slab", () -> new ExoticWoodSlabBlock());
	public static final RegistryObject<Block> EXOTIC_WOOD_FENCE = REGISTRY.register("exotic_wood_fence", () -> new ExoticWoodFenceBlock());
	public static final RegistryObject<Block> EXOTIC_WOOD_FENCE_GATE = REGISTRY.register("exotic_wood_fence_gate",
			() -> new ExoticWoodFenceGateBlock());
	public static final RegistryObject<Block> EXOTIC_WOOD_PRESSURE_PLATE = REGISTRY.register("exotic_wood_pressure_plate",
			() -> new ExoticWoodPressurePlateBlock());
	public static final RegistryObject<Block> EXOTIC_WOOD_BUTTON = REGISTRY.register("exotic_wood_button", () -> new ExoticWoodButtonBlock());
}
