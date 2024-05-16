package net.mcreator.survivalplus.block.listener;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.entity.BlockEntityType;

import net.mcreator.survivalplus.init.SurvivalplusModBlockEntities;
import net.mcreator.survivalplus.block.renderer.AirPurefireTileRenderer;
import net.mcreator.survivalplus.block.entity.AirPurefireTileEntity;
import net.mcreator.survivalplus.SurvivalplusMod;

@Mod.EventBusSubscriber(modid = SurvivalplusMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer((BlockEntityType<AirPurefireTileEntity>) SurvivalplusModBlockEntities.AIR_PUREFIRE.get(), context -> new AirPurefireTileRenderer());
	}
}
