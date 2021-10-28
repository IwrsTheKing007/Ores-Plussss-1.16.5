package net.iwrstheking007.omiam.setup;

import net.iwrstheking007.omiam.common.enchantments.PoisonEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.fml.RegistryObject;

public class ModEnchants {

    public static final RegistryObject<Enchantment> POISON_ENCHANT = Registrations.ENCHANTMENTS.register("poison", () -> new PoisonEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.WEAPON, EquipmentSlotType.MAINHAND));

    static void register() {}
}
