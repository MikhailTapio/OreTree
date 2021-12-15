package com.teamfractal.ore_tree.common.item.init;

import com.teamfractal.ore_tree.common.block.init.OTBlocks;
import com.teamfractal.ore_tree.common.creativeTab.OTTabs;
import com.teamfractal.ore_tree.common.util.OTRegistryHandler;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class OTItems {

    public static RegistryObject<Item> coalTreeLog;
    public static RegistryObject<Item> copperTreeLog;
    public static RegistryObject<Item> diamondTreeLog;
    public static RegistryObject<Item> emeraldTreeLog;
    public static RegistryObject<Item> goldTreeLog;
    public static RegistryObject<Item> ironTreeLog;
    public static RegistryObject<Item> lapisTreeLog;
    public static RegistryObject<Item> quartzTreeLog;
    public static RegistryObject<Item> redstoneTreeLog;
    public static RegistryObject<Item> coalTreeSapling;
    public static RegistryObject<Item> copperTreeSapling;
    public static RegistryObject<Item> diamondTreeSapling;
    public static RegistryObject<Item> emeraldTreeSapling;
    public static RegistryObject<Item> goldTreeSapling;
    public static RegistryObject<Item> ironTreeSapling;
    public static RegistryObject<Item> lapisTreeSapling;
    public static RegistryObject<Item> quartzTreeSapling;
    public static RegistryObject<Item> redstoneTreeSapling;

    public static void register(){
        coalTreeLog = OTRegistryHandler.Items.register("coal_tree_log"
                ,() -> new BlockItem(OTBlocks.coalTreeLog.get(), new Item.Properties().tab(OTTabs.MAIN)));
        copperTreeLog = OTRegistryHandler.Items.register("copper_tree_log"
                ,() -> new BlockItem(OTBlocks.copperTreeLog.get(), new Item.Properties().tab(OTTabs.MAIN)));
        diamondTreeLog = OTRegistryHandler.Items.register("diamond_tree_log"
                ,() -> new BlockItem(OTBlocks.diamondTreeLog.get(), new Item.Properties().tab(OTTabs.MAIN)));
        emeraldTreeLog = OTRegistryHandler.Items.register("emerald_tree_log"
                ,() -> new BlockItem(OTBlocks.emeraldTreeLog.get(), new Item.Properties().tab(OTTabs.MAIN)));
        goldTreeLog = OTRegistryHandler.Items.register("gold_tree_log"
                ,() -> new BlockItem(OTBlocks.goldTreeLog.get(), new Item.Properties().tab(OTTabs.MAIN)));
        ironTreeLog = OTRegistryHandler.Items.register("iron_tree_log"
                ,() -> new BlockItem(OTBlocks.ironTreeLog.get(), new Item.Properties().tab(OTTabs.MAIN)));
        lapisTreeLog = OTRegistryHandler.Items.register("lapis_tree_log"
                ,() -> new BlockItem(OTBlocks.lapisTreeLog.get(), new Item.Properties().tab(OTTabs.MAIN)));
        quartzTreeLog = OTRegistryHandler.Items.register("quartz_tree_log"
                ,() -> new BlockItem(OTBlocks.quartzTreeLog.get(), new Item.Properties().tab(OTTabs.MAIN)));
        redstoneTreeLog = OTRegistryHandler.Items.register("redstone_tree_log"
                ,() -> new BlockItem(OTBlocks.redstoneTreeLog.get(), new Item.Properties().tab(OTTabs.MAIN)));
        coalTreeSapling = OTRegistryHandler.Items.register("coal_tree_sapling"
                ,() -> new BlockItem(OTBlocks.coalTreeSapling.get(), new Item.Properties().tab(OTTabs.MAIN)));
        copperTreeSapling = OTRegistryHandler.Items.register("copper_tree_sapling"
                ,() -> new BlockItem(OTBlocks.copperTreeSapling.get(), new Item.Properties().tab(OTTabs.MAIN)));
        diamondTreeSapling = OTRegistryHandler.Items.register("diamond_tree_sapling"
                ,() -> new BlockItem(OTBlocks.diamondTreeSapling.get(), new Item.Properties().tab(OTTabs.MAIN)));
        emeraldTreeSapling = OTRegistryHandler.Items.register("emerald_tree_sapling"
                ,() -> new BlockItem(OTBlocks.emeraldTreeSapling.get(), new Item.Properties().tab(OTTabs.MAIN)));
        goldTreeSapling = OTRegistryHandler.Items.register("gold_tree_sapling"
                ,() -> new BlockItem(OTBlocks.goldTreeSapling.get(), new Item.Properties().tab(OTTabs.MAIN)));
        ironTreeSapling = OTRegistryHandler.Items.register("iron_tree_sapling"
                ,() -> new BlockItem(OTBlocks.ironTreeSapling.get(), new Item.Properties().tab(OTTabs.MAIN)));
        lapisTreeSapling = OTRegistryHandler.Items.register("lapis_tree_sapling"
                ,() -> new BlockItem(OTBlocks.lapisTreeSapling.get(), new Item.Properties().tab(OTTabs.MAIN)));
        quartzTreeSapling = OTRegistryHandler.Items.register("quartz_tree_sapling"
                ,() -> new BlockItem(OTBlocks.quartzTreeSapling.get(), new Item.Properties().tab(OTTabs.MAIN)));
        redstoneTreeSapling = OTRegistryHandler.Items.register("redstone_tree_sapling"
                ,() -> new BlockItem(OTBlocks.redstoneTreeSapling.get(), new Item.Properties().tab(OTTabs.MAIN)));
    }
}
