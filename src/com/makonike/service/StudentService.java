package com.makonike.service;

import com.makonike.entity.Student;

import java.util.List;

/**
 * 业务逻辑层接口层 - Student
 *
 * @author Makonike
 * @date 2021-02-24 0:42
 **/
public interface StudentService{

    /**
     * 显示所有学生
     * @param
     * @return void
     * @author Makonike
     * @date 2021/3/10 23:02
     */

    List<Student> findAllStudent();

    /**
     * 添加学生
     * @param student
     * @return void
     * @author Makonike
     * @date 2021/2/24 15:57
     */

    boolean addStudent(Student student);

    /**
     * 查找学生
     * @param id
     * @return com.makonike.pojo.Student
     * @author Makonike
     * @date 2021/2/24 15:59
     */

    Student seekStudent(String id);

    /**
     * 检查学生信息是否存在
     * @param id
     * @return boolean
     * @author Makonike
     * @date 2021/2/24 16:00
     */

    boolean isExist(String id);

    /**
     * 删除学生信息
     * @param id
     * @return boolean
     * @author Makonike
     * @date 2021/2/24 16:01
     */

    boolean deleteStudent(String id);

    /**
     * 修改学生信息
     * @param student
     * @return void
     * @author Makonike
     * @date 2021/2/24 16:32
     */

    boolean updateStudent(Student student);
}
