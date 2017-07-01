package com.emyxam.btbh.world;

import com.emyxam.btbh.block.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;
import java.util.Random;



public class ModWorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (world.provider.getDimension() == 1) { // the end
            generateEnd(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
    }

    private void generateEnd(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        generateOre(ModBlocks.ore_vibranium.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt(4), 6);
    }

    private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
        int deltaY = maxY - minY;

        int dimension = world.provider.getDimension();

        for (int i = 0; i < chances; i++) {
            BlockPos pos= new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));

            BornToBeaHeroWorldGenMinable generator = new BornToBeaHeroWorldGenMinable(ore, size, dimension);
            generator.generate(world, random, pos);
        }
    }

}