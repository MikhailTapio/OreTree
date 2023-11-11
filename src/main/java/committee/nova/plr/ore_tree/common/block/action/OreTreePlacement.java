package committee.nova.plr.ore_tree.common.block.action;

import net.minecraft.block.AirBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.structure.StructurePlacementData;
import net.minecraft.structure.StructureTemplate;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class OreTreePlacement {
    public static void consumeCatalyst(PlayerEntity player, Item item) {
        if (player instanceof ServerPlayerEntity serverPlayer) {
            if (!serverPlayer.interactionManager.getGameMode().isCreative()) {
                player.getInventory().remove(e -> e.isOf(item), 1, player.getInventory());
            }
        }
    }

    public static boolean tryPlace(World level, Identifier loc, BlockPos pos) {
        if (readyForPlacement(level, pos)) {
            if (level instanceof ServerWorld serverLevel) {
                serverLevel.setBlockState(pos, Blocks.AIR.getDefaultState(), 2);
                StructureTemplate structure = serverLevel.getStructureTemplateManager().getTemplateOrBlank(loc);
                int x = pos.getX() - 2;
                int y = pos.getY();
                int z = pos.getZ() - 2;
                structure.place(serverLevel, new BlockPos(x, y, z),
                        new BlockPos(x, y, z),
                        new StructurePlacementData().setIgnoreEntities(false),
                        serverLevel.random, 3);
            }
            return true;
        }
        return false;
    }

    private static boolean readyForPlacement(World level, BlockPos pos) {
        boolean result = true;
        int sx = 0;
        int sy;
        int sz;
        for (int y = 0; y < 5 && result; y++) {
            sy = 1;
            for (int z = 0; z < 5 && result; z++) {
                sz = -2;
                for (int x = 0; x < 5 && result; x++) {
                    result = isTargetBlockReplaceable(level.getBlockState(new BlockPos(pos.getX() + sx, pos.getY() + sy, pos.getZ() + sz)));
                    sz++;
                }
                sy++;
            }
            sx++;
        }
        return result;
    }

    private static boolean isTargetBlockReplaceable(BlockState state) {
        return state.isIn(BlockTags.LEAVES) || state.isIn(BlockTags.SAPLINGS) || state.getBlock() instanceof AirBlock;
    }
}
