package com.teamfractal.ore_tree.common.block.init;

import com.teamfractal.ore_tree.common.block.base.OreInlaidLogBlock;
import com.teamfractal.ore_tree.common.block.base.OreSaplingBlock;
import com.teamfractal.ore_tree.common.config.OTCommonConfig;
import com.teamfractal.ore_tree.common.util.OTRegistryHandler;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.tags.BlockTags.bind;

public class OTBlocks {

    public static final Tag.Named<Block> QUARTZ_ORES = bind("quartz_ores");

    public static RegistryObject<Block> coalTreeLog;
    public static RegistryObject<Block> copperTreeLog;
    public static RegistryObject<Block> diamondTreeLog;
    public static RegistryObject<Block> emeraldTreeLog;
    public static RegistryObject<Block> goldTreeLog;
    public static RegistryObject<Block> ironTreeLog;
    public static RegistryObject<Block> lapisTreeLog;
    public static RegistryObject<Block> quartzTreeLog;
    public static RegistryObject<Block> redstoneTreeLog;
    public static RegistryObject<Block> coalTreeSapling;
    public static RegistryObject<Block> copperTreeSapling;
    public static RegistryObject<Block> diamondTreeSapling;
    public static RegistryObject<Block> emeraldTreeSapling;
    public static RegistryObject<Block> goldTreeSapling;
    public static RegistryObject<Block> ironTreeSapling;
    public static RegistryObject<Block> lapisTreeSapling;
    public static RegistryObject<Block> quartzTreeSapling;
    public static RegistryObject<Block> redstoneTreeSapling;

    public static void register(){
        coalTreeLog = OTRegistryHandler.Blocks.register("coal_tree_log", OreInlaidLogBlock::new);
        copperTreeLog = OTRegistryHandler.Blocks.register("copper_tree_log", OreInlaidLogBlock::new);
        diamondTreeLog = OTRegistryHandler.Blocks.register("diamond_tree_log", OreInlaidLogBlock::new);
        emeraldTreeLog = OTRegistryHandler.Blocks.register("emerald_tree_log", OreInlaidLogBlock::new);
        goldTreeLog = OTRegistryHandler.Blocks.register("gold_tree_log", OreInlaidLogBlock::new);
        ironTreeLog = OTRegistryHandler.Blocks.register("iron_tree_log", OreInlaidLogBlock::new);
        lapisTreeLog = OTRegistryHandler.Blocks.register("lapis_tree_log", OreInlaidLogBlock::new);
        quartzTreeLog = OTRegistryHandler.Blocks.register("quartz_tree_log", OreInlaidLogBlock::new);
        redstoneTreeLog = OTRegistryHandler.Blocks.register("redstone_tree_log", OreInlaidLogBlock::new);
        coalTreeSapling = OTRegistryHandler.Blocks.register("coal_tree_sapling"
                ,() -> new OreSaplingBlock(Items.COAL, BlockTags.COAL_ORES, OTCommonConfig.COAL_TICK.get(), OTCommonConfig.COAL_CATALYZE.get(), new ResourceLocation("ore_tree", "coal_tree"))
        );
        copperTreeSapling = OTRegistryHandler.Blocks.register("copper_tree_sapling"
                ,() -> new OreSaplingBlock(Items.COPPER_INGOT, BlockTags.COPPER_ORES, OTCommonConfig.COPPER_TICK.get(), OTCommonConfig.COPPER_CATALYZE.get(), new ResourceLocation("ore_tree", "copper_tree"))
        );
        diamondTreeSapling = OTRegistryHandler.Blocks.register("diamond_tree_sapling"
                ,() -> new OreSaplingBlock(Items.DIAMOND, BlockTags.DIAMOND_ORES, OTCommonConfig.DIAMOND_TICK.get(), OTCommonConfig.DIAMOND_CATALYZE.get(), new ResourceLocation("ore_tree", "diamond_tree"))
        );
        emeraldTreeSapling = OTRegistryHandler.Blocks.register("emerald_tree_sapling"
                ,() -> new OreSaplingBlock(Items.EMERALD, BlockTags.EMERALD_ORES, OTCommonConfig.EMERALD_TICK.get(), OTCommonConfig.EMERALD_CATALYZE.get(), new ResourceLocation("ore_tree", "emerald_tree"))
        );
        goldTreeSapling = OTRegistryHandler.Blocks.register("gold_tree_sapling"
                ,() -> new OreSaplingBlock(Items.GOLD_INGOT, BlockTags.GOLD_ORES, OTCommonConfig.GOLD_TICK.get(), OTCommonConfig.GOLD_CATALYZE.get(), new ResourceLocation("ore_tree", "gold_tree"))
        );
        ironTreeSapling = OTRegistryHandler.Blocks.register("iron_tree_sapling"
                ,() -> new OreSaplingBlock(Items.IRON_INGOT, BlockTags.IRON_ORES, OTCommonConfig.IRON_TICK.get(), OTCommonConfig.IRON_CATALYZE.get(), new ResourceLocation("ore_tree", "iron_tree"))
        );
        lapisTreeSapling = OTRegistryHandler.Blocks.register("lapis_tree_sapling"
                ,() -> new OreSaplingBlock(Items.LAPIS_LAZULI, BlockTags.LAPIS_ORES, OTCommonConfig.LAPIS_TICK.get(), OTCommonConfig.LAPIS_CATALYZE.get(), new ResourceLocation("ore_tree", "lapis_tree"))
        );
        quartzTreeSapling = OTRegistryHandler.Blocks.register("quartz_tree_sapling"
                ,() -> new OreSaplingBlock(Items.QUARTZ, QUARTZ_ORES, OTCommonConfig.QUARTZ_TICK.get(), OTCommonConfig.QUARTZ_CATALYZE.get(), new ResourceLocation("ore_tree", "quartz_tree"))
        );
        redstoneTreeSapling = OTRegistryHandler.Blocks.register("redstone_tree_sapling"
                ,() -> new OreSaplingBlock(Items.REDSTONE, BlockTags.REDSTONE_ORES, OTCommonConfig.REDSTONE_TICK.get(), OTCommonConfig.REDSTONE_CATALYZE.get(), new ResourceLocation("ore_tree", "redstone_tree"))
        );
    }
}
