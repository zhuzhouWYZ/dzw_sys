package com.accp.test.biz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.ydh.Ydhbiz;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-ctx.xml"})
public class BizTest {
	@Autowired
	private Ydhbiz ydh;
	/**
	 *技工班组
	 */
	@Test
	public void testquerymechan() {
		ydh.querymechanall(1,3,"1");
	}
	@Test
	public void testdelmechan() {
		ydh.removemechan(1);
	}
/**
 * 技工星级
 */
	@Test
	public void testmestar() {
		ydh.querymestarall(1, 3);
	}
	
	/**
	 * 外勤车辆
	 */
	@Test
	public void testfcar() {
		ydh.queryfcarall(1, 2, 1, "1");
	}
	
	
	/**
	 * 技工
	 */
	@Test
	public void testchaic() {
		ydh.querychaic(1, 6, "1",1);
	}
	
}
