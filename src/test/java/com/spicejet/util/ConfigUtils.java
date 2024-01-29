package com.spicejet.util;

import org.apache.commons.configuration2.PropertiesConfiguration;

public class ConfigUtils {

    private static final String SPICEJET_GLOBAL_PROPERTIES = System.getProperty("global.properties",
            "resources/spicejet.properties");

    private static PropertiesConfiguration globalConfig = null;

    static {
        globalConfig = createConfig(SPICEJET_GLOBAL_PROPERTIES);
    }

    private static PropertiesConfiguration createConfig(String pathName) {
        try {
            return PropertiesConfigurationUtils.getPropertiesConfigurationThatReturnsNullOnMissingProperty(pathName);
        } catch (Exception e) {
            System.out.println(e);
        }
        // Return an empty one.
        return new PropertiesConfiguration();
    }

}
