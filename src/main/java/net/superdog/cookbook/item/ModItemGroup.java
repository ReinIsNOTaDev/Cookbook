package net.superdog.cookbook.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.superdog.cookbook.cookbookMod;

public class ModItemGroup {
    public static final ItemGroup cookbookS_MOD = FabricItemGroupBuilder.build(
            new Identifier(cookbookMod.MOD_ID, "chocolate"), () -> new ItemStack(ModItems.CHOCOLATE));
}