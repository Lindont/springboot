package com.example.demo.controller;

import com.example.demo.common.result.ResultEnum;
import com.example.demo.exception.GlobalException;
import com.example.demo.properties.MyValueProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : HuangHaoXin
 * @Description : 获取配置文件的值的几种方式
 * @Date : Create in 2018-01-01
 */
@RestController
public class HelloController {

    @Autowired
    MyValueProperties myValueProperties;

    @Autowired
    private Environment env;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${myvalue.valtwo}")
    private String myvalue;

    @RequestMapping("/hello")
    public String show() throws Exception {
        System.out.println("value1: " + myValueProperties.getValone());
        System.out.println("value2: " + myValueProperties.getValtwo());
        System.out.println(username);
        System.out.println(myvalue);
        System.out.println(env.getProperty("spring.datasource.url"));
        if (myValueProperties.getValone() != 101) {
            throw new GlobalException(ResultEnum.UNKNOW_ERROR);
            //throw new Exception("出错啦");
        }
        return "Hello SpringBoot";
    }
}