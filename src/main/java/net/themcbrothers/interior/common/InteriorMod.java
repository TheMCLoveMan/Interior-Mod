package net.themcbrothers.interior.common;

import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.themcbrothers.interior.api.InteriorApi;
import net.themcbrothers.interior.common.core.InteriorItems;
import net.themcbrothers.interior.common.core.Registration;
import org.slf4j.Logger;

@Mod(InteriorApi.MOD_ID)
public class InteriorMod {
    private static final Logger LOGGER = LogUtils.getLogger();

    public InteriorMod(IEventBus bus) {
        Registration.register(bus);

        bus.addListener(this::commonSetup);
        bus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.debug("Hello from common setup");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(InteriorItems.SCREWDRIVER);
        }
    }

    public static ResourceLocation id(String name) {
        return ResourceLocation.fromNamespaceAndPath(InteriorApi.MOD_ID, name);
    }
}
