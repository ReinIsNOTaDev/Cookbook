package net.superdog.cookbook;

import net.fabricmc.api.ModInitializer;
import net.superdog.cookbook.block.ModBlocks;
import net.superdog.cookbook.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class cookbookMod implements ModInitializer {
//cook

    public static final String MOD_ID = "cookbook";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
