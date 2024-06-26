
package net.mcreator.survivalplus.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public class WaitingOutsideItem extends RecordItem {
	public WaitingOutsideItem() {
		super(3, () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("survivalplus:music5")), new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON), 72000);
	}
}
