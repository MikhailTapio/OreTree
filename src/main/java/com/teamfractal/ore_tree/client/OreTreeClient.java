package com.teamfractal.ore_tree.client;

import com.teamfractal.ore_tree.common.block.OTBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class OreTreeClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(OTBlocks.coalTreeSapling, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OTBlocks.copperTreeSapling, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OTBlocks.diamondTreeSapling, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OTBlocks.emeraldTreeSapling, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OTBlocks.goldTreeSapling, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OTBlocks.ironTreeSapling, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OTBlocks.lapisTreeSapling, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OTBlocks.quartzTreeSapling, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OTBlocks.redstoneTreeSapling, RenderLayer.getCutout());
    }
}
