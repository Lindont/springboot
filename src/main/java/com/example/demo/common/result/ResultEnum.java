package com.example.demo.common.result;

/**
 * @Author : HuangHaoXin
 * @Description : 全局状态码定义
 * @Date : Create in 2018-01-23
 */
public enum ResultEnum {
    UNKNOW_ERROR(-1, "error"),
    FAILED(0, "failed"),
    SUCCESS(1, "success");


    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
