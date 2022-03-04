package com.teamfractal.ore_tree.common.creativeTab;

import com.teamfractal.ore_tree.common.item.init.OTItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class OTTabs {
    public static final CreativeModeTab MAIN = new CreativeModeTab("ore_tree.main") {
        @Override
        @Nonnull
        public ItemStack makeIcon() {
            return new ItemStack(OTItems.diamondTreeSapling.get());
        }
    };
}
