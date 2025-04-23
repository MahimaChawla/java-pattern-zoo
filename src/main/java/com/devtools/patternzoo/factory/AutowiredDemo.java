package com.devtools.patternzoo.factory;

import com.devtools.patternzoo.factory.config.AppConfig;

public class AutowiredDemo {
    private final AppConfig config;
    private final String env;

    public AutowiredDemo(String env) {
        // This is like Spring autowiring the correct bean for the interface
        this.env = env;
        EnvType envType;
        try {
            envType = EnvType.valueOf(env);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Invalid environment: " + env);
        }

        this.config = SpringFactory.getBean(envType)
                .orElseThrow(() -> new RuntimeException("No bean found for: " + env));

    }

    public void showBean() {
        System.out.println(config.getConfigValue());
    }
}

