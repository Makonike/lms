package com.makonike.test;

import com.makonike.dao.StudentDao;
import com.makonike.dao.impl.StudentDaoImpl;
import com.makonike.entity.Student;
import org.junit.Test;

import java.util.Date;

/**
 * @author Makonike
 */
public class StudentDaoTest {

    private StudentDao studentDao = new StudentDaoImpl();

    @Test
    public void findAllStudent(){
        System.out.println(studentDao.findAllStudent());
    }

    @Test
    public void queryStudentByid() {
        System.out.println(studentDao.queryStudentById("1001"));
    }

    @Test
    public void saveStudent() {
        System.out.println(studentDao.saveStudent(new Student("1002", "小红", "男", new Date(1001, 11, 05), 617, "548")));
    }

    @Test
    public void deleteStudent() {
        System.out.println(studentDao.deleteStudent("1004"));
    }

    @Test
    public void updateStudent() {
        System.out.println(studentDao.updateStudent(studentDao.queryStudentById("1001")));
    }
}