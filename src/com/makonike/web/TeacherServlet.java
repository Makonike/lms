package com.makonike.web;

import com.makonike.entity.Teacher;
import com.makonike.service.TeacherService;
import com.makonike.service.impl.TeacherServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
@WebServlet(name = "TeacherServlet",value = "/teacherServlet")
public class TeacherServlet extends BaseServlet{

    TeacherService teacherService = new TeacherServiceImpl();

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
            /* 未完成 */
            System.out.println("添加成功！");
        }else{
            System.out.println("添加失败！");
        }
        /* 未完成 */

    }

    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        boolean b = teacherService.deleteStudent(id);
        if(b){
            /* 未完成 */
            System.out.println("删除成功！");
        }else{
            System.out.println("删除失败！");
        }
    }

    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //本来是想着设计修改信息的功能只能修改id（主键）以外的数据，
        // 呃 这里要结合网页前端去搞。。知识储备还不够。。所以暂时放弃了
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
            /* 未完成 */
            System.out.println("添加成功！");
        }else{
            System.out.println("修改失败！");
        }
        /* 未完成 */

    }
}
