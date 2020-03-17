package com.elensdata;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudConfigBusAclientServiceApplication {
    public static void main(String[] args) {

        SpringApplication.run(SpringcloudConfigBusAclientServiceApplication.class, args);
    }

}
