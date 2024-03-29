package com.atguigu.springboot.component;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor implements HandlerInterceptor {

    //方位之前进行拦截
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user = request.getSession().getAttribute("loginUser");
        if (user == null) {
            //未登录, 跳转到首页
            request.setAttribute("msg", "没有权限，请先登录");
            request.getRequestDispatcher("/login.html").forward(request, response);
            return false;
        } else {
            //已登录
            return true;
        }

    }
}
