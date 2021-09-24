package com.Sb.test.repo;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.Sb.test.Model.Book;



public interface BookRepositery extends MongoRepository<Book, Integer>{

}