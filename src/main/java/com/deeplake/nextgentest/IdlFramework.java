package com.deeplake.nextgentest;

import com.deeplake.nextgentest.registry.BlockRegistry;
import com.deeplake.nextgentest.registry.ItemRegistry;
import com.deeplake.nextgentest.registry.RegistryManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(IdlFramework.MOD_ID)
public class IdlFramework {
    public static final String MOD_ID = "idlframework";

    public IdlFramework(){
        RegistryManager.RegisterAll();
    }
}
