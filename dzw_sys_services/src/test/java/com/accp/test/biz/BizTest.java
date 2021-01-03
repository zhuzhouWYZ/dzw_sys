package com.accp.test.biz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.xn.JurisdictionBiz;
import com.alibaba.fastjson.JSON;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-ctx.xml")
public class BizTest {
	
	@Autowired JurisdictionBiz jurisdictionBiz;
	
	@Test
	public void test() {
		jurisdictionBiz.queryAllJurisdictions().forEach(temp->{
			System.out.println(JSON.toJSONString(temp));
		});
	}

}
