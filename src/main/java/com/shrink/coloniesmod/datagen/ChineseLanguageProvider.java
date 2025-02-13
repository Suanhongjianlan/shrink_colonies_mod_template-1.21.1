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
        translationBuilder.add("itemGroup.sc_tools_tab","Shrink工具");
        translationBuilder.add(ModBlocks.TIN_BLOCK,"锌块");
        translationBuilder.add(ModBlocks.ALUMINUM_BLOCK,"铝块");
        translationBuilder.add(ModBlocks.SILVER_BLOCK,"银块");
        translationBuilder.add(ModBlocks.TIN_ORE,"锌矿石");
        translationBuilder.add(ModBlocks.ALUMINUM_ORE,"铝矿石");
        translationBuilder.add(ModBlocks.SILVER_ORE,"银矿石");
        translationBuilder.add(ModItems.RAW_ALUMINUM,"粗铝");
        translationBuilder.add(ModItems.RAW_TIN,"粗锡");
        translationBuilder.add(ModItems.RAW_SILVER,"粗银");
        translationBuilder.add(ModItems.SILVER_NUGGET,"银粒");
        translationBuilder.add(ModItems.TIN_NUGGET,"锡粒");
        translationBuilder.add(ModItems.ALUMINUM_NUGGET,"铝粒");
        translationBuilder.add(ModItems.SILVER_INGOT,"银锭");
        translationBuilder.add(ModItems.TIN_INGOT,"锡锭");
        translationBuilder.add(ModItems.ALUMINUM_INGOT,"铝锭");
        translationBuilder.add(ModItems.STEEL_SWORD,"钢剑");
        translationBuilder.add(ModItems.STEEL_PICKAXE,"钢镐");
        translationBuilder.add(ModItems.STEEL_SHOVEL,"钢铲");
        translationBuilder.add(ModItems.STEEL_AXE,"钢斧");
        translationBuilder.add(ModItems.STEEL_HOE,"钢锄");
    }
}
