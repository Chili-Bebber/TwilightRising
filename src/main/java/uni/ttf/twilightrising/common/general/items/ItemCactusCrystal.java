package uni.ttf.twilightrising.common.general.items;

import net.minecraft.block.BlockCactus;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import uni.ttf.twilightrising.TwilightRising;

/**
 * Project: TwilightRising
 * Created by Carbon
 * Copyright (c) Carbon 2018
 */
public class ItemCactusCrystal extends Item {
	private static final String unlocalized = "cactusCrystal";

	public ItemCactusCrystal() {
		setUnlocalizedName(unlocalized);
		setTextureName(TwilightRising.MODID + ":cactus_crystal");
		setCreativeTab(TwilightRising.tabTwilight);
	}

	@Override
	public boolean onItemUse(ItemStack item, EntityPlayer user, World world, int posx, int posy, int posz, int side, float px, float py, float pz) {
		int y = posy;
		if (world.getBlock(posx, posy, posz) instanceof BlockCactus) {
			y++;
			while (y <= 255 && (world.isAirBlock(posx, y, posz) || world.getBlock(posx, y, posz) instanceof BlockCactus)) {
				world.setBlock(posx, y, posz, Blocks.cactus);
				y++;
			}
		}

		item.stackSize--;

		return false;
	}
}
