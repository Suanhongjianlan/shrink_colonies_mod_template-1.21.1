package com.shrink.coloniesmod.tags;

import com.shrink.coloniesmod.ShrinkColoniesMod;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {

    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.ofVanilla(id));
    }

    public static void registerModBlockTags() {
        ShrinkColoniesMod.LOGGER.info("Register Mod Block Tags");
    }
}
