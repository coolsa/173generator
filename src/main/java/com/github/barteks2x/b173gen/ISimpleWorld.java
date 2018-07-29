package com.github.barteks2x.b173gen;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;

/**
 * Simple world interface for setting and getting blocks
 */
public interface ISimpleWorld {
	Material getType(int x, int y, int z);
	
	Block getBlockAt(int x, int y, int z);

	void setType(int x, int y, int z, Material material);

	boolean isEmpty(int x, int y, int z);

	int getBlockLight(int x, int y, int z);

	int getSkyLight(int x, int y, int z);

	BlockState getBlockState(int x, int y, int z);

	int getHighestBlockYAt(int x, int z);
}
