
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.survivalplus.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.survivalplus.client.gui.AirPurefierGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SurvivalplusModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(SurvivalplusModMenus.AIR_PUREFIER_GUI.get(), AirPurefierGUIScreen::new);
	}
}
