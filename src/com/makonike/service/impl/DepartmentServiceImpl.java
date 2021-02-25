package com.makonike.service.impl;

import com.makonike.dao.DepartmentDao;
import com.makonike.dao.impl.DepartmentDaoImpl;
import com.makonike.entity.Department;
import com.makonike.service.DepartmentService;

/**
 * 业务逻辑实现层 - Department
 *
 * @author Makonike
 * @date 2021-02-24 17:33
 **/
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentDao dao = new DepartmentDaoImpl();

    @Override
    public boolean addDepartment(Department department) {
        int i = dao.saveDepartment(department);
        return i > 0;
    }

    @Override
    public boolean deleteDepartment(String deoNo) {
        int i = dao.deleteDepartment(deoNo);
        return i > 0;
    }

    @Override
    public boolean updateDepartment(Department department) {
        int i = dao.updateDepartment(department);
        return i > 0;
    }
}
