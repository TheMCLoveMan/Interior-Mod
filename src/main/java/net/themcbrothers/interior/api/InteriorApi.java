package net.themcbrothers.interior.api;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.themcbrothers.interior.api.furniture.IFurnitureMaterial;
import net.themcbrothers.interior.api.furniture.IFurnitureType;

/**
 * Main API class
 *
 * @author TheMCBrothers
 * @version 1.0.0
 */
public class InteriorApi {
    /**
     * Mod ID for TheMCBrothers Interior Mod
     *
     * @since 1.0.0
     */
    public static final String MOD_ID = "interior";

    /**
     * Registry key for furniture types such as Table, Chair, etc.
     *
     * @since 1.0.0
     */
    public static final ResourceKey<Registry<IFurnitureType>> FURNITURE_TYPES = ResourceKey.createRegistryKey(ResourceLocation.fromNamespaceAndPath(MOD_ID, "furniture_types"));

    /**
     * Registry key for furniture materials
     *
     * @since 1.0.0
     */
    public static final ResourceKey<Registry<IFurnitureMaterial>> FURNITURE_MATERIALS = ResourceKey.createRegistryKey(ResourceLocation.fromNamespaceAndPath(MOD_ID, "furniture_materials"));
}
