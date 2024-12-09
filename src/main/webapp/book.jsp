<%--
  Created by IntelliJ IDEA.
  User: lizis
  Date: 2024/12/5
  Time: 下午2:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍</title>
</head>
<body>
    <jsp:include page="topNav.jsp"/>
    <h1>这是书籍页</h1>
    <h2>书籍id：${book.id}</h2>
    <h2>书名：${book.title}</h2>
    <h2>作者：${book.author}</h2>
    <h2>页数：${book.pages}</h2>
    <h2>书籍描述：${book.description}</h2>
</body>
</html>
