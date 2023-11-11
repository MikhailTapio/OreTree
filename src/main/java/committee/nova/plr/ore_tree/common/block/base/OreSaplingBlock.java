package committee.nova.plr.ore_tree.common.block.base;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import static committee.nova.plr.ore_tree.common.block.action.OreTreePlacement.consumeCatalyst;
import static committee.nova.plr.ore_tree.common.block.action.OreTreePlacement.tryPlace;


public class OreSaplingBlock extends PlantBlock {
    private static final IntProperty AGE = Properties.AGE_3;
    private static final VoxelShape SHAPE = Block.createCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);
    private final Item catalystItem;
    private final TagKey<Block> rootable;
    private final double randomTickValue;
    private final double randomCatalyzeValue;
    private final Identifier treeNBTLocation;

    public OreSaplingBlock(Item catalystItem, TagKey<Block> rootable, double randomTickValue, double randomCatalyzeValue, Identifier treeNBTLocation) {
        super(Settings.create().ticksRandomly().noCollision().sounds(BlockSoundGroup.GRASS).breakInstantly());
        this.setDefaultState(this.stateManager.getDefaultState().with(AGE, 0));
        this.catalystItem = catalystItem;
        this.randomTickValue = randomTickValue;
        this.randomCatalyzeValue = randomCatalyzeValue;
        this.treeNBTLocation = treeNBTLocation;
        this.rootable = rootable;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(AGE, 0);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }


    @Override
    public boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(rootable);
    }

    @Override
    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return new ItemStack(this);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        int i = state.get(AGE);

        if (random.nextDouble() <= randomTickValue && world.getBaseLightLevel(pos.up(), 0) >= 9) {
            if (i < 3) {
                world.setBlockState(pos, state.with(AGE, i + 1), 2);
            } else {
                tryPlace(world, treeNBTLocation, pos);
            }
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        int i = state.get(AGE);
        final var random = world.random;
        if (player.getStackInHand(hand).getItem() == catalystItem) {
            if (!(i >= 3)) {

                if (random.nextDouble() <= randomCatalyzeValue) {
                    if (world instanceof ServerWorld serverLevel) {
                        serverLevel.spawnParticles(ParticleTypes.HAPPY_VILLAGER, pos.getX() + 0.5, pos.getY() + 0.7, pos.getZ() + 0.5, 5, 0, 0, 0, 1);
                        serverLevel.setBlockState(pos, state.with(AGE, i + 1), 2);
                    }
                } else {
                    if (world.isClient) {
                        world.addParticle(ParticleTypes.LARGE_SMOKE, pos.getX() + 0.5, pos.getY() + 0.7, pos.getZ() + 0.5, 0, 0, 0);
                    }
                }

                consumeCatalyst(player, catalystItem);

            } else {
                if (tryPlace(world, treeNBTLocation, pos)) {
                    consumeCatalyst(player, catalystItem);
                }
            }
        } else {
            return super.onUse(state, world, pos, player, hand, hit);
        }
        return ActionResult.PASS;
    }
}
