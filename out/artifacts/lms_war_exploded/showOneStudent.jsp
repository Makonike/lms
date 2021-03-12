<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Makonike
  Date: 2021/3/11
  Time: 12:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>显示查询到的学生</title>
</head>
<body>
<br/>
<br/>
<br/>
<br/>
<br/>
    <table align="center" height="100" width="450" border="1">

        <tr align="center">
            <td><font color="red">学号</font></td>
            <td><font color="red">姓名</font></td>
            <td><font color="red">性别</font></td>
            <td><font color="red">出生日期</font></td>
            <td><font color="red">入学成绩</font></td>
            <td><font color="red">所在系号</font></td>
        </tr>
        <%-- 遍历输出获取到的学生List集合 --%>
        <tr align="center">
        <td>${ oneStudent.id }</td>
        <td>${ oneStudent.name }</td>
        <td>${ oneStudent.sex }</td>
        <td>
            <%-- 将bornDate转换为YY-HH-DD的形式输出 --%>
        <fmt:formatDate value="${oneStudent.bornDate}" type="date" dateStyle="medium"/>
        </td>
        <td>${ oneStudent.scores }</td>
        <td>${ oneStudent.depNo }</td>
        </tr>
    </table>
<br/>
<br/>
<center>
    <a href="./student.jsp"><button>返回</button></a>
</center>

</body>
</html>
