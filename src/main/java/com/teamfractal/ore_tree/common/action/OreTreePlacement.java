package com.teamfractal.ore_tree.common.action;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AirBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;

public class OreTreePlacement {
    public static void consumeCatalyst(Player player, ItemStack stack){
        if (player instanceof ServerPlayer serverPlayer){
            if (!serverPlayer.gameMode.getGameModeForPlayer().isCreative()) {
                player.getInventory()
                        .clearOrCountMatchingItems(p -> stack.getItem() == p.getItem()
                                ,1,player.inventoryMenu.getCraftSlots());
            }
        }
    }

    public static boolean tryPlace(Level level, ResourceLocation loc, BlockPos pos){
        if(readyForPlacement(level,pos)) {
            if(level instanceof ServerLevel serverLevel){
                serverLevel.setBlock(pos, Blocks.AIR.defaultBlockState(),2);
                StructureTemplate structure = serverLevel.getStructureManager().getOrCreate(loc);
                int x = pos.getX() - 2;
                int y = pos.getY();
                int z = pos.getZ() - 2;
                structure.placeInWorld(serverLevel, new BlockPos(x, y, z),
                        new BlockPos(x, y, z),
                        new StructurePlaceSettings().setIgnoreEntities(false),
                        serverLevel.random, 3);
            }
            return true;
        }
        return false;
    }

    private static boolean readyForPlacement(Level level, BlockPos pos){
        boolean result = true;
        double sx = 0;
        double sy;
        double sz;
        for (int y = 0; y < 5 && result; y++) {
            sy = 1;
            for (int z = 0; z < 5 && result; z++) {
                sz = -2;
                for (int x = 0; x < 5 && result; x++) {
                    result = isTargetBlockReplaceable(level.getBlockState(new BlockPos(pos.getX() + sx, pos.getY() + sy, pos.getZ() + sz)).getBlock());
                    sz++;
                }
                sy++;
            }
            sx++;
        }
        return result;
    }

    private static boolean isTargetBlockReplaceable(Block block){
        return BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("minecraft:leaves"))
                .contains(block)
                ||BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("minecraft:saplings"))
                .contains(block)
                ||block instanceof AirBlock;
    }
}
