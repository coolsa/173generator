package com.github.barteks2x.b173gen;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.World;
import org.bukkit.block.BlockState;

public class BukkitSimpleWorldImpl implements ISimpleWorld {
	private final World world;

	public BukkitSimpleWorldImpl(World world) {
		this.world = world;
	}

	@Override public Material getType(int x, int y, int z) {
		return world.getBlockAt(x, y, z).getType();
	}
	@Override public Block getBlockAt(int x, int y, int z) {
		return world.getBlockAt(x, y, z);
	}

	@Override public void setType(int x, int y, int z, Material material) {
	    Block block = world.getBlockAt(x, y, z);
	    block.setType(material);
	}

	@Override public boolean isEmpty(int x, int y, int z) {
		return world.getBlockAt(x, y, z).isEmpty();
	}

	@Override public int getBlockLight(int x, int y, int z) {
		if(y < 0 || y > 255) {
			return 0;
		}
		return world.getBlockAt(x, y, z).getLightFromBlocks();
	}

	@Override public int getSkyLight(int x, int y, int z) {
		if(y < 0) {
			return 0;
		}
		if(y > 255) {
			return 15;
		}
		return world.getBlockAt(x, y, z).getLightFromSky();
	}

	@Override public BlockState getBlockState(int x, int y, int z) {
		return world.getBlockAt(x, y, z).getState();
	}

	@Override public int getHighestBlockYAt(int x, int z) {
		return world.getHighestBlockYAt(x, z);
	}
}
