package com.emyxam.btbh.item;


import com.emyxam.btbh.BornToBeaHero;
import com.emyxam.btbh.item.armors.marvel.ItemCaptainArmor;
import com.emyxam.btbh.item.armors.marvel.ItemIronmanArmor;
import com.emyxam.btbh.item.tool.ItemSword;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class   ModItems{
    /*-----Ingot-----*/
    public static ItemBase ingotVibranium;
    public static ItemBase ingotAmantium;
    public static ItemBase ingotSteel;
    public static ItemBase ingotTitanium;
    public static ItemBase ingotUru;
    /*Captain*/
    public static ItemCaptainArmor captain_helmet;
    public static ItemCaptainArmor captain_boots;
    public static ItemCaptainArmor captain_chestplate;
    public static ItemCaptainArmor captain_leggings;
    //public static ItemShieldBase captain_shield;
    /*Eye*/
    public static ItemArmor eye_helmet;
    public static ItemArmor eye_boots;
    public static ItemArmor eye_chestplate;
    public static ItemArmor eye_leggings;
    public static ItemBow eye_bow;
    /*IronMan*/
    public static ItemIronmanArmor man_helmet;
    public static ItemIronmanArmor man_boots;
    public static ItemIronmanArmor man_chestplate;
    public static ItemIronmanArmor man_leggings;
    /*Hulk*/
    public static ItemIronmanArmor hulk_helmet;
    public static ItemIronmanArmor hulk_boots;
    public static ItemIronmanArmor hulk_chestplate;
    public static ItemIronmanArmor hulk_leggings;
    /*black*/
    public static ItemArmor black_helmet;
    public static ItemArmor black_boots;
    public static ItemArmor black_chestplate;
    public static ItemArmor black_leggings;
    /*thor*/
    public static ItemArmor thor_helmet;
    public static ItemArmor thor_boots;
    public static ItemArmor thor_chestplate;
    public static ItemArmor thor_leggings;
    public static ItemSword thor_hammer;

    public static void init() {

                   /*-----Ingot-----*/
        ingotVibranium = register(new ItemOre("ingot_vibranium","ingot_vibranium"));
        ingotAmantium = register(new ItemOre("ingot_adamantium", "ingot_adamantium"));
        ingotSteel = register(new ItemOre("ingot_steel", "ingot_steel"));
        ingotTitanium = register(new ItemOre("ingot_titanium", "ingot_titanium"));
        ingotUru = register(new ItemOre("ingot_uru","ingot_uru"));
                       /*Captain*/
        captain_leggings = register(new ItemCaptainArmor(BornToBeaHero.avengerArmorMaterial, EntityEquipmentSlot.LEGS, "captain_leggings"));
        captain_boots = register(new ItemCaptainArmor(BornToBeaHero.avengerArmorMaterial, EntityEquipmentSlot.FEET, "captain_boots"));
        captain_chestplate = register(new ItemCaptainArmor(BornToBeaHero.avengerArmorMaterial, EntityEquipmentSlot.CHEST, "captain_chestplate"));
        captain_helmet = register(new ItemCaptainArmor(BornToBeaHero.avengerArmorMaterial, EntityEquipmentSlot.HEAD, "captain_helmet"));
        //captain_shield = register(new ItemShieldBase("captain_shield", 2048));
                        /*Eye*/
        eye_leggings = register(new ItemArmor(BornToBeaHero.eyeArmorMaterial, EntityEquipmentSlot.LEGS, "eye_leggings"));
        eye_boots = register(new ItemArmor(BornToBeaHero.eyeArmorMaterial, EntityEquipmentSlot.FEET, "eye_boots"));
        eye_chestplate = register(new ItemArmor(BornToBeaHero.eyeArmorMaterial, EntityEquipmentSlot.CHEST, "eye_chestplate"));
        eye_helmet = register(new ItemArmor(BornToBeaHero.eyeArmorMaterial, EntityEquipmentSlot.HEAD, "eye_helmet"));
                      /*IronMan*/
        man_leggings = register(new ItemIronmanArmor(BornToBeaHero.manArmorMaterial,EntityEquipmentSlot.LEGS, "man_leggings"));
        man_boots = register(new ItemIronmanArmor(BornToBeaHero.manArmorMaterial, EntityEquipmentSlot.FEET, "man_boots"));
        man_chestplate = register(new ItemIronmanArmor(BornToBeaHero.manArmorMaterial, EntityEquipmentSlot.CHEST, "man_chestplate"));
        man_helmet = register(new ItemIronmanArmor(BornToBeaHero.manArmorMaterial, EntityEquipmentSlot.HEAD, "man_helmet"));
                      /*Hulk*/
        hulk_leggings = register(new ItemIronmanArmor(BornToBeaHero.hulkArmorMaterial, EntityEquipmentSlot.LEGS, "hulk_leggings"));
        hulk_boots = register(new ItemIronmanArmor(BornToBeaHero.hulkArmorMaterial, EntityEquipmentSlot.FEET, "hulk_boots"));
        hulk_chestplate = register(new ItemIronmanArmor(BornToBeaHero.hulkArmorMaterial, EntityEquipmentSlot.CHEST, "hulk_chestplate"));
        hulk_helmet = register(new ItemIronmanArmor(BornToBeaHero.hulkArmorMaterial, EntityEquipmentSlot.HEAD, "hulk_helmet"));
                      /*Black*/
        black_leggings = register(new ItemArmor(BornToBeaHero.blackArmorMaterial, EntityEquipmentSlot.LEGS, "black_leggings"));
        black_boots = register(new ItemArmor(BornToBeaHero.blackArmorMaterial, EntityEquipmentSlot.FEET, "black_boots"));
        black_chestplate = register(new ItemArmor(BornToBeaHero.blackArmorMaterial, EntityEquipmentSlot.CHEST, "black_chestplate"));
        black_helmet = register(new ItemArmor(BornToBeaHero.blackArmorMaterial, EntityEquipmentSlot.HEAD, "black_helmet"));
                       /*Thor*/
        thor_leggings = register(new ItemArmor(BornToBeaHero.thorArmorMaterial, EntityEquipmentSlot.LEGS, "thor_leggings"));
        thor_boots = register(new ItemArmor(BornToBeaHero.thorArmorMaterial, EntityEquipmentSlot.FEET, "thor_boots"));
        thor_chestplate = register(new ItemArmor(BornToBeaHero.thorArmorMaterial, EntityEquipmentSlot.CHEST, "thor_chestplate"));
        thor_helmet = register(new ItemArmor(BornToBeaHero.thorArmorMaterial, EntityEquipmentSlot.HEAD, "thor_helmet"));
        thor_hammer = register(new ItemSword(BornToBeaHero.ThorToolMaterial,"thor_hammer"));
    }

    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);

        if (item instanceof ItemBase) {
            ((ItemBase)item).registerItemModel(item);
        }
        if (item instanceof ItemOreDict) {
            ((ItemOreDict)item).initOreDict();
        }

        if ((item instanceof ItemModelProvider)) {
            ((ItemModelProvider)item).registerItemModel(item);
        }

        return item;
    }}