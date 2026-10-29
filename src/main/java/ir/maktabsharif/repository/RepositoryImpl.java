package ir.maktabsharif.repository;

import ir.maktabsharif.model.Book;

import java.util.List;

public class RepositoryImpl {
    private final InMemoryDB inMemoryDB ;

    public RepositoryImpl(InMemoryDB inMemoryDB) {
        this.inMemoryDB = inMemoryDB;
    }

    public List<Book> findAll(){
        return inMemoryDB.getBooks();
    }

    public void addBook(Book book){
        inMemoryDB.add(book);
    }

}
