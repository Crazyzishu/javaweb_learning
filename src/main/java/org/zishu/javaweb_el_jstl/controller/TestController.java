package org.zishu.javaweb_el_jstl.controller;

import com.alibaba.fastjson.JSON;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.zishu.javaweb_el_jstl.model.AxiosData;
import org.zishu.javaweb_el_jstl.model.Book;
import org.zishu.javaweb_el_jstl.service.impl.BookServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/test")
public class TestController extends HttpServlet {
    private BookServiceImpl bookService = new BookServiceImpl(); // 成员变量
    @Override
    // 重写doGet方法, 处理GET请求, 处理请求并返回响应，从数据库中查询book中的数据
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=utf-8"); //设置返回的值
        Book book = bookService.getbooks();
        AxiosData data = new AxiosData("查询成功",200,book);
        String jsonString = JSON.toJSONString(data); // 将对象转换为JSON字符串
        PrintWriter writer = resp.getWriter(); // 获取PrintWriter对象
        writer.print(jsonString); // 将JSON字符串写入响应中
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }
}
