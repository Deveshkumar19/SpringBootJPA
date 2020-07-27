package com.Devesh.BookAPI.Service;

import com.Devesh.BookAPI.Model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book,Integer> {


}
