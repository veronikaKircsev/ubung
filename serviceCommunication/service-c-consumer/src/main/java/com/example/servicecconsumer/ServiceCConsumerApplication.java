package com.example.servicecconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ServiceCConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCConsumerApplication.class, args);
    }

    @GetMapping("/getservice")
    public String greet() {
        //Make a call to Service A
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:5050/hello", String.class);
        return "Service C" + response.getBody();
    }
}
