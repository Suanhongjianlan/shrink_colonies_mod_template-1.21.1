package com.shrink.coloniesmod.datagen;

import com.shrink.coloniesmod.block.ModBlocks;
import com.shrink.coloniesmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ChineseLanguageProvider extends FabricLanguageProvider {
    public ChineseLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn",registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.STEEL_INGOT,"钢锭");
        translationBuilder.add(ModBlocks.STEEL_BLOCK,"钢块");
        translationBuilder.add("itemGroup.sc_items_tab","Shrink物品");
        translationBuilder.add("itemGroup.sc_blocks_tab","Shrink方块");
    }
}
