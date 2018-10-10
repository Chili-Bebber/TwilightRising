package uni.ttf.twilightrising.core;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import uni.ttf.twilightrising.TwilightRising;


/**
 * Project: TwilightRising
 * Created by Carbon
 * Copyright (c) Carbon 2018
 */
public class TConfig {
	public static boolean DOGE_ITEMS;
	public static boolean LUCAS_ITEMS;
	public static boolean KIRA_ITEMS;
	public static boolean CAT_ITEMS;
	public static boolean CLOCK_ITEMS;
	public static boolean POKE_ITEMS;


	public static void loadConfig(Configuration config) {
		try {
			config.load();

			Property doggo = config.get(Configuration.CATEGORY_GENERAL,
					"isDogeItemsEnabled",
					"true",
					"If doge's Items are enabled");

			Property catto = config.get(Configuration.CATEGORY_GENERAL,
					"isCatItemsEnabled",
					"true",
					"If AKCat's items are enabled");

			Property birb = config.get(Configuration.CATEGORY_GENERAL,
					"areLucasItemsEnabled",
					"true",
					"Wether or not Lucas's Items are enabled");

			DOGE_ITEMS = doggo.getBoolean();
			LUCAS_ITEMS = birb.getBoolean();
			CAT_ITEMS = catto.getBoolean();
		} catch (Exception e) {

		} finally {
			if (config.hasChanged()) config.save();
		}
	}
}
