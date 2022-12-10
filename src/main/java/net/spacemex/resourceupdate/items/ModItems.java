package net.spacemex.resourceupdate.items;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.spacemex.resourceupdate.ResourceUpdateMod;
import net.spacemex.resourceupdate.creative.ModCreativeModeTab;
import net.spacemex.resourceupdate.teirs.ModTiers;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ResourceUpdateMod.MODID);


    //Tools
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            ()-> new AxeItem(ModTiers.Copper, 0,0,
                    new Item.Properties().tab(ModCreativeModeTab.RESOURCE_UPDATE_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
