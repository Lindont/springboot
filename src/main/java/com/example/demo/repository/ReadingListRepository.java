package com.example.demo.repository;

import com.example.demo.bean.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-01-01
 */
public interface ReadingListRepository extends JpaRepository<Book,Long> {
    List<Book> findByReader(String reader);
}
