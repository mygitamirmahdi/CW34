package ir.maktabsharif.service;

import ir.maktabsharif.model.Book;
import ir.maktabsharif.repository.RepositoryImpl;

import java.util.List;

public class BookServiceImpl {
    private final RepositoryImpl repository;

    public BookServiceImpl(RepositoryImpl repository) {
        this.repository = repository;
    }
    public List<Book> findAll(){
        return repository.findAll();
    }
    public void addBook(Book book){
        repository.addBook(book);
    }
}
