package com.elensdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayMasterServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayMasterServiceApplication.class, args);
    }

}
