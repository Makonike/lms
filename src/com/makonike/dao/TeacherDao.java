package com.makonike.dao;

import com.makonike.entity.Teacher;

/**
 * 持久化接口 - Teacher
 *
 * @author Makonike
 * @date 2021-02-24 2:19
 **/
public interface TeacherDao {

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
