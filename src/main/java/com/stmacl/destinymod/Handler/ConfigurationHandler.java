package com.stmacl.destinymod.Handler;

import java.io.File;

import com.stmacl.destinymod.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	public static Configuration configuration;
	public static boolean testValue = false;

	public static void init(File configFile) {
		if (configuration == null) {
			Configuration configuration = new Configuration(configFile);

			loadConfiguration();
		}
	}

	public static void loadConfiguration() {
		testValue = configuration.getBoolean("configValue",
				Configuration.CATEGORY_GENERAL, false, "Test Config value");
		if (configuration.hasChanged()) {
			configuration.save();
		}
	}

	@SubscribeEvent
	public void onConfigurationChangedEvent(
			ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
			loadConfiguration();
		}
	}
}