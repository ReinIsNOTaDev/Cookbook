package net.superdog.lancey;

import net.fabricmc.api.ModInitializer;
import net.superdog.lancey.block.ModBlocks;
import net.superdog.lancey.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class lanceyMod implements ModInitializer {


    public static final String MOD_ID = "lancey";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
