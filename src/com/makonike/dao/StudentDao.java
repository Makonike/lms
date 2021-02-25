package com.makonike.dao;

import com.makonike.entity.Student;

/**
 * 持久化接口 - Student
 *
 * @author Makonike
 * @date 2021-02-23 16:04
 **/
public interface StudentDao {


    /**
     * 根据学号查询学生信息
     * @param id 需要查询的学号
     * @return 如果是null就没有找到，反之则找到，返回学生信息
     * @author Makonike
     * @date 2021/2/23 16:06
     */
    Student queryStudentByid(String id);


    /**
     * 保存学生信息
     * @param student 新的student对象
     * @return int
     * @author Makonike
     * @date 2021/2/23 16:18
     */
    int saveStudent(Student student);

    /**
     * 根据id删除
     * @param id
     * @return boolean
     * @author Makonike
     * @date 2021/2/24 0:52
     */
    int deleteStudent(String id);

    /**
     * 根据id删除
     * @param student
     * @return boolean
     * @author Makonike
     * @date 2021/2/24 0:55
     */
    int updateStudent(Student student);
}
