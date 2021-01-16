package com.accp.biz.xn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.xn.QxconnectDao;

@Service
public class QxconnectBiz {

	@Autowired
	private QxconnectDao qxconnectDao;
	

	public Integer deleteByJid(String jid) {
		return qxconnectDao.deleteByJid(jid);
	}
	
	public Integer addQxByList(String[] fids, String jid) {
		deleteByJid(jid);
		qxconnectDao.addQxByList(fids, jid);
		return 1;
	}
}
