package committee.nova.plr.ore_tree.common.tab;

import committee.nova.plr.ore_tree.common.OreTree;
import committee.nova.plr.ore_tree.common.block.OTBlocks;
import committee.nova.plr.ore_tree.common.block.base.OreInlaidLogBlock;
import committee.nova.plr.ore_tree.common.block.base.OreSaplingBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class OTTabs {
    public static ItemGroup ore_tree = ItemGroup.create(ItemGroup.Row.TOP, 0)
            .displayName(Text.translatable("itemGroup.ore_tree.main"))
            .icon(() -> new ItemStack(OTBlocks.diamondTreeLog))
            .entries((ctx, e) -> {
                Registries.BLOCK.forEach(b -> {
                    if (!(b instanceof OreSaplingBlock) && !(b instanceof OreInlaidLogBlock)) return;
                    e.add(new ItemStack(b));
                });
            })
            .build();

    public static void register() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(OreTree.MODID, "main"), ore_tree);
    }
}
