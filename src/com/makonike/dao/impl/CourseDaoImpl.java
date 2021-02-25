package com.makonike.dao.impl;

import com.makonike.dao.CourseDao;
import com.makonike.entity.Course;

/**
 * 持久化dao接口的实现类 - Course
 *
 * @author Makonike
 * @date 2021-02-24 13:51
 **/
public class CourseDaoImpl extends BaseDao implements CourseDao {

    /**
     * 课程信息的输入
     * @param course
     * @return int
     * @author Makonike
     * @date 2021/2/24 13:57
     */
    @Override
    public int saveCourse(Course course) {
        //language=MySQL
        String sql = "insert into lms2.course(id, name, teacherId, creditHour, creditPoint, schoolTime, classPlace, examTime) value (?,?,?,?,?,?,?,?)";
        return update(sql,course.getId(),course.getName(),course.getTeacherId(),course.getCreditHour(),course.getCreditPoint(),course.getSchoolTime(),course.getClassPlace(),course.getExamTime());
    }

    /**
     * 根据课程号删除课程的信息
     * @param id
     * @return int
     * @author Makonike
     * @date 2021/2/24 13:58
     */
    @Override
    public int deleteCourse(String id) {
        //language=MySQL
        String sql = "delete from lms2.course where id = ?";
        return update(sql,id);
    }

    /**
     * 修改课程信息
     * @param course
     * @return int
     * @author Makonike
     * @date 2021/2/24 14:02
     */
    @Override
    public int updateCourse(Course course) {
        //language=MySQL
        String sql = "update lms2.course set `name`=?,`teacherId`=?,`creditHour`=?,`creditPoint`=?,`schoolTime`=?,`classPlace`=?,`examTime`=?";
        return update(sql,course.getName(),course.getTeacherId(),course.getCreditHour(),course.getCreditPoint(),course.getSchoolTime(),course.getClassPlace(),course.getExamTime());
    }
}
