package uni.ttf.twilightrising.common;

import uni.ttf.twilightrising.common.doge.DogHelper;
import uni.ttf.twilightrising.common.lucas.BirbHelper;

/**
 * Project: TwilightRising
 * Created by Carbon
 * Copyright (c) Carbon 2018
 */
public class TwilightHelper {
	public static void preInit() {
		DogHelper.preInit();
		BirbHelper.preInit();
	}

	public static void init() {
		DogHelper.init();
		BirbHelper.init();
	}

	public static void postInit() {
		DogHelper.postInit();
		BirbHelper.postInit();
	}
}
