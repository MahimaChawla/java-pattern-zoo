package com.devtools.patternzoo.factory.config;

public class DevConfigBean implements AppConfig {
    @Override
    public String getConfigValue() {
        return "Loaded DEV configuration";
    }
}
