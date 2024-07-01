package emissivity.trashchest;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrashChest implements ModInitializer {
	public static final String MOD_ID = "trash-chest";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("trash-chest");
	public static final boolean LOGGING = false;

	@Override
	public void onInitialize() {
		if(LOGGING)
			LOGGER.info("Initialized {}", MOD_ID);
	}
}