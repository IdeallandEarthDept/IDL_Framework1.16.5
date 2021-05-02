package com.deeplake.nextgentest.items;

import com.deeplake.nextgentest.IdlFramework;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, IdlFramework.MOD_ID);

    public static final RegistryObject<Item> testIngot = ITEMS.register("test_ingot", TestIngot::new);

    //public static final BaseItemIDF testIngot2 = new TestIngotAuto("test_ingot_auto");
    public static final RegistryObject<Item> testIngot2 = ITEMS.register("test_ingot_auto", BaseItemIDF::new);
    public static final RegistryObject<Item> food = ITEMS.register("test_food", BaseItemFood::new);
}
