package com.example.demo.service;

import com.example.demo.entity.Book;

import java.util.List;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-01-24
 */
public interface BookService {
    Book selectBook(int id);
    List<Book> selectAllBooks();
}
