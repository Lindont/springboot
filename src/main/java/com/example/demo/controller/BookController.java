package com.example.demo.controller;

import com.example.demo.common.result.Result;
import com.example.demo.common.result.ResultEnum;
import com.example.demo.common.result.ResultUtil;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-01-24
 */
@Controller
public class BookController {
    @Autowired
    BookService bookService;

    @RequestMapping("/getbook/{id}")
    @ResponseBody
    public Result getBookInfoByid(@PathVariable int id) {
        return ResultUtil.resultEnumMsg(ResultEnum.SUCCESS,bookService.selectBook(id));
    }
}
