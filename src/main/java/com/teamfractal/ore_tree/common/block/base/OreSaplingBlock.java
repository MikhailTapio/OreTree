package com.teamfractal.ore_tree.common.block.base;

import com.teamfractal.ore_tree.client.config.OTClientConfig;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.Tag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nonnull;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static com.teamfractal.ore_tree.common.action.OreTreePlacement.consumeCatalyst;
import static com.teamfractal.ore_tree.common.action.OreTreePlacement.tryPlace;

public class OreSaplingBlock extends BushBlock{
    private static final IntegerProperty AGE = BlockStateProperties.AGE_3;
    private static final VoxelShape SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);
    private final Item catalystItem;
    private final Tag<Block> rootable;
    private final double randomTickValue;
    private final double randomCatalyzeValue;
    private final ResourceLocation treeNBTLocation;
    public OreSaplingBlock(Item catalystItem, Tag<Block> rootable, double randomTickValue, double randomCatalyzeValue, ResourceLocation treeNBTLocation) {
        super(Properties.of(Material.PLANT).randomTicks().noCollission().sound(SoundType.GRASS).instabreak());
        this.catalystItem = catalystItem;
        this.randomTickValue = randomTickValue;
        this.randomCatalyzeValue = randomCatalyzeValue;
        this.treeNBTLocation = treeNBTLocation;
        this.rootable = rootable;
        this.registerDefaultState(this.stateDefinition.any().setValue(AGE, 0));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    public BlockState getStateForPlacement(@Nonnull BlockPlaceContext p_48881_) {
        return this.defaultBlockState().setValue(AGE, 0);
    }

    @Nonnull
    public VoxelShape getShape(@Nonnull BlockState state, @Nonnull BlockGetter getter, @Nonnull BlockPos pos, @Nonnull CollisionContext cc) {
        return SHAPE;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 100;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 60;
    }

    @Nonnull
    @Override
    public List<ItemStack> getDrops(@Nonnull BlockState state, @Nonnull LootContext.Builder builder) {
        final List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }

    @Override
    public boolean mayPlaceOn(BlockState groundState, @Nonnull BlockGetter worldIn, @Nonnull BlockPos pos) {
        return groundState.is(rootable);
    }

    @Override
    public boolean canSurvive(@Nonnull BlockState blockstate, @Nonnull LevelReader worldIn, BlockPos pos) {
        return this.mayPlaceOn(worldIn.getBlockState(pos.below()), worldIn, pos.below());
    }

    @Nonnull
    public ItemStack getCloneItemStack(@Nonnull BlockGetter p_52254_, @Nonnull BlockPos p_52255_, @Nonnull BlockState p_52256_) {
        return new ItemStack(this);
    }

    public void randomTick(BlockState state, @Nonnull ServerLevel world, @Nonnull BlockPos pos, @Nonnull Random random) {
        final int i = state.getValue(AGE);

        if(random.nextDouble() <= randomTickValue && world.getBrightness(LightLayer.SKY, pos.above()) - world.getSkyDarken() >= 9)
        {
            if (i < 3) {
                world.setBlock(pos, state.setValue(AGE, i + 1), 2);
            }else{
                tryPlace(world,treeNBTLocation,pos);
            }
        }
    }

    @Nonnull
    public InteractionResult use(@Nonnull BlockState state, @Nonnull Level level, @Nonnull BlockPos pos, @Nonnull Player player, @Nonnull InteractionHand hand, @Nonnull BlockHitResult trace) {
        final int i = state.getValue(AGE);
        final Random random = level.random;
        if(player.getItemInHand(hand).getItem() == catalystItem){
            if (!(i >= 3)) {

                if(random.nextDouble() <= randomCatalyzeValue) {
                    if(level instanceof ServerLevel serverLevel)
                    {
                        serverLevel.sendParticles(ParticleTypes.HAPPY_VILLAGER, pos.getX() + 0.5, pos.getY() + 0.7, pos.getZ() + 0.5, 5, 0, 0, 0, 1);
                        serverLevel.setBlock(pos, state.setValue(AGE, i + 1), 2);
                    }
                }
                else if(OTClientConfig.CATALYZE_FAILURE_PARTICLE_DISPLAY.get()){
                    if(level instanceof ClientLevel clientLevel){
                        clientLevel.addParticle(ParticleTypes.LARGE_SMOKE, pos.getX() + 0.5, pos.getY() + 0.7, pos.getZ() + 0.5, 0, 0, 0);
                    }
                }
                consumeCatalyst(player, catalystItem.getDefaultInstance());
            }else{
                if(tryPlace(level,treeNBTLocation,pos)) {
                    consumeCatalyst(player, catalystItem.getDefaultInstance());
                }
            }
        }else {
            return super.use(state, level, pos, player, hand, trace);
        }
        return InteractionResult.PASS;
    }
}
