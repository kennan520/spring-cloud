package com.elensdata.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Project spring-cloud
 * @Date 2019/12/20 15:02
 * @Author: jiangJiaQiang
 */
@RestController
@Configuration
public class UserController {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
    @GetMapping(value = "/router")
    public String router() {
        RestTemplate restTemplate = getRestTemplate();
        String forEntity = restTemplate.getForObject("http://first-service-provider/user/getUser", String.class);
        return forEntity;
    }
}
