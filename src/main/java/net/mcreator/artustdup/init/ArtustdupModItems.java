
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.artustdup.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Item;

import net.mcreator.artustdup.item.inventory.ItemDuplicatorInventoryCapability;
import net.mcreator.artustdup.item.ItemDuplicatorItem;
import net.mcreator.artustdup.ArtustdupMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class ArtustdupModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ArtustdupMod.MODID);
	public static final DeferredItem<Item> ITEM_DUPLICATOR = REGISTRY.register("item_duplicator", ItemDuplicatorItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.ItemHandler.ITEM, (stack, context) -> new ItemDuplicatorInventoryCapability(stack), ITEM_DUPLICATOR.get());
	}
}
