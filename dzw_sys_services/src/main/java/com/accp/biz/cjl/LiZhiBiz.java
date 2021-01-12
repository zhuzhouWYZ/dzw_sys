package com.accp.biz.cjl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.cjl.DimissionMapper;
import com.accp.pojo.Dimission;
import com.accp.vo.EmpAndBumenAndZhiweiAndLizhi;
import com.github.pagehelper.PageInfo;

@Service
public class LiZhiBiz {
	@Autowired
	private DimissionMapper dao;

	public DimissionMapper getDao() {
		return dao;
	}

	public void setDao(DimissionMapper dao) {
		this.dao = dao;
	}
	
	/**
	 * 离职登记vo
	 */
	public PageInfo<EmpAndBumenAndZhiweiAndLizhi> LiZhiVo(){
		return new PageInfo<EmpAndBumenAndZhiweiAndLizhi>(dao.lizhiVo());
	}
	/**
	 * 新增员工离职表
	 */
	public Integer addLizhi(Dimission dimission) {
		return dao.insert(dimission);
	}
	/**
	 * 改变员工状态为1
	 */
	public Integer modifyZhuangtai(String Empno) {
		return dao.EmpZhuangTai(Empno);
	}
	/**
	 * 改变员工状态为0
	 */
	public Integer modifyZhuangtai1(String Empno) {
		return dao.EmpZhuangTai1(Empno);
	}
	/**
	 * 删除离职表
	 */
	public Integer remove(String employeeno) {
		return dao.deleteByPrimaryKey(employeeno);
	}
}
