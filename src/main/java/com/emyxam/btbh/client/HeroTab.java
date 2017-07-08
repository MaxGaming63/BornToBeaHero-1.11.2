package com.emyxam.btbh.client;

import com.emyxam.btbh.Info;
import com.emyxam.btbh.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class HeroTab extends CreativeTabs {

    public static CreativeTabs creativeTab;

    public HeroTab() {
        super(Info.modId);
        setBackgroundImageName("tab_btbh.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.ingotVibranium);

    }

    @Override
    public boolean hasSearchBar() {
        return false;
    }

}