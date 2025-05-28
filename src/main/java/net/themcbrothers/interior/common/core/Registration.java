package net.themcbrothers.interior.common.core;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.themcbrothers.interior.api.InteriorApi;

public class Registration {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(InteriorApi.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(InteriorApi.MOD_ID);
    public static final DeferredRegister.DataComponents DATA_COMPONENTS = DeferredRegister.createDataComponents(InteriorApi.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, InteriorApi.MOD_ID);

    @SuppressWarnings("InstantiationOfUtilityClass")
    public static void register(IEventBus bus) {
        new InteriorBlocks();
        new InteriorItems();
        new InteriorDataComponents();
        new InteriorCreativeModeTabs();

        BLOCKS.register(bus);
        ITEMS.register(bus);
        DATA_COMPONENTS.register(bus);
        CREATIVE_MODE_TABS.register(bus);
    }
}
