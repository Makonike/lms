package com.makonike.test;

import com.makonike.dao.TeacherDao;
import com.makonike.dao.impl.TeacherDaoImpl;
import com.makonike.entity.Teacher;
import org.junit.Test;

import java.util.Date;

/**
 * @author Makonike
 */
public class TeacherDaoImplTest {

    TeacherDao teacherDao = new TeacherDaoImpl();
    @Test
    public void saveTeacher() {
        int i = teacherDao.saveTeacher(new Teacher("1001", "小曾", "女", new Date(98, 2, 7), "3100", "高级教师", "心理"));
        System.out.println(i);
    }

    @Test
    public void deleteTeacher() {
        int i = teacherDao.deleteTeacher("1001");
        System.out.println(i);
    }

    @Test
    public void updateTeacher() {
    }
}