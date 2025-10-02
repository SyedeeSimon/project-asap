package com.asap.publisher.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


enum HealthCheckStatus {
    UP, DOWN
}


record HealthCheckResponse(HealthCheckStatus status, String message) {
}


@RestController
@RequestMapping("/api")
public class HealthCheckController {

    @GetMapping(value = "/health-check", produces = "application/json")
    public HealthCheckResponse healthCheck() {
        var status = new HealthCheckResponse(HealthCheckStatus.UP, "Healthy");
        return status;
    }
}