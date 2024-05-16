package net.mcreator.survivalplus.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.survivalplus.block.model.AirPurefireBlockModel;
import net.mcreator.survivalplus.block.entity.AirPurefireTileEntity;

public class AirPurefireTileRenderer extends GeoBlockRenderer<AirPurefireTileEntity> {
	public AirPurefireTileRenderer() {
		super(new AirPurefireBlockModel());
	}

	@Override
	public RenderType getRenderType(AirPurefireTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
