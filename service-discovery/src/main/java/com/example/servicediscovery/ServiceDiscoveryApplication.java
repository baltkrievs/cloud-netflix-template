package com.example.servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class ServiceDiscoveryApplication {

    public static void main(String[] args) {

        // open http://localhost:8761/ for more details
        SpringApplication.run(ServiceDiscoveryApplication.class, args);
    }
}
