package com.example.demo.bean;

import lombok.Data;

import javax.validation.constraints.Min;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-01-22
 */
@Data
public class Girl {
    private int id;
    private String name;

    @Min(value = 18, message = "未成年女生禁止注册")
    private int age;
    private String address;
}
