package com.emyxam.btbh;


import com.emyxam.btbh.client.HeroTab;
import com.emyxam.btbh.item.armors.marvel.ItemCaptainArmor;
import com.emyxam.btbh.item.armors.marvel.ItemIronmanArmor;
import com.emyxam.btbh.proxy.CommonProxy;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod (modid = Info.modId, name = Info.name, version = Info.version)

public class BornToBeaHero {

    @Mod.Instance
    public static BornToBeaHero instance;

    @SidedProxy(serverSide = "com.emyxam.btbh.proxy.CommonProxy", clientSide = "com.emyxam.btbh.proxy.ClientProxy")
    public static CommonProxy proxy;

    public static final HeroTab creativeTab = new HeroTab();

    public static ItemCaptainArmor.ArmorMaterial captainArmorMaterial = EnumHelper.addArmorMaterial("CAPTAIN", Info.modId + ":captain", 8, new int[]{2, 2, 2, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static ItemArmor.ArmorMaterial eyeArmorMaterial = EnumHelper.addArmorMaterial("EYE", Info.modId + ":eye", 8, new int[]{5, 5, 5, 5}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static ItemArmor.ArmorMaterial thorArmorMaterial = EnumHelper.addArmorMaterial("THOR", Info.modId + ":thor", 16, new int[]{4, 4, 4, 4}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static ItemIronmanArmor.ArmorMaterial hulkArmorMaterial = EnumHelper.addArmorMaterial("HULK", Info.modId + ":hulk", 40, new int[]{10, 10, 10, 10}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static ItemIronmanArmor.ArmorMaterial manArmorMaterial = EnumHelper.addArmorMaterial("MAN", Info.modId + ":man", 40, new int[]{10, 10, 10, 10}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static  ItemArmor.ArmorMaterial blackArmorMaterial = EnumHelper.addArmorMaterial("BLACK", Info.modId + ":black", 20, new int[]{5, 5, 5, 5}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final Item.ToolMaterial ThorToolMaterial = EnumHelper.addToolMaterial("THOR", 2, -1, 6, 40, 14);
    //public static final Item.ToolMaterial EyeToolMaterial = EnumHelper.addToolMaterial("EYE",2,1,6,40,14);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(Info.name + " is loading!");
        this.proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        this.proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        this.proxy.postInit(event);
    }
}