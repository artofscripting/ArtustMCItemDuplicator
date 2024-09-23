
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.artustdup.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.artustdup.world.inventory.DuplicatorGUIMenu;
import net.mcreator.artustdup.ArtustdupMod;

public class ArtustdupModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, ArtustdupMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<DuplicatorGUIMenu>> DUPLICATOR_GUI = REGISTRY.register("duplicator_gui", () -> IMenuTypeExtension.create(DuplicatorGUIMenu::new));
}
