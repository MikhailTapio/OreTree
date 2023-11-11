package committee.nova.plr.ore_tree.common;

import committee.nova.plr.ore_tree.common.block.OTBlocks;
import committee.nova.plr.ore_tree.common.tab.OTTabs;
import net.fabricmc.api.ModInitializer;

public class OreTree implements ModInitializer {
    public static final String MODID = "ore_tree";

    @Override
    public void onInitialize() {
        OTBlocks.register();
        OTTabs.register();
    }
}
