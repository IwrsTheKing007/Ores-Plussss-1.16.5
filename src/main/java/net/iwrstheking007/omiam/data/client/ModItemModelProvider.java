package net.iwrstheking007.omiam.data.client;

import net.iwrstheking007.omiam.OMIAM;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, OMIAM.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        ModelFile itemHandHeld = getExistingFile(mcLoc("item/handheld"));

        builderGen(itemGenerated, "platinum_ingot");
        builderGen(itemGenerated, "sandia_alloy_ingot");
        builderGen(itemGenerated, "fuse_crystal");
        builderGen(itemGenerated, "mjolnir_ingot");
        builderGen(itemGenerated, "steel_ingot");
        builderGen(itemGenerated, "magma_nugget");
        builderGen(itemGenerated, "magma_ingot");

        builderGen(itemGenerated, "enchanted_golden_dragon_fruit");
        builderGen(itemGenerated, "enchanted_dragon_fruit");
        builderGen(itemGenerated, "dragon_fruit");

        builderGen(itemGenerated, "anthracite");
        builderGen(itemGenerated, "super_fuel");

        builderGen(itemGenerated, "platinum_helmet");
        builderGen(itemGenerated, "platinum_chestplate");
        builderGen(itemGenerated, "platinum_leggings");
        builderGen(itemGenerated, "platinum_boots");

        builderGen(itemGenerated, "sandia_alloy_helmet");
        builderGen(itemGenerated, "sandia_alloy_chestplate");
        builderGen(itemGenerated, "sandia_alloy_leggings");
        builderGen(itemGenerated, "sandia_alloy_boots");

        builderGen(itemGenerated, "magma_helmet");
        builderGen(itemGenerated, "magma_chestplate");
        builderGen(itemGenerated, "magma_leggings");
        builderGen(itemGenerated, "magma_boots");

        builderGen(itemGenerated, "rabbit_foot_boots");

        builderGen(itemGenerated, "diving_helmet");
        builderGen(itemGenerated, "diving_chestplate");
        builderGen(itemGenerated, "diving_leggings");
        builderGen(itemGenerated, "diving_boots");

        builderHand(itemHandHeld,"platinum_pickaxe");
        builderHand(itemHandHeld,"platinum_axe");
        builderHand(itemHandHeld,"platinum_shovel");
        builderHand(itemHandHeld,"platinum_hoe");
        builderHand(itemHandHeld,"platinum_sword");

        builderHand(itemHandHeld,"sandia_alloy_pickaxe");
        builderHand(itemHandHeld,"sandia_alloy_axe");
        builderHand(itemHandHeld,"sandia_alloy_shovel");
        builderHand(itemHandHeld,"sandia_alloy_hoe");
        builderHand(itemHandHeld,"sandia_alloy_sword");

        builderHand(itemHandHeld,"magma_pickaxe");
        builderHand(itemHandHeld,"magma_axe");
        builderHand(itemHandHeld,"magma_shovel");
        builderHand(itemHandHeld,"magma_hoe");
        builderHand(itemHandHeld,"magma_sword");

        builderGen(itemHandHeld, "warped_stick");
        builderHand(itemHandHeld,"warped_staff");
        builderHand(itemHandHeld,"mjolnir_hammer");
        builderHand(itemHandHeld,"super_sword");
        builderHand(itemHandHeld,"kitchen_knife");
    }

    private ItemModelBuilder builderGen(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0","items/" + name);
    }
    private ItemModelBuilder builderHand(ModelFile itemHandHeld, String name) {
        return getBuilder(name).parent(itemHandHeld).texture("layer0","items/" + name);
    }
}
