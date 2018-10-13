package uni.ttf.twilightrising.common.general;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import uni.ttf.twilightrising.common.general.blocks.TwilightLeaves;
import uni.ttf.twilightrising.common.general.blocks.TwilightWood;
import uni.ttf.twilightrising.common.general.items.ItemCactusCrystal;
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
	public static ItemCactusCrystal cactusCrystal = new ItemCactusCrystal();

	public static TwilightWood twilightWood = new TwilightWood();
	public static TwilightLeaves twilightLeaves = new TwilightLeaves();

	public static void preInit() {
		initItems();
		initBlocks();
	}

	public static void init() {
		initCrafting();
	}

	public static void postInit() {

	}

	private static void initItems() {
		GameRegistry.registerItem(debug, debug.getUnlocalizedName());
		GameRegistry.registerItem(caneCrystal, caneCrystal.getUnlocalizedName());
		GameRegistry.registerItem(cactusCrystal, cactusCrystal.getUnlocalizedName());
	}

	private static void initBlocks() {
		GameRegistry.registerBlock(twilightWood, twilightWood.getUnlocalizedName());
		GameRegistry.registerBlock(twilightLeaves, twilightLeaves.getUnlocalizedName());
	}

	private static void initCrafting() {
			GameRegistry.addShapedRecipe(
					new ItemStack(caneCrystal),
					"SDS",
					"ECE",
					"SDS",
					'S', Items.sugar,
					'D', Items.diamond,
					'E', Items.emerald,
					'C', Items.reeds
			);

		GameRegistry.addShapedRecipe(
				new ItemStack(cactusCrystal),
				"SDS",
				"ECE",
				"SDS",
				'S', new ItemStack(Items.dye, 1, 2).getItem(),
				'D', Items.diamond,
				'E', Items.emerald,
				'C', Blocks.cactus
		);
	}
}
