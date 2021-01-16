package com.accp.dao.xn;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Syslog;

public interface SyslogDao {

	List<Syslog> queryAllSyslog();
	
	Integer addSyslog(@Param("user_id")String user_id,@Param("user_action")String user_action);
}
