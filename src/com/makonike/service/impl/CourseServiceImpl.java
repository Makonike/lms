package com.makonike.service.impl;

import com.makonike.dao.CourseDao;
import com.makonike.dao.impl.CourseDaoImpl;
import com.makonike.entity.Course;
import com.makonike.service.CourseService;

/**
 * 业务逻辑实现层 - Course
 *
 * @author Makonike
 * @date 2021-02-24 17:31
 **/
public class CourseServiceImpl implements CourseService {
    private CourseDao dao = new CourseDaoImpl();

    @Override
    public boolean addCourse(Course course) {
        int i = dao.saveCourse(course);
        return i > 0;
    }

    @Override
    public boolean deleteCourse(String id) {
        int i = dao.deleteCourse(id);
        return i > 0;
    }

    @Override
    public boolean updateCourse(Course course) {
        int i = dao.updateCourse(course);
        return i > 0;
    }
}
