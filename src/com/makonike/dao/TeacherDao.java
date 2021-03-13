package com.makonike.dao;

import com.makonike.entity.Teacher;

import java.util.List;

/**
 * 持久化接口 - Teacher
 *
 * @author Makonike
 * @date 2021-02-24 2:19
 **/
public interface TeacherDao {

    /**
     * 查询所有教师
     * @param
     * @return 返回一个Teacher的List集合
     * @author Makonike
     * @date 2021/3/12 19:08
     */

    List<Teacher> findAllTeacher();

    /**
     * 通过教职工工号查询教师信息
     * @param id
     * @return com.makonike.entity.Teacher
     * @author Makonike
     * @date 2021/3/13 10:27
     */

    Teacher queryTeacherById(String id);

    /**
     * 教师基本信息的输入
     * @param teacher
     * @return int
     * @author Makonike
     * @date 2021/2/24 2:23
     */
    int saveTeacher(Teacher teacher);

    /**
     * 教师基本信息的删除
     * @param id
     * @return int
     * @author Makonike
     * @date 2021/2/24 2:23
     */
    int deleteTeacher(String id);

    /**
     * 教师基本信息的修改
     * @param teacher
     * @return int
     * @author Makonike
     * @date 2021/2/24 2:23
     */
    int updateTeacher(Teacher teacher);

}
