package com.elensdata.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project spring-cloud
 * @Date 2019/12/30 15:53
 * @Author: jiangJiaQiang
 */
@RestController
public class Bcontroller {
    /**
     * @ClassName SayHelloController
     * @Desc TODO   读取配置文件中的端口
     * @Version 1.0
     */
    @Value("${server.port}")
    private String port;

    /**
     * @ClassName SayHelloController
     * @Desc TODO   Say Hello
     * @Version 1.0
     */
    @RequestMapping("/hello")
    public String hello() {
        return "Hello！I'm b. port：" + port;
    }

    /**
     * @ClassName ASayHelloController
     * @Desc TODO   接收从网关传入的参数
     * @Version 1.0
     */
    @RequestMapping("/age")
    public String age(String age) {
        return "I am " + age + " years old this year. bbb";
    }

    /**
     * @ClassName ASayHelloController
     * @Desc TODO   接收从网关传入的参数
     * @Version 1.0
     */
    @RequestMapping("/routeAll")
    public String routeAll(String pass) {
        return "Can I pass? " + pass + "! port：" + port;
    }
}
