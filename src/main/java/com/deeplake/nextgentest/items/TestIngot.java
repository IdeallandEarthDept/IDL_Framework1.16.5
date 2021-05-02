package com.deeplake.nextgentest.items;

import net.minecraft.item.ItemGroup;

public class TestIngot extends BaseItemBoson {
    public TestIngot() {
        super(new Properties().tab(ItemGroup.TAB_MATERIALS));
        //Boson style.
        // public static final RegistryObject<Item> testIngot = ITEMS.register("test_ingot", TestIngot::new);
    }
}
