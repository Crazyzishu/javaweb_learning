package org.zishu.javaweb_el_jstl.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.zishu.javaweb_el_jstl.model.Article;
import org.zishu.javaweb_el_jstl.model.Book;

import java.io.IOException;

/**
 * 主页servlet用于处理主页相关的请求
 */

/**
 * 这是一个注解，用于将一个类声明为一个Servlet，
 * 并将其映射到特定的URL路径。在这里，
 * "/home"表示当用户访问服务器的/home路径时，
 * 这个Servlet会被调用。
 */
@WebServlet("/home") // 声明为一个Servlet，并将其映射到"/home"路径
public class HomeServlet extends HttpServlet {
    /**
     * 处理GET请求
     * @param req 请求对象
     * @param resp 响应对象
     * @throws ServletException 异常
     * @throws IOException 异常
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //查询数据库（首先模拟链接数据库）
        Article article = new Article();
        article.setId(1);
        article.setTitle("article 1");
        article.setAuthor("author 1");
        article.setContent("content 1");
        article.setTime("2024-05-01");
        //第一种request
        req.setAttribute("article", article); //将article对象存储到req对象中，以便在home.jsp页面中使用
        //第二种session
        //req.getSession().setAttribute("article2", article); //将article对象存储到req对象中，以便在home.jsp页面中使用
        req.getRequestDispatcher("/home.jsp").forward(req, resp); //转发到home.jsp页面

        //模拟查询图书信息
        Book book=new Book();
        book.setTitle("java");
        book.setAuthor("java1"); //设置图书作者
        book.setPrice("100"); //设置图书价格
        book.setPages("200"); //设置图书页数
        book.setPicture("图片地址"); //设置图书图片地址

        req.getSession().setAttribute("book", book); //将book对象存储到req对象中，以便在home.jsp页面中使用
        req.getRequestDispatcher("home.jsp").forward(req, resp); //转发到home.jsp页面
    }
}

