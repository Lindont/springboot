package com.example.demo.controller;

import com.example.demo.bean.Girl;
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
public class GirlController {

    @PostMapping("/savegirl")
    public String saveGirlInfo(@Valid Girl girl, BindingResult result) {
        if (result.hasErrors()) {
            System.out.println(result.getFieldError().getDefaultMessage());
        }

        System.out.println(girl);
        return "index";
    }
}
