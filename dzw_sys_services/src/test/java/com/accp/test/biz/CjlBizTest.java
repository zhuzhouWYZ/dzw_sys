package com.accp.test.biz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.cjl.CjlBiz;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-ctx.xml")
public class CjlBizTest {
	@Autowired
	private CjlBiz biz;
	
	@Test
	public void queryAlltest() {
		biz.queryAllpostt().forEach(temp->{
			System.out.println(temp);
		});
	}
}
