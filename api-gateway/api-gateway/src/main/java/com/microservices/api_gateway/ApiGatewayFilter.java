package com.microservices.api_gateway;

import java.util.List;
import java.util.Set;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class ApiGatewayFilter implements GlobalFilter {


    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        System.out.println("filters is executed");

        //EXCHANGE IS THE object
        ServerHttpRequest request = exchange.getRequest();
        HttpHeaders headers = request.getHeaders();
        Set<String> keySet = headers.keySet();

        if(!keySet.contains("secret-key")){
            throw new RuntimeException("It is invalid request");
        }

        List<String> list = headers.get("secret-key");
        if(!list.get(0).equals("ankita@it")){
            throw new RuntimeException("It is Invalid Request");
        }


        //TODO: validate the request
        return chain.filter(exchange);
    }
}
