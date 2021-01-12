package com.accp.dao.cjl;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Department;

public interface DepartmentDao {
	 List<Department> queryAll();
	Integer insert(Department department);
	
	Integer update(Department department);
	
	Integer delete(@Param("departmentid")Integer departmentid);
}
