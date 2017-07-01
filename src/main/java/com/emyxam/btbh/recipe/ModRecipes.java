package com.emyxam.btbh.recipe;

import com.emyxam.btbh.block.ModBlocks;
import com.emyxam.btbh.item.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init() {

        GameRegistry.addSmelting(ModBlocks.ore_vibranium, new ItemStack(ModItems.ingotVibranium), 1.5f);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotSteel), Items.IRON_INGOT, Items.COAL);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.ingotTitanium), "SOS", "ODO", "SOS", 'S', ModItems.ingotSteel, 'O', Blocks.OBSIDIAN, 'D', Items.DIAMOND);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotAmantium), ModItems.ingotSteel, ModItems.ingotTitanium, ModItems.ingotVibranium);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.block_uru),"AAA","AAA","AAA",'A', ModItems.ingotAmantium);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotUru, 9),ModBlocks.block_uru);
        //captain
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.captain_helmet),"WAW","W W", 'W', Blocks.WOOL, 'A', ModItems.ingotAmantium);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.captain_chestplate),"W W","WAW","WWW", 'W', Blocks.WOOL, 'A', ModItems.ingotAmantium);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.captain_leggings),"WAW","W W","W W", 'W', Blocks.WOOL, 'A', ModItems.ingotAmantium);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.captain_boots),"W W","A W", 'W', Blocks.WOOL, 'A', ModItems.ingotAmantium);
        //hawkeye
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.eye_helmet),"LAL","L B", 'L', Items.LEATHER, 'A', ModItems.ingotAmantium, 'B', Items.DYE);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.eye_chestplate),"L L","LAL","LBL", 'L', Items.LEATHER, 'A', ModItems.ingotAmantium, 'B', Items.DYE);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.eye_leggings),"LAL","L L","L B", 'L', Items.LEATHER, 'A', ModItems.ingotAmantium, 'B', Items.DYE);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.eye_boots),"L L","A B", 'L', Items.LEATHER, 'A', ModItems.ingotAmantium, 'B', Items.DYE);
        //IronMan
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.man_helmet),"IAI","I I", 'I', Items.IRON_INGOT, 'A', ModItems.ingotAmantium);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.man_chestplate),"I I","IAI","III", 'I', Items.IRON_INGOT, 'A', ModItems.ingotAmantium);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.man_leggings),"IAI","I I","I I", 'I', Items.IRON_INGOT, 'A', ModItems.ingotAmantium);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.man_boots),"I I","A I", 'I', Items.IRON_INGOT, 'A', ModItems.ingotAmantium);
        //Hulk
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.hulk_helmet),"EAE","E E", 'E', Blocks.EMERALD_BLOCK, 'A', ModItems.ingotAmantium);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.hulk_chestplate),"E E","EAE","EEE", 'E', Blocks.EMERALD_BLOCK, 'A', ModItems.ingotAmantium);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.hulk_leggings),"EAE","E E","E E", 'E', Blocks.EMERALD_BLOCK, 'A', ModItems.ingotAmantium);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.hulk_boots),"E E","A E", 'E', Blocks.EMERALD_BLOCK, 'A', ModItems.ingotAmantium);
        //BlackWidow
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.black_helmet),"LAL","B L", 'L', Items.LEATHER, 'A', ModItems.ingotAmantium, 'B', Items.DYE);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.black_chestplate),"L L","LBL","LAL", 'L', Items.LEATHER, 'A', ModItems.ingotAmantium, 'B', Items.DYE);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.black_leggings),"LAL","L L","B L", 'L', Items.LEATHER, 'A', ModItems.ingotAmantium, 'B', Items.DYE);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.black_boots),"L L","B A", 'L', Items.LEATHER, 'A', ModItems.ingotAmantium, 'B', Items.DYE);
        //Thor
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.thor_helmet),"FAF","I I", 'F', Items.FEATHER, 'A', ModItems.ingotAmantium, 'I', Items.IRON_INGOT);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.thor_chestplate),"I I","IAI","IBI", 'I', Items.IRON_INGOT, 'A', ModItems.ingotAmantium, 'B', Items.BANNER);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.thor_leggings),"IIA","I I","I I", 'I', Items.IRON_INGOT, 'A', ModItems.ingotAmantium);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.thor_boots),"I I","I A", 'L', Items.LEATHER, 'A', ModItems.ingotAmantium);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.thor_hammer),"BBB"," V "," V ",'B', ModBlocks.block_uru, 'V', ModItems.ingotVibranium);
    }

}
