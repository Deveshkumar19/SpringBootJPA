package com.Devesh.BookAPI.Service;

import com.Devesh.BookAPI.Model.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
    // SQL
    @Query(value = "select * from Person ", nativeQuery = true)
    public List<Person> getPerson();
 }

