package net.mcreator.survivalplus.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.survivalplus.block.entity.AirPurefireTileEntity;

public class AirPurefireBlockModel extends GeoModel<AirPurefireTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AirPurefireTileEntity animatable) {
		return new ResourceLocation("survivalplus", "animations/purefire.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AirPurefireTileEntity animatable) {
		return new ResourceLocation("survivalplus", "geo/purefire.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AirPurefireTileEntity animatable) {
		return new ResourceLocation("survivalplus", "textures/block/texture.png");
	}
}
