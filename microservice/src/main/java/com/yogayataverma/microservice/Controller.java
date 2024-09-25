package com.yogayataverma.microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class Controller {

    @GetMapping("/home")
    public String home()
    {
        return "Hello from Home!";
    }
}