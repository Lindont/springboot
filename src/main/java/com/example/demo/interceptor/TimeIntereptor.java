package com.example.demo.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author : HuangHaoXin
 * @Description : 自定义拦截器
 * @Date : Create in 2018-02-10
 */
@Component
public class TimeIntereptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //System.out.println("拦截器 TimeIntereptor preHandle..");
        //System.out.println("拦截器: 要访问的类名 -> " + ((HandlerMethod)handler).getBean().getClass().getName());
        //System.out.println("拦截器: 要访问的方法名 -> " + ((HandlerMethod)handler).getMethod().getName());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //System.out.println("拦截器 TimeIntereptor postHandle..");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        //System.out.println("拦截器 TimeIntereptor afterCompletion...");
    }
}
