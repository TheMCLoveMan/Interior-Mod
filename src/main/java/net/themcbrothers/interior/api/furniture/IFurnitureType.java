package net.themcbrothers.interior.api.furniture;

import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

/**
 * Furniture type
 *
 * @since 1.0.0
 */
public interface IFurnitureType extends StringRepresentable {
    /**
     * Creates and returns an {@link ItemStack item stack}
     *
     * @return The stack
     * @since 1.0.0
     */
    ItemStack createItemStack();

    /**
     * Returns the {@link Block block}
     *
     * @return The block
     * @since 1.0.0
     */
    Block getBlock();
}
