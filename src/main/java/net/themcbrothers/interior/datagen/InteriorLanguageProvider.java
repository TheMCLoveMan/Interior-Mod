package net.themcbrothers.interior.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.themcbrothers.interior.api.InteriorApi;
import net.themcbrothers.interior.common.core.InteriorBlocks;
import net.themcbrothers.interior.common.core.InteriorCreativeModeTabs;
import net.themcbrothers.interior.common.core.InteriorItems;

class InteriorLanguageProvider extends LanguageProvider {
    InteriorLanguageProvider(PackOutput output) {
        super(output, InteriorApi.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Blocks
        addBlock(InteriorBlocks.FURNITURE_WORKBENCH, "Furniture Workbench");
        addBlock(InteriorBlocks.FURNITURE, "Furniture");

        // Items
        addItem(InteriorItems.SCREWDRIVER, "Screwdriver");

        // Creative Mode Tab
        add(InteriorCreativeModeTabs.MAIN_TAB.getId().toLanguageKey("itemGroup"), "TheMCBrothers Interior Mod");

        // Mod Description
        add("fml.menu.mods.info.description." + InteriorApi.MOD_ID, "TheMCBrothers Interior Mod adds some furniture. Tables and Chairs are customizable.");
    }
}
