package com.makonike.dao.impl;

import com.makonike.dao.StudentDao;
import com.makonike.entity.Student;

/**
 * 持久化dao接口的实现类 - Student
 *
 * @author Makonike
 * @date 2021-02-23 16:17
 **/
public class StudentDaoImpl extends BaseDao implements StudentDao {
    /**
     * 根据学号查询一个学生的信息
     * @param id
     * @return com.makonike.pojo.Student 找到则返回查找到的学生信息，若找不到则返回null
     * @author Makonike
     * @date 2021/2/23 16:37
     */

    @Override
    public Student queryStudentByid(String id) {
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
     * @return int int>0表示更改成功，反之则更改失败
     * @author Makonike
     * @date 2021/2/24 1:33
     */
    @Override
    public int updateStudent(Student student) {
        //language=MySQL
        String sql = "update lms2.student set `name`=?,`sex`=?,`bornDate`=?,`scores`=?,`depNo`=? where `id` = ? ";
        return update(sql,student.getName(),student.getSex(),student.getBornDate(),student.getScores(),student.getDepNo(),student.getId());
    }


}
