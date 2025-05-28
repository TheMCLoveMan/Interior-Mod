package net.themcbrothers.interior.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.themcbrothers.interior.api.InteriorApi;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = InteriorApi.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class InteriorDataGeneration {
    @SubscribeEvent
    static void onGatherData(final GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        // Client resources
        boolean client = event.includeClient();
        generator.addProvider(client, new InteriorLanguageProvider(packOutput));
        generator.addProvider(client, new InteriorItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(client, new InteriorBlockStateProvider(packOutput, existingFileHelper));
    }
}
