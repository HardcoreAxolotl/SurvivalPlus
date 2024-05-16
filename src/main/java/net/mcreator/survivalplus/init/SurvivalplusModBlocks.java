
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.survivalplus.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.survivalplus.block.OakHouseBuilderBlock;
import net.mcreator.survivalplus.block.AirPurefireBlock;
import net.mcreator.survivalplus.SurvivalplusMod;

public class SurvivalplusModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK, SurvivalplusMod.MODID);
	public static final DeferredHolder<Block, Block> OAK_HOUSE_BUILDER = REGISTRY.register("oak_house_builder", () -> new OakHouseBuilderBlock());
	public static final DeferredHolder<Block, Block> AIR_PUREFIRE = REGISTRY.register("air_purefire", () -> new AirPurefireBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
