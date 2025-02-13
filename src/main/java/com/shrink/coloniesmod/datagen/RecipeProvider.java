package com.shrink.coloniesmod.datagen;

import com.shrink.coloniesmod.block.ModBlocks;
import com.shrink.coloniesmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class RecipeProvider extends FabricRecipeProvider {
    public RecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        /*
          块<->锭的合成和分解配方
          */
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, ModItems.STEEL_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_BLOCK);

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, ModItems.ALUMINUM_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.ALUMINUM_BLOCK);

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, ModItems.TIN_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.TIN_BLOCK);

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, ModItems.SILVER_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.SILVER_BLOCK);

        /*
          锭<->粒的合成和分解配方
          */
        offerReversibleCompactingRecipesWithCompactingRecipeGroup(
                recipeExporter, RecipeCategory.MISC, ModItems.SILVER_NUGGET, RecipeCategory.MISC,
                ModItems.SILVER_INGOT, "silver_ingot_from_nuggets", "silver_ingot"
        );
        offerReversibleCompactingRecipesWithCompactingRecipeGroup(
                recipeExporter, RecipeCategory.MISC, ModItems.TIN_NUGGET, RecipeCategory.MISC,
                ModItems.TIN_INGOT, "tin_ingot_from_nuggets", "tin_ingot"
        );
        offerReversibleCompactingRecipesWithCompactingRecipeGroup(
                recipeExporter, RecipeCategory.MISC, ModItems.ALUMINUM_NUGGET, RecipeCategory.MISC,
                ModItems.ALUMINUM_INGOT, "aluminum_ingot_from_nuggets", "aluminum_ingot"
        );

    }
}
