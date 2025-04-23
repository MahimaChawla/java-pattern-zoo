package com.devtools.patternzoo.strategy;

public class DeadLetterStrategy implements KafkaMessageRetryStrategy {
    @Override
    public boolean retry(String topic, String key, String value, Exception e) {
        String deadLetterTopic = topic + ".DLT";
        System.out.println("[DLT] Failed to process message. Sending to: " + deadLetterTopic);
        System.out.println("[DLT] Key: " + key);
        System.out.println("[DLT] Value: " + value);
        System.out.println("[DLT] Reason: " + e.getMessage());

        // Kafka Producer
        return false;
    }

    private void publishToDeadLetterTopic(String deadLetterTopic, String key, String value, String reason) {
        System.out.printf("Publishing to DLT [%s]: key='%s', value='%s', reason='%s'%n", deadLetterTopic, key, value, reason);
    }
}
