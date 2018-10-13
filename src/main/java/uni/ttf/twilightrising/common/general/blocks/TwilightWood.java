package uni.ttf.twilightrising.common.general.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWood;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraftforge.common.util.ForgeDirection;
import uni.ttf.twilightrising.TwilightRising;
import uni.ttf.twilightrising.core.TRUtility;

/**
 * Project: TwilightRising
 * Created by Carbon
 * Copyright (c) Carbon 2018
 */
public class TwilightWood extends Block {
	private static final String unlocalized = "blockWoodTwilight";

	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	public TwilightWood() {
		super(Material.wood);
		setCreativeTab(TwilightRising.tabTwilight);
		setBlockName(unlocalized);
		setHardness(3F);
		setResistance(172F);
		setStepSound(soundTypeWood);
		setHarvestLevel("axe", 5);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register) {
		icons = new IIcon[2];

		for (int i = 0; i < icons.length; i++) {
			icons[i] = register.registerIcon(TRUtility.getTextureName(unlocalized + i));
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2) {
		if (ForgeDirection.getOrientation(par1) == ForgeDirection.UP || ForgeDirection.getOrientation(par1) == ForgeDirection.DOWN) {
			return icons[0];
		} else {
			return icons[1];
		}
	}
}
