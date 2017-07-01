package com.emyxam.btbh.proxy;


import com.emyxam.btbh.BornToBeaHero;
import com.emyxam.btbh.Info;
import com.emyxam.btbh.item.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {


    @Override
    public void preInit(FMLPreInitializationEvent event){
        super.preInit(event);
        OBJLoader.INSTANCE.addDomain(Info.modId);
        registerModel(ModItems.thor_hammer);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }

    public void registerModel(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Info.modId + ":" + item.getUnlocalizedName().substring(5),"inventory"));
    }

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Info.modId + ":" + id, "inventory"));
    }

    @Override
    public String localize(String unlocalized, Object... args) {
        return I18n.format(unlocalized, args);
    }
}
