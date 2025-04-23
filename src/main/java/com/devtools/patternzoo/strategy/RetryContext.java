package com.devtools.patternzoo.strategy;

import java.util.function.Function;

public class RetryContext {
    private KafkaMessageRetryStrategy retryStrategy;

    public RetryContext(KafkaMessageRetryStrategy retryStrategy) {
        this.retryStrategy = retryStrategy;
    }

    public void handleFailure(String topic, String key, String value, Exception e) {
        boolean success = retryStrategy.retry(topic, key, value, e);
        if (success) {
            System.out.println("Retry succeeded for key: " + key);
        } else {
            System.out.println("Retry failed for key: " + key);
        }
    }
}
