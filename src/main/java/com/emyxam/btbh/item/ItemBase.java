package com.emyxam.btbh.item;


import com.emyxam.btbh.BornToBeaHero;
import net.minecraft.item.Item;


public class ItemBase extends Item {
    protected String name;

    public ItemBase(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(BornToBeaHero.creativeTab);
    }

    public void registerItemModel(Item item) {
        BornToBeaHero.proxy.registerItemRenderer(this, 0, name);
    }
}