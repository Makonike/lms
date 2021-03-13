package com.makonike.web;

import com.makonike.entity.Teacher;
import com.makonike.service.TeacherService;
import com.makonike.service.impl.TeacherServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
@WebServlet(name = "TeacherServlet",value = "/teacherServlet")
public class TeacherServlet extends BaseServlet{

    private TeacherService teacherService = new TeacherServiceImpl();

    protected void findAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Teacher> allTeacher = teacherService.findAllTeacher();
        req.setAttribute("allTeacher", allTeacher);
        req.getRequestDispatcher("/showAllTeacher.jsp").forward(req,resp);
    }

    protected void seek(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Teacher teacher = teacherService.seekTeacher(id);
        if(teacher==null){
            //警告提示框
            PrintWriter out=resp.getWriter();
            out.print("<script>alert('查找失败！未找到该教职工信息');history.go(-1);</script>");
        }else{
            //将查到的对象放入请求域中，并跳转至相应页面展示
            req.setAttribute("oneTeacher",teacher);
            req.getRequestDispatcher("/showOneTeacher.jsp").forward(req,resp);
        }
    }

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String sex = req.getParameter("sex");
        String bornDate = req.getParameter("bornDate");
        String depNo = req.getParameter("depNo");
        String jobTitle = req.getParameter("jobTitle");
        String major = req.getParameter("major");
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");

        Date date = null;
        try {
            date = (Date)sdf.parse(bornDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setName(name);
        teacher.setSex(sex);
        teacher.setBornDate(date);
        teacher.setDepNo(depNo);
        teacher.setJobTitle(jobTitle);
        teacher.setMajor(major);
        boolean b = teacherService.addTeacher(teacher);
        if(b){
            //警告提示框
            PrintWriter out=resp.getWriter();
            out.print("<script>alert('添加成功！');history.go(-1);</script>");
        }else{
            PrintWriter out=resp.getWriter();
            out.print("<script>alert('添加失败！');history.go(-1);</script>");
        }
    }

    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        boolean b = teacherService.deleteStudent(id);
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
        String jobTitle = req.getParameter("jobTitle");
        String major = req.getParameter("major");
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");

        Date date = null;
        try {
            date = (Date)sdf.parse(bornDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setName(name);
        teacher.setSex(sex);
        teacher.setBornDate(date);
        teacher.setDepNo(depNo);
        teacher.setJobTitle(jobTitle);
        teacher.setMajor(major);
        boolean b = teacherService.updateTeacher(teacher);
        if(b){
            PrintWriter out=resp.getWriter();
            out.print("<script>alert('修改成功！');history.go(-1);</script>");
        }else{
            PrintWriter out=resp.getWriter();
            out.print("<script>alert('修改失败！');history.go(-1);</script>");
        }
    }
}
