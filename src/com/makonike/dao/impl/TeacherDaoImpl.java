package com.makonike.dao.impl;

import com.makonike.dao.TeacherDao;
import com.makonike.entity.Teacher;

import java.util.List;

/**
 * 持久化dao接口的实现类 - Teacher
 *
 * @author Makonike
 * @date 2021-02-24 2:24
 **/
public class TeacherDaoImpl extends BaseDao implements TeacherDao {


    /**
     * 显示所有教师
     * @param
     * @return 返回一个教师对象的List集合>
     * @author Makonike
     * @date 2021/3/12 19:08
     */

    @Override
    public List<Teacher> findAllTeacher() {
        //language=MySQL
        String sql = "select `id`, `name`, `sex`, `bornDate`, `depNo`, `jobTitle`, `major` from lms2.teacher order by `id` asc ";
        return queryForList(Teacher.class, sql);
    }


    /**
     * 通过教职工号查询教师信息
     * @param id
     * @return 如果存在则返回查询到的教师对象，若没有则返回null
     * @author Makonike
     * @date 2021/3/13 10:28
     */

    @Override
    public Teacher queryTeacherById(String id) {
        //language=MySQL
        String sql = "select `id`, `name`, `sex`, `bornDate`, `depNo`, `jobTitle`, `major` from lms2.teacher where id = ?";
        return queryForOne(Teacher.class,sql,id);
    }


    /**
     * 教职工信息的输入
     * @param teacher
     * @return int
     * @author Makonike
     * @date 2021/2/24 13:42
     */

    @Override
    public int saveTeacher(Teacher teacher) {
        //language=MySQL
        String sql = "insert into lms2.teacher(`id`, `name`, `sex`, `bornDate`, `depNo`, `jobTitle`, `major`) value (?,?,?,?,?,?,?)";
        return update(sql,teacher.getId(),teacher.getName(),teacher.getSex(),teacher.getBornDate(),teacher.getDepNo(),teacher.getJobTitle(),teacher.getMajor());
    }

    /**
     * 根据教职工号删除教职工的信息
     * @param id
     * @return int
     * @author Makonike
     * @date 2021/2/24 13:44
     */

    @Override
    public int deleteTeacher(String id) {
        //language=MySQL
        String sql = "delete from lms2.teacher where `id` = ?";
        return update(sql,id);
    }

    /**
     * 修改教职工信息
     * @param teacher
     * @return int
     * @author Makonike
     * @date 2021/2/24 14:03
     */

    @Override
    public int updateTeacher(Teacher teacher) {
        //language=MySQL
        String sql = "update lms2.teacher set `name`=?,`sex`=?,`bornDate`=?,`depNo`=?,`jobTitle`=?,`major`=?";
        return update(sql,teacher.getName(),teacher.getSex(),teacher.getBornDate(),teacher.getDepNo(),teacher.getJobTitle(),teacher.getMajor());
    }
}
