package com.devtools.patternzoo.factory;

import com.devtools.patternzoo.factory.config.AppConfig;
import com.devtools.patternzoo.factory.config.DevConfigBean;
import com.devtools.patternzoo.factory.config.ProdConfigBean;

import java.util.Optional;

public class SpringFactory {
    public static Optional<AppConfig> getBean(EnvType env) {
        switch (env) {
            case DEVELOPMENT:
                return Optional.of(new DevConfigBean());
            case PRODUCTION:
                return Optional.of(new ProdConfigBean());
            default:
                return Optional.empty();
        }
    }

}

