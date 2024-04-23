package com.example.serviceaproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class ServiceAProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAProducerApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Service A";
    }


}
