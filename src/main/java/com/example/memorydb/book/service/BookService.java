package com.example.memorydb.book.service;

import com.example.memorydb.book.entity.BookEntity;
import com.example.memorydb.book.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {


    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    //create ,update
    public BookEntity create(BookEntity bookEntity){
        return bookRepository.save(bookEntity);
    }

    //all
    public List<BookEntity> findAll(){
        return bookRepository.findAll();
    }

    //delete
    public void delete(Long id){
        bookRepository.delete(id);
    }

    //findOne
    public Optional<BookEntity> findOne(Long id){

        return bookRepository.findById(id);

    }

}
