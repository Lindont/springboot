package com.example.demo.config;

import lombok.Data;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-01-23
 */
@Data
public class ConfigBean {
    private int id;
    private String name;
    private int age;

    /**
     * Bean初始化时执行的方法
     */
    public void init() {
        System.out.println("ConfigBean init......");
    }

    /**
     * Bean销毁时执行的方法
     */
    public void destroy() {
        System.out.println("ConfigBean destroy......");
    }
}
