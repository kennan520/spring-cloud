package com.elensdata.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project spring-cloud
 * @Date 2020/1/6 11:01
 * @Author: jiangJiaQiang
 */
@RestController
public class FallbackController {
    @RequestMapping("fallback")
    public String fallback() {
        return "I'm Spring Cloud Gateway fallback.";
    }
}
