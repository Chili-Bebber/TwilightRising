package uni.ttf.twilightrising.core;

import cpw.mods.fml.common.FMLLog;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import org.apache.commons.logging.impl.Jdk13LumberjackLogger;
import uni.ttf.twilightrising.TwilightRising;

import java.util.logging.Logger;


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

	public static int TREE_PARTICLE_COUNT;


	public static void loadConfig(Configuration config) {
		try {
			config.load();

			//////////////////////////////////
			//         Module Configs       //
			//////////////////////////////////

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
					"Whether or not Lucas's Items are enabled");

			//////////////////////////////////
			//        Other Configs         //
			//////////////////////////////////
			Property treeParticles = config.get(Configuration.CATEGORY_GENERAL,
					"treeParticleCount",
					"3",
					"The number of particles that  Twilight Leaves produce (a higher number may lag your game!)");

			//////////////////////////////////

			DOGE_ITEMS = doggo.getBoolean();
			LUCAS_ITEMS = birb.getBoolean();
			CAT_ITEMS = catto.getBoolean();

			TREE_PARTICLE_COUNT = treeParticles.getInt();
		} catch (Exception e) {
			FMLLog.severe("There was an error reading the config! This may cause issues!");
		} finally {
			if (config.hasChanged()) config.save();
		}
	}
}
