package net.themcbrothers.interior.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.themcbrothers.interior.api.InteriorApi;
import net.themcbrothers.interior.common.core.InteriorBlocks;

class InteriorBlockStateProvider extends BlockStateProvider {
    InteriorBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, InteriorApi.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        ResourceLocation furnitureWorkbench = blockTexture(InteriorBlocks.FURNITURE_WORKBENCH.get());

        simpleBlockWithItem(
                InteriorBlocks.FURNITURE_WORKBENCH.get(),
                models().cube(furnitureWorkbench.getPath(),
                                furnitureWorkbench.withSuffix("_bottom"),
                                furnitureWorkbench.withSuffix("_top"),
                                furnitureWorkbench.withSuffix("_front"),
                                furnitureWorkbench.withSuffix("_side"),
                                furnitureWorkbench.withSuffix("_side"),
                                furnitureWorkbench.withSuffix("_front"))
                        .texture("particle", furnitureWorkbench.withSuffix("_front"))
        );
    }
}
