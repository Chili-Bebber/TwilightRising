package uni.ttf.twilightrising.common.misc;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Project: TwilightRising
 * Created by Carbon
 * Copyright (c) Carbon 2018
 */
public class TwilightTab extends CreativeTabs {
	public TwilightTab(int par1, String par2) {
		super(par1, par2);
	}

	@Override
	public Item getTabIconItem() {
		return Items.brick;
	}

	public String getTranslatedTabLabel(){
		return "Twilight Rising";
	}
}
