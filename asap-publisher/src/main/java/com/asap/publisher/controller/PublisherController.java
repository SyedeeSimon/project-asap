package com.asap.publisher.controller;

import com.asap.publisher.model.Payload;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class PublisherController {

    @PostMapping(value = "/publish", consumes = "application/json", produces = "application/json")
    public String publish(@RequestBody Payload payload) {
        // Process the payload (e.g., log, store, or forward)
        return "{\"status\": \"Payload received\", \"message\": \"" + payload.getMessage() + "\"}";
    }
}