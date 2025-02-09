package com.shrink.coloniesmod.item;


import com.shrink.coloniesmod.ShrinkColoniesMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item STEEL_INGOT = registerItems("steel_ingot", new Item(new Item.Settings()));

    private static Item registerItems(String id,Item item){
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(ShrinkColoniesMod.MOD_ID,id)),item);
    }

    public static void registerModItems(){
        ShrinkColoniesMod.LOGGER.info("Registering ShrinkColoniesMod Items");
    }
}
