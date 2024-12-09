<%--
  Created by IntelliJ IDEA.
  User: lizis
  Date: 2024/11/30
  Time: 下午2:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<jsp:include page="topNav.jsp"/> <!-- 引入导航栏jsp文件 -->
<h1>当前是主页</h1>
<h1>这是从数据库里获取的数据吗，传递给了前台</h1>
<h2>标题：${article.title}</h2>
<%--<jsp:include page="bottomNav.jsp"/> <!-- 引入底部导航栏jsp文件 -->--%>
</body>
</html>
