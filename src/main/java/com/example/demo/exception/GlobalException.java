package com.example.demo.exception;

import com.example.demo.common.result.ResultEnum;

/**
 * @Author : HuangHaoXin
 * @Description : 自定义异常处理
 * @Date : Create in 2018-01-23
 */
public class GlobalException extends RuntimeException {
    private Integer code;

    public GlobalException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
