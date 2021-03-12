package com.makonike.web;

import com.makonike.entity.Department;
import com.makonike.service.DepartmentService;
import com.makonike.service.impl.DepartmentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Makonike
 * @date 2021-02-25 11:56
 **/
@WebServlet(name = "DepartmentServlet",value = "/departmentServlet")
public class DepartmentServlet extends BaseServlet{

    private DepartmentService departmentService = new DepartmentServiceImpl();

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String depNo = req.getParameter("depNo");
        String name = req.getParameter("name");
        String intro = req.getParameter("intro");

        Department department = new Department();
        department.setDepNo(depNo);
        department.setName(name);
        department.setIntro(intro);

        boolean b = departmentService.addDepartment(department);
        if(b){
            /* 未完成 */
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
        /* 未完成 */

    }
    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String depNo = req.getParameter("id");
        boolean b = departmentService.deleteDepartment(depNo);
        if(b){
            /* 未完成 */
            System.out.println("删除成功！");
        }else{
            System.out.println("删除失败");
        }
    }
    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /* 未完成 */
        String depNo = req.getParameter("depNo");
        String name = req.getParameter("name");
        String intro = req.getParameter("intro");

        Department department = new Department();
        department.setDepNo(depNo);
        department.setName(name);
        department.setIntro(intro);

        boolean b = departmentService.updateDepartment(department);
        if(b){
            /* 未完成 */
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
        /* 未完成 */


    }
}
