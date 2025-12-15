package com.example.security_demo_lesson5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/public")
    public String publicApi() {
        return "This is the public api";
    }

    @GetMapping("/private")
    private String privateApi() {
        return "This is the private api";
    }
}
