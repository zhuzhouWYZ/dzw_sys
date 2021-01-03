package com.accp.biz.cjl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.cjl.DepartmentDao;
import com.accp.pojo.Department;

@Service
public class CjlBiz {
	@Autowired
	private DepartmentDao dao;
	
	
	public DepartmentDao getDao() {
		return dao;
	}


	public void setDao(DepartmentDao dao) {
		this.dao = dao;
	}


	/**
	 * 查询所有部门
	 */
	
	public List<Department> queryAll(){
		return dao.queryAll();
	}
}
