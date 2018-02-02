package com.example.demo.service.impl;

import com.example.demo.entity.Book;
import com.example.demo.mapper.book.BookMapper;
import com.example.demo.mapper.test.TestXmlMapper;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-01-24
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;

    @Autowired
    TestXmlMapper testXmlMapper;

    @Override
    public Book selectBook(int id) {
        return bookMapper.selectBook(id);
    }

    @Override
    public List<Book> selectAllBooks() {
        return testXmlMapper.getListBook();
    }

}
