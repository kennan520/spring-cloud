package com.elensdata.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;

/**
 * @Project spring-cloud
 * @Date 2020/1/8 17:04
 * @Author: jiangJiaQiang
 */
@Configuration
@PropertySource("classpath:system.properties")
public class InitConfig {
    @Value("${hello}")
    private String hello;
    @PostConstruct
    public void init(){
        System.err.println(hello);
    }
}
