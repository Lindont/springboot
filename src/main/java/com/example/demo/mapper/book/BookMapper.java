package com.example.demo.mapper.book;

import com.example.demo.entity.Book;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;


/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-01-24
 */
@Component
public interface BookMapper {
    @Select("select * from book where id = #{id}")
    Book selectBook(int id);
}
