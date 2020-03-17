package com.elensdata.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Project spring-cloud
 * @Date 2020/1/7 15:49
 * @Author: jiangJiaQiang
 */
@FeignClient("say-hello")
public interface FeignApi {

    @RequestMapping("hello")
    String hello();
}
