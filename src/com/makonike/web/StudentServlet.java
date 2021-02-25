package com.makonike.web;

import com.makonike.service.StudentService;
import com.makonike.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 *
 * @author Makonike
 **/
public class StudentServlet extends BaseServlet {

    StudentService studentService = new StudentServiceImpl();

    protected void seek(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }


}
