package net.iwrstheking007.omiam.setup;

import net.iwrstheking007.omiam.common.blocks.AnthraciteOreEXPDrop;
import net.iwrstheking007.omiam.common.blocks.DragonFruitOreEXPDrop;
import net.iwrstheking007.omiam.common.blocks.TestMate;
import net.iwrstheking007.omiam.common.blocks.TestMateTwo;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ModBlocks {

    public static final RegistryObject<Block> PLATINUM_ORE = Registrations.BLOCKS.register("platinum_ore", ()-> new Block(AbstractBlock.Properties.of(Material.STONE).strength(3, 30).harvestLevel(2).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> PLATINUM_BLOCK = Registrations.BLOCKS.register("platinum_block", ()-> new Block(AbstractBlock.Properties.of(Material.METAL).strength(4, 45).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> SANDIA_ALLOY_BLOCK = Registrations.BLOCKS.register("sandia_alloy_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(20,6000).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> DRAGON_FRUIT_ORE = Registrations.BLOCKS.register("dragon_fruit_ore", () -> new DragonFruitOreEXPDrop(AbstractBlock.Properties.of(Material.STONE).strength(3,30).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANTHRACITE_ORE = Registrations.BLOCKS.register("anthracite_ore", () -> new AnthraciteOreEXPDrop(AbstractBlock.Properties.of(Material.STONE).strength(3,20).harvestLevel(1).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> MJOLNIR_ORE = Registrations.BLOCKS.register("mjolnir_ore", ()-> new Block(AbstractBlock.Properties.of(Material.STONE).strength(5, 60).harvestLevel(5).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> STEEL_ORE = Registrations.BLOCKS.register("steel_ore", ()-> new Block(AbstractBlock.Properties.of(Material.STONE).strength(4, 30).harvestLevel(3).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> NETHER_MAGMA_ORE = Registrations.BLOCKS.register("nether_magma_ore", ()-> new Block(AbstractBlock.Properties.of(Material.STONE).strength(5, 60).harvestLevel(5).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> TEST_MATE = Registrations.BLOCKS.register("test_mate", ()-> new TestMate(AbstractBlock.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> TEST_MATE_TWO = Registrations.BLOCKS.register("test_mate_two", ()-> new TestMateTwo(AbstractBlock.Properties.copy(Blocks.OAK_PLANKS)));




    static void register() {}
}
