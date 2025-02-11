package com.shrink.coloniesmod;

import com.shrink.coloniesmod.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.data.report.ItemListProvider;

public class ShrinkColoniesModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(BlockTagsProvider::new);
		pack.addProvider(ChineseLanguageProvider::new);
		pack.addProvider(ItemListProvider::new);
		pack.addProvider(LanguageProvider::new);
		pack.addProvider(LootTableProvider::new);
		pack.addProvider(ModelsProvider::new);
		pack.addProvider(RecipeProvider::new);
	}
}
