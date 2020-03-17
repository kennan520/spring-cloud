package com.elensdata.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Project spring-cloud
 * @Date 2020/1/8 17:04
 * @Author: jiangJiaQiang
 */
@Configuration
@PropertySource("classpath:system.properties")
public class InitConfig {
}
