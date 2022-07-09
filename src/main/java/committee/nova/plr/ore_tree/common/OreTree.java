package committee.nova.plr.ore_tree.common;

import committee.nova.plr.ore_tree.common.block.OTBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class OreTree implements ModInitializer {
    public static final String N = "ore_tree";
    public static final ItemGroup OreTree = FabricItemGroupBuilder.build(
            new Identifier("ore_tree", "main"),
            () -> new ItemStack(OTBlocks.diamondTreeLog));

    @Override
    public void onInitialize() {
        OTBlocks.register();
    }
}
