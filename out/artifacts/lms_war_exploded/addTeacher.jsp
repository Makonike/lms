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
    <title>添加操作</title>

    <script type="text/javascript">
        //把表单的action改为teacher.jsp
        function jumpBack() {
            document.add.action = "teacher.jsp";
            document.add.submit();
        }
    </script>

</head>
<body>
<br/>
<h1 align="center">添加教职工</h1>
<br/>
<form action="${pageContext.request.contextPath}/teacherServlet?method=add" method="post" name="add">
    <table align="center" height="350">
        <tr>
            <td>教职工号：</td>
            <td><label><input type="text" name="id" placeholder="请输入教职工号"></label></td>
        </tr>
        <tr>
            <td>姓名：</td>
            <td><label><input type="text" name="name" placeholder="请输入姓名"></label></td>
        </tr>

        <tr>
            <td>性别：</td>
            <td>
                <label><input type="radio" name="sex" value="男"/>男</label>
                <label><input type="radio" name="sex" value="女"/>女</label>
            </td>
        </tr>

        <tr>
            <td>出生日期：</td>
            <td><label><input type="date" name="bornDate"></label></td>
        </tr>

        <tr>
            <td>所在系号：</td>
            <td><label><input type="text" name="depNo" placeholder="请输入所在系号"></label></td>
        </tr>

        <tr>
            <td>职称：</td>
            <td><label><input type="text" name="jobTitle" placeholder="请输入职称"></label></td>
        </tr>

        <tr>
            <td>专业及教学方向：</td>
            <td><label><input type="text" name="major" placeholder="请输入专业及教学方向"></label></td>
        </tr>

        <tr>
            <label>
                <td>
                    &nbsp;<input type="submit" value="提交">
                </td>
                <td>
                    <input type="reset" value="重置">
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <input type="button" value="返回" onclick="jumpBack()"/>
                </td>
            </label>
        </tr>
    </table>

</form>
</body>
</html>
