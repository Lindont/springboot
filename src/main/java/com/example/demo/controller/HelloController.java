package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-01-01
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String showPage() {
        return "Hello SpringBoot 黄浩新很帅哈哈哈123";
    }

    @RequestMapping("/hello")
    public String show(){
        return "Hello";
    }
}