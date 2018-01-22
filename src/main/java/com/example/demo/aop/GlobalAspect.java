package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-01-22
 */
@Aspect
@Component
public class GlobalAspect {
    private static final Logger logger = LoggerFactory.getLogger(GlobalAspect.class);

    @Pointcut("execution(* com.example.demo.controller.*.*(..))")
    public void doLog() {

    }

    @Before("doLog()")
    public void beforeDoLog(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        logger.info("url = " + request.getRequestURL());
        logger.info("method = " + request.getMethod());
        logger.info("ip = " + request.getRemoteAddr());
        logger.info("class_method = " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.info("args = " + joinPoint.getArgs());
        logger.info("开始执行方法");
    }

    @After("doLog()")
    public void afterDoLog() {
        logger.info("执行方法完成");
    }


    @AfterReturning(pointcut = "doLog()", returning = "object")
    public void afterReturnDoLog(JoinPoint joinPoint, Object object) {
        logger.info("返回数据: " + object);
    }
}
