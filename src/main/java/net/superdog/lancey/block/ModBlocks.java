package net.superdog.lancey.block;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.superdog.lancey.item.ModItemGroup;
import net.superdog.lancey.lanceyMod;

public class ModBlocks {
    public static final Block CHOCOLATE_BLOCK = registerBlock("chocolate_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f)), ModItemGroup.LANCEYS_MOD);



    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(lanceyMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(lanceyMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        lanceyMod.LOGGER.debug("Registering ModBlocks for " + lanceyMod.MOD_ID);
    }
}