package com.greenapple.greendelight.registry;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // Namespace corrected to "greendelight"
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "greendelight");

    // Generic Fork registered under the correct namespace
    public static final RegistryObject<Item> FORK = ITEMS.register("fork",
            () -> new Item(new Item.Properties().stacksTo(1).durability(250)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
