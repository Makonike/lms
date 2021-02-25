package com.makonike.service.impl;

import com.makonike.dao.TeacherDao;
import com.makonike.dao.impl.TeacherDaoImpl;
import com.makonike.entity.Teacher;

/**
 * 业务逻辑实现层 - Teacher
 *
 * @author Makonike
 * @date 2021-02-24 17:20
 **/
public class TeacherServiceImpl implements com.makonike.service.TeacherService {
    private TeacherDao dao = new TeacherDaoImpl();

    @Override
    public boolean addTeacher(Teacher teacher) {
        int i = dao.saveTeacher(teacher);
        return i > 0;
    }

    @Override
    public boolean deleteStudent(String id) {
        int i = dao.deleteTeacher(id);
        return i > 0;
    }

    @Override
    public boolean updateTeacher(Teacher teacher) {
        int i = dao.updateTeacher(teacher);
        return i > 0;
    }
}
