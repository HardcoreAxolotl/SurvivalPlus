
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.survivalplus.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.item.Item;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.survivalplus.item.WaitingRoomItem;
import net.mcreator.survivalplus.item.WaitingOutsideItem;
import net.mcreator.survivalplus.item.ThePianistItem;
import net.mcreator.survivalplus.item.RingingBellsItem;
import net.mcreator.survivalplus.item.OldFunTimesItem;
import net.mcreator.survivalplus.item.HeIsHereItem;
import net.mcreator.survivalplus.item.HeIsGettingCloserItem;
import net.mcreator.survivalplus.item.FunTimeOutsideItem;
import net.mcreator.survivalplus.item.FunTimeItem;
import net.mcreator.survivalplus.item.ClassicalItem;
import net.mcreator.survivalplus.item.Classical2Item;
import net.mcreator.survivalplus.SurvivalplusMod;

public class SurvivalplusModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, SurvivalplusMod.MODID);
	public static final DeferredHolder<Item, Item> OLD_FUN_TIMES = REGISTRY.register("old_fun_times", () -> new OldFunTimesItem());
	public static final DeferredHolder<Item, Item> FUN_TIME_OUTSIDE = REGISTRY.register("fun_time_outside", () -> new FunTimeOutsideItem());
	public static final DeferredHolder<Item, Item> THE_PIANIST = REGISTRY.register("the_pianist", () -> new ThePianistItem());
	public static final DeferredHolder<Item, Item> FUN_TIME = REGISTRY.register("fun_time", () -> new FunTimeItem());
	public static final DeferredHolder<Item, Item> WAITING_OUTSIDE = REGISTRY.register("waiting_outside", () -> new WaitingOutsideItem());
	public static final DeferredHolder<Item, Item> WAITING_ROOM = REGISTRY.register("waiting_room", () -> new WaitingRoomItem());
	public static final DeferredHolder<Item, Item> CLASSICAL = REGISTRY.register("classical", () -> new ClassicalItem());
	public static final DeferredHolder<Item, Item> CLASSICAL_2 = REGISTRY.register("classical_2", () -> new Classical2Item());
	public static final DeferredHolder<Item, Item> RINGING_BELLS = REGISTRY.register("ringing_bells", () -> new RingingBellsItem());
	public static final DeferredHolder<Item, Item> HE_IS_GETTING_CLOSER = REGISTRY.register("he_is_getting_closer", () -> new HeIsGettingCloserItem());
	public static final DeferredHolder<Item, Item> HE_IS_HERE = REGISTRY.register("he_is_here", () -> new HeIsHereItem());

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}
}
