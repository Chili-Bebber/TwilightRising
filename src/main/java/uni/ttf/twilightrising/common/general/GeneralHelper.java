package uni.ttf.twilightrising.common.general;

import cpw.mods.fml.common.registry.GameRegistry;
import uni.ttf.twilightrising.common.general.items.ItemCaneCrystal;
import uni.ttf.twilightrising.common.general.items.ItemDebug;

/**
 * Project: TwilightRising
 * Created by Carbon
 * Copyright (c) Carbon 2018
 */
public class GeneralHelper {
	public static ItemDebug debug = new ItemDebug();
	public static ItemCaneCrystal caneCrystal = new ItemCaneCrystal();

	public static void preInit() {

	}

	public static void init() {
		initItems();
	}

	public static void postInit() {

	}

	public static void initItems() {
		GameRegistry.registerItem(debug, debug.getUnlocalizedName());
		GameRegistry.registerItem(caneCrystal, caneCrystal.getUnlocalizedName());
	}
}
