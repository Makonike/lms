<%--
  Created by IntelliJ IDEA.
  User: Makonike
  Date: 2021/3/11
  Time: 23:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除操作</title>
</head>
<body>
<br/>
<br/>
<h1 align="center">删除教职工信息</h1>
<br/>
<br/>
<br/>

<form action="${pageContext.request.contextPath}/teacherServlet?method=delete" method="post" name="delete">
    <table align="center" height="50">
        <tr>
            <td><label>教职工号：<input type="text" name="id" placeholder="请输入教职工号"></label></td>
            <td><input type="submit" value="提交" onclick=""></td>
        </tr>
    </table>

</form>
<p align="center">
    <a href="./teacher.jsp"><button>返回</button></a>
</p>


</body>
</html>
