package uni.ttf.twilightrising.common.general.blocks;

import com.sun.xml.internal.fastinfoset.algorithm.BuiltInEncodingAlgorithm;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandKill;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import uni.ttf.twilightrising.TwilightRising;
import uni.ttf.twilightrising.core.TConfig;
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
		setTickRandomly(true);
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
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int xpar, int ypar, int zpar, Random randy) {
		if(xpar % 3 == 0 && zpar % 3 == 0) {
			magicRunes(world, xpar, ypar, zpar, randy);
		}
	}

	private void magicRunes(World world, int x, int y, int z, Random randy) {
		double offset = 0.9D; // Y offset

		double rx = x + 0.5D + (0.5D - randy.nextDouble());
		double ry = y - offset;
		double rz = z + 0.5D + (0.5D - randy.nextDouble());

		for (int i = 0; i < TConfig.TREE_PARTICLE_COUNT; i++) {
			world.spawnParticle("enchantmenttable", rx, ry, rz, 0, 1, 0);
		}
	}
}
