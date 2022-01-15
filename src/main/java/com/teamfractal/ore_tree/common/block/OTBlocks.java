package com.teamfractal.ore_tree.common.block;

import com.teamfractal.ore_tree.common.block.base.OreInlaidLogBlock;
import com.teamfractal.ore_tree.common.block.base.OreSaplingBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.teamfractal.ore_tree.common.OreTree.N;
import static com.teamfractal.ore_tree.common.OreTree.OreTree;

public class OTBlocks {
    public static final Tag<Block> QUARTZ_ORES = TagRegistry.block(new Identifier("minecraft", "quartz_ores"));
    public static final Block coalTreeLog = new OreInlaidLogBlock();
    public static final Block copperTreeLog = new OreInlaidLogBlock();
    public static final Block diamondTreeLog = new OreInlaidLogBlock();
    public static final Block emeraldTreeLog = new OreInlaidLogBlock();
    public static final Block goldTreeLog = new OreInlaidLogBlock();
    public static final Block ironTreeLog = new OreInlaidLogBlock();
    public static final Block lapisTreeLog = new OreInlaidLogBlock();
    public static final Block quartzTreeLog = new OreInlaidLogBlock();
    public static final Block redstoneTreeLog = new OreInlaidLogBlock();
    public static final Block coalTreeSapling = new OreSaplingBlock(Items.COAL, BlockTags.COAL_ORES, 0.9, 0.9,new Identifier(N,"coal_tree"));
    public static final Block copperTreeSapling = new OreSaplingBlock(Items.COPPER_INGOT, BlockTags.COPPER_ORES, 0.9, 0.9,new Identifier(N,"copper_tree"));
    public static final Block diamondTreeSapling = new OreSaplingBlock(Items.DIAMOND, BlockTags.DIAMOND_ORES, 0.5, 0.4,new Identifier(N,"diamond_tree"));
    public static final Block emeraldTreeSapling = new OreSaplingBlock(Items.EMERALD, BlockTags.EMERALD_ORES, 0.8, 0.7,new Identifier(N,"emerald_tree"));
    public static final Block goldTreeSapling = new OreSaplingBlock(Items.GOLD_INGOT, BlockTags.GOLD_ORES, 0.8, 0.7,new Identifier(N,"gold_tree"));
    public static final Block ironTreeSapling = new OreSaplingBlock(Items.IRON_INGOT, BlockTags.IRON_ORES, 0.9, 0.9,new Identifier(N,"iron_tree"));
    public static final Block lapisTreeSapling = new OreSaplingBlock(Items.LAPIS_LAZULI, BlockTags.LAPIS_ORES, 0.7, 0.7,new Identifier(N,"lapis_tree"));
    public static final Block quartzTreeSapling = new OreSaplingBlock(Items.QUARTZ, QUARTZ_ORES, 0.7, 0.7,new Identifier(N,"quartz_tree"));
    public static final Block redstoneTreeSapling = new OreSaplingBlock(Items.REDSTONE, BlockTags.REDSTONE_ORES, 0.7, 0.8,new Identifier(N,"redstone_tree"));

    public static final Item iCoalTreeLog = new BlockItem(coalTreeLog, new FabricItemSettings().group(OreTree));
    public static final Item iCopperTreeLog = new BlockItem(copperTreeLog, new FabricItemSettings().group(OreTree));
    public static final Item iDiamondTreeLog = new BlockItem(diamondTreeLog, new FabricItemSettings().group(OreTree));
    public static final Item iEmeraldTreeLog = new BlockItem(emeraldTreeLog, new FabricItemSettings().group(OreTree));
    public static final Item iGoldTreeLog = new BlockItem(goldTreeLog, new FabricItemSettings().group(OreTree));
    public static final Item iIronTreeLog = new BlockItem(ironTreeLog, new FabricItemSettings().group(OreTree));
    public static final Item iLapisTreeLog = new BlockItem(lapisTreeLog, new FabricItemSettings().group(OreTree));
    public static final Item iQuartzTreeLog = new BlockItem(quartzTreeLog, new FabricItemSettings().group(OreTree));
    public static final Item iRedstoneTreeLog = new BlockItem(redstoneTreeLog, new FabricItemSettings().group(OreTree));
    public static final Item iCoalTreeSapling = new BlockItem(coalTreeSapling, new FabricItemSettings().group(OreTree));
    public static final Item iCopperTreeSapling = new BlockItem(copperTreeSapling, new FabricItemSettings().group(OreTree));
    public static final Item iDiamondTreeSapling = new BlockItem(diamondTreeSapling, new FabricItemSettings().group(OreTree));
    public static final Item iEmeraldTreeSapling = new BlockItem(emeraldTreeSapling, new FabricItemSettings().group(OreTree));
    public static final Item iGoldTreeSapling = new BlockItem(goldTreeSapling, new FabricItemSettings().group(OreTree));
    public static final Item iIronTreeSapling = new BlockItem(ironTreeSapling, new FabricItemSettings().group(OreTree));
    public static final Item iLapisTreeSapling = new BlockItem(lapisTreeSapling, new FabricItemSettings().group(OreTree));
    public static final Item iQuartzTreeSapling = new BlockItem(quartzTreeSapling, new FabricItemSettings().group(OreTree));
    public static final Item iRedstoneTreeSapling = new BlockItem(redstoneTreeSapling, new FabricItemSettings().group(OreTree));

    public static void register(){
        Registry.register(Registry.BLOCK, new Identifier(N, "coal_tree_log"), coalTreeLog);
        Registry.register(Registry.BLOCK, new Identifier(N, "copper_tree_log"), copperTreeLog);
        Registry.register(Registry.BLOCK, new Identifier(N, "diamond_tree_log"), diamondTreeLog);
        Registry.register(Registry.BLOCK, new Identifier(N, "emerald_tree_log"), emeraldTreeLog);
        Registry.register(Registry.BLOCK, new Identifier(N, "gold_tree_log"), goldTreeLog);
        Registry.register(Registry.BLOCK, new Identifier(N, "iron_tree_log"), ironTreeLog);
        Registry.register(Registry.BLOCK, new Identifier(N, "lapis_tree_log"), lapisTreeLog);
        Registry.register(Registry.BLOCK, new Identifier(N, "quartz_tree_log"), quartzTreeLog);
        Registry.register(Registry.BLOCK, new Identifier(N, "redstone_tree_log"), redstoneTreeLog);
        Registry.register(Registry.BLOCK, new Identifier(N, "coal_tree_sapling"), coalTreeSapling);
        Registry.register(Registry.BLOCK, new Identifier(N, "copper_tree_sapling"), copperTreeSapling);
        Registry.register(Registry.BLOCK, new Identifier(N, "diamond_tree_sapling"), diamondTreeSapling);
        Registry.register(Registry.BLOCK, new Identifier(N, "emerald_tree_sapling"), emeraldTreeSapling);
        Registry.register(Registry.BLOCK, new Identifier(N, "gold_tree_sapling"), goldTreeSapling);
        Registry.register(Registry.BLOCK, new Identifier(N, "iron_tree_sapling"), ironTreeSapling);
        Registry.register(Registry.BLOCK, new Identifier(N, "lapis_tree_sapling"), lapisTreeSapling);
        Registry.register(Registry.BLOCK, new Identifier(N, "quartz_tree_sapling"), quartzTreeSapling);
        Registry.register(Registry.BLOCK, new Identifier(N, "redstone_tree_sapling"), redstoneTreeSapling);
        Registry.register(Registry.ITEM, new Identifier(N, "coal_tree_log"), iCoalTreeLog);
        Registry.register(Registry.ITEM, new Identifier(N, "copper_tree_log"), iCopperTreeLog);
        Registry.register(Registry.ITEM, new Identifier(N, "diamond_tree_log"), iDiamondTreeLog);
        Registry.register(Registry.ITEM, new Identifier(N, "emerald_tree_log"), iEmeraldTreeLog);
        Registry.register(Registry.ITEM, new Identifier(N, "gold_tree_log"), iGoldTreeLog);
        Registry.register(Registry.ITEM, new Identifier(N, "iron_tree_log"), iIronTreeLog);
        Registry.register(Registry.ITEM, new Identifier(N, "lapis_tree_log"), iLapisTreeLog);
        Registry.register(Registry.ITEM, new Identifier(N, "quartz_tree_log"), iQuartzTreeLog);
        Registry.register(Registry.ITEM, new Identifier(N, "redstone_tree_log"), iRedstoneTreeLog);
        Registry.register(Registry.ITEM, new Identifier(N, "coal_tree_sapling"), iCoalTreeSapling);
        Registry.register(Registry.ITEM, new Identifier(N, "copper_tree_sapling"), iCopperTreeSapling);
        Registry.register(Registry.ITEM, new Identifier(N, "diamond_tree_sapling"), iDiamondTreeSapling);
        Registry.register(Registry.ITEM, new Identifier(N, "emerald_tree_sapling"), iEmeraldTreeSapling);
        Registry.register(Registry.ITEM, new Identifier(N, "gold_tree_sapling"), iGoldTreeSapling);
        Registry.register(Registry.ITEM, new Identifier(N, "iron_tree_sapling"), iIronTreeSapling);
        Registry.register(Registry.ITEM, new Identifier(N, "lapis_tree_sapling"), iLapisTreeSapling);
        Registry.register(Registry.ITEM, new Identifier(N, "quartz_tree_sapling"), iQuartzTreeSapling);
        Registry.register(Registry.ITEM, new Identifier(N, "redstone_tree_sapling"), iRedstoneTreeSapling);
    }
}
