package com.elensdata.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project spring-cloud
 * @Date 2019/12/30 15:38
 * @Author: jiangJiaQiang
 */
@RestController
public class Acontroller {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello！I'm a. port：" + port;
    }

    /**
     * @ClassName ASayHelloController
     * @Desc TODO   接收从网关传入的参数
     * @Date 2019/6/23 16:28
     * @Version 1.0
     */
    @RequestMapping("/name")
    public String name(String name) {
        return "My name is " + name + ". aaa";
    }

    /**
     * @ClassName ASayHelloController
     * @Desc TODO   接收从网关传入的参数
     * @Date 2019/6/23 16:52
     * @Version 1.0
     */
    @RequestMapping("/age")
    public String age(String age) {
        return "I am " + age + " years old this year. aaa";
    }

    /**
     * @ClassName ASayHelloController
     * @Desc TODO   接收从网关传入的参数
     * @Date 2019/6/29 22:00
     * @Version 1.0
     */
    @RequestMapping("/routeAll")
    public String routeAll(String pass) {
        return "Can I pass? " + pass + "! port：" + port;
    }

}
