package dev.evannregnault.iledesartistes;

import dev.evannregnault.iledesartistes.loaders.FallingTreeLoader;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static dev.evannregnault.iledesartistes.enchantments.EnchantmentLoader.InitEnchantments;

public class IleDesArtistes implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Ile des Artistes");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		if (FabricLoader.getInstance().isModLoaded("fallingtree")) {
			FallingTreeLoader.InitFallingTree();
		}

		InitEnchantments();


		LOGGER.info("Mod has successfully Loaded");
	}
}