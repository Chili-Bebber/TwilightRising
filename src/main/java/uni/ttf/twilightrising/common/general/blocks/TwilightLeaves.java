package uni.ttf.twilightrising.common.general.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import uni.ttf.twilightrising.TwilightRising;
import uni.ttf.twilightrising.core.TRUtility;

import java.util.Random;

/**
 * Project: TwilightRising
 * Created by Carbon
 * Copyright (c) Carbon 2018
 */
public class TwilightLeaves extends Block {
	private static final String unlocalized = "blockTwilightLeaves";

	public TwilightLeaves() {
		super(Material.leaves);

		setCreativeTab(TwilightRising.tabTwilight);
		setHardness(1F);
		setResistance(10000F);
		setStepSound(soundTypeGrass);
		setBlockName(unlocalized);
		setBlockTextureName(TRUtility.getTextureName(unlocalized));
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean shouldSideBeRendered(IBlockAccess iBlockAccess, int i, int j, int k, int side) {
		return Blocks.leaves.shouldSideBeRendered(iBlockAccess, i, j, k, side);
	}

	@Override
	public void randomDisplayTick(World world, int xpar, int ypar, int zpar, Random randy) {
		magicRunes(world, xpar, ypar, zpar, randy);
	}

	private void magicRunes(World world, int x, int y, int z, Random randy) {
		double offset = 0.0625D;

		double rx = x + randy.nextFloat();
		double ry = y + randy.nextFloat() - offset;
		double rz = z + randy.nextFloat();

		world.spawnParticle("enchant", rx, ry, rz, 0, 0, 0);
	}
}
