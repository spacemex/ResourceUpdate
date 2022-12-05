package net.spacemex.resourceupdate.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.spacemex.resourceupdate.ResourceUpdateMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ResourceUpdateMod.MODID);



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
