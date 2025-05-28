package net.themcbrothers.interior.client;

import com.mojang.logging.LogUtils;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.themcbrothers.interior.api.InteriorApi;
import org.slf4j.Logger;

@Mod(value = InteriorApi.MOD_ID, dist = Dist.CLIENT)
public class InteriorClient {
    private static final Logger LOGGER = LogUtils.getLogger();

    public InteriorClient(IEventBus bus) {
        bus.addListener(this::clientSetup);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        LOGGER.debug("Hello from client setup");
    }
}
