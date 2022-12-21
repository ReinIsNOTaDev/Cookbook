package net.superdog.lancey.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.superdog.lancey.lanceyMod;

public class ModItemGroup {
    public static final ItemGroup LANCEYS_MOD = FabricItemGroupBuilder.build(
            new Identifier(lanceyMod.MOD_ID, "chocolate"), () -> new ItemStack(ModItems.CHOCOLATE));
}