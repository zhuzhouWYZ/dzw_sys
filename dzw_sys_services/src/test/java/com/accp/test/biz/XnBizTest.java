package com.accp.test.biz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.xn.JurisdictionBiz;
import com.accp.dao.xn.LoadEmpDao;
import com.accp.dao.xn.QxconnectDao;
import com.alibaba.fastjson.JSON;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-ctx.xml")
public class XnBizTest {
	
//	@Autowired JurisdictionBiz jurisdictionBiz;
	@Autowired
	LoadEmpDao loadEmpDao;
	
	@Autowired
	QxconnectDao qxconnectDao;
	
	@Test
	public void test() {
//		jurisdictionBiz.queryAllJurisdictions().forEach(temp->{
//			System.out.println(JSON.toJSONString(temp));
//		});
		qxconnectDao.deleteByJid("2");
		//System.out.println(JSON.toJSONString(loadEmpDao.loginIn("admin", "123456")));
	}

}
