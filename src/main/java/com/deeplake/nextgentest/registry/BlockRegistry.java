package com.deeplake.nextgentest.registry;

import com.deeplake.nextgentest.IdlFramework;
import com.deeplake.nextgentest.blocks.BaseBlockIDF;
import com.deeplake.nextgentest.items.BaseItemIDF;
import com.deeplake.nextgentest.items.tabs.TabList;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistryEntry;

import java.util.function.Supplier;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, IdlFramework.MOD_ID);

    public static RegistryObject<Block> register(final String name, final Supplier<? extends Block> sup)
    {
        return register(name, sup, TabList.MISC_GROUP);
    }

    public static RegistryObject<Block> register(final String name, final Supplier<? extends Block> sup, ItemGroup tab)
    {
        RegistryObject<Block> block = BLOCKS.register(name, sup);
        ItemRegistry.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
        return block;
    }

    public static final RegistryObject<Block> obsidianBlock = register("test_block", BaseBlockIDF::new);

    // register block
//    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", () ->
//            new Block(
//                    Block.Properties
//                            .of(Material.DIRT)
//                            .strength(5.0f, 6.0f)
//                            .sound(SoundType.STONE)
//                            .harvestLevel(1)
//                            .harvestTool(ToolType.PICKAXE)
//            )
//    );


    //
}
