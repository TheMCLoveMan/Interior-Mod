package net.themcbrothers.interior.common.compat.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import net.minecraft.resources.ResourceLocation;
import net.themcbrothers.interior.common.InteriorMod;

@JeiPlugin
public class InteriorJeiPlugin implements IModPlugin {
    private static final ResourceLocation UID = InteriorMod.id("jei_plugin");

    @Override
    public ResourceLocation getPluginUid() {
        return UID;
    }
}
