package com.microservices.greet_api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "welcome-api")
public interface FeignClientCommunication {



    @GetMapping("/welcome")
    public String getWelcomeMsg();

}


//fiegnclient talks with the eureka server to get the url of requested service
//and eurekaserver gives the url, and then communication is taken place