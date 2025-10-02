package com.asap.publisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import software.amazon.awssdk.services.sns.SnsClient;

@SpringBootApplication
public class AsapPublisherApplication {

    public static void main(String[] args) {
        SpringApplication.run(AsapPublisherApplication.class, args);
    }

    @Bean
    public SnsClient snsClient() {
        return SnsClient.create();
    }

}
