
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.artustdup.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.artustdup.client.gui.DuplicatorGUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ArtustdupModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(ArtustdupModMenus.DUPLICATOR_GUI.get(), DuplicatorGUIScreen::new);
	}
}
