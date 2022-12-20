package net.superdog.lancey.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.superdog.lancey.lanceyMod;

public class ModItemGroup {
    public static final ItemGroup LANCEYS_MOD = FabricItemGroup.builder(new Identifier(lanceyMod.MOD_ID))
            .displayName(Text.literal("Lancey's Mod"))
            .icon(() -> new ItemStack(ModItems.CHOCOLATE))
            .build();
}
