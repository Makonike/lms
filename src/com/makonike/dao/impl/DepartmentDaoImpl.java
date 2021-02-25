package com.makonike.dao.impl;

import com.makonike.dao.DepartmentDao;
import com.makonike.entity.Department;

/**
 * 持久化dao接口的实现类 - Department
 *
 * @author Makonike
 * @date 2021-02-24 14:06
 **/
public class DepartmentDaoImpl extends BaseDao implements DepartmentDao {

    /**
     * 系信息的输入
     * @param department
     * @return int
     * @author Makonike
     * @date 2021/2/24 14:14
     */
    @Override
    public int saveDepartment(Department department) {
        //language=MySQL
        String sql = "insert into lms2.department(depNo, name, intro) value (?,?,?)";
        return update(sql,department.getDepNo(),department.getName(),department.getIntro());
    }

    /**
     * 根据系号删除系的信息
     * @param depNo
     * @return int
     * @author Makonike
     * @date 2021/2/24 14:14
     */
    @Override
    public int deleteDepartment(String depNo) {
        //language=MySQL
        String sql = "delete from lms2.department where depNo = ?";
        return update(sql,depNo);
    }

    /**
     * 修改系信息
     * @param department
     * @return int
     * @author Makonike
     * @date 2021/2/24 14:14
     */
    @Override
    public int updateDepartment(Department department) {
        //language=MySQL
        String sql = "update lms2.department set `name`=?,`intro`=?";
        return update(sql,department.getName(),department.getIntro());
    }
}
