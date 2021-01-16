package com.accp.biz.xn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.xn.SyfunctionDao;
import com.accp.pojo.Syfunction;

@Service
public class SyfunctionBiz {

	@Autowired
	private SyfunctionDao syfunctionDao;
	
	public List<Syfunction> queryAllSyfun(){
		return syfunctionDao.queryAllSyfun();
	}
}
