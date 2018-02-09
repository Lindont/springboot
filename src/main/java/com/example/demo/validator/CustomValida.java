package com.example.demo.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-02-09
 */

/**
 * 自定义注解
 * 自定义校验
 * @Target: 指定可以注解在哪些位置, 下面是在方法, 字段上生效
 */

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CustomConstraintValidator.class)
public @interface CustomValida {

    String message() default "{javax.validation.constraints.Min.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
