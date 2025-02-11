package com.shrink.coloniesmod.block;


import com.shrink.coloniesmod.ShrinkColoniesMod;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //钢块
    public static final Block STEEL_BLOCK = register(
            "steel_block",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.IRON_GRAY)
                            .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                            .requiresTool()
                            .strength(5.0F, 6.0F)
                            .sounds(BlockSoundGroup.METAL)
            )
    );
    //
    public static final Block ROCK = register(
            "rock",
            new Block(
                    AbstractBlock.Settings.create()
                            .strength(5.0F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)
            )
    );


    public static void registerBlockItem(String id,Block block){
        Item item = Registry.register(Registries.ITEM,Identifier.of(ShrinkColoniesMod.MOD_ID,id),new BlockItem(block,new Item.Settings()));
        if(item instanceof BlockItem){
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS,item);
        }
    }

    public static Block register(String id,Block block){
        registerBlockItem(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ShrinkColoniesMod.MOD_ID,id),block);
    }

    public static void registerModBlock(){
        ShrinkColoniesMod.LOGGER.info("Register Mod Block");
    }
}
