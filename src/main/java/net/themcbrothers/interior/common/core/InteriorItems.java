package net.themcbrothers.interior.common.core;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

import static net.themcbrothers.interior.common.core.Registration.ITEMS;

public final class InteriorItems {
    InteriorItems() {
    }

    public static final DeferredItem<Item> SCREWDRIVER = ITEMS.registerSimpleItem("screwdriver", new Item.Properties().stacksTo(1));
}
