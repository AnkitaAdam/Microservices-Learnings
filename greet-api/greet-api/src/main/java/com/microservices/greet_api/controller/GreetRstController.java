package com.microservices.greet_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.greet_api.client.FeignClientCommunication;

@RestController
public class GreetRstController {

    @Autowired
    private FeignClientCommunication feignClientCommunication;

    @GetMapping("/greet")
    public String getMapping(){

        String wlcMsg = feignClientCommunication.getWelcomeMsg();

        String msg = " Good Morning!";

        return wlcMsg + msg;

    }
}
