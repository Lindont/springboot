package com.example.demo.config.beanmanager;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-02-08
 */
@Component
@Slf4j
public class MyBeanPostProcessor implements BeanPostProcessor {

    /**
     * 每个Bean初始化前都调用
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //log.info("Start init Bean : " + bean.getClass());
        return bean;
    }

    /**
     * 每个Bean初始化后都调用
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //log.info("End init Bean : " + bean.getClass());
        return bean;
    }
}
