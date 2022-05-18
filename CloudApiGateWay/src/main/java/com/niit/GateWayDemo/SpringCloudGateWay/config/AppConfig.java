package com.niit.GateWayDemo.SpringCloudGateWay.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;

@Configuration
public class AppConfig {
    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/api/user/**")
                        .uri("http://localhost:8086/"))
                .route(p -> p
                        .path("/api/pizza/**")
                        .uri("http://localhost:8083/"))
                .route(p -> p
                        .path("/api/orders/**")
                        .uri("http://localhost:8085/"))
                .build();
    }
}