package com.weather.WeatherApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String Welcome() {
        String welcomeMsg = "Welcome to Springboot planet!";
        return welcomeMsg;
    }
}