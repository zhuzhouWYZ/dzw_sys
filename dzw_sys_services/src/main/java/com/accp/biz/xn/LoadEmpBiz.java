package com.accp.biz.xn;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.xn.LoadEmpDao;
import com.accp.pojo.Employee;

@Service
public class LoadEmpBiz {

	@Autowired
	private LoadEmpDao loadEmpDao;
	
	public Employee loginIn(String emplogenid,String emplogepaw) {
		return loadEmpDao.loginIn(emplogenid, emplogepaw);
	}
	
}
