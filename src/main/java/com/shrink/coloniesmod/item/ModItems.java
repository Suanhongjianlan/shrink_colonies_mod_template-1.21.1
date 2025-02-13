package com.shrink.coloniesmod.item;


import com.shrink.coloniesmod.ShrinkColoniesMod;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item STEEL_INGOT = registerItems("steel_ingot", new Item(new Item.Settings()));

    public static final Item TIN_INGOT = registerItems("tin_ingot", new Item(new Item.Settings()));

    public static final Item ALUMINUM_INGOT = registerItems("aluminum_ingot", new Item(new Item.Settings()));

    public static final Item SILVER_INGOT = registerItems("silver_ingot", new Item(new Item.Settings()));

    public static final Item RAW_TIN = registerItems("raw_tin", new Item(new Item.Settings()));

    public static final Item RAW_ALUMINUM = registerItems("raw_aluminum", new Item(new Item.Settings()));

    public static final Item RAW_SILVER = registerItems("raw_silver", new Item(new Item.Settings()));

    public static final Item TIN_NUGGET = registerItems("tin_nugget", new Item(new Item.Settings()));

    public static final Item ALUMINUM_NUGGET = registerItems("aluminum_nugget", new Item(new Item.Settings()));

    public static final Item SILVER_NUGGET = registerItems("silver_nugget", new Item(new Item.Settings()));

    public static final Item STEEL_SWORD = registerItems(
            "steel_sword", new SwordItem(ModToolMaterials.STEEL, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STEEL, 6, -2.4F)))
    );
    public static final Item STEEL_SHOVEL = registerItems(
            "steel_shovel",
            new ShovelItem(ModToolMaterials.STEEL, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.STEEL, 4.5F, -3.0F)))
    );
    public static final Item STEEL_PICKAXE = registerItems(
            "steel_pickaxe",
            new PickaxeItem(ModToolMaterials.STEEL, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.STEEL, 4.0F, -2.8F)))
    );
    public static final Item STEEL_AXE = registerItems(
            "steel_axe", new AxeItem(ModToolMaterials.STEEL, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.STEEL, 8.0F, -3.2F)))
    );
    public static final Item STEEL_HOE = registerItems(
            "steel_hoe", new HoeItem(ModToolMaterials.STEEL, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.STEEL, 0.0F, -1.0F)))
    );

    private static Item registerItems(String id,Item item){
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(ShrinkColoniesMod.MOD_ID,id)),item);
    }

    public static void registerModItems(){
        ShrinkColoniesMod.LOGGER.info("Registering ShrinkColoniesMod Items");
    }
}
