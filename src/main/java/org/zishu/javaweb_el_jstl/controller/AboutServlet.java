package org.zishu.javaweb_el_jstl.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.zishu.javaweb_el_jstl.model.About;

import java.io.IOException;

@WebServlet("/about") //将这个servlet映射到"/about"路径
public class AboutServlet extends HttpServlet {
    /**
     * 处理GET请求
     * @param req 请求对象
     * @param resp 响应对象
     * @throws ServletException 异常
     * @throws IOException 异常
     */
    @Override //重写doGet方法
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //模拟从数据库中获取数据
        About about = new About();
        about.setId(1);
        about.setPh("12345678901");
        about.setEmail("about@gmail.com");
        about.setTeam("1,2,3,4");
        about.setName("zishu");

        req.getSession().setAttribute("about", about); //将about对象存储到session作用域中，以便在about.jsp页面中使用
        req.getRequestDispatcher("about.jsp").forward(req, resp); //转发到about.jsp页面
    }
}
