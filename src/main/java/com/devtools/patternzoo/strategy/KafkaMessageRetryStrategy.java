package com.devtools.patternzoo.strategy;

public interface KafkaMessageRetryStrategy {
    boolean retry(String topic, String key, String value, Exception e);
}
