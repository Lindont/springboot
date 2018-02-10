package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Date;

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

    /*
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
    */

    @Around("doLog()")
    private Object aroundDoLog(ProceedingJoinPoint pjp) throws Throwable {
        logger.info("开始执行方法: " + pjp.toString());

        long start = new Date().getTime();
        Object[] args = pjp.getArgs();
        Arrays.stream(args).forEach( data -> {
            logger.info("data -> " + data.toString());
        });

        //开始调用request请求的方法, 并拿到返回值
        Object value = pjp.proceed();
        //调用结束
        logger.info("执行方法结束返回: " + value);
        logger.info("Aspect: 执行方法耗时 -> " + (new Date().getTime() - start) + "毫秒");
        return value;
    }
}
