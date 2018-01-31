package com.example.demo.mapper.test;

import com.example.demo.bean.Book;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-01-31
 */
@Component
public interface TestXmlMapper {

    @Select("select * from book")
    List<Book> getListBook();
}
