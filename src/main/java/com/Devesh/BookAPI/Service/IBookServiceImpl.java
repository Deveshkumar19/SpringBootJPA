package com.Devesh.BookAPI.Service;

import com.Devesh.BookAPI.Model.Book;
import com.Devesh.BookAPI.Model.Person;
import com.Devesh.BookAPI.Repository.BookRepository;
import com.Devesh.BookAPI.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IBookServiceImpl implements IBookService{

        @Autowired
        BookRepository bookRepository;

        @Autowired
        PersonRepository personRepository;

        @Override
        public void insertBook(Book book){

              bookRepository.save(book);
        }

        @Override
        public List<Person> getPerson() {
                return personRepository.getPerson();
        }

        @Override
        public List<Book> getBook() {
                return (List<Book>) bookRepository.findAll();
        }

        @Override
        public List<Person> getAllPerson() {
                return (List<Person>) personRepository.findAll();
        }

        @Override
        public List<Book>  findBookByCosts(int cost) {
                return (List<Book>) bookRepository.findBookByCosts(cost);
        }


}
