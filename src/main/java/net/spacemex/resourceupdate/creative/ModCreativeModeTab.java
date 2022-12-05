package net.spacemex.resourceupdate.creative;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeModeTab {
    public static final CreativeModeTab RESOURCE_UPDATE_TAB = new CreativeModeTab("resource_update_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.DIAMOND);
        }
    }; // Add Below Here
}
