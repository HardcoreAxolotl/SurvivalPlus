package net.mcreator.survivalplus.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.network.chat.Component;

import java.util.function.Supplier;
import java.util.Map;

public class AirPurefireOnBlockRightClickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double i = 0;
		if (entity.isShiftKeyDown()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.REDSTONE_BLOCK.asItem()) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("The Purefire Has Activated"), true);
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("There is No Fuel In the Purefire"), true);
			}
			while ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.REDSTONE_BLOCK.asItem()) {
				if (0 >= i) {
					i = 100;
				} else {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(0)).getItem();
						if (stack != null) {
							if (stack.hurt(1, RandomSource.create(), null)) {
								stack.shrink(1);
								stack.setDamageValue(0);
							}
							_player.containerMenu.broadcastChanges();
						}
					}
				}
			}
		}
	}
}
