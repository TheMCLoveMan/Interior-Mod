package net.themcbrothers.interior.api.furniture;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

/**
 * Furniture material
 *
 * @since 1.0.0
 */
public interface IFurnitureMaterial {
    Block getBlock();

    /**
     * Returns the display name as {@link Component component}
     *
     * @return Display name
     * @since 1.0.0
     */
    Component getDisplayName();

    /**
     * Returns the texture of the material
     *
     * @return Texture
     * @since 1.0.0
     */
    ResourceLocation getTexture();

    /**
     * Returns the {@link Ingredient ingredient} for the recipe
     *
     * @return Ingredient
     * @since 1.0.0
     */
    Ingredient getIngredient();

    /**
     * Validates a {@link IFurnitureType furniture type}
     *
     * @param type Furniture type
     * @return If the material is valid for the given type
     * @since 1.0.0
     */
    boolean isValidFor(IFurnitureType type);
}
