package com.makonike.dao;

import com.makonike.entity.Course;

/**
 * 持久化接口 - Course
 *
 * @author Makonike
 * @date 2021-02-24 13:48
 **/
public interface CourseDao {

    /**
     * 课程基本信息的输入
     * @param course
     * @return int
     * @author Makonike
     * @date 2021/2/24 13:50
     */

    int saveCourse(Course course);

    /**
     * 课程基本信息的删除
     * @param id
     * @return int
     * @author Makonike
     * @date 2021/2/24 13:50
     */

    int deleteCourse(String id);

    /**
     * 课程基本信息的修改
     * @param course
     * @return int
     * @author Makonike
     * @date 2021/2/24 13:51
     */

    int updateCourse(Course course);
}
