package net.iwrstheking007.omiam.setup;

import net.iwrstheking007.omiam.OMIAM;
import net.iwrstheking007.omiam.common.armors.RabbitBoots;
import net.iwrstheking007.omiam.common.items.*;
import net.iwrstheking007.omiam.common.items.dragonfruit.EnchantedDragonFruit;
import net.iwrstheking007.omiam.common.items.dragonfruit.EnchantedGoldenDragonFruit;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;


public class ModItems {

    //Items
    public static final RegistryObject<Item> PLATINUM_INGOT = Registrations.ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> SANDIA_ALLOY_INGOT = Registrations.ITEMS.register("sandia_alloy_ingot", () -> new Item(new Item.Properties().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> MJOLNIR_INGOT = Registrations.ITEMS.register("mjolnir_ingot", () -> new Item(new Item.Properties().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> STEEL_INGOT = Registrations.ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> MAGMA_NUGGET = Registrations.ITEMS.register("magma_nugget", () -> new Item(new Item.Properties().fireResistant().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> MAGMA_INGOT = Registrations.ITEMS.register("magma_ingot", () -> new Item(new Item.Properties().fireResistant().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> FUSE_CRYSTAL = Registrations.ITEMS.register("fuse_crystal", () -> new Item(new Item.Properties().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> WARPED_STICK = Registrations.ITEMS.register("warped_stick", () -> new WarpedStick(new Item.Properties().tab(OMIAM.GENERAL_GROUP), 600));

    //Block Items
    public static final RegistryObject<BlockItem> PLATINUM_ORE = Registrations.ITEMS.register("platinum_ore", () -> new BlockItem(ModBlocks.PLATINUM_ORE.get(), new Item.Properties().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<BlockItem> PLATINUM_BLOCK = Registrations.ITEMS.register("platinum_block", () -> new BlockItem(ModBlocks.PLATINUM_BLOCK.get(), new Item.Properties().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<BlockItem> SANDIA_ALLOY_BLOCK = Registrations.ITEMS.register("sandia_alloy_block", () -> new BlockItem(ModBlocks.SANDIA_ALLOY_BLOCK.get(), new Item.Properties().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<BlockItem> DRAGON_FRUIT_ORE = Registrations.ITEMS.register("dragon_fruit_ore", () -> new BlockItem(ModBlocks.DRAGON_FRUIT_ORE.get(), new Item.Properties().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<BlockItem> ANTHRACITE_ORE = Registrations.ITEMS.register("anthracite_ore", () -> new BlockItem(ModBlocks.ANTHRACITE_ORE.get(), new Item.Properties().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<BlockItem> MJOLNIR_ORE = Registrations.ITEMS.register("mjolnir_ore", () -> new BlockItem(ModBlocks.MJOLNIR_ORE.get(), new Item.Properties().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<BlockItem> STEEL_ORE = Registrations.ITEMS.register("steel_ore", () -> new BlockItem(ModBlocks.STEEL_ORE.get(), new Item.Properties().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<BlockItem> NETHER_MAGMA_ORE = Registrations.ITEMS.register("nether_magma_ore", () -> new BlockItem(ModBlocks.NETHER_MAGMA_ORE.get(), new Item.Properties().fireResistant().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<BlockItem> TEST_MATE = Registrations.ITEMS.register("test_mate", () -> new BlockItem(ModBlocks.TEST_MATE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TEST_MATE_TWO = Registrations.ITEMS.register("test_mate_two", () -> new BlockItem(ModBlocks.TEST_MATE_TWO.get(), new Item.Properties()));

    //Tools
    public static final RegistryObject<Item> PLATINUM_PICKAXE = Registrations.ITEMS.register("platinum_pickaxe", () -> new PickaxeItem(OMIAMToolMaterial.PLATINUM_TOOL, 4, -2.4f, new Item.Properties().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> PLATINUM_AXE = Registrations.ITEMS.register("platinum_axe", () -> new AxeItem(OMIAMToolMaterial.PLATINUM_TOOL, 9, -2.6f, new Item.Properties().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> PLATINUM_SHOVEL = Registrations.ITEMS.register("platinum_shovel", () -> new ShovelItem(OMIAMToolMaterial.PLATINUM_TOOL, 4, -2.6f, new Item.Properties().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> PLATINUM_HOE = Registrations.ITEMS.register("platinum_hoe", () -> new HoeItem(OMIAMToolMaterial.PLATINUM_TOOL, 1, -1f, new Item.Properties().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> PLATINUM_SWORD = Registrations.ITEMS.register("platinum_sword", () -> new SwordItem(OMIAMToolMaterial.PLATINUM_TOOL, 6, -2f, new Item.Properties().tab(OMIAM.GENERAL_GROUP)));

    public static final RegistryObject<Item> SANDIA_ALLOY_PICKAXE = Registrations.ITEMS.register("sandia_alloy_pickaxe", () -> new PickaxeItem(OMIAMToolMaterial.SANDIA_ALLOY_TOOL, 5, -2.4f, new Item.Properties().fireResistant().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> SANDIA_ALLOY_AXE = Registrations.ITEMS.register("sandia_alloy_axe", () -> new AxeItem(OMIAMToolMaterial.SANDIA_ALLOY_TOOL, 12, -2.6f, new Item.Properties().fireResistant().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> SANDIA_ALLOY_SHOVEL = Registrations.ITEMS.register("sandia_alloy_shovel", () -> new ShovelItem(OMIAMToolMaterial.SANDIA_ALLOY_TOOL, 5, -2.6f, new Item.Properties().fireResistant().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> SANDIA_ALLOY_HOE = Registrations.ITEMS.register("sandia_alloy_hoe", () -> new HoeItem(OMIAMToolMaterial.SANDIA_ALLOY_TOOL, 1, -1f, new Item.Properties().fireResistant().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> SANDIA_ALLOY_SWORD = Registrations.ITEMS.register("sandia_alloy_sword", () -> new SwordItem(OMIAMToolMaterial.SANDIA_ALLOY_TOOL, 9, -2f, new Item.Properties().fireResistant().tab(OMIAM.GENERAL_GROUP)));

    public static final RegistryObject<Item> MAGMA_PICKAXE = Registrations.ITEMS.register("magma_pickaxe", () -> new MagmaPickaxeItem(OMIAMToolMaterial.MAGMA_TOOL, 6, -2.4f, new Item.Properties().fireResistant().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> MAGMA_AXE = Registrations.ITEMS.register("magma_axe", () -> new MagmaAxeItem(OMIAMToolMaterial.MAGMA_TOOL, 15, -2.6f, new Item.Properties().fireResistant().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> MAGMA_SHOVEL = Registrations.ITEMS.register("magma_shovel", () -> new MagmaShovelItem(OMIAMToolMaterial.MAGMA_TOOL, 6, -2.6f, new Item.Properties().fireResistant().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> MAGMA_HOE = Registrations.ITEMS.register("magma_hoe", () -> new MagmaHoeItem(OMIAMToolMaterial.MAGMA_TOOL, 1, -1f, new Item.Properties().fireResistant().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> MAGMA_SWORD = Registrations.ITEMS.register("magma_sword", () -> new MagmaSwordItem(OMIAMToolMaterial.MAGMA_TOOL, 12, -2f, new Item.Properties().fireResistant().tab(OMIAM.GENERAL_GROUP)));

    public static final RegistryObject<Item> SUBLIME_BLADE = Registrations.ITEMS.register("sublime_blade", () -> new SublimeSword(OMIAMToolMaterial.SUBLIME_BLADE, 150, -2f, 15, new Item.Properties().fireResistant().tab(OMIAM.GENERAL_GROUP)));

    public static final RegistryObject<Item> WARPED_STAFF = Registrations.ITEMS.register("warped_staff", () -> new WarpedStaff(new Item.Properties().stacksTo(1).tab(OMIAM.GENERAL_GROUP),60));
    public static final RegistryObject<Item> MJOLNIR_HAMMER = Registrations.ITEMS.register("mjolnir_hammer", () -> new MjolnirHammer(OMIAMToolMaterial.MJOLNIR_HAMMER, 150, -2f, 60, new Item.Properties().fireResistant().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> KITCHEN_KNIFE = Registrations.ITEMS.register("kitchen_knife", () -> new KitchenKnife(OMIAMToolMaterial.KITCHEN_KNIFE,6, 2147483647, new Item.Properties().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> SUPER_SWORD = Registrations.ITEMS.register("super_sword", () -> new SuperSword(OMIAMToolMaterial.SUPER_SWORD, 2147483647, 2147483647f, 55, new Item.Properties().fireResistant()));

    //Armor
    public static final RegistryObject<Item> PLATINUM_HELMET = Registrations.ITEMS.register("platinum_helmet", () -> new ArmorItem(OMIAMArmorMaterial.PLATINUM_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> PLATINUM_CHESTPLAE = Registrations.ITEMS.register("platinum_chestplate", () -> new ArmorItem(OMIAMArmorMaterial.PLATINUM_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> PLATINUM_LEGGINGS = Registrations.ITEMS.register("platinum_leggings", () -> new ArmorItem(OMIAMArmorMaterial.PLATINUM_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> PLATINUM_BOOTS = Registrations.ITEMS.register("platinum_boots", () -> new ArmorItem(OMIAMArmorMaterial.PLATINUM_ARMOR, EquipmentSlotType.FEET, new Item.Properties().tab(OMIAM.GENERAL_GROUP)));

    public static final RegistryObject<Item> SANDIA_ALLOY_HELMET = Registrations.ITEMS.register("sandia_alloy_helmet", () -> new SandiaAlloyArmorItem(OMIAMArmorMaterial.SANDIA_ALLOY_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().fireResistant().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> SANDIA_ALLOY_CHESTPLAE = Registrations.ITEMS.register("sandia_alloy_chestplate", () -> new SandiaAlloyArmorItem(OMIAMArmorMaterial.SANDIA_ALLOY_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().fireResistant().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> SANDIA_ALLOY_LEGGINGS = Registrations.ITEMS.register("sandia_alloy_leggings", () -> new SandiaAlloyArmorItem(OMIAMArmorMaterial.SANDIA_ALLOY_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().fireResistant().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> SANDIA_ALLOY_BOOTS = Registrations.ITEMS.register("sandia_alloy_boots", () -> new SandiaAlloyArmorItem(OMIAMArmorMaterial.SANDIA_ALLOY_ARMOR, EquipmentSlotType.FEET, new Item.Properties().fireResistant().tab(OMIAM.GENERAL_GROUP)));

    public static final RegistryObject<Item> MAGMA_HELMET = Registrations.ITEMS.register("magma_helmet", () -> new ArmorItem(OMIAMArmorMaterial.MAGMA_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().fireResistant().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> MAGMA_CHESTPLAE = Registrations.ITEMS.register("magma_chestplate", () -> new ArmorItem(OMIAMArmorMaterial.MAGMA_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().fireResistant().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> MAGMA_LEGGINGS = Registrations.ITEMS.register("magma_leggings", () -> new ArmorItem(OMIAMArmorMaterial.MAGMA_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().fireResistant().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> MAGMA_BOOTS = Registrations.ITEMS.register("magma_boots", () -> new ArmorItem(OMIAMArmorMaterial.MAGMA_ARMOR, EquipmentSlotType.FEET, new Item.Properties().fireResistant().tab(OMIAM.GENERAL_GROUP)));

    public static final RegistryObject<Item> DIVING_HELMET = Registrations.ITEMS.register("diving_helmet", () -> new ArmorItem(OMIAMArmorMaterial.DIVING_SUIT, EquipmentSlotType.HEAD, new Item.Properties().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> DIVING_CHESTPLATE = Registrations.ITEMS.register("diving_chestplate", () -> new ArmorItem(OMIAMArmorMaterial.DIVING_SUIT, EquipmentSlotType.CHEST, new Item.Properties().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> DIVING_LEGGINGS = Registrations.ITEMS.register("diving_leggings", () -> new ArmorItem(OMIAMArmorMaterial.DIVING_SUIT, EquipmentSlotType.LEGS, new Item.Properties().tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> DIVING_BOOTS = Registrations.ITEMS.register("diving_boots", () -> new ArmorItem(OMIAMArmorMaterial.DIVING_SUIT, EquipmentSlotType.FEET, new Item.Properties().tab(OMIAM.GENERAL_GROUP)));

    public static final RegistryObject<Item> RABBIT_FOOT_BOOTS = Registrations.ITEMS.register("rabbit_foot_boots", () -> new RabbitBoots(OMIAMArmorMaterial.RABBIT_FOOT_BOOTS, EquipmentSlotType.FEET, new Item.Properties().tab(OMIAM.GENERAL_GROUP)));

    //Food
    public static final RegistryObject<Item> DRAGON_FRUIT = Registrations.ITEMS.register("dragon_fruit", () -> new Item(new Item.Properties().food(new Food.Builder().nutrition(8).saturationMod(4).build()).tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> ENCHANTED_DRAGON_FRUIT = Registrations.ITEMS.register("enchanted_dragon_fruit", () -> new EnchantedDragonFruit(new Item.Properties().food(new Food.Builder().nutrition(8).saturationMod(4).effect(() -> new EffectInstance(Effects.REGENERATION, 2400, 4), 1.0F).alwaysEat().build()).tab(OMIAM.GENERAL_GROUP)));
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_DRAGON_FRUIT = Registrations.ITEMS.register("enchanted_golden_dragon_fruit", () -> new EnchantedGoldenDragonFruit(new Item.Properties().food(new Food.Builder().nutrition(10).saturationMod(10).effect(() -> new EffectInstance(Effects.REGENERATION, 800, 3), 1.0F).effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 6000, 0), 1.0F).effect(() -> new EffectInstance(Effects.DAMAGE_RESISTANCE, 6000, 0), 1.0F).effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED, 6000, 1), 1.0F).effect(() -> new EffectInstance(Effects.NIGHT_VISION, 6000, 0), 1.0F).effect(() -> new EffectInstance(Effects.HEALTH_BOOST, 6000, 4), 1.0F).alwaysEat().build()).tab(OMIAM.GENERAL_GROUP)));

    //Fuel
    public static final RegistryObject<Item> ANTHRACITE = Registrations.ITEMS.register("anthracite", () -> new FuelItem(new Item.Properties().tab(OMIAM.GENERAL_GROUP), 3200));
    public static final RegistryObject<Item> SUPER_FUEL = Registrations.ITEMS.register("super_fuel", () -> new FuelItem(new Item.Properties().tab(OMIAM.GENERAL_GROUP), 2147483647));

    

    static void register() {}
}
