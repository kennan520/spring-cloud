package com.elensdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FeignRegistryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignRegistryServiceApplication.class, args);
    }

}
