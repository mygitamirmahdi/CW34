package ir.maktabsharif.controller;

import ir.maktabsharif.model.Book;
import ir.maktabsharif.service.BookServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public class BookListController implements org.springframework.web.servlet.mvc.Controller {
   private final BookServiceImpl bookService;

    public BookListController(BookServiceImpl bookService) {
        this.bookService = bookService;
    }

    @Override
    public @Nullable ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Book> all = bookService.findAll();
        ModelAndView modelAndView = new ModelAndView("show");
        modelAndView.addObject("books" , all);
        return modelAndView;
    }
}
