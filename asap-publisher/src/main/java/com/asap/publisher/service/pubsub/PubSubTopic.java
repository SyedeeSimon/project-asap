package com.asap.publisher.service.pubsub;

public enum PubSubTopic {
    PRIMARY_MESSAGE_TOPIC("arn:aws:sns:ap-southeast-2:323726448228:asap_primary_message_topic");

    private String topicArn;

    private PubSubTopic(final String topicArn) {
        this.topicArn = topicArn;
    }

    public String getTopicArn() {
        return topicArn;
    }
}
