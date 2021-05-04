//package com.deeplake.idlframework.worldgen;
//
//import com.deeplake.idealland.Idealland;
//import com.deeplake.idealland.blocks.ModBlocks;
//import com.deeplake.idealland.entity.creatures.moroon.EntityMorTainterSP;
//import com.deeplake.idealland.entity.creatures.moroon.EntityMoroonStandardInfantrySpawner;
//import com.deeplake.idealland.init.ModConfig;
//import com.deeplake.idealland.init.ModLootList;
//import net.minecraft.entity.EntityList;
//import net.minecraft.init.Blocks;
//import net.minecraft.tileentity.TileEntity;
//import net.minecraft.tileentity.TileEntityChest;
//import net.minecraft.tileentity.TileEntityMobSpawner;
//import net.minecraft.util.EnumFacing;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.World;
//import net.minecraft.world.chunk.IChunkProvider;
//import net.minecraft.world.gen.IChunkGenerator;
//import net.minecraftforge.fml.common.IWorldGenerator;
//
//import java.util.Random;
//
//import static com.deeplake.idealland.util.CommonDef.CHUNK_SIZE;
//
//public class ModGenTomb implements IWorldGenerator {
//
//    public ModGenTomb() {
//
//    }
//
//    @Override
//    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
//
//        if (random.nextFloat() > ModConfig.WORLD_GEN_CONF.SP_DUNGEON_CHANCE)
//        {
//            return;
//        }
//
//        BlockPos pos = new BlockPos(chunkX << 4, 0, chunkZ << 4);
//        if (world.provider.getDimension() != 0)
//        {
//            //only in overworld
//            return;
//        }
//
//        //avoid chunk border
//        int minHeight = 8;
//        int buildHeightLimit = world.getActualHeight();
//
//        int shell_size = 2;
//
//        int heightBase = minHeight + random.nextInt(buildHeightLimit - minHeight);
//        int size = 2*shell_size+1;
//        BlockPos posGen = pos.add(random.nextInt(CHUNK_SIZE - size) + shell_size, heightBase, random.nextInt(CHUNK_SIZE - size) + shell_size) ;
//
//        for (int x = -shell_size; x<=shell_size; x++)
//        {
//            for (int z = -shell_size; z<=shell_size; z++)
//            {
//                for (int y = -shell_size; y<=shell_size; y++)
//                {
//                    BlockPos basePos = posGen.add(x,y,z);
//                    if (x == 0 && y == 0 && z == 0)
//                    {
//                        world.setBlockState(basePos, Blocks.CHEST.getDefaultState(), 2);
//                        TileEntity tileEntity1 = world.getTileEntity(basePos);
//                        if (tileEntity1 instanceof TileEntityChest) {
//                            ((TileEntityChest) tileEntity1).setLootTable(ModLootList.SP_TEMP, random.nextLong());
//                        }
//                    }
//                    else if (x == 0 && y == 1 && z == 0)
//                    {
//                        world.setBlockState(basePos, Blocks.MOB_SPAWNER.getDefaultState(), 2);
//                        TileEntity tileentity = world.getTileEntity(basePos);
//
//                        if (tileentity instanceof TileEntityMobSpawner)
//                        {
//                            if (random.nextBoolean())
//                            {
//                                ((TileEntityMobSpawner)tileentity).getSpawnerBaseLogic().setEntityId(EntityList.getKey(EntityMoroonStandardInfantrySpawner.class));
//                            }else {
//                                ((TileEntityMobSpawner)tileentity).getSpawnerBaseLogic().setEntityId(EntityList.getKey(EntityMorTainterSP.class));
//                            }
//
//                        }
//                        else
//                        {
//                            Idealland.LogWarning("[Tomb]ailed to fetch mob spawner entity at (%s, %s, %s)", pos.getX(), pos.getY(), pos.getZ());
//                        }
//
//                    }
//                    else {
//                        if (x != 0 && z != 0)
//                        {
//                            world.setBlockState(basePos, ModBlocks.MORON_BLOCK.getDefaultState(), 2);
//                        }else {
//                            world.setBlockState(basePos, Blocks.OBSIDIAN.getDefaultState(), 2);
//                        }
//
//                    }
//                }
//            }
//        }
//
//
//
//
//
//    }
//
//    void CreateLogAt(Random random, World worldIn, BlockPos pos, EnumFacing facing)
//    {
//        if (worldIn.getBlockState(pos).getBlock() == Blocks.AIR)
//        {
//            worldIn.setBlockState(pos, Blocks.WATER.getDefaultState(), 2);
//        }
//    }
//}