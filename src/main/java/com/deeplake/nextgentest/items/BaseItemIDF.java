package com.deeplake.nextgentest.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BaseItemIDF extends Item {
    //Idealland Style
    public Properties properties;
    public String name;

    public BaseItemIDF(String name, Properties p_i48487_1_) {
        super(p_i48487_1_);
        properties = p_i48487_1_;
        this.name = name;
        register();
    }

    public void register()
    {
        ItemRegistry.ITEMS.register(name, () -> new BaseItemIDF(name, properties));
    }

    public BaseItemIDF(String name) {
        this(name, new Properties().tab(ItemGroup.TAB_MISC));
    }
}
