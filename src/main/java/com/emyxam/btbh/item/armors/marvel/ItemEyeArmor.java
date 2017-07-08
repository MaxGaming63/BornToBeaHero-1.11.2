package com.emyxam.btbh.item.armors.marvel;

import com.emyxam.btbh.BornToBeaHero;
import com.emyxam.btbh.item.ItemModelProvider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

public class ItemEyeArmor extends net.minecraft.item.ItemArmor implements ItemModelProvider {

    private String name;

    public ItemEyeArmor(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
        super(material, 0, slot);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
        setCreativeTab(BornToBeaHero.creativeTab);
        this.setMaxStackSize(1);
    }

    @Override
    public void registerItemModel(Item item) {

        BornToBeaHero.proxy.registerItemRenderer(this, 0, name);
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {
        int damage = stack.getMaxDamage() - stack.getItemDamage();
        tooltip.add("Durability: \u00A7c" + damage);

    }

    public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
        ItemStack head = entity.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
        ItemStack chest = entity.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
        ItemStack legs = entity.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
        ItemStack feet = entity.getItemStackFromSlot(EntityEquipmentSlot.FEET);

        if (head != null && head.getItem() instanceof ItemEyeArmor && chest != null && chest.getItem() instanceof ItemEyeArmor && legs != null && legs.getItem() instanceof ItemEyeArmor && feet != null && feet.getItem() instanceof ItemEyeArmor || entity.capabilities.isCreativeMode || entity.isSpectator()) {
            entity.fallDistance = 0.0F;
        }
    }

    @Override
    public int getItemEnchantability() {
        return 0;
    }

    public static class abilityHandler {

        public static List<String> playersWithSet = new ArrayList<String>();
        private boolean hasset;

        public static String playerKey(EntityPlayer player) {
            return player.getGameProfile().getName() + ":" + player.world.isRemote;
        }

        public static boolean playerHasSet(EntityPlayer entity) {
            ItemStack head = entity.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
            ItemStack chest = entity.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
            ItemStack legs = entity.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
            ItemStack feet = entity.getItemStackFromSlot(EntityEquipmentSlot.FEET);

            return head != null && head.getItem() instanceof ItemEyeArmor && chest != null && chest.getItem() instanceof ItemEyeArmor && legs != null && legs.getItem() instanceof ItemEyeArmor && feet != null && feet.getItem() instanceof ItemEyeArmor;
        }

        @SubscribeEvent
        public void updatePlayerAbilityStatus(LivingEvent.LivingUpdateEvent event){
            if(event.getEntityLiving() instanceof EntityPlayer){
                EntityPlayer player = (EntityPlayer)event.getEntityLiving();
                String key = playerKey(player);

                Boolean hasSet = playerHasSet(player);

                if(playersWithSet.contains(key)){
                    if(hasSet){
                        player.addPotionEffect(new PotionEffect(Potion.getPotionById(16),10, 1));   //NightVision
                    } else {
                        player.stepHeight = 0.5F;
                        if(!player.capabilities.isCreativeMode && !player.isSpectator()){
                        }
                        playersWithSet.remove(key);
                    }
                }else if(hasSet){
                    playersWithSet.add(key);
                }
            }
        }

    } // End Ability class
}
