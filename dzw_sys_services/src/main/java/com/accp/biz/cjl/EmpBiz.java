package com.accp.biz.cjl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.cjl.EmployeeMapper;
import com.accp.pojo.Employee;
import com.accp.vo.EmpAndBumenAndZhiwei;
import com.github.pagehelper.PageInfo;
@Service
public class EmpBiz {
	/**
	 * 查询员工表的dao
	 */
	@Autowired
	private EmployeeMapper dao2;

	public EmployeeMapper getDao2() {
		return dao2;
	}

	public void setDao2(EmployeeMapper dao2) {
		this.dao2 = dao2;
	}
	
	/**
	 * 查询员工表vo
	 */
	public PageInfo<EmpAndBumenAndZhiwei> EmpVo(String empname){
		return new PageInfo<EmpAndBumenAndZhiwei>(dao2.EmpVo(empname));
	}
	/**
	 * 新增员工
	 */
	public int addEmp(Employee emp) {
		return dao2.insertSelective(emp);
	}
	/**
	 * 根据id查询员工
	 */
	public Employee queryByid(String employeeno ) {
		return dao2.selectByPrimaryKey(employeeno);
	}
	/**
	 * 修改员工
	 */
	public int modifyEmp(Employee employee) {
		return dao2.updateByPrimaryKeySelective(employee);
	}
	/**
	 * 删除员工
	 */
	public int removeEmp(String  Empno) {
		return dao2.deleteByPrimaryKey(Empno);
	}
}
