<%--
  Created by IntelliJ IDEA.
  User: Makonike
  Date: 2021/3/9
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改操作</title>

    <script type="text/javascript">
        //把表单的action改为student.jsp
        function jumpBack() {
            document.update.action = "student.jsp";
            document.update.submit();
        }
    </script>

</head>
<body>
<br/>
<h1 align="center">修改学生信息</h1>
<br/>
<form action="${pageContext.request.contextPath}/studentServlet?method=update" method="post" name="update">
    <table align="center" height="350">
        <tr>
            <td>学号：</td>
            <td><label><input type="text" name="id" placeholder="请输入学生的学号"></label></td>
        </tr>
        <tr>
            <td>姓名：</td>
            <td><label><input type="text" name="name" placeholder="请输入学生的姓名"></label></td>
        </tr>

        <tr>
            <td>性别：</td>
            <td>
                <label><input type="radio" name="sex" value="男"/>男</label>
                <label><input type="radio" name="sex" value="女"/>女</label>
            </td>
        </tr>

        <tr>
            <td>入学成绩：</td>
            <td><label><input type="text" name="scores" placeholder="请输入学生的入学成绩"></label></td>
        </tr>

        <tr>
            <td>出生日期：</td>
            <td><label><input type="date" name="bornDate"></label></td>
        </tr>

        <tr>
            <td>所在系号：</td>
            <td><label><input type="text" name="depNo" placeholder="请输入学生所在系号"></label></td>
        </tr>
        <tr>
            <label>
                <td>
                    &nbsp;<input type="submit" value="提交">
                </td>
                <td>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置">
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <input type="button" value="返回" onclick="jumpBack()"/>
                </td>
            </label>
        </tr>
    </table>

</form>
</body>
</html>
