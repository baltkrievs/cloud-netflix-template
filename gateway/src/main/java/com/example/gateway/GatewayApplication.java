package com.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
@EnableZuulProxy
public class GatewayApplication {

    public static void main(String[] args) {

        // Object[] sources = {SpringCloudZuulExampleApplication.class, new UrlResource(new URL("file:C:/dev/abc_dynamic.groovy"))};
        Object[] sources = {GatewayApplication.class, new ClassPathResource("groovy/ExampleSurgicalDebugFilterBean.groovy")};
        SpringApplication.run(sources, args);
    }
}
