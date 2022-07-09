package committee.nova.plr.ore_tree.common.block.base;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class OreInlaidLogBlock extends Block {
    public OreInlaidLogBlock() {
        super(Settings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1f, 10f).requiresTool());
    }
}
