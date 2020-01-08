package com.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.service.DubboTestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HP on 2020/1/6.
 */
@Controller
@RequestMapping("/test/")
public class HelloController {

    @Reference(interfaceClass = DubboTestService.class,check = false,version = "1.0.0")
    private DubboTestService dubboTest;

    @RequestMapping("getHW")
    @ResponseBody
    public String getHW(){
        return "helloword";
    }

    @RequestMapping("getHW1")
    @ResponseBody
    public String getHW1(){
        return  dubboTest.getHelloWord();
    }

}
