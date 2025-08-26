package net.themcbrothers.interior.common.core;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.themcbrothers.interior.common.block.entity.FurnitureBlockEntity;

import static net.themcbrothers.interior.common.core.Registration.BLOCK_ENTITY_TYPES;

public final class InteriorBlockEntityTypes {
    InteriorBlockEntityTypes() {
    }

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<FurnitureBlockEntity>> FURNITURE = BLOCK_ENTITY_TYPES.register("furniture", () -> BlockEntityType.Builder.of(FurnitureBlockEntity::new, InteriorBlocks.FURNITURE.value()).build(null));
}
