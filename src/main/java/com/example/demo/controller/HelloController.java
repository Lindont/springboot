package com.example.demo.controller;

import com.example.demo.properties.MyValueProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-01-01
 */
@RestController
public class HelloController {

    @Autowired
    MyValueProperties myValueProperties;

    @RequestMapping("/")
    public String showPage() {
        return "Hello SpringBoot 黄浩新很帅哈哈哈123";
    }

    @RequestMapping("/hello")
    public String show() {
        System.out.println("value1: " + myValueProperties.getValone());
        System.out.println("value2: " + myValueProperties.getValtwo());
        return "Hello";
    }
}