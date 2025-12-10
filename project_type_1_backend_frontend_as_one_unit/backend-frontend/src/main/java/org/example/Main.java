package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@Controller
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/productinfo")
    public String productinfo(Model model) {
        model.addAttribute("name", "T-shirt");
        model.addAttribute("price", 19.99);
        return "productinfo";
    }
}