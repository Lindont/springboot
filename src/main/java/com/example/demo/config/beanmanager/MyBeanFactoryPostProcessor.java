package com.example.demo.config.beanmanager;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-02-08
 */
@Component
@Slf4j
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        log.info("======================================================");
        log.info("Beans Count: " + beanFactory.getBeanDefinitionCount());
        String[] strs = beanFactory.getBeanDefinitionNames();
        for (String s : strs) {
            log.info(s);
        }
        log.info("======================================================");
    }
}
