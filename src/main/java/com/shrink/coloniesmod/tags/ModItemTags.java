package com.shrink.coloniesmod.tags;

import com.shrink.coloniesmod.ShrinkColoniesMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {

    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.ofVanilla(id));
    }

    public static void registerModItemTags() {
        ShrinkColoniesMod.LOGGER.info("Register Mod Item Tags");
    }
}
