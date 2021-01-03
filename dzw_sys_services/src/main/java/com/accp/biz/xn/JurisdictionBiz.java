package com.accp.biz.xn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.xn.JurisdictionDao;
import com.accp.pojo.Jurisdiction;

@Service
public class JurisdictionBiz {

	@Autowired
	private JurisdictionDao jurisdictionDao;
	
	public List<Jurisdiction> queryAllJurisdictions(){
		return jurisdictionDao.queryAlljJurisdictions();
	}
}
