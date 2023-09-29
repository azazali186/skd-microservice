package com.sdk.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/api/skd-auth-service/**")
                        .uri("lb://SKD-AUTH-SERVICE/"))
                .route(r -> r.path("/api/skd-master-service/**")
                        .uri("lb://SKD-MASTER-SERVICE/"))
                .route(r -> r.path("/api/skd-profile-service/**")
                        .uri("lb://SKD-PROFILE-SERVICE/"))
                .route(r -> r.path("/api/skd-file-service/**")
                        .uri("lb://SKD-FILE-SERVICE/"))
                .route(r -> r.path("/api/skd-report-service/**")
                        .uri("lb://SKD-REPORT-SERVICE/"))
                // You can define more routes in a similar fashion
                .build();
    }
}

