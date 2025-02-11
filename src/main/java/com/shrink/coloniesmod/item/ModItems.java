package com.shrink.coloniesmod.item;


import com.shrink.coloniesmod.ShrinkColoniesMod;
import net.minecraft.item.Item;
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



    private static Item registerItems(String id,Item item){
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(ShrinkColoniesMod.MOD_ID,id)),item);
    }

    public static void registerModItems(){
        ShrinkColoniesMod.LOGGER.info("Registering ShrinkColoniesMod Items");
    }
}
