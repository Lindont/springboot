package com.example.demo.controller;

import com.example.demo.entity.Girl;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-01-22
 */
@Controller
public class ValidController {

    /**
     * @Valid: 开启校验, 对传入的参数进行校验
     * BindingResult result: 校验后返回结果
     */
    @PostMapping("/savegirl")
    public String saveGirlInfo(@Valid Girl girl, BindingResult result) {
        if (result.hasErrors()) {
            result.getAllErrors().stream().forEach(error -> System.out.println(error.getDefaultMessage()));
        }

        System.out.println(girl);
        return "index";
    }
}
