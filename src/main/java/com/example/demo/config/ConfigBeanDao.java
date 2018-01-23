package com.example.demo.config;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-01-23
 */
public class ConfigBeanDao {
    public ConfigBean getConfigBean() {
        ConfigBean configBean = new ConfigBean();
        configBean.setId(1);
        configBean.setName("data");
        configBean.setAge(18);
        return configBean;
    }
}
