package com.example.demo.exception;

import com.example.demo.common.result.Result;
import com.example.demo.common.result.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author : HuangHaoXin
 * @Description : 自定义全局异常处理器
 * @Date : Create in 2018-01-23
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof GlobalException) {
            GlobalException globalException = (GlobalException) e;
            return ResultUtil.resultMsg(globalException.getCode(), globalException.getMessage(), null);
        } else {
            logger.error("【系统异常】" + e);
            return ResultUtil.error(e.getMessage());
        }
    }
}
