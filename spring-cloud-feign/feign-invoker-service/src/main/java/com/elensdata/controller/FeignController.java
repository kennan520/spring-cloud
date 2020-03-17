package com.elensdata.controller;

import com.elensdata.service.FeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project spring-cloud
 * @Date 2020/1/7 15:51
 * @Author: jiangJiaQiang
 */

@RestController
public class FeignController {

    @Autowired(required = false)
    private FeignApi feignApi;

    /*
     * @ClassName FeignController
     * @Desc TODO   调用 Say Hello 方法
     * @Date 2019/5/15 16:20
     * @Version 1.0
     */
    @RequestMapping("/feign")
    public String feign(){
        return feignApi.hello();
    }


}
