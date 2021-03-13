package com.makonike.service.impl;

import com.makonike.dao.TeacherDao;
import com.makonike.dao.impl.TeacherDaoImpl;
import com.makonike.entity.Teacher;

import java.util.List;

/**
 * 业务逻辑实现层 - Teacher
 *
 * @author Makonike
 * @date 2021-02-24 17:20
 **/
public class TeacherServiceImpl implements com.makonike.service.TeacherService {
    private TeacherDao dao = new TeacherDaoImpl();

    /**
     * 通过教职工号查询教职工信息
     * @param id
     * @return com.makonike.entity.Teacher
     * @author Makonike
     * @date 2021/3/13 10:31
     */

    @Override
    public Teacher seekTeacher(String id) {
        return dao.queryTeacherById(id);
    }

    /**
     * 显示所有教师
     * @param
     * @return 返回一个Teacher对象的List集合
     * @author Makonike
     * @date 2021/3/12 19:13
     */

    @Override
    public List<Teacher> findAllTeacher() {
        return dao.findAllTeacher();
    }

    @Override
    public boolean addTeacher(Teacher teacher) {
        if(isExist(teacher.getId())){
            return false;
        }
        int i = dao.saveTeacher(teacher);
        return i > 0;
    }

    @Override
    public boolean deleteStudent(String id) {
        if(isExist(id)){
            int i = dao.deleteTeacher(id);
            return i > 0;
        }
        return false;
    }

    @Override
    public boolean updateTeacher(Teacher teacher) {
        if(isExist(teacher.getId())){
            int i = dao.updateTeacher(teacher);
            return i > 0;
        }
        return false;
    }

    @Override
    public boolean isExist(String id) {
        return dao.queryTeacherById(id) != null;
    }
}
