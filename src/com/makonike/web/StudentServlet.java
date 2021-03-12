package com.makonike.web;

import com.alibaba.druid.util.DruidWebUtils;
import com.makonike.entity.Student;
import com.makonike.service.StudentService;
import com.makonike.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author Makonike
 **/
@WebServlet(name = "StudentServlet",value = "/studentServlet")
public class StudentServlet extends BaseServlet {

    private StudentService studentService = new StudentServiceImpl();

    protected void findAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> allStudent = studentService.findAllStudent();
        req.setAttribute("allStudent", allStudent);
        req.getRequestDispatcher(  "/showAllStudent.jsp").forward(req,resp);
    }

    protected void seek(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Student student = studentService.seekStudent(id);
        if(student==null){
            PrintWriter out=resp.getWriter();
            out.print("<script>alert('查找失败！未找到该学生信息');history.go(-1);</script>");
        }else{
            req.setAttribute("oneStudent",student);
            req.getRequestDispatcher("/showOneStudent.jsp").forward(req,resp);
        }
    }

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String sex = req.getParameter("sex");
        String bornDate = req.getParameter("bornDate");
        String depNo = req.getParameter("depNo");
        int scores = Integer.parseInt(req.getParameter("scores"));
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");

        Date date = null;
        try {
            date = (Date)sdf.parse(bornDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setSex(sex);
        student.setBornDate(date);
        student.setScores(scores);
        student.setDepNo(depNo);

        boolean b = studentService.addStudent(student);
        if(b){
            PrintWriter out=resp.getWriter();
            out.print("<script>alert('添加成功！');history.go(-1);</script>");
        }else{
            PrintWriter out=resp.getWriter();
            out.print("<script>alert('添加失败！');history.go(-1);</script>");
        }
    }

    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        boolean b = studentService.deleteStudent(id);
        if(b){
            PrintWriter out=resp.getWriter();
            out.print("<script>alert('删除成功！');history.go(-1);</script>");
        }else{
            PrintWriter out=resp.getWriter();
            out.print("<script>alert('删除失败！');history.go(-1);</script>");
        }
    }

    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String sex = req.getParameter("sex");
        String bornDate = req.getParameter("bornDate");
        String depNo = req.getParameter("depNo");
        int scores = Integer.parseInt(req.getParameter("scores"));
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");

        Date date = null;
        try {
            date = (Date)sdf.parse(bornDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setSex(sex);
        student.setBornDate(date);
        student.setScores(scores);
        student.setDepNo(depNo);

        boolean b = studentService.updateStudent(student);
        if(b){
            PrintWriter out=resp.getWriter();
            out.print("<script>alert('修改成功！');history.go(-1);</script>");
        }else{
            PrintWriter out=resp.getWriter();
            out.print("<script>alert('修改失败！');history.go(-1);</script>");
        }
    }

}
