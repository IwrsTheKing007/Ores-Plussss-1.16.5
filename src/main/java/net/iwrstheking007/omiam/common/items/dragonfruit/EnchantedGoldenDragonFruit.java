package net.iwrstheking007.omiam.common.items.dragonfruit;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EnchantedGoldenDragonFruit extends Item {
    public EnchantedGoldenDragonFruit(Properties properties) {
        super(properties);
    }

    public boolean isFoil(ItemStack stack) {
        return true;
    }
}
