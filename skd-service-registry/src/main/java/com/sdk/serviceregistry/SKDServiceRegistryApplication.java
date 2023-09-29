package com.sdk.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SKDServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SKDServiceRegistryApplication.class, args);
	}

}
