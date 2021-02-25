package com.makonike.service;

import com.makonike.entity.Department;

/**
 * 业务逻辑层接口层 - Department
 *
 * @author Makonike
 * @date 2021-02-24 17:28
 **/
public interface DepartmentService {
    /**
     * 添加系信息
     * @param department
     * @return void
     * @author Makonike
     * @date 2021/2/24 17:30
     */
    boolean addDepartment(Department department);

    /**
     * 删除系信息
     * @param deoNo
     * @return void
     * @author Makonike
     * @date 2021/2/24 17:30
     */
    boolean deleteDepartment(String deoNo);

    /**
     * 修改系信息
     * @param department
     * @return void
     * @author Makonike
     * @date 2021/2/24 17:30
     */
    boolean updateDepartment(Department department);
}
