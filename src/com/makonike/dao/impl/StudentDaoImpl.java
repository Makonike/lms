package com.makonike.dao.impl;

import com.makonike.dao.StudentDao;
import com.makonike.entity.Student;

import java.util.List;

/**
 * 持久化dao接口的实现类 - Student
 *
 * @author Makonike
 * @date 2021-02-23 16:17
 **/
public class StudentDaoImpl extends BaseDao implements StudentDao {

    /**
     * 显示所有学生
     * @param
     * @return 返回一个学生List集合
     * @author Makonike
     * @date 2021/3/10 22:52
     */

    @Override
    public List<Student> findAllStudent() {
        //language=MySQL
        String sql = "select `id`, `name`, `sex`,`bornDate`, `scores`, `depNo` from lms2.student order by `id` asc ";
        return queryForList(Student.class, sql);
    }

    /**
     * 根据学号查询一个学生的信息
     * @param id
     * @return com.makonike.pojo.Student 找到则返回查找到的学生信息，若找不到则返回null
     * @author Makonike
     * @date 2021/2/23 16:37
     */

    @Override
    public Student queryStudentById(String id) {
        //language=MySQL
        String sql = "select `id`, `name`, `sex`, `bornDate`, `scores`, `depNo` from lms2.student where id = ?";
        return queryForOne(Student.class,sql,id);
    }

    /**
     * 录入/保存学生信息
     * @param student 需要录入的学生对象
     * @return int int>0表示录入成功，反之则录入失败
     * @author Makonike
     * @date 2021/2/23 16:51
     */
    @Override
    public int saveStudent(Student student) {
        //language=MySQL
        String sql = "insert into lms2.student(id, name, sex, bornDate, scores, depNo) value (?,?,?,?,?,?)";
        return update(sql,student.getId(),student.getName(),student.getSex(),student.getBornDate(),student.getScores(),student.getDepNo());
    }

    /**
     * 根据学号删除学生信息
     * @param id
     * @return int int>0表示删除成功，反之则删除失败
     * @author Makonike
     * @date 2021/2/24 1:33
     */
    @Override
    public int deleteStudent(String id) {
        //language=MySQL
        String sql = "delete from  lms2.student where `id`  = ?" ;
        return update(sql, id);
    }

    /**
     * 更改学生信息
     * @param student
     * @return int 返回值大于0表示更改成功，反之则更改失败
     * @author Makonike
     * @date 2021/2/24 1:33
     */
    @Override
    public int updateStudent(Student student) {
        //language=MySQL
        String sql = "update lms2.student set `id`=?,`name`=?,`sex`=?,`bornDate`=?,`scores`=?,`depNo`=? where `id` = ? ";
        return update(sql,student.getId(),student.getName(),student.getSex(),student.getBornDate(),student.getScores(),student.getDepNo(),student.getId());
    }


}
