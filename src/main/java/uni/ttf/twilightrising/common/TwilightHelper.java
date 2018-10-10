package uni.ttf.twilightrising.common;

import uni.ttf.twilightrising.common.doge.DogHelper;
import uni.ttf.twilightrising.common.general.GeneralHelper;
import uni.ttf.twilightrising.common.lucas.BirbHelper;

/**
 * Project: TwilightRising
 * Created by Carbon
 * Copyright (c) Carbon 2018
 */
public class TwilightHelper {
	public static void preInit() {
		GeneralHelper.preInit();

		DogHelper.preInit();
		BirbHelper.preInit();
	}

	public static void init() {
		GeneralHelper.init();

		DogHelper.init();
		BirbHelper.init();
	}

	public static void postInit() {
		GeneralHelper.postInit();

		DogHelper.postInit();
		BirbHelper.postInit();
	}
}
