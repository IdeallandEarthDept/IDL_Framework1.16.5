package com.deeplake.nextgentest;

import com.deeplake.nextgentest.items.ItemRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(IdlFramework.MOD_ID)
public class IdlFramework {
    public static final String MOD_ID = "idlframework";

    public IdlFramework(){
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
