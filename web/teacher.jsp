<%--
  Created by IntelliJ IDEA.
  User: Makonike
  Date: 2021/3/10
  Time: 22:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>教职工</title>
</head>
<body>
<br/>
<h1 align="center"> 欢迎来到教职工界面 </h1>
<form action="./teacherServlet?method=seek" method="post">
    <p align="center">
        查询：<input type="text" name="id" align="right">
        <input type="submit">
    </p>
</form>

<table align="center">
    <tr>
        <td>
            <iframe src="./teacherServlet?method=findAll" align="middle" width="550" height="250" frameborder="0"></iframe>
        </td>
    </tr>
</table>

<table align="center" height="100">

    <tr>
        <td align="center">>>  <a href="./addTeacher.jsp"> 增加 </a>  <<</td>
        <td align="center">>>  <a href="./deleteTeacher.jsp"> 删除 </a>  <<</td>
        <td align="center">>>  <a href="./updateTeacher.jsp"> 修改 </a>  <<</td>
    </tr>
    <tr>
        <td></td>
        <td align="center">>>  <a href="./index.jsp"> 返回 </a>  <<</td>
        <td></td>
    </tr>

</table>




</body>
</html>
