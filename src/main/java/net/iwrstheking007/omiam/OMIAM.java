package net.iwrstheking007.omiam;

import net.iwrstheking007.omiam.setup.ModCommands;
import net.iwrstheking007.omiam.setup.ModItems;
import net.iwrstheking007.omiam.setup.Registrations;
import net.iwrstheking007.omiam.world.OreGeneration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(OMIAM.MOD_ID)
public class OMIAM
{
    @SubscribeEvent
    public void onCommandRegister(final RegisterCommandsEvent event) {
        ModCommands.registerCommands(event);
    }

    public static final String MOD_ID = "omiam";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public static final ItemGroup GENERAL_GROUP = new GeneralGroup("generaltab");
    public static final ItemGroup ORESNSTUFF_GROUP = new oresNStuffGroup("oresnstuff");
    public static final ItemGroup BLOCKSNSTUFF_GROUP = new blocksNStuffGroup("blocksnstuff");
    public static final ItemGroup TOOLSNSTUFF_GROUP = new toolsNStuffGroup("toolsnstuff");
    public static final ItemGroup ARMORNSTUFF_GROUP = new armorNStuffGroup("armornstuff");
    public static final ItemGroup FOODNSTUFF_GROUP = new foodNStuffGroup("foodnstuff");
    public static final ItemGroup MISCNSTUFF_GROUP = new MISCNStuffGroup("miscnstuff");

    public OMIAM() {
        Registrations.register();



        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);



        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SuppressWarnings("deprication")
    public void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {

    }

    public static class GeneralGroup extends ItemGroup{

        public GeneralGroup(String label) {
            super(label);
        }
        @Override
        public ItemStack makeIcon() {
            return ModItems.SANDIA_ALLOY_BLOCK.get().getDefaultInstance();
        }
    }

    public static class oresNStuffGroup extends ItemGroup{

        public oresNStuffGroup(String label) {
            super(label);
        }
        @Override
        public ItemStack makeIcon() {
            return ModItems.SANDIA_ALLOY_INGOT.get().getDefaultInstance();
        }
        @Override
        public void fillItemList(NonNullList<ItemStack> items) {
            items.add(ModItems.SANDIA_ALLOY_INGOT.get().getDefaultInstance());
            items.add(ModItems.PLATINUM_ORE.get().getDefaultInstance());
            items.add(ModItems.PLATINUM_INGOT.get().getDefaultInstance());
            items.add(ModItems.FUSE_CRYSTAL.get().getDefaultInstance());
            items.add(ModItems.MJOLNIR_ORE.get().getDefaultInstance());
            items.add(ModItems.MJOLNIR_INGOT.get().getDefaultInstance());
            items.add(ModItems.STEEL_ORE.get().getDefaultInstance());
            items.add(ModItems.STEEL_INGOT.get().getDefaultInstance());
            items.add(ModItems.NETHER_MAGMA_ORE.get().getDefaultInstance());
            items.add(ModItems.MAGMA_NUGGET.get().getDefaultInstance());
            items.add(ModItems.MAGMA_INGOT.get().getDefaultInstance());
            items.add(ModItems.DRAGON_FRUIT_ORE.get().getDefaultInstance());
            items.add(ModItems.ANTHRACITE_ORE.get().getDefaultInstance());
            items.add(ModItems.ANTHRACITE.get().getDefaultInstance());
            items.add(ModItems.SUPER_FUEL.get().getDefaultInstance());
        }
    }

    public static class blocksNStuffGroup extends ItemGroup{

        public blocksNStuffGroup(String label) {
            super(label);
        }
        @Override
        public ItemStack makeIcon() {
            return ModItems.SANDIA_ALLOY_BLOCK.get().getDefaultInstance();
        }

        @Override
        public void fillItemList(NonNullList<ItemStack> items) {
            items.add(ModItems.SANDIA_ALLOY_BLOCK.get().getDefaultInstance());
            items.add(ModItems.PLATINUM_ORE.get().getDefaultInstance());
            items.add(ModItems.PLATINUM_BLOCK.get().getDefaultInstance());
            items.add(ModItems.DRAGON_FRUIT_ORE.get().getDefaultInstance());
            items.add(ModItems.ANTHRACITE_ORE.get().getDefaultInstance());
            items.add(ModItems.MJOLNIR_ORE.get().getDefaultInstance());
            items.add(ModItems.STEEL_ORE.get().getDefaultInstance());
            items.add(ModItems.NETHER_MAGMA_ORE.get().getDefaultInstance());
        }
    }

    public static class toolsNStuffGroup extends ItemGroup{

        public toolsNStuffGroup(String label) {
            super(label);
        }
        @Override
        public ItemStack makeIcon() {
            return ModItems.SANDIA_ALLOY_PICKAXE.get().getDefaultInstance();
        }
        @Override
        public void fillItemList(NonNullList<ItemStack> items) {
            items.add(ModItems.SANDIA_ALLOY_SWORD.get().getDefaultInstance());
            items.add(ModItems.SANDIA_ALLOY_PICKAXE.get().getDefaultInstance());
            items.add(ModItems.SANDIA_ALLOY_AXE.get().getDefaultInstance());
            items.add(ModItems.SANDIA_ALLOY_SHOVEL.get().getDefaultInstance());
            items.add(ModItems.SANDIA_ALLOY_HOE.get().getDefaultInstance());

            items.add(ModItems.PLATINUM_SWORD.get().getDefaultInstance());
            items.add(ModItems.PLATINUM_PICKAXE.get().getDefaultInstance());
            items.add(ModItems.PLATINUM_AXE.get().getDefaultInstance());
            items.add(ModItems.PLATINUM_SHOVEL.get().getDefaultInstance());
            items.add(ModItems.PLATINUM_HOE.get().getDefaultInstance());

            items.add(ModItems.MAGMA_SWORD.get().getDefaultInstance());
            items.add(ModItems.MAGMA_PICKAXE.get().getDefaultInstance());
            items.add(ModItems.MAGMA_AXE.get().getDefaultInstance());
            items.add(ModItems.MAGMA_SHOVEL.get().getDefaultInstance());
            items.add(ModItems.MAGMA_HOE.get().getDefaultInstance());

            items.add(ModItems.SUBLIME_BLADE.get().getDefaultInstance());
            items.add(ModItems.WARPED_STAFF.get().getDefaultInstance());
            items.add(ModItems.MJOLNIR_HAMMER.get().getDefaultInstance());
            items.add(ModItems.KITCHEN_KNIFE.get().getDefaultInstance());
        }
    }

    public static class armorNStuffGroup extends ItemGroup{

        public armorNStuffGroup(String label) {
            super(label);
        }
        @Override
        public ItemStack makeIcon() {
            return ModItems.SANDIA_ALLOY_CHESTPLAE.get().getDefaultInstance();
        }
        @Override
        public void fillItemList(NonNullList<ItemStack> items) {
            items.add(ModItems.SANDIA_ALLOY_HELMET.get().getDefaultInstance());
            items.add(ModItems.SANDIA_ALLOY_CHESTPLAE.get().getDefaultInstance());
            items.add(ModItems.SANDIA_ALLOY_LEGGINGS.get().getDefaultInstance());
            items.add(ModItems.SANDIA_ALLOY_BOOTS.get().getDefaultInstance());

            items.add(ModItems.PLATINUM_HELMET.get().getDefaultInstance());
            items.add(ModItems.PLATINUM_CHESTPLAE.get().getDefaultInstance());
            items.add(ModItems.PLATINUM_LEGGINGS.get().getDefaultInstance());
            items.add(ModItems.PLATINUM_BOOTS.get().getDefaultInstance());

            items.add(ModItems.MAGMA_HELMET.get().getDefaultInstance());
            items.add(ModItems.MAGMA_CHESTPLAE.get().getDefaultInstance());
            items.add(ModItems.MAGMA_LEGGINGS.get().getDefaultInstance());
            items.add(ModItems.MAGMA_BOOTS.get().getDefaultInstance());

            items.add(ModItems.RABBIT_FOOT_BOOTS.get().getDefaultInstance());

            items.add(ModItems.DIVING_HELMET.get().getDefaultInstance());
            items.add(ModItems.DIVING_CHESTPLATE.get().getDefaultInstance());
            items.add(ModItems.DIVING_LEGGINGS.get().getDefaultInstance());
            items.add(ModItems.DIVING_BOOTS.get().getDefaultInstance());
        }
    }

    public static class foodNStuffGroup extends ItemGroup{

        public foodNStuffGroup(String label) {
            super(label);
        }
        @Override
        public ItemStack makeIcon() {
            return ModItems.ENCHANTED_GOLDEN_DRAGON_FRUIT.get().getDefaultInstance();
        }
        @Override
        public void fillItemList(NonNullList<ItemStack> items) {
            items.add(ModItems.ENCHANTED_GOLDEN_DRAGON_FRUIT.get().getDefaultInstance());
            items.add(ModItems.ENCHANTED_DRAGON_FRUIT.get().getDefaultInstance());
            items.add(ModItems.DRAGON_FRUIT.get().getDefaultInstance());
        }
    }

    public static class MISCNStuffGroup extends ItemGroup{

        public MISCNStuffGroup(String label) {
            super(label);
        }
        @Override
        public ItemStack makeIcon() {
            return ModItems.WARPED_STICK.get().getDefaultInstance();
        }
        @Override
        public void fillItemList(NonNullList<ItemStack> items) {
            items.add(ModItems.WARPED_STICK.get().getDefaultInstance());
        }
    }
}
