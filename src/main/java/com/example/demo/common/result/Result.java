package com.example.demo.common.result;

import lombok.Data;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-01-23
 */
@Data
public class Result<T> {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 消息
     */
    private String msg;
    /**
     * 数据
     */
    private T data;
}
