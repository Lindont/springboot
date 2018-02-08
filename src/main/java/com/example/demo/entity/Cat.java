package com.example.demo.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-02-06
 */
public class Cat {

    /**
     * @PostConstruct: 指定该方法为Bean初始化执行的方法
     */
    @PostConstruct
    public void init() {
        System.out.println("Cat init......");
    }

    /**
     * @PreDestroy: 指定该方法为Bean销毁时执行的方法
     */
    @PreDestroy
    public void destroy() {
        System.out.println("Cat destroy......");
    }

}
