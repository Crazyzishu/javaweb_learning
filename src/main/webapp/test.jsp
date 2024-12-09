<%--
  Created by IntelliJ IDEA.
  User: lizis
  Date: 2024/12/5
  Time: 下午5:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 id="title"></h1>
<h1 id="description"></h1>
<script src="https://cdn.bootcdn.net/ajax/libs/axios/1.7.2/axios.js"></script>
<script>
    axios.get("http://localhost:8888/test")
       .then(res=>{
            console.log(res); // 打印响应数据
           let title = document.getElementById("title"); // 获取标题元素
           title.textContent=res.data.data.title;

           let description = document.getElementById("description"); // 获取标题元素
           description.textContent=res.data.data.description;
        })
</script>
</body>
</html>
