package com.deeplake.idlframework.worldgen;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class InitWorldGen {
    static int nextWeight = 100;
    public static void registerWorldGen()
    {
        //register(new ModWorldGenOld(), 100);
        //register(new ModWorldGenNew(), 120);
        //register(new ModGenSpine(), nextWeight);
    }

//    static void register(IWorldGenerator generator, int modGenerationWeight)
//    {
//        GameRegistry.registerWorldGenerator(generator, modGenerationWeight);
//        nextWeight++;
//    }
}
