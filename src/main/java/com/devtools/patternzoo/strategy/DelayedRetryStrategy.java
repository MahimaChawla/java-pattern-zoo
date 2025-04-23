package com.devtools.patternzoo.strategy;

public class DelayedRetryStrategy implements KafkaMessageRetryStrategy {
    @Override
    public boolean retry(String topic, String key, String value, Exception e) {
        try {
            System.out.println("Delaying retry for key: " + key);
            Thread.sleep(2000); // Simulate delay
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        return true;
    }
}
