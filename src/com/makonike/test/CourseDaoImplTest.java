package com.makonike.test;

import com.makonike.dao.CourseDao;
import com.makonike.dao.impl.CourseDaoImpl;
import com.makonike.entity.Course;
import org.junit.Test;

import java.util.Date;

/**
 * @author Makonike
 */
public class CourseDaoImplTest {

    CourseDao courseDao = new CourseDaoImpl();
    @Test
    public void saveCourse() {
        int i = courseDao.saveCourse(new Course("1001", "高数", "邱红兵", 88, 5.5, new Date(121, 1, 15), "教三315", new Date(121, 1, 18)));
        System.out.println(i);
    }

    @Test
    public void deleteCourse() {
        int i = courseDao.deleteCourse("1001");
        System.out.println(i);
    }

    @Test
    public void updateCourse() {
    }
}