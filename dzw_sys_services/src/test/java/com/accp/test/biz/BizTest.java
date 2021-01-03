package com.accp.test.biz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.xn.Ydhbiz;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-ctx.xml"})
public class BizTest {
	@Autowired
	private Ydhbiz ydh;
	
	@Test
	public void testquerymechan() {
		ydh.querymechanall(1,3);
	}
	@Test
	public void testdelmechan() {
		ydh.removemechan(1);
	}

}
