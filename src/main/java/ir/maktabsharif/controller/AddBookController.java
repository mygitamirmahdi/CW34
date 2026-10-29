package ir.maktabsharif.controller;

import ir.maktabsharif.service.BookServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class AddBookController implements Controller {
    private final BookServiceImpl bookService;

    public AddBookController(BookServiceImpl bookService) {
        this.bookService = bookService;
    }

    @Override
    public @Nullable ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HttpServletRequest req = (HttpServletRequest) request;

        if (req.getMethod().equals("GET")){
          return new ModelAndView("add");
        }
        return null;

    }
}
