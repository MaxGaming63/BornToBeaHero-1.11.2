package com.emyxam.btbh.block;

import com.emyxam.btbh.BornToBeaHero;
import com.emyxam.btbh.item.ItemModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockBase extends Block implements ItemModelProvider{

    protected String name;

    public BlockBase(Material material, String name) {
        super(material);

        this.name = name;

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(BornToBeaHero.creativeTab);
    }
    public void registerItemModel(Item item)
    {
        BornToBeaHero.proxy.registerItemRenderer(item, 0, this.name);
    }
}