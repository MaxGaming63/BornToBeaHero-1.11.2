package com.emyxam.btbh.block;

import com.emyxam.btbh.item.ItemOreDict;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.emyxam.btbh.item.ItemModelProvider;

public class ModBlocks{

    public static BlockBase ore_vibranium;
    public static BlockBase block_uru;
    public static BlockBase ore_uru;

    public static void init() {

        ore_vibranium = register(new BlockOre("ore_vibranium", "ore_vibranium"));
        ore_uru = register(new BlockOre("ore_uru", "ore_uru"));
        block_uru = register(new BlockOre("block_uru", "block_uru"));

    }
    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        if (itemBlock != null) {
            GameRegistry.register(itemBlock);
            if (block instanceof ItemModelProvider) {
                ((ItemModelProvider)block).registerItemModel(itemBlock);
            }
            if (block instanceof ItemOreDict) {
                ((ItemOreDict)block).initOreDict();
            } else if (itemBlock instanceof ItemOreDict) {
                ((ItemOreDict)itemBlock).initOreDict();
            }
        }


        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}

