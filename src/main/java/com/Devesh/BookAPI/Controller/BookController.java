package com.Devesh.BookAPI.Controller;

import com.Devesh.BookAPI.Model.Book;
import com.Devesh.BookAPI.Model.Person;
import com.Devesh.BookAPI.Service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@ComponentScan("com.Devesh.BookAPI.Service")
public class BookController {

    @Autowired
    IBookService bookService;

    @RequestMapping (value= "/insertBook",method= RequestMethod.POST)
    public void insertBook(@RequestBody Book book){
         bookService.insertBook(book);
    }


    @RequestMapping(value="/getPerson",method=RequestMethod.GET)
    public List<Person> getPerson() {
       return  bookService.getPerson();
    }

    @RequestMapping(value="/getBook",method=RequestMethod.GET)
    public List<Book> getBook(){
        return bookService.getBook();
    }
    @RequestMapping(value="/getAllPerson",method=RequestMethod.GET)
        public List<Person> getAllPerson() {
            return  bookService.getAllPerson();
        }
    @RequestMapping(value="/findBookByCost", method = RequestMethod.GET)
    public List<Book> getBookByCost(@RequestParam int cost){
        return (List<Book>)bookService.findBookByCosts(cost);
    }


}
