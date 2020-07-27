package com.Devesh.BookAPI.Repository;

import com.Devesh.BookAPI.Model.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book,Integer> {

    // JPQL -> Java persistence query language
    //@Query("select b from Book b where b.cost=:cost")
    @Query(value = "select * from Book b where b.Cost=:price", nativeQuery = true)
    public List<Book> findBookByCosts(int price);

    // SQL
    @Query(value = "select * from Book b where b.cost=:price", nativeQuery = true)
    public List<Book> findByPrice(int price);

//    @Query("select b from Book b where b.authorName=:name")
//    public List<Book> getAuthorBooksJPQL(String name);

    @Query(value = "select * from Book b where b.authorName=:name", nativeQuery = true)
    public List<Book> getAuthorBooksSQL(String name);
}
