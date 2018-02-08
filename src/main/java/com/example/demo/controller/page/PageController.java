package com.example.demo.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-01-22
 */
@Controller
public class PageController {
    @RequestMapping("/")
    public String showIndex(HttpServletRequest request, Model model) {
        model.addAttribute("ip",request.getRemoteAddr());
        return "index";
    }
}
