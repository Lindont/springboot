package com.example.demo.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-01-22
 */
@Component
@Data
@ConfigurationProperties(prefix = "myvalue")
public class MyValueProperties {
    private int valone;
    private String valtwo;
}
