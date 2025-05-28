package net.themcbrothers.interior.datagen;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.themcbrothers.interior.api.InteriorApi;
import net.themcbrothers.interior.common.core.InteriorItems;

import java.util.Objects;

class InteriorItemModelProvider extends ItemModelProvider {
    InteriorItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, InteriorApi.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicHandheldItem(InteriorItems.SCREWDRIVER.value());
    }

    private ItemModelBuilder basicHandheldItem(Item item) {
        return basicHandheldItem(Objects.requireNonNull(BuiltInRegistries.ITEM.getKey(item)));
    }

    private ItemModelBuilder basicHandheldItem(ResourceLocation item) {
        return getBuilder(item.toString())
                .parent(new ModelFile.UncheckedModelFile("item/handheld"))
                .texture("layer0", ResourceLocation.fromNamespaceAndPath(item.getNamespace(), "item/" + item.getPath()));
    }
}
