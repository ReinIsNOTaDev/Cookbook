package net.superdog.lancey.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.superdog.lancey.lanceyMod;

public class ModItems {
    public static final Item CHOCOLATE = registerItem("chocolate",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build()).group(ModItemGroup.LANCEYS_MOD)));

    public static final Item CHOCO_ICE_CREAM = registerItem("choco_ice_cream",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).build()).group(ModItemGroup.LANCEYS_MOD)));

    public static final Item CHOCO_COOKIE = registerItem("choco_cookie",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).snack().build()).group(ModItemGroup.LANCEYS_MOD)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(lanceyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        lanceyMod.LOGGER.debug("Registering Mod Items for " + lanceyMod.MOD_ID);
    }
}