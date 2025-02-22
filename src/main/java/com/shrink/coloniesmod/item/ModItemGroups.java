package com.shrink.coloniesmod.item;

import com.shrink.coloniesmod.ShrinkColoniesMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.shrink.coloniesmod.block.ModBlocks;

import static com.shrink.coloniesmod.ShrinkColoniesMod.MOD_ID;

public class ModItemGroups {

//    public static final RegistryKey<ItemGroup> SC_ITEMS_TAB = register("sc_items_tab");
//    private static final Logger log = LoggerFactory.getLogger(ModItemGroups.class);
//
//    private static RegistryKey<ItemGroup> register(String id) {
//        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(MOD_ID,id));
//    }
//
//    public static void registerModItemGroups(){
//        Registry.register(Registries.ITEM_GROUP,SC_ITEMS_TAB,
//                ItemGroup.create(ItemGroup.Row.TOP,7)
//                        .displayName(Text.translatable("itemGroup.shrink_colonies_mod.sc_items_tab"))
//                        .icon(()->new ItemStack(ModItems.STEEL_INGOT))
//                        .entries(((displayContext, entries) -> {entries.add(ModItems.STEEL_INGOT);}))
//                        .build());
//        ShrinkColoniesMod.LOGGER.info("Registering Item Groups");
//    }
    public static final ItemGroup SC_ITEMS_TAB = Registry.register(Registries.ITEM_GROUP,Identifier.of(MOD_ID,"sc_items_tab"),
        ItemGroup.create(null,-1).displayName(Text.translatable("itemGroup.sc_items_tab"))
                .icon(()->new ItemStack(ModItems.STEEL_INGOT))
                .entries((displayContext, entries) -> {
                    entries.add(ModItems.STEEL_INGOT);
                    entries.add(ModItems.ALUMINUM_INGOT);
                    entries.add(ModItems.SILVER_INGOT);
                    entries.add(ModItems.TIN_INGOT);
                    entries.add(ModItems.RAW_ALUMINUM);
                    entries.add(ModItems.RAW_TIN);
                    entries.add(ModItems.RAW_SILVER);
                    entries.add(ModItems.TIN_NUGGET);
                    entries.add(ModItems.ALUMINUM_NUGGET);
                    entries.add(ModItems.SILVER_NUGGET);
                }).build());


    public static final ItemGroup SC_BLOCKS_TAB = Registry.register(Registries.ITEM_GROUP,Identifier.of(MOD_ID,"sc_blocks_tab"),
            ItemGroup.create(null,-1).displayName(Text.translatable("itemGroup.sc_blocks_tab"))
                    .icon(()->new ItemStack(ModBlocks.STEEL_BLOCK))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.STEEL_BLOCK);
                        entries.add(ModBlocks.ALUMINUM_BLOCK);
                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add(ModBlocks.SILVER_BLOCK);
                        entries.add(ModBlocks.SILVER_ORE);
                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModBlocks.ALUMINUM_ORE);
                    }).build());

    public static final ItemGroup SC_TOOLS_TAB = Registry.register(Registries.ITEM_GROUP,Identifier.of(MOD_ID,"sc_tools_tab"),
            ItemGroup.create(null,-1).displayName(Text.translatable("itemGroup.sc_tools_tab"))
                    .icon(()->new ItemStack(ModItems.STEEL_PICKAXE))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.STEEL_SHOVEL);
                        entries.add(ModItems.STEEL_PICKAXE);
                        entries.add(ModItems.STEEL_AXE);
                        entries.add(ModItems.STEEL_HOE);
                        entries.add(ModItems.STEEL_SWORD);
                    }).build());
    
    public static void registerModItemGroups(){
        ShrinkColoniesMod.LOGGER.info("Registering Item Groups");
    }
}
