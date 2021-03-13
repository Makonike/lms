package com.makonike.service.impl;

import com.makonike.dao.StudentDao;
import com.makonike.dao.impl.StudentDaoImpl;
import com.makonike.entity.Student;
import com.makonike.service.StudentService;

import java.util.List;

/**
 * 业务逻辑实现层 - Student
 *
 * @author Makonike
 * @date 2021-02-24 16:03
 **/
public class StudentServiceImpl implements StudentService {
    private StudentDao dao = new StudentDaoImpl();

    /**
     * 显示所有学生
     * @param
     * @return 返回一个Student对象的List集合
     * @author Makonike
     * @date 2021/3/10 23:03
     */

    @Override
    public List<Student> findAllStudent() {
        return dao.findAllStudent();
    }

    /**
     * 添加学生信息
     * @param student
     * @return boolean 返回true说明添加成功 反之则添加失败
     * @author Makonike
     * @date 2021/2/24 16:24
     */
    @Override
    public boolean addStudent(Student student) {
        if(isExist(student.getId())){
            return false;
        }
        int i = dao.saveStudent(student);
        return i > 0;
    }

    /**
     * 通过学号查询学生信息
     * @param id
     * @return 返回null则说明不存在该学生，反之则返回该学生对象
     * @author Makonike
     * @date 2021/2/24 16:24
     */
    @Override
    public Student seekStudent(String id) {
        return dao.queryStudentById(id);
    }

    /**
     * 根据学号检查学生信息是否存在
     * @param id
     * @return boolean 返回true说明存在，反之则不存在
     * @author Makonike
     * @date 2021/2/24 16:27
     */
    @Override
    public boolean isExist(String id) {
        return dao.queryStudentById(id) != null;
    }

    /**
     * 删除学生信息
     * @param id
     * @return boolean 返回true说明删除成功，反之则删除失败
     * @author Makonike
     * @date 2021/2/24 16:29
     */
    @Override
    public boolean deleteStudent(String id) {
        if(isExist(id)){
            int i = dao.deleteStudent(id);
            return i > 0;
        }
        return false;
    }

    @Override
    public boolean updateStudent(Student student) {
        if(isExist(student.getId())){
            int i = dao.updateStudent(student);
            return i > 0;
        }
        return false;
    }
}
