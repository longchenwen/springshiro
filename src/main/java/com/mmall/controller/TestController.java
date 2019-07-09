package com.mmall.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@Slf4j
public class TestController {

    @RequestMapping("/hello")
    @ResponseBody
    public String test(){
        log.info("测试日志");
        return "test controller";
    }
}
