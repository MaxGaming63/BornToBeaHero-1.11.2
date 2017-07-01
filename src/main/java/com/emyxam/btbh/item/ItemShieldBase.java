package com.emyxam.btbh.item;

import com.emyxam.btbh.client.HeroTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemShield;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;


public class ItemShieldBase extends ItemShield{

    protected String name;

    public ItemShieldBase(String unlocalizedName, int maxDamage)
    {
        super();

        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setMaxDamage(maxDamage);
        this.name = name;
        this.setCreativeTab(HeroTab.creativeTab);
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabs.COMBAT);
        this.setMaxDamage(336);
        this.addPropertyOverride(new ResourceLocation("captain_shield_blocking"), new IItemPropertyGetter()
        {
            @SideOnly(Side.CLIENT)
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
            {
                return entityIn != null && entityIn.isHandActive() && entityIn.getActiveItemStack() == stack ? 1.0F : 0.0F;
            }
        });
    }
}

