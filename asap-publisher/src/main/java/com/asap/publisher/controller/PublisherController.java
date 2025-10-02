package com.asap.publisher.controller;

import com.asap.publisher.controller.model.messages.DefaultMessage;
import com.asap.publisher.service.pubsub.PubSubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class PublisherController {
    private PubSubService pubSubService;

    @Autowired
    public PublisherController(PubSubService pubSubService) {
        this.pubSubService = pubSubService;
    }

    @PostMapping(value = "/publish", consumes = "application/json", produces = "application/json")
    public String publish(@RequestBody DefaultMessage message) {
        // Process the payload (e.g., log, store, or forward)
        pubSubService.publishMessage(message.message());
        return HttpStatus.ACCEPTED.toString();
    }
}
