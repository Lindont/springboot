package com.example.demo.controller;

import com.example.demo.config.ConfigBean;
import com.example.demo.service.ConfigBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-01-23
 */
@Controller
public class ConfigBeanController {
    @Autowired
    ConfigBeanService configBeanService;

    @RequestMapping("/cbean")
    public String getConfigBean() {
        ConfigBean configBean = configBeanService.getConfigBean();
        System.out.println(configBean);
        return "index";
    }
}
