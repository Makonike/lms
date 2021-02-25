package com.makonike.dao;

import com.makonike.entity.Department;

/**
 * 持久化接口 - DepartmentDao
 *
 * @author Makonike
 * @date 2021-02-24 14:03
 **/
public interface DepartmentDao {

    /**
     * 系信息的输入
     * @param department
     * @return int
     * @author Makonike
     * @date 2021/2/24 14:05
     */

    int saveDepartment(Department department);

    /**
     * 根据系号删除系信息
     * @param depNo
     * @return int
     * @author Makonike
     * @date 2021/2/24 14:06
     */

    int deleteDepartment(String depNo);

    /**
     * 更新系的信息
     * @param department
     * @return int
     * @author Makonike
     * @date 2021/2/24 14:06
     */

    int updateDepartment(Department department);

}
