package com.example.demo.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-01-01
 */
@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reader;
    private String isbn;
    private String title;
    private String author;
    private String description;
}
