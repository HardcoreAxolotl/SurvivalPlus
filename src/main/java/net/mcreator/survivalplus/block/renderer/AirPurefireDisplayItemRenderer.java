package net.mcreator.survivalplus.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.survivalplus.block.model.AirPurefireDisplayModel;
import net.mcreator.survivalplus.block.display.AirPurefireDisplayItem;

public class AirPurefireDisplayItemRenderer extends GeoItemRenderer<AirPurefireDisplayItem> {
	public AirPurefireDisplayItemRenderer() {
		super(new AirPurefireDisplayModel());
	}

	@Override
	public RenderType getRenderType(AirPurefireDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
