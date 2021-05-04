package com.deeplake.idlframework;

import com.deeplake.idlframework.registry.RegistryManager;
import net.minecraftforge.fml.common.Mod;

@Mod(IdlFramework.MOD_ID)
public class IdlFramework {
    public static final String MOD_ID = "idlframework";

    public IdlFramework(){
        RegistryManager.RegisterAll();
    }
}
