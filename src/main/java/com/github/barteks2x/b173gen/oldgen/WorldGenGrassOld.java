package com.github.barteks2x.b173gen.oldgen;

import com.github.barteks2x.b173gen.ISimpleWorld;
import com.github.barteks2x.b173gen.generator.WorldGenerator173;
import org.bukkit.Material;
import org.bukkit.Tag;

import java.util.Random;

public class WorldGenGrassOld implements WorldGenerator173 {

    private final Material block;

    public WorldGenGrassOld(Material i) {
        this.block = i;
    }

    public boolean generate(ISimpleWorld world, Random random, int i, int j, int k) {
        Material l;

        for(; ((l = world.getType(i, j, k)) == Material.AIR
                || Tag.LEAVES.isTagged(l)) && j > 0; --j) {
        }

        for(int i1 = 0; i1 < 128; ++i1) {
            int j1 = i + random.nextInt(8) - random.nextInt(8);
            int k1 = j + random.nextInt(4) - random.nextInt(4);
            int l1 = k + random.nextInt(8) - random.nextInt(8);

            if(world.isEmpty(j1, k1, l1)
                    && (world.getType(j1, k1-1, l1) == Material.DIRT 
                    || world.getType(j1, k1-1, l1) == Material.GRASS_BLOCK)) {
                world.setType(j1, k1, l1, this.block);
            }
        }

        return true;
    }

    public void scale(double d0, double d1, double d2) {
    }
}
