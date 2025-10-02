package com.asap.publisher.service.pubsub.model.messages;

import java.util.UUID;

public record Message<T>(MessageType messageType, UUID messageId, T message) {
}