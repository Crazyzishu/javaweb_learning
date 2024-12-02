package org.zishu.javaweb_el_jstl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.zishu.javaweb_el_jstl.model.Video;

import java.io.IOException;

/**
 * 视频servlet，用于处理视频相关的请求
 */

@WebServlet("/video") //将这个servlet映射到"/video"路径
public class VideoServlet extends HttpServlet {
    /**
     * 去数据库查询相关信息
     * @param req 请求
     * @param resp 转发
     * @throws ServletException servlet异常
     * @throws IOException io异常
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //模拟从数据库中获取信息
        Video video = new Video();
        video.setId(1);
        video.setDescription("这是javaweb的视频描述");
        video.setTime("100");
        video.setTitle("video 1");
        video.setAuthor("zishu");
        video.setSrc("视频播放地址");

        req.getSession().setAttribute("video", video); //将video对象存储到session中，以便在video.jsp页面中使用
        req.getRequestDispatcher("video.jsp").forward(req, resp); //转发到video.jsp页面
    }
}
