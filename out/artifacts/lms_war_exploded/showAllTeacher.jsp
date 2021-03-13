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
    <title>显示所有学生</title>
</head>
<body>
        <table align="center" height="50" width="500" border="1">
                <tr align="center">
                    <td><font color="red">学号</font></td>
                    <td><font color="red">姓名</font></td>
                    <td><font color="red">性别</font></td>
                    <td><font color="red">出生日期</font></td>
                    <td><font color="red">所在系号</font></td>
                    <td><font color="red">职称</font></td>
                    <td><font color="red">专业及教学方向</font></td>
                </tr>
        <%-- 遍历输出获取到的学生List集合 --%>
        <c:forEach items="${ allTeacher }" var="i">
        <tr align="center">
        <td>${ i.id }</td>
        <td>${ i.name }</td>
        <td>${ i.sex }</td>
        <td>
            <%-- 将bornDate转换为YY-HH-DD的形式输出 --%>
        <fmt:formatDate value="${i.bornDate}" type="date" dateStyle="medium"/>
        </td>
        <td>${ i.depNo }</td>
        <td>${ i.jobTitle }</td>
        <td>${ i.major }</td>
        </tr>
            </c:forEach>
    </table>
</body>
</html>
