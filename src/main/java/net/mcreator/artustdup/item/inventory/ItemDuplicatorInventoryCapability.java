package net.mcreator.artustdup.item.inventory;

import net.neoforged.neoforge.items.ComponentItemHandler;
import net.neoforged.neoforge.event.entity.item.ItemTossEvent;
import net.neoforged.neoforge.common.MutableDataComponentHolder;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.core.component.DataComponents;
import net.minecraft.client.Minecraft;

import net.mcreator.artustdup.init.ArtustdupModItems;
import net.mcreator.artustdup.client.gui.DuplicatorGUIScreen;

import javax.annotation.Nonnull;

@EventBusSubscriber(Dist.CLIENT)
public class ItemDuplicatorInventoryCapability extends ComponentItemHandler {
	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public static void onItemDropped(ItemTossEvent event) {
		if (event.getEntity().getItem().getItem() == ArtustdupModItems.ITEM_DUPLICATOR.get()) {
			if (Minecraft.getInstance().screen instanceof DuplicatorGUIScreen) {
				Minecraft.getInstance().player.closeContainer();
			}
		}
	}

	public ItemDuplicatorInventoryCapability(MutableDataComponentHolder parent) {
		super(parent, DataComponents.CONTAINER, 4);
	}

	@Override
	public int getSlotLimit(int slot) {
		return 64;
	}

	@Override
	public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
		return stack.getItem() != ArtustdupModItems.ITEM_DUPLICATOR.get();
	}

	@Override
	public ItemStack getStackInSlot(int slot) {
		return super.getStackInSlot(slot).copy();
	}
}
