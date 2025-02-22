package com.shrink.coloniesmod.datagen;

import com.shrink.coloniesmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagsProvider extends FabricTagProvider.BlockTagProvider {


    public BlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.TIN_BLOCK)
                .add(ModBlocks.ALUMINUM_BLOCK)
                .add(ModBlocks.SILVER_BLOCK)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.ALUMINUM_ORE)
                .add(ModBlocks.SILVER_ORE)
                .add(ModBlocks.STEEL_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.TIN_BLOCK)
                .add(ModBlocks.ALUMINUM_BLOCK)
                .add(ModBlocks.SILVER_BLOCK)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.ALUMINUM_ORE)
                .add(ModBlocks.SILVER_ORE)
                .add(ModBlocks.STEEL_BLOCK);
    }
}
