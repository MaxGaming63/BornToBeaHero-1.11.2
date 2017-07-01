package com.emyxam.btbh.item;

import com.emyxam.btbh.BornToBeaHero;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;


public class ItemArmor extends net.minecraft.item.ItemArmor implements ItemModelProvider {

    private String name;

    public ItemArmor(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
        super(material, 0, slot);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
        setCreativeTab(BornToBeaHero.creativeTab);
    }

    @Override
    public void registerItemModel(Item item) {

        BornToBeaHero.proxy.registerItemRenderer(this, 0, name);
    }

}