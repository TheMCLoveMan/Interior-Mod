package net.themcbrothers.interior.common.core;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.function.Function;
import java.util.function.Supplier;

public final class InteriorBlocks {
    InteriorBlocks() {
    }

    private static final Function<Block, BlockItem> DEFAULT_BLOCK_ITEM = block -> new BlockItem(block, new Item.Properties());

    public static final DeferredBlock<Block> TEST_BLOCK = register("i_am_a_test_block", () -> new Block(BlockBehaviour.Properties.of().destroyTime(1.0F)), DEFAULT_BLOCK_ITEM);

    public static final DeferredBlock<Block> FURNITURE_WORKBENCH = register("furniture_workbench", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.5F).sound(SoundType.WOOD).ignitedByLava()), DEFAULT_BLOCK_ITEM);

    private static <B extends Block> DeferredBlock<B> register(String name, Supplier<B> blockSupplier, Function<B, ? extends BlockItem> blockItemFactory) {
        var block = Registration.BLOCKS.register(name, blockSupplier);
        Registration.ITEMS.register(name, () -> blockItemFactory.apply(block.get()));
        return block;
    }
}
