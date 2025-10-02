package com.asap.publisher.service.pubsub;

import com.asap.publisher.service.pubsub.model.messages.Message;
import com.asap.publisher.service.pubsub.model.messages.MessageType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import software.amazon.awssdk.services.sns.SnsClient;

import java.util.UUID;

import static com.asap.publisher.service.pubsub.PubSubTopic.PRIMARY_MESSAGE_TOPIC;

@Component
public class PubSubService {
    private final SnsClient snsClient;

    @Autowired
    public PubSubService(SnsClient snsClient) {
        this.snsClient = snsClient;
    }

    public void publishMessage(String textMessage) {
        var message = new Message(MessageType.DEFAULT, UUID.randomUUID(), textMessage);
        publishMessage(message);
    }

    public void publishMessage(Message message) {
        snsClient.publish(builder ->
                builder.topicArn(PRIMARY_MESSAGE_TOPIC.getTopicArn())
                        .message(message.toString())
        );
    }
}
