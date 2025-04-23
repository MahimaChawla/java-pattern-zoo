package com.devtools.patternzoo.strategy;

public class StrategyService {

    public static void main(String[] args) {
        String topic = "options-data";
        String key = "chunk-42";
        String value = "data-payload";
        Exception failure = new RuntimeException("Simulated processing error");

        RetryContext context = new RetryContext(new DelayedRetryStrategy());
        context.handleFailure(topic, key, value, failure);

        RetryContext dltContext = new RetryContext(new DeadLetterStrategy());
        dltContext.handleFailure(topic, key, value, failure);
    }
}
