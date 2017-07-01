package com.emyxam.btbh.block;

import com.emyxam.btbh.item.ItemOreDict;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;

public class BlockOre extends BlockBase implements ItemOreDict{

    private String oreName;

    public BlockOre(String name, String oreName) {
        super(Material.ROCK, name);

        this.oreName = oreName;

        setHardness(3f);
        setResistance(5f);
    }

    @Override
    public void initOreDict() {
        OreDictionary.registerOre(this.oreName, this);
    }
}
