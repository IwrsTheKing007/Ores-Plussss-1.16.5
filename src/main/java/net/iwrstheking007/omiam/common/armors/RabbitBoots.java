package net.iwrstheking007.omiam.common.armors;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class RabbitBoots extends ArmorItem {
    public RabbitBoots(IArmorMaterial material, EquipmentSlotType equipSlot, Properties properties) {
        super(material, equipSlot, properties);
    }

    @Override
    public void onArmorTick(ItemStack itemStack, World world, PlayerEntity player) {
        if(!world.isClientSide) {
            player.addEffect(new EffectInstance(Effects.JUMP, 5, 2, false, false, true));
        }
        player.fallDistance = 0F;
    }

}
