package com.accp.dao.xn;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Statistics;

public interface StatisticsDao {

	List<Statistics> queryStas(@Param("stdate")String stdate);
}
