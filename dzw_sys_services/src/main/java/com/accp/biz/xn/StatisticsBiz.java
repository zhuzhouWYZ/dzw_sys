package com.accp.biz.xn;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.xn.StatisticsDao;
import com.accp.pojo.Statistics;

@Service
public class StatisticsBiz {

	@Autowired
	private StatisticsDao statisticsDao;
	
	public List<Statistics> queryStas(String stdate){
		return statisticsDao.queryStas(stdate);
	}
}
