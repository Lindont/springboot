package com.example.demo.entity;

import lombok.Data;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-01-01
 */

@Data
public class Book {
    private Long id;
    private String reader;
    private String isbn;
    private String title;
    private String author;
    private String description;
}
