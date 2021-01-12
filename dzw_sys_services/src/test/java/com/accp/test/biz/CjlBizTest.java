package com.accp.test.biz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.cjl.CjlBiz;
import com.accp.biz.cjl.EmpBiz;
import com.accp.biz.cjl.LiZhiBiz;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-ctx.xml")
public class CjlBizTest {
	@Autowired
	private CjlBiz biz;
	@Autowired
	private EmpBiz biz1;
	
	@Autowired LiZhiBiz biz2;
	
	@Test
	public void queryAlltest() {
		biz2.LiZhiVo().getList().forEach(action->{
			System.out.println(action);
		});
	}
}
