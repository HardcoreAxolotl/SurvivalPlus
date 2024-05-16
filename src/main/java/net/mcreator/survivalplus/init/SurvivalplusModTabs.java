
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.survivalplus.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.survivalplus.SurvivalplusMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SurvivalplusModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SurvivalplusMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(SurvivalplusModItems.FUN_TIME_OUTSIDE.get());
			tabData.accept(SurvivalplusModItems.OLD_FUN_TIMES.get());
			tabData.accept(SurvivalplusModItems.THE_PIANIST.get());
			tabData.accept(SurvivalplusModItems.FUN_TIME.get());
			tabData.accept(SurvivalplusModItems.WAITING_OUTSIDE.get());
			tabData.accept(SurvivalplusModItems.WAITING_ROOM.get());
			tabData.accept(SurvivalplusModItems.CLASSICAL.get());
			tabData.accept(SurvivalplusModItems.CLASSICAL_2.get());
			tabData.accept(SurvivalplusModItems.RINGING_BELLS.get());
			tabData.accept(SurvivalplusModItems.HE_IS_GETTING_CLOSER.get());
			tabData.accept(SurvivalplusModItems.HE_IS_HERE.get());
		}
	}
}
