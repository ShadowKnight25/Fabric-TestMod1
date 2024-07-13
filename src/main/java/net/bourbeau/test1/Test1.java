package net.bourbeau.test1;

import net.bourbeau.test1.item.Moditems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test1 implements ModInitializer {
	public static String MOD_ID = "test1";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		Moditems.registerModItems();

		LOGGER.info("Hello Fabric world!");
	}
}