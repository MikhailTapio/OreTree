package com.teamfractal.ore_tree.common.util;

import com.teamfractal.ore_tree.OreTree;
import com.teamfractal.ore_tree.client.config.OTClientConfig;
import com.teamfractal.ore_tree.common.block.init.OTBlocks;
import com.teamfractal.ore_tree.common.config.OTCommonConfig;
import com.teamfractal.ore_tree.common.item.init.OTItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class OTRegistryHandler {
    public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, OreTree.MODID);
    public static final DeferredRegister<Block> Blocks = DeferredRegister.create(ForgeRegistries.BLOCKS, OreTree.MODID);

    public static void register(){
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        OTBlocks.register();
        OTItems.register();

        Blocks.register(eventBus);
        Items.register(eventBus);

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, OTClientConfig.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, OTCommonConfig.COMMON_CONFIG);
    }
}
