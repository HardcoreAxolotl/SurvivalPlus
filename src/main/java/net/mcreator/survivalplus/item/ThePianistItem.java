
package net.mcreator.survivalplus.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public class ThePianistItem extends RecordItem {
	public ThePianistItem() {
		super(2, () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("survivalplus:music3")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 72000);
	}
}
