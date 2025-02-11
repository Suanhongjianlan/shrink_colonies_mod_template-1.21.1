package com.shrink.coloniesmod.datagen;

import com.shrink.coloniesmod.block.ModBlocks;
import com.shrink.coloniesmod.item.ModItemGroups;
import com.shrink.coloniesmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class LanguageProvider extends FabricLanguageProvider {
    public LanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput,"en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.STEEL_INGOT,"Steel Ingot");
        translationBuilder.add(ModBlocks.STEEL_BLOCK,"Steel Block");
        translationBuilder.add("itemGroup.sc_items_tab","Shrink's Items");
        translationBuilder.add("itemGroup.sc_blocks_tab","Shrink's Blocks");
    }
}
