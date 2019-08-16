package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

/*    @RequestMapping({"/", "/index"})
    public String index() {

        return "index";
    }*/

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "forward:hello2";
    }

    @ResponseBody
    @RequestMapping("/hello2")
    public String hello2() {

        return "hello Spring boot";
    }

    //@ResponseBody
    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("hello", "<h1>你好</h1>");
        map.put("users", Arrays.asList("lisi", "zhangsan", "wangwu"));
        return "success";
    }

}
