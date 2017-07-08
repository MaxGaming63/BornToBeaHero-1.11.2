package com.emyxam.btbh.proxy;

import com.emyxam.btbh.block.ModBlocks;
import com.emyxam.btbh.item.ModItems;
import com.emyxam.btbh.item.armors.marvel.*;
import com.emyxam.btbh.recipe.ModRecipes;
import com.emyxam.btbh.world.ModWorldGen;
import net.minecraft.item.Item;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public abstract class CommonProxy {

    public static CommonProxy proxy;

    public void preInit(FMLPreInitializationEvent event){
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
        ModItems.init();
        ModBlocks.init();
    }

    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new ItemIronmanArmor.abilityHandler());
        MinecraftForge.EVENT_BUS.register(new ItemCaptainArmor.abilityHandler());
        MinecraftForge.EVENT_BUS.register(new ItemHulkArmor.abilityHandler());
        MinecraftForge.EVENT_BUS.register(new ItemEyeArmor.abilityHandler());
        MinecraftForge.EVENT_BUS.register(new ItemThorArmor.abilityHandler());
        ModRecipes.init();
    }

    public void postInit(FMLPostInitializationEvent event) {

    }

    public void registerItemRenderer(Item item, int meta, String id) {
    }

    public String localize(String unlocalized, Object... args) {
        return I18n.translateToLocalFormatted(unlocalized, args);
    }

}
