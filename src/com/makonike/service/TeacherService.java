package com.makonike.service;

import com.makonike.entity.Teacher;

import java.util.List;

/**
 * 业务逻辑层接口层 - Teacher
 *
 * @author Makonike
 * @date 2021-02-24 17:03
 **/
public interface TeacherService {

    /**
     * 查询教师
     * @param id
     * @return com.makonike.entity.Teacher
     * @author Makonike
     * @date 2021/3/13 10:31
     */

    Teacher seekTeacher(String id);

    /**
     * 显示所有教师
     * @param
     * @return 返回一个Teacher对象的List集合
     * @author Makonike
     * @date 2021/3/12 19:12
     */

    List<Teacher> findAllTeacher();

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

    /**
     * 检查教职工信息是否存在
     * @param id
     * @return boolean
     * @author Makonike
     * @date 2021/3/13 10:33
     */

    boolean isExist(String id);

}
