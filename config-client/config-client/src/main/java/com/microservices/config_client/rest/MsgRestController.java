package com.microservices.config_client.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

    //value annotaion is used to read aproperty from properties file

    @Value("${msg}")
    private String msg;

    @GetMapping("/")
    public String getMsg(){
        return msg;
    }

}
