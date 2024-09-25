package com.yogayataverma.microservice;

import org.springframework.stereotype.Service;

@Service
public class Service1 implements MyService {

    @Override
    public String provideServiceLogic()
    {
        return "Hello from Service!";
    }
}
