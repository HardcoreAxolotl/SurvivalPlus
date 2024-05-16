
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.survivalplus.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.survivalplus.block.entity.AirPurefireTileEntity;
import net.mcreator.survivalplus.SurvivalplusMod;

public class SurvivalplusModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, SurvivalplusMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> AIR_PUREFIRE = register("air_purefire", SurvivalplusModBlocks.AIR_PUREFIRE, AirPurefireTileEntity::new);

	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
