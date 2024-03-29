package net.superdog.cookbook.block;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.superdog.cookbook.item.ModItemGroup;
import net.superdog.cookbook.cookbookMod;

public class ModBlocks {
    public static final Block CHOCOLATE_BLOCK = registerBlock("chocolate_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f)), ModItemGroup.COOKBOOK_MOD);



    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(cookbookMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(cookbookMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        cookbookMod.LOGGER.debug("Registering ModBlocks for " + cookbookMod.MOD_ID);
    }
}