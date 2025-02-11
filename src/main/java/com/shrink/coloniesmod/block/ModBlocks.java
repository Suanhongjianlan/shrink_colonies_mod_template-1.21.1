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
import net.minecraft.util.math.intprovider.ConstantIntProvider;

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
    //铝矿石
    public static final Block ALUMINUM_ORE = register(
            "aluminum_ore",
            new ExperienceDroppingBlock(
                    ConstantIntProvider.create(0),
                    AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.5F, 2.5F)
            )
    );
    //铝块
    public static final Block ALUMINUM_BLOCK = register(
            "aluminum_block",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.IRON_GRAY)
                            .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                            .requiresTool()
                            .strength(4.0F, 3.0F)
                            .sounds(BlockSoundGroup.METAL)
            )
    );
    //锡矿石
    public static final Block TIN_ORE = register(
            "tin_ore",
            new ExperienceDroppingBlock(
                    ConstantIntProvider.create(0),
                    AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 2.0F)
            )
    );
    //锡块
    public static final Block TIN_BLOCK = register(
            "tin_block",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.IRON_GRAY)
                            .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                            .requiresTool()
                            .strength(3.0F, 3.0F)
                            .sounds(BlockSoundGroup.METAL)
            )
    );
    //银矿石
    public static final Block SILVER_ORE = register(
            "silver_ore",
            new ExperienceDroppingBlock(
                    ConstantIntProvider.create(0),
                    AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.5F, 2.5F)
            )
    );
    //银块
    public static final Block SILVER_BLOCK = register(
            "silver_block",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.IRON_GRAY)
                            .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                            .requiresTool()
                            .strength(4.0F, 3.0F)
                            .sounds(BlockSoundGroup.METAL)
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
