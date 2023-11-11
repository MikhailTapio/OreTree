package committee.nova.plr.ore_tree.common.block;

import committee.nova.plr.ore_tree.common.block.base.OreInlaidLogBlock;
import committee.nova.plr.ore_tree.common.block.base.OreSaplingBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import static committee.nova.plr.ore_tree.common.OreTree.MODID;

public class OTBlocks {
    public static final TagKey<Block> QUARTZ_ORES = TagKey.of(Registries.BLOCK.getKey(), new Identifier("quartz_ores"));
    public static final Block coalTreeLog = new OreInlaidLogBlock();
    public static final Block copperTreeLog = new OreInlaidLogBlock();
    public static final Block diamondTreeLog = new OreInlaidLogBlock();
    public static final Block emeraldTreeLog = new OreInlaidLogBlock();
    public static final Block goldTreeLog = new OreInlaidLogBlock();
    public static final Block ironTreeLog = new OreInlaidLogBlock();
    public static final Block lapisTreeLog = new OreInlaidLogBlock();
    public static final Block quartzTreeLog = new OreInlaidLogBlock();
    public static final Block redstoneTreeLog = new OreInlaidLogBlock();
    public static final Block coalTreeSapling = new OreSaplingBlock(Items.COAL, BlockTags.COAL_ORES, 0.9, 0.9, new Identifier(MODID, "coal_tree"));
    public static final Block copperTreeSapling = new OreSaplingBlock(Items.COPPER_INGOT, BlockTags.COPPER_ORES, 0.9, 0.9, new Identifier(MODID, "copper_tree"));
    public static final Block diamondTreeSapling = new OreSaplingBlock(Items.DIAMOND, BlockTags.DIAMOND_ORES, 0.5, 0.4, new Identifier(MODID, "diamond_tree"));
    public static final Block emeraldTreeSapling = new OreSaplingBlock(Items.EMERALD, BlockTags.EMERALD_ORES, 0.8, 0.7, new Identifier(MODID, "emerald_tree"));
    public static final Block goldTreeSapling = new OreSaplingBlock(Items.GOLD_INGOT, BlockTags.GOLD_ORES, 0.8, 0.7, new Identifier(MODID, "gold_tree"));
    public static final Block ironTreeSapling = new OreSaplingBlock(Items.IRON_INGOT, BlockTags.IRON_ORES, 0.9, 0.9, new Identifier(MODID, "iron_tree"));
    public static final Block lapisTreeSapling = new OreSaplingBlock(Items.LAPIS_LAZULI, BlockTags.LAPIS_ORES, 0.7, 0.7, new Identifier(MODID, "lapis_tree"));
    public static final Block quartzTreeSapling = new OreSaplingBlock(Items.QUARTZ, QUARTZ_ORES, 0.7, 0.7, new Identifier(MODID, "quartz_tree"));
    public static final Block redstoneTreeSapling = new OreSaplingBlock(Items.REDSTONE, BlockTags.REDSTONE_ORES, 0.7, 0.8, new Identifier(MODID, "redstone_tree"));

    public static final Item iCoalTreeLog = new BlockItem(coalTreeLog, new FabricItemSettings());
    public static final Item iCopperTreeLog = new BlockItem(copperTreeLog, new FabricItemSettings());
    public static final Item iDiamondTreeLog = new BlockItem(diamondTreeLog, new FabricItemSettings());
    public static final Item iEmeraldTreeLog = new BlockItem(emeraldTreeLog, new FabricItemSettings());
    public static final Item iGoldTreeLog = new BlockItem(goldTreeLog, new FabricItemSettings());
    public static final Item iIronTreeLog = new BlockItem(ironTreeLog, new FabricItemSettings());
    public static final Item iLapisTreeLog = new BlockItem(lapisTreeLog, new FabricItemSettings());
    public static final Item iQuartzTreeLog = new BlockItem(quartzTreeLog, new FabricItemSettings());
    public static final Item iRedstoneTreeLog = new BlockItem(redstoneTreeLog, new FabricItemSettings());
    public static final Item iCoalTreeSapling = new BlockItem(coalTreeSapling, new FabricItemSettings());
    public static final Item iCopperTreeSapling = new BlockItem(copperTreeSapling, new FabricItemSettings());
    public static final Item iDiamondTreeSapling = new BlockItem(diamondTreeSapling, new FabricItemSettings());
    public static final Item iEmeraldTreeSapling = new BlockItem(emeraldTreeSapling, new FabricItemSettings());
    public static final Item iGoldTreeSapling = new BlockItem(goldTreeSapling, new FabricItemSettings());
    public static final Item iIronTreeSapling = new BlockItem(ironTreeSapling, new FabricItemSettings());
    public static final Item iLapisTreeSapling = new BlockItem(lapisTreeSapling, new FabricItemSettings());
    public static final Item iQuartzTreeSapling = new BlockItem(quartzTreeSapling, new FabricItemSettings());
    public static final Item iRedstoneTreeSapling = new BlockItem(redstoneTreeSapling, new FabricItemSettings());

    public static void register() {
        Registry.register(Registries.BLOCK, new Identifier(MODID, "coal_tree_log"), coalTreeLog);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "copper_tree_log"), copperTreeLog);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "diamond_tree_log"), diamondTreeLog);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "emerald_tree_log"), emeraldTreeLog);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "gold_tree_log"), goldTreeLog);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "iron_tree_log"), ironTreeLog);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "lapis_tree_log"), lapisTreeLog);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "quartz_tree_log"), quartzTreeLog);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "redstone_tree_log"), redstoneTreeLog);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "coal_tree_sapling"), coalTreeSapling);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "copper_tree_sapling"), copperTreeSapling);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "diamond_tree_sapling"), diamondTreeSapling);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "emerald_tree_sapling"), emeraldTreeSapling);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "gold_tree_sapling"), goldTreeSapling);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "iron_tree_sapling"), ironTreeSapling);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "lapis_tree_sapling"), lapisTreeSapling);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "quartz_tree_sapling"), quartzTreeSapling);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "redstone_tree_sapling"), redstoneTreeSapling);
        Registry.register(Registries.ITEM, new Identifier(MODID, "coal_tree_log"), iCoalTreeLog);
        Registry.register(Registries.ITEM, new Identifier(MODID, "copper_tree_log"), iCopperTreeLog);
        Registry.register(Registries.ITEM, new Identifier(MODID, "diamond_tree_log"), iDiamondTreeLog);
        Registry.register(Registries.ITEM, new Identifier(MODID, "emerald_tree_log"), iEmeraldTreeLog);
        Registry.register(Registries.ITEM, new Identifier(MODID, "gold_tree_log"), iGoldTreeLog);
        Registry.register(Registries.ITEM, new Identifier(MODID, "iron_tree_log"), iIronTreeLog);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lapis_tree_log"), iLapisTreeLog);
        Registry.register(Registries.ITEM, new Identifier(MODID, "quartz_tree_log"), iQuartzTreeLog);
        Registry.register(Registries.ITEM, new Identifier(MODID, "redstone_tree_log"), iRedstoneTreeLog);
        Registry.register(Registries.ITEM, new Identifier(MODID, "coal_tree_sapling"), iCoalTreeSapling);
        Registry.register(Registries.ITEM, new Identifier(MODID, "copper_tree_sapling"), iCopperTreeSapling);
        Registry.register(Registries.ITEM, new Identifier(MODID, "diamond_tree_sapling"), iDiamondTreeSapling);
        Registry.register(Registries.ITEM, new Identifier(MODID, "emerald_tree_sapling"), iEmeraldTreeSapling);
        Registry.register(Registries.ITEM, new Identifier(MODID, "gold_tree_sapling"), iGoldTreeSapling);
        Registry.register(Registries.ITEM, new Identifier(MODID, "iron_tree_sapling"), iIronTreeSapling);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lapis_tree_sapling"), iLapisTreeSapling);
        Registry.register(Registries.ITEM, new Identifier(MODID, "quartz_tree_sapling"), iQuartzTreeSapling);
        Registry.register(Registries.ITEM, new Identifier(MODID, "redstone_tree_sapling"), iRedstoneTreeSapling);
    }
}
