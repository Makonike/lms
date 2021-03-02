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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 因为来不及学jsp，没做前端页面，Servlet部分就先放下了
 *
 * @author Makonike
 **/
@WebServlet(name = "StudentServlet",value = "/studentServlet")
public class StudentServlet extends BaseServlet {

    StudentService studentService = new StudentServiceImpl();

    protected void seek(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Student student = studentService.seekStudent(id);
        /* 未完成 */
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
            /* 未完成 */
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
        /* 未完成 */

    }

    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        boolean b = studentService.deleteStudent(id);
        if(b){
            /* 未完成 */
            System.out.println("删除成功！");
        }else{
            System.out.println("删除失败");
        }
    }

    /* 未完成 */
    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //本来是想着设计修改信息的功能只能修改id（主键）以外的数据，
        // 呃 这里要结合网页前端去搞。。知识储备还不够。。所以暂时放弃了
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
            /* 未完成 */
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
        /* 未完成 */
    }

}
