package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * 用户登录控制器
 */
@Controller
public class LoginController {


    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String, String> map, HttpSession session) {
        if (!StringUtils.isEmpty(username) && "123456".equalsIgnoreCase(password)) {
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";

        } else {
            map.put("msg", "用户名或密码错误");
        }
        return "login";
    }
}
