package com.accp.biz.cjl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.cjl.DepartmentDao;
import com.accp.dao.cjl.PosttableMapper;
import com.accp.pojo.Department;
import com.accp.pojo.Posttable;

@Service
public class CjlBiz {
	/**
	 * 查询部门表的dao
	 */
	@Autowired
	private DepartmentDao dao;
	
	public DepartmentDao getDao() {
		return dao;
	}


	public void setDao(DepartmentDao dao) {
		this.dao = dao;
	}
	/**
	 * 查询岗位表的dao
	 */
	@Autowired
	private PosttableMapper dao1;
	

	public PosttableMapper getDao1() {
		return dao1;
	}


	public void setDao1(PosttableMapper dao1) {
		this.dao1 = dao1;
	}


	/**
	 * 查询所有部门
	 */
	
	public List<Department> queryAll(){
		return dao.queryAll();
	}
	
	/**
	 * 查询所有岗位
	 */
	public List<Posttable> queryAllpostt(){
		return dao1.selectByPrimaryKey();
	}
}
