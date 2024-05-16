
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.survivalplus.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.survivalplus.SurvivalplusMod;

public class SurvivalplusModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, SurvivalplusMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC1 = REGISTRY.register("music1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("survivalplus", "music1")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC2 = REGISTRY.register("music2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("survivalplus", "music2")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC3 = REGISTRY.register("music3", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("survivalplus", "music3")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC4 = REGISTRY.register("music4", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("survivalplus", "music4")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC5 = REGISTRY.register("music5", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("survivalplus", "music5")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC6 = REGISTRY.register("music6", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("survivalplus", "music6")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC7 = REGISTRY.register("music7", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("survivalplus", "music7")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC8 = REGISTRY.register("music8", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("survivalplus", "music8")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC9 = REGISTRY.register("music9", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("survivalplus", "music9")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC10 = REGISTRY.register("music10", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("survivalplus", "music10")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC11 = REGISTRY.register("music11", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("survivalplus", "music11")));
}
