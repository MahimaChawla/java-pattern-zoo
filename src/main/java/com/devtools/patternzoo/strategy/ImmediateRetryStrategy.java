package com.devtools.patternzoo.strategy;

public class ImmediateRetryStrategy implements KafkaMessageRetryStrategy {
    @Override
    public boolean retry(String topic, String key, String value, Exception e) {
        System.out.println("Retrying immediately for key: " + key);
        return true;
    }
}
