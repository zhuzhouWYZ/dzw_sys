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
	
	public List<Jurisdiction> queryAllJurMap(){
		return jurisdictionDao.queryAllJurMap();
	}
	
	public Integer removeJurQx(String jurid,String syfunid) {
		return jurisdictionDao.delJurQx(jurid, syfunid);
	}
	
	public List<Jurisdiction> queryAllJurisdictions(){
		return jurisdictionDao.queryAlljJurisdictions();
	}
	
	public Integer addJurisdiction(Jurisdiction jurisdiction) {
		return jurisdictionDao.addJurisdiction(jurisdiction);
	}
	
	public Integer modifyJurisdiction(Jurisdiction jurisdiction) {
		return jurisdictionDao.updateJurisdiction(jurisdiction);
	}
	
	public Integer removeJurisdiction(String jurisdictionid) {
		return jurisdictionDao.delJurisdiction(jurisdictionid);
	}
}
