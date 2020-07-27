package com.Devesh.BookAPI.Service;

import com.Devesh.BookAPI.Model.Book;
import com.Devesh.BookAPI.Model.Person;

import java.util.List;

public interface IBookService {

     void insertBook(Book book);

     List<Person> getPerson();


     List<Book> getBook();

     List<Person> getAllPerson();

}
