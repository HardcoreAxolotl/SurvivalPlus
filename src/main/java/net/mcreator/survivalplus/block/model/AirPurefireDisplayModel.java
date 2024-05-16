package net.mcreator.survivalplus.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.survivalplus.block.display.AirPurefireDisplayItem;

public class AirPurefireDisplayModel extends GeoModel<AirPurefireDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AirPurefireDisplayItem animatable) {
		return new ResourceLocation("survivalplus", "animations/purefire.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AirPurefireDisplayItem animatable) {
		return new ResourceLocation("survivalplus", "geo/purefire.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AirPurefireDisplayItem entity) {
		return new ResourceLocation("survivalplus", "textures/block/texture.png");
	}
}
