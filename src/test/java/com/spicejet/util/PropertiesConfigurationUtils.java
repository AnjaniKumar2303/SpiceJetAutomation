package com.spicejet.util;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.builder.fluent.PropertiesBuilderParameters;

public class PropertiesConfigurationUtils {

    public static PropertiesConfiguration getPropertiesConfigurationThatReturnsNullOnMissingProperty(String propertyFile) throws Exception {
        FileBasedConfigurationBuilder<PropertiesConfiguration> builder = new FileBasedConfigurationBuilder<>(PropertiesConfiguration.class);
        PropertiesBuilderParameters propertiesBuilderParameters = new Parameters().properties();
        propertiesBuilderParameters.setFileName(propertyFile);
        propertiesBuilderParameters.setThrowExceptionOnMissing(false);
        builder.configure(propertiesBuilderParameters);
        PropertiesConfiguration propertiesConfiguration = builder.getConfiguration();
        return propertiesConfiguration;
    }
}
