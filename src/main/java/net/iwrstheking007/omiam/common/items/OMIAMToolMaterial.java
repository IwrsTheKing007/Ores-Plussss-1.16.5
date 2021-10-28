package net.iwrstheking007.omiam.common.items;

import net.iwrstheking007.omiam.setup.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum OMIAMToolMaterial implements IItemTier {

    PLATINUM_TOOL(3, 1361, 13, -1f, 13, () -> Ingredient.of(ModItems.PLATINUM_INGOT.get())),

    SANDIA_ALLOY_TOOL(5, 5031, 17, -1f, 25, () -> Ingredient.of(ModItems.SANDIA_ALLOY_INGOT.get())),

    SUBLIME_BLADE(5, 1000000, 20, -1f, 50, () -> Ingredient.of(ModItems.SANDIA_ALLOY_INGOT.get())),

    MJOLNIR_HAMMER(5, 2147483647, 20, -1f, 50, () -> Ingredient.of(ModItems.MJOLNIR_INGOT.get())),

    SUPER_SWORD(2147483647, 2147483647, 2147483647, -1f, 2147483647, () -> Ingredient.EMPTY),

    KITCHEN_KNIFE(2, 10000, 20, -1f, 50, () -> Ingredient.of(ModItems.STEEL_INGOT.get())),

    MAGMA_TOOL(5, 6062, 18, -1f, 50, () -> Ingredient.of(ModItems.MAGMA_INGOT.get()));

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairMaterial;

    OMIAMToolMaterial(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial.get();
    }

    @Override
    public int getUses() {
        return this.maxUses;
    }

    @Override
    public float getSpeed() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamage;
    }

    @Override
    public int getLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial;
    }
}
