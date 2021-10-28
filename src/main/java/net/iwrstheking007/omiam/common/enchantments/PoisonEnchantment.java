package net.iwrstheking007.omiam.common.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class PoisonEnchantment extends Enchantment {
    public PoisonEnchantment(Enchantment.Rarity rarity, EnchantmentType enchantType, EquipmentSlotType... equipSlot) {
        super(rarity, enchantType, equipSlot);
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public int getMinLevel() {
        return 1;
    }

    @Override
    public void doPostAttack(LivingEntity user, Entity target, int level) {
            for(int i = 0; i < level; i++) {
                ((LivingEntity) target).addEffect(new EffectInstance(Effects.POISON, 100 * level, -1 + level));
            }
    }
}
