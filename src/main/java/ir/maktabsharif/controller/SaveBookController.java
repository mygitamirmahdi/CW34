package ir.maktabsharif.controller;


import ir.maktabsharif.model.Book;
import ir.maktabsharif.service.BookServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class SaveBookController implements Controller {
    private BookServiceImpl bookService;
    public SaveBookController(BookServiceImpl bookService){
        this.bookService = bookService;
    }
    @Override
    public @Nullable ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String title = request.getParameter("name");
        String author = request.getParameter("author");
        Double price = Double.valueOf(request.getParameter("price"));

        Book book = new Book(title,author,price);

        bookService.addBook(book);
        return null;

    }
}
