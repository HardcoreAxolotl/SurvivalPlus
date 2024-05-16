
package net.mcreator.survivalplus.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CreativeAmulateItem extends Item implements ICurioItem {
	public CreativeAmulateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
