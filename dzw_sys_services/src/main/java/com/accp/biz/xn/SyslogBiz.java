package com.accp.biz.xn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.xn.SyslogDao;
import com.accp.pojo.Syslog;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class SyslogBiz {

	@Autowired
	private SyslogDao syslogDao;
	
	public PageInfo<Syslog> queryAllSyslog(Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Syslog>(syslogDao.queryAllSyslog());
	}
	
	public Integer addSyslog(String user_id,String user_action) {
		return syslogDao.addSyslog(user_id, user_action);
	}
}
