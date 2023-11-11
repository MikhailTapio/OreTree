package committee.nova.plr.ore_tree.common.block.base;

import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class OreInlaidLogBlock extends Block {
    public OreInlaidLogBlock() {
        super(Settings.create().sounds(BlockSoundGroup.WOOD).strength(1f, 10f).requiresTool());
    }
}
