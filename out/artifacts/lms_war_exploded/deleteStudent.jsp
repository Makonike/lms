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
    <title>删除学生</title>
</head>
<body>
<br/>
<br/>
<h1 align="center">删除学生</h1>
<br/>
<br/>
<br/>

<form action="${pageContext.request.contextPath}/studentServlet?method=delete" method="post" name="delete">
    <table align="center" height="50">
        <tr>
            <td><label>学号：<input type="text" name="id" placeholder="请输入学生的学号"></label></td>
            <td><input type="submit" value="提交" onclick=""></td>
        </tr>
    </table>

</form>
<p align="center">
    <a href="./student.jsp"><button>返回</button></a>
</p>


</body>
</html>
