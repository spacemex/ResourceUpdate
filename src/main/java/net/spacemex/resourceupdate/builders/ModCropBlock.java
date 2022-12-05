package net.spacemex.resourceupdate.builders;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

import java.util.function.Supplier;

public class ModCropBlock extends CropBlock {

    public static final IntegerProperty AGE = BlockStateProperties.AGE_7;

    private final Supplier<Item> CropItem;

    public final Supplier<Item> SeedItem;

    private final Integer RandomAmountToDrop;

    public ModCropBlock(Properties pProperties, Supplier<Item> pCropItem, Supplier<Item> pSeedItem, Integer pRandomAmountToDrop) {
        super(pProperties);
        this.CropItem = pCropItem;
        this.SeedItem = pSeedItem;
        this.RandomAmountToDrop = pRandomAmountToDrop;
    }

    protected ItemLike getCropItem(){
        return CropItem.get();
    }

    protected ItemLike getSeedItem(){
        return SeedItem.get();
    }

    protected Integer getRandomAmountToDrop(){
        return 3;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(AGE);
    }
}
