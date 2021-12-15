package com.teamfractal.ore_tree.client.render;

import com.teamfractal.ore_tree.common.block.init.OTBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RenderTypeRegistry {
    @SubscribeEvent
    public static void onRenderTypeSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(OTBlocks.coalTreeSapling.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(OTBlocks.copperTreeSapling.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(OTBlocks.diamondTreeSapling.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(OTBlocks.emeraldTreeSapling.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(OTBlocks.goldTreeSapling.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(OTBlocks.ironTreeSapling.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(OTBlocks.lapisTreeSapling.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(OTBlocks.quartzTreeSapling.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(OTBlocks.redstoneTreeSapling.get(), RenderType.cutout());
        });
    }
}
