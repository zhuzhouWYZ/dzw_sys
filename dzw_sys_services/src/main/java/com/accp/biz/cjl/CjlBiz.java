package com.accp.biz.cjl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.cjl.DepartmentDao;
import com.accp.dao.cjl.EmployeeMapper;
import com.accp.dao.cjl.PosttableMapper;
import com.accp.pojo.Department;
import com.accp.pojo.Jurisdiction;
import com.accp.pojo.Posttable;
import com.accp.vo.EmpAndBumenAndZhiwei;
import com.github.pagehelper.PageInfo;

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
	 * 新增一个部门
	 */
	public int addDepart(Department department) {
		return dao.insert(department);
	}
	/**
	 * 修改部门名称
	 */
	public int modifyBumen(Department department) {
		return dao.update(department);
	}
	/**
	 * 删除部门
	 */
	public int removeBumen(Integer departmentid) {
		return dao.delete(departmentid);
	}
	/**
	 * 查询所有岗位
	 */
	public List<Posttable> queryAllaa(){
		return dao1.queryAll();
	}
	/**
	 * 分页查询所有岗位
	 */
	public PageInfo<Posttable> queryAllpostt(){
		return new PageInfo<Posttable>(dao1.selectByPrimaryKey());
	}
	/**
	 * 添加一个岗位
	 */
	public Integer addpost(Posttable posttable) {
		return dao1.insertSelective(posttable);
	}
	/**
	 * 修改岗位
	 */
	public Integer modifypost(Posttable posttable) {
		return dao1.updateByPrimaryKeySelective(posttable);
	}
	/**
	 * 删除岗位
	 */
	public Integer removepost(Integer postid) {
		return dao1.deleteByPrimaryKey(postid);
	}
	
	/**
	 * 查询所有角色
	 */
	public List<Jurisdiction> queryAllJuese(){
		return dao1.queryAlljuese();
	}
}
