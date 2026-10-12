package dev.whyosa.abandonedworld.item;

import dev.whyosa.abandonedworld.AbandonedWorld;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AbandonedWorld.MODID);

    public static final DeferredItem<Item> ENERGY_DRINK = ITEMS.register("energy_drink",
            () -> new Item(
                    new Item.Properties().food(
                            new FoodProperties.Builder()
                                    .alwaysEdible()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 2), 1.0f)
                                    .build()
                    )
            )
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
