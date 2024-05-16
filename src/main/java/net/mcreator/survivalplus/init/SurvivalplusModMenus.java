
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.survivalplus.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.survivalplus.world.inventory.AirPurefierGUIMenu;
import net.mcreator.survivalplus.SurvivalplusMod;

public class SurvivalplusModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, SurvivalplusMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<AirPurefierGUIMenu>> AIR_PUREFIER_GUI = REGISTRY.register("air_purefier_gui", () -> IMenuTypeExtension.create(AirPurefierGUIMenu::new));
}
