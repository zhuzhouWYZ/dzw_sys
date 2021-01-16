package com.accp.action.xn;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.xn.StatisticsBiz;
import com.accp.pojo.Statistics;


@RestController
@RequestMapping("/api/stas")
public class StatisticsAction {

	@Autowired
	private StatisticsBiz statisticsBiz;
	
	@GetMapping
	public List<Statistics> queryStas(){
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return statisticsBiz.queryStas(df.format(date));
	}
}
