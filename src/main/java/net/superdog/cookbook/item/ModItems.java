package net.superdog.cookbook.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.superdog.cookbook.cookbookMod;

public class ModItems {

    public static final Item DOUGH = registerItem("dough",
            new Item(new FabricItemSettings().group(ModItemGroup.COOKBOOK_MOD)));
    public static final Item CHOCOLATE = registerItem("chocolate",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build()).group(ModItemGroup.COOKBOOK_MOD)));

    public static final Item CHOCO_COOKIE = registerItem("choco_cookie",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).snack().build()).group(ModItemGroup.COOKBOOK_MOD)));

    public static final Item MIXED_ICE_CREAM = registerItem("ice_cream",
            new StewItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.8f).build()).group(ModItemGroup.COOKBOOK_MOD).maxCount(1)));

    public static final Item FRIED_EGG = registerItem("fried_egg",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.4F).build()).group(ModItemGroup.COOKBOOK_MOD)));

    public static final Item SCRAMBLED_EGGS = registerItem("scrambled_eggs",
            new StewItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.8f).build()).group(ModItemGroup.COOKBOOK_MOD).maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(cookbookMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        cookbookMod.LOGGER.debug("Registering Mod Items for " + cookbookMod.MOD_ID);
    }
}