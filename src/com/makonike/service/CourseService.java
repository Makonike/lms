package com.makonike.service;

import com.makonike.entity.Course;

/**
 * 业务逻辑层接口层 - Course
 *
 * @author Makonike
 * @date 2021-02-24 17:24
 **/
public interface CourseService {

    /**
     * 添加课程信息
     * @param course
     * @return void
     * @author Makonike
     * @date 2021/2/24 17:27
     */

    boolean addCourse(Course course);

    /**
     * 删除课程信息
     * @param id
     * @return void
     * @author Makonike
     * @date 2021/2/24 17:28
     */

    boolean deleteCourse(String id);

    /**
     * 修改课程信息
     * @param course
     * @return void
     * @author Makonike
     * @date 2021/2/24 17:28
     */

    boolean updateCourse(Course course);
}
