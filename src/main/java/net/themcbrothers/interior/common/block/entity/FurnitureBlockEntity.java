package net.themcbrothers.interior.common.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.themcbrothers.interior.common.core.InteriorBlockEntityTypes;

public class FurnitureBlockEntity extends BlockEntity {
    public FurnitureBlockEntity(BlockPos pos, BlockState blockState) {
        super(InteriorBlockEntityTypes.FURNITURE.value(), pos, blockState);
    }
}
