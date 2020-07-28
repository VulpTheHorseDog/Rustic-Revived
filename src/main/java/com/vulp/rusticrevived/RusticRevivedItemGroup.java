package com.vulp.rusticrevived;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class RusticRevivedItemGroup extends ItemGroup {

    public RusticRevivedItemGroup(String label) {
        super(label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.STICK);
    }
}
