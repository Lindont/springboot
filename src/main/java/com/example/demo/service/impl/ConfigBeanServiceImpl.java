package com.example.demo.service.impl;

import com.example.demo.config.ConfigBean;
import com.example.demo.config.ConfigBeanDao;
import com.example.demo.service.ConfigBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-01-23
 */
@Service
public class ConfigBeanServiceImpl implements ConfigBeanService {

    @Autowired
    ConfigBeanDao configBeanDao;

    @Override
    public ConfigBean getConfigBean() {
        return configBeanDao.getConfigBean();
    }
}
