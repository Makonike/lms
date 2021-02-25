package com.makonike.service;

import com.makonike.entity.Teacher;

/**
 * 业务逻辑层接口层 - Teacher
 *
 * @author Makonike
 * @date 2021-02-24 17:03
 **/
public interface TeacherService {

    /**
     * 添加教职工信息
     * @param teacher
     * @return boolean
     * @author Makonike
     * @date 2021/2/24 17:17
     */

    boolean addTeacher(Teacher teacher);

    /**
     * 删除教职工信息
     * @param id
     * @return boolean
     * @author Makonike
     * @date 2021/2/24 17:18
     */

    boolean deleteStudent(String id);

    /**
     * 修改教职工信息
     * @param teacher
     * @return void
     * @author Makonike
     * @date 2021/2/24 17:18
     */

    boolean updateTeacher(Teacher teacher);
}
