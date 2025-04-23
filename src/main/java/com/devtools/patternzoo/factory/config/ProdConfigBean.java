package com.devtools.patternzoo.factory.config;

public class ProdConfigBean implements AppConfig {
    @Override
    public String getConfigValue() {
        return "Loaded PROD configuration";
    }
}
