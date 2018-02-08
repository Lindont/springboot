package com.example.demo.config;

import com.example.demo.entity.Cat;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-02-06
 */

@Configuration
public class MyConfig {

    /**
     * initMethod: 指定Bean 初始化时执行的方法
     * destroyMethod: 指定Bean 销毁时执行的方法
     *
     * @return
     */
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public ConfigBean configBean() {
        ConfigBean configBean = new ConfigBean();
        configBean.setId(1);
        configBean.setName("Lindont");
        configBean.setAge(18);
        return configBean;
    }


    @Bean
    public Cat cat() {
        return new Cat();
    }
}
