package com.makonike.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 请求与分发处理的超类
 * 用方法名通过反射调用方法
 * @author Makonike
 * @date 2021-02-25 10:27
 **/
public abstract class BaseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=utf-8");
        req.setCharacterEncoding("UTF-8");
        //获取参数method
        //识别客户端想要请求的方法
        String methodName = req.getParameter("method");

        if(methodName == null || methodName.trim().isEmpty()){
            throw new RuntimeException("获取的参数为空！");
        }
        Method method = null;
        try {
            // this指继承自BaseServlet的、与所请求的url相匹配的Servlet
            method = this.getClass().getDeclaredMethod(methodName,HttpServletRequest.class,HttpServletResponse.class);
            //调用method方法
            method.invoke(this,req,resp);
        } catch (Exception e) {
            e.printStackTrace();
//            throw new RuntimeException("你要调用的方法" + methodName +"不存在");
            PrintWriter out=resp.getWriter();
            out.print("<script>alert('请求失败！');history.go(-1);</script>");
        }
    }
}
