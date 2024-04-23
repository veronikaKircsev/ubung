package com.example.servicebconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ServiceBConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceBConsumerApplication.class, args);
    }

    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<String> stringResponseEntity = restTemplate.getForEntity("http://localhost:5050/hello", String.class);
    System.out.println( "Service B" + stringResponseEntity.getBody());
}
