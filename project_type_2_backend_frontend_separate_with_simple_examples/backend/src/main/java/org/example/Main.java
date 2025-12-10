package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
@CrossOrigin
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/productinfo")
    public Map<String, Object> abc() {
        Map<String, Object> product = new HashMap<>();
        product.put("name", "T-shirt");
        product.put("price", 300);
        return product;
//        return Map.of("name", "T-shirt", "price", 19.99);
    }
}