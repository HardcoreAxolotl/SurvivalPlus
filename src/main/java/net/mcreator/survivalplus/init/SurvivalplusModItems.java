
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.survivalplus.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.item.Item;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.survivalplus.item.CreativeAmulateItem;
import net.mcreator.survivalplus.SurvivalplusMod;

public class SurvivalplusModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, SurvivalplusMod.MODID);
	public static final DeferredHolder<Item, Item> CREATIVE_AMULATE = REGISTRY.register("creative_amulate", () -> new CreativeAmulateItem());

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}
}
