package com.example.demo.mapper;

import com.example.demo.bean.Book;
import org.apache.ibatis.annotations.Select;


/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-01-24
 */

public interface BookMapper {
    @Select("select * from book where id = #{id}")
    Book selectBook(int id);
}
