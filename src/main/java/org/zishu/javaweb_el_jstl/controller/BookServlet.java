package org.zishu.javaweb_el_jstl.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.zishu.javaweb_el_jstl.model.Book;
import org.zishu.javaweb_el_jstl.service.BookService;
import org.zishu.javaweb_el_jstl.service.impl.BookServiceImpl;

import java.io.IOException;

@WebServlet("/book")
public class BookServlet extends HttpServlet {
    private BookServiceImpl bookService = new BookServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Book book = bookService.getbooks();

        req.setAttribute("book", book);
        req.getRequestDispatcher("book.jsp").forward(req, resp);
    }
}
