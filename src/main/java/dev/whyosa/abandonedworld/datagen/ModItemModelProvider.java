package dev.whyosa.abandonedworld.datagen;

import dev.whyosa.abandonedworld.AbandonedWorld;
import dev.whyosa.abandonedworld.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AbandonedWorld.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.ENERGY_DRINK.get());
    }
}
