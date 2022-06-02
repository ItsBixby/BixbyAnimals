
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bixbyanimals.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BixbyAnimalsModTabs {
	public static CreativeModeTab TAB_BIXBY_ANIMALS;

	public static void load() {
		TAB_BIXBY_ANIMALS = new CreativeModeTab("tabbixby_animals") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.GLOW_SQUID_SPAWN_EGG);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
