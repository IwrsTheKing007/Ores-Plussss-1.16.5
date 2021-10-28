package net.iwrstheking007.omiam.common.items.dragonfruit;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EnchantedDragonFruit extends Item {
    public EnchantedDragonFruit(Properties properties) {
        super(properties);
    }

    public boolean isFoil(ItemStack stack) {
        return true;
    }
}
