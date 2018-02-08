package com.example.demo.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-02-06
 */
public class AppTest {

    @Test
    public void test1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example.demo");
        System.out.println(context.getBean("configBean"));
        System.out.println(context.getBean("cat"));
        context.close();
    }

}
