package com.example.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-01-23
 */

/**
 * @Configuration 通过该注解来表明该类是一个Spring的配置，相当于一个xml文件
 * @ComponentScan 扫描包
 * @Bean 通过该注解来表明是一个Bean对象，相当于xml中的<bean>
 * @PropertySource 加载配置文件
 */
@Configuration
@ComponentScan(basePackages = "com.example.demo")
@PropertySource(value = {"classpath:jdbc.properties", "classpath:redis.properties"}, ignoreResourceNotFound = true, encoding = "UTF-8")
public class SpringConfig {
    @Bean
    public ConfigBeanDao getConfigBeanDao() {
        return new ConfigBeanDao();
    }
}
