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
        translationBuilder.add("itemGroup.sc_tools_tab","Shrink's Tools");
        translationBuilder.add(ModBlocks.TIN_BLOCK,"Tin Block");
        translationBuilder.add(ModBlocks.ALUMINUM_BLOCK,"Aluminum Block");
        translationBuilder.add(ModBlocks.SILVER_BLOCK,"Silver Block");
        translationBuilder.add(ModBlocks.TIN_ORE,"Tin Ore");
        translationBuilder.add(ModBlocks.ALUMINUM_ORE,"Aluminum Ore");
        translationBuilder.add(ModBlocks.SILVER_ORE,"Silver Ore");
        translationBuilder.add(ModItems.RAW_ALUMINUM,"Raw Aluminum");
        translationBuilder.add(ModItems.RAW_TIN,"Raw Tin");
        translationBuilder.add(ModItems.RAW_SILVER,"Raw Silver");
        translationBuilder.add(ModItems.SILVER_NUGGET,"Silver Nugget");
        translationBuilder.add(ModItems.TIN_NUGGET,"Tin Nugget");
        translationBuilder.add(ModItems.ALUMINUM_NUGGET,"Aluminum Nugget");
        translationBuilder.add(ModItems.SILVER_INGOT,"Silver Ingot");
        translationBuilder.add(ModItems.TIN_INGOT,"Tin Ingot");
        translationBuilder.add(ModItems.ALUMINUM_INGOT,"Aluminum Ingot");
        translationBuilder.add(ModItems.STEEL_SWORD,"Steel Sword");
        translationBuilder.add(ModItems.STEEL_SHOVEL,"Steel Shovel");
        translationBuilder.add(ModItems.STEEL_PICKAXE,"Steel Pickaxe");
        translationBuilder.add(ModItems.STEEL_AXE,"Steel Axe");
        translationBuilder.add(ModItems.STEEL_HOE,"Steel Hoe");
    }
}
