package com.makonike.web;

import com.makonike.entity.Course;
import com.makonike.service.CourseService;
import com.makonike.service.impl.CourseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Makonike
 * @date 2021-02-25 11:55
 **/
@WebServlet(name = "CourseServlet",value = "/courseServlet")
public class CourseServlet extends BaseServlet{
    CourseService courseService = new CourseServiceImpl();

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String teacherId = req.getParameter("teacherId");
        int creditHour = Integer.parseInt(req.getParameter("creditHour"));
        double creditPoint = Double.parseDouble(req.getParameter("creditPoint"));
        String schoolTime = req.getParameter("schoolTime");
        String classPlace = req.getParameter("classPlace");
        String examTime = req.getParameter("examTime");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date schoolDate = null;
        Date examDate = null;
        try {
            schoolDate = (Date)sdf.parse(schoolTime);
            examDate = (Date)sdf.parse(examTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Course course = new Course();
        course.setId(id);
        course.setName(name);
        course.setTeacherId(teacherId);
        course.setCreditHour(creditHour);
        course.setCreditPoint(creditPoint);
        course.setSchoolTime(schoolDate);
        course.setExamTime(examDate);

        boolean b = courseService.addCourse(course);
        if(b){
            /* 未完成 */
            System.out.println("添加成功！");
        }else {
            System.out.println("添加失败！");
        }
        /* 未完成 */

    }


    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        boolean b = courseService.deleteCourse(id);
        if(b){
            /* 未完成 */
            System.out.println("删除成功！");
        }else{
            System.out.println("删除失败");
        }
    }


    /* 未完成 */
    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String teacherId = req.getParameter("teacherId");
        int creditHour = Integer.parseInt(req.getParameter("creditHour"));
        double creditPoint = Double.parseDouble(req.getParameter("creditPoint"));
        String schoolTime = req.getParameter("schoolTime");
        String classPlace = req.getParameter("classPlace");
        String examTime = req.getParameter("examTime");
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");

        Date schoolDate = null;
        Date examDate = null;
        try {
            schoolDate = (Date)sdf.parse(schoolTime);
            examDate = (Date)sdf.parse(examTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Course course = new Course();
        course.setId(id);
        course.setName(name);
        course.setTeacherId(teacherId);
        course.setCreditHour(creditHour);
        course.setCreditPoint(creditPoint);
        course.setSchoolTime(schoolDate);
        course.setExamTime(examDate);

        boolean b = courseService.updateCourse(course);
        if(b){
            /* 未完成 */
            System.out.println("修改成功！");
        }else {
            System.out.println("修改失败！");
        }
        /* 未完成 */
    }
}
