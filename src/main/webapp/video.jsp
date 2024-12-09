<%--
  Created by IntelliJ IDEA.
  User: lizis
  Date: 2024/11/30
  Time: 下午2:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>video</title>
</head>
<body>
<jsp:include page="topNav.jsp"/>
<h1>这个是视频页</h1>
<%--<h2>${video}</h2>--%>
<h2>视频id：${video.id}</h2>
<h2>视频时间：${video.time}</h2>
<h2>视频描述：${video.description}</h2>
<h2>视频标题：${video.title}</h2>
<h2>视频作者：${video.author}</h2>
<h2>视频播放地址：${video.src}</h2>
</body>
</html>
