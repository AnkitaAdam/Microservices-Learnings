
# Microservices Architecture Mini Projects

This repository contains several mini-projects that I have built to set up and demonstrate various components of a microservices architecture, including:

## Components

### 1. Config Server
A centralized configuration server to manage and provide configurations to microservices.

### 2. Zipkin Server
A server for distributed tracing using Zipkin to trace the requests across multiple microservices.

### 3. Admin Server
A server for monitoring and managing microservices using [Spring Boot Admin](https://github.com/codecentric/spring-boot-admin).

### 4. Service Registry (Eureka Server)
A service registry for registering and discovering microservices using [Spring Cloud Eureka](https://spring.io/projects/spring-cloud-netflix).

### 5. Load Balancing
A sample project demonstrating load balancing by following the [API Gateway](https://microservices.io/patterns/apigateway.html) architecture pattern.

## Features

- **Centralized Configuration Management:** All microservices can fetch their configuration from the Config Server.
- **Distributed Tracing with Zipkin:** Trace the requests flowing through multiple microservices.
- **Microservices Monitoring:** Admin Server provides a UI to monitor and manage the health and metrics of microservices.
- **Service Discovery:** Eureka Server handles dynamic registration and discovery of microservices.
- **Load Balancing:** Using the API Gateway pattern to balance the load across services.
