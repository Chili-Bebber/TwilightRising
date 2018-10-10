package uni.ttf.twilightrising.common.general.items;

import net.minecraft.item.Item;
import uni.ttf.twilightrising.TwilightRising;

/**
 * Project: TwilightRising
 * Created by Carbon
 * Copyright (c) Carbon 2018
 */
public class DebugItem extends Item {
	public DebugItem() {
		String unlocalized = "debugItem";
		setUnlocalizedName(unlocalized);
		setTextureName(unlocalized);

		setCreativeTab(TwilightRising.tabTwilight);
	}
}
