package utils;

import java.util.Properties;

import constants.EnvType;

public class ConfigLoader {
	private final Properties properties;
	private static ConfigLoader configloader;

	private ConfigLoader() {
		String env = System.getProperty("env", String.valueOf(EnvType.STAGE));

		switch (EnvType.valueOf(env)) {
		case PROD:
			properties = PropertyUtils.propertyLoader("/src/test/resources/prod_config.properties");
			break;
		case STAGE:
			properties = PropertyUtils.propertyLoader("/src/test/resources/stage_config.properties");
			break;
		case TESTING:
			properties = PropertyUtils.propertyLoader("/src/test/resources/testing_config.properties");
			break;
		case DEV:
			properties = PropertyUtils.propertyLoader("/src/test/resources/prod_config.properties");
			break;
		default:
			throw new IllegalStateException("Illegal Env:   " + env);
		}
	}

	public static ConfigLoader getInstance() {
		return configloader == null ? new ConfigLoader() : configloader;
	}

	public String getBaseUrl() {
		String prop = properties.getProperty("baseUrl");
		if (prop != null)
			return prop;
		else
			throw new RuntimeException("Property baseurl is not specified in the prperties file");
	}

}
