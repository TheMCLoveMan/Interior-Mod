package net.themcbrothers.interior.common.core;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;

public final class InteriorCreativeModeTabs {
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MAIN_TAB =
            Registration.CREATIVE_MODE_TABS.register("main", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.interior.main"))
                    .icon(() -> new ItemStack(InteriorBlocks.FURNITURE_WORKBENCH))
                    .displayItems((itemDisplayParameters, output) ->
                            output.acceptAll(Registration.ITEMS.getEntries().stream().map(ItemStack::new).toList()))
                    .build());
}
