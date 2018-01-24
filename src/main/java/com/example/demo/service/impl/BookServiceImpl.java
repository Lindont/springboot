package com.example.demo.service.impl;

import com.example.demo.bean.Book;
import com.example.demo.mapper.BookMapper;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-01-24
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;

    @Override
    public Book selectBook(int id) {
        return bookMapper.selectBook(id);
    }
}
