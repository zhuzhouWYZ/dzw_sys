package com.accp.dao.xn;

import org.apache.ibatis.annotations.Param;

public interface QxconnectDao {

	Integer addQxByList(@Param("fids")String[] fids, @Param("jid")String jid);
	
	Integer deleteByJid(@Param("jid")String jid);
	
	Integer deleteByFid();
}
