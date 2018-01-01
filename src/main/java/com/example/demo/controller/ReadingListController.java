package com.example.demo.controller;

import com.example.demo.bean.Book;
import com.example.demo.repository.ReadingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author : HuangHaoXin
 * @Description :
 * @Date : Create in 2018-01-01
 */
@Controller
@RequestMapping("/")
public class ReadingListController {
    @Autowired
    ReadingListRepository readingListRepository;

    @RequestMapping(value = "/{reader}", method = RequestMethod.GET)
    public String readersBooks(@PathVariable("reader") String reader,Model model) {
        List<Book> readingList = readingListRepository.findByReader(reader);
        if (readingList != null) {
            model.addAttribute("books", readingList);
        }
        return "readingList";
    }



    @RequestMapping(value = "/{reader}", method = RequestMethod.POST)
    public String addToReadingList(@PathVariable("reader") String reader, Book book) {
        book.setReader(reader);
        readingListRepository.save(book);
        return "redirect:/{reader}";
    }
}
