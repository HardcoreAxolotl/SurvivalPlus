package net.mcreator.survivalplus.init;

import net.neoforged.fml.event.lifecycle.InterModEnqueueEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SurvivalplusModCuriosSlots {
	@SubscribeEvent
	public static void enqueueIMC(final InterModEnqueueEvent event) {
	}
}
