package com.example.demo.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Author : HuangHaoXin
 * @Description : 自定义校验实现类
 * @Date : Create in 2018-02-09
 */
public class CustomConstraintValidator implements ConstraintValidator<CustomValida, Object> {

    //@Autowired 在此类中也可以使用Autowired调用其它Bean


    @Override
    public void initialize(CustomValida constraintAnnotation) {
        //初始化校验器
        System.out.println("CustomValida init...");
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        //校验逻辑
        return false;
    }
}
