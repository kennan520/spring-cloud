package com.elensdata.eurekaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project spring-cloud
 * @Date 2019/12/12 17:55
 * @Author: jiangJiaQiang
 */
@RestController
@RequestMapping("user")
public class UserController {
    @GetMapping("getUser")
    public String getUser() {
        return "hello world";
    }
}
